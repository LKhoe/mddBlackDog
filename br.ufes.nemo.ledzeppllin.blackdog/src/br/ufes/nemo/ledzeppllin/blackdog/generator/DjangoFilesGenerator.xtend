package br.ufes.nemo.ledzeppllin.blackdog.generator

import br.ufes.nemo.ledzeppllin.blackdog.blackDog.Entity
import br.ufes.nemo.ledzeppllin.blackdog.blackDog.Feature
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider

class DjangoFilesGenerator extends AbstractGenerator {

	@Inject extension IQualifiedNameProvider

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		//Gera os modelos
		fsa.generateFile("core/models.py", resource.createModel)

        //Gera as views
        fsa.generateFile("core/views.py", resource.createView)

        //Gera HTMLs
        // for(App app : resource.allContents.toIterable.filter(App)) {
        for(Entity e : resource.allContents.toIterable.filter(Entity)){
            if(e.annotations.isEmpty){
                fsa.generateFile("core/templates/core/"+e.name.toLowerCase+"_form.html", e.formHtml)
                fsa.generateFile("core/templates/core/"+e.name.toLowerCase+"_list.html", e.listHtml)
                fsa.generateFile("core/templates/core/"+e.name.toLowerCase+"_confirm_delete.html", e.confirmDeleteHtml)
            }else{
                for(a : e.annotations){
                    if(a.name == 'Create'){
                        fsa.generateFile("core/templates/core/"+e.name.toLowerCase+"_form.html", e.formHtml)
                    }
                    if(a.name == 'List'){
                        fsa.generateFile("core/templates/core/"+e.name.toLowerCase+"_list.html", e.listHtml)
                    }
                    if(a.name == 'Update'){
                        fsa.generateFile("core/templates/core/"+e.name.toLowerCase+"_form.html", e.formHtml)
                    }
                    if(a.name == 'Delete'){
                        fsa.generateFile("core/templates/core/"+e.name.toLowerCase+"_confirm_delete.html", e.confirmDeleteHtml)
                    }
                }
            }
        }
        // }

        //Gera o form do signup
        fsa.generateFile("core/forms.py", resource.createForm)

        //Gera as urls
        fsa.generateFile("core/urls.py", resource.createUrl)

        //Gera o yml
        fsa.generateFile("gitlab.yml", resource.createYml)

        //Gera o gitignore
        fsa.generateFile(".gitignore", resource.createGitignore)

        //Gera o requirements
        fsa.generateFile("requirements.txt", resource.createRequirements)
        
        //Gera o UML
        fsa.generateFile("uml.puml", resource.createClassDiagram)
	}

//------------ HTMLs ----------
    private def formHtml(Entity e)'''
        {% extends 'bootstrap/index.html' %}
        {% load crispy_forms_tags %}
        {% block content %}
            <h1>Criar «e.name»</h1>

            <form action="" method="post">
                {% csrf_token %}
                {{ form|crispy }}
                <input name="submit" type="submit" value="Criar" />
            </form>
        {% endblock %}
    '''

    private def listHtml(Entity e)'''
        {% extends 'bootstrap/index.html' %}
        {% load static %}
        {% block content %}
        <head>
            <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
            <script src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
            {% comment %} <link rel="stylesheet" type="text/css" href="{% static 'vendor/datatables/dataTables.bootstrap4.min.css' %}"> {% endcomment %}
            <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css">
        </head>
        <h1 style="text-align: center">«e.name»</h1>
        <div style="margin: auto; width: 80%;">
            <a href = "{% url '«e.name.toLowerCase»_add' %}" class="btn btn-success" style="float: right; margin-bottom: 10px; margin-right: 10px;">Criar</a>
        </div>
        <div style="margin: auto; width: 80%; padding: 10px;">
            <table id="table" class="display" style="width:100%">
                <thead>
                    <tr>
                        {% for column in object_list.cols %}
                            <th>{{ column }}</th>
                        {% endfor %}
                    </tr>
                </thead>
                <tbody>
                    {% for «e.name.toLowerCase» in object_list.rows %}
                        <tr>
                            «FOR f : e.features»
                            <td>{{ «e.name.toLowerCase».«f.name» }}</td>
                            «ENDFOR»
                            <td>
                                <a href="{% url '«e.name.toLowerCase»_update' «e.name.toLowerCase».pk %}">Atualizar</a>
                                <a href="{% url '«e.name.toLowerCase»_delete' «e.name.toLowerCase».pk %}">Deletar</a>
                            </td>
                        </tr>
                    {% endfor %}
                </tbody>
            </table>
        </div>
        <script>
        $('#table').DataTable();
        </script>
        {% endblock %} 
    '''

    private def confirmDeleteHtml(Entity e)'''
        {% extends 'bootstrap/index.html' %}
        {% block content %}  
        <form action="" method="post">{% csrf_token %}
            <p>Tem certeza que deseja deletar a «e.name.toLowerCase» "{{ object.name }}"?</p>
            <input type="submit" value="Confirm" />
            <button type='button' onclick="window.location.href={% url '«e.name.toLowerCase»_list' %}">No</button>
        </form>
        {% endblock %}
    '''

//------------ Forms ----------
    private def createForm(Resource resource)'''
        from django import forms
        from django.contrib.auth.forms import UserCreationForm
        from django.contrib.auth.models import User

        class SignUpForm(UserCreationForm):
            first_name = forms.CharField(max_length=30, required=False, help_text='Optional.')
            last_name = forms.CharField(max_length=30, required=False, help_text='Optional.')
            email = forms.EmailField(max_length=254, help_text='Required. Inform a valid email address.')

            class Meta:
                model = User
                fields = ('username', 'first_name', 'last_name', 'email', 'password1', 'password2', )
    '''

//------------ View ----------
    private def createView(Resource resource)'''
        from django.shortcuts import render, redirect
        from django.views.generic.base import TemplateView
        from django.views.generic.edit import CreateView, UpdateView, DeleteView
        from django.views.generic.list import ListView
        from django.contrib.messages.views import SuccessMessageMixin
        from .models import «FOR e : resource.allContents.toIterable.filter(Entity)» «e.fullyQualifiedName», «ENDFOR»
        from django.urls import reverse_lazy

        from django.contrib import messages

        from .forms import SignUpForm

        # Autenticação de usuário
        from django.contrib.auth import login, authenticate
        from django.contrib.auth.forms import UserCreationForm
        from django.contrib.auth import views as auth_views
        from django.contrib.auth import logout
        from django.contrib.auth.mixins import LoginRequiredMixin

        def redirect_to_home(request):
            return redirect('home_page')

        ## Registro
        def signup(request):
            if request.method == 'POST':
                form = SignUpForm(request.POST)
                if form.is_valid():
                    form.save()
                    username = form.cleaned_data.get('username')
                    raw_password = form.cleaned_data.get('password1')
                    user = authenticate(username=username, password=raw_password)
                    login(request, user)
                    return redirect('home_page')
            else:
                form = SignUpForm()
            return render(request, 'bootstrap/register.html', {'form': form})

        ## Login
        class LoginUserView(auth_views.LoginView):
            template_name = "bootstrap/login.html"

            def get_success_url(self):
                if self.request.user.is_superuser:
                    return reverse_lazy("admin")
                else:
                    return reverse_lazy("home_page")

        ## Logout
        def logout_view(request):
            logout(request)
            return redirect('login')

        ## Home
        class HomePageView(LoginRequiredMixin,TemplateView):
            login_url = '/login/'
            redirect_field_name = 'redirect_to'

            template_name = "core/home.html"

        «FOR e : resource.allContents.toIterable.filter(Entity)»
            «IF e.annotations.isEmpty»
			    «e.createView»«e.listView»«e.updateView»«e.deleteView»
            «ELSE»
                «FOR a : e.annotations»
                    «IF a.name == 'Create'»
                        «e.createView»
                    «ENDIF»
                    «IF a.name == 'List'»
                        «e.listView»
                    «ENDIF»
                    «IF a.name == 'Update'»
                        «e.updateView»
                    «ENDIF»
                    «IF a.name == 'Delete'»
                        «e.deleteView»
                    «ENDIF»
                «ENDFOR»
            «ENDIF»
		«ENDFOR»
    '''

    private def createView(Entity e)'''
        class «e.fullyQualifiedName»Create(LoginRequiredMixin,SuccessMessageMixin,CreateView):
            login_url = '/login/'
            redirect_field_name = 'redirect_to'

            model = «e.fullyQualifiedName»
            success_url = reverse_lazy('«e.name.toLowerCase»_list')
            success_message = "«e.fullyQualifiedName» criado com sucesso"
    
    '''

    private def listView(Entity e) '''
        class «e.fullyQualifiedName»List(LoginRequiredMixin,ListView):
            login_url = '/login/'
            redirect_field_name = 'redirect_to'

            model = «e.fullyQualifiedName»
            template_name = "core/«e.name.toLowerCase»_list.html"

            def get_querySet(self):
                return {'rows' : «e.fullyQualifiedName».objects.filter(),
                        'cols' : [«FOR f : e.features»'«f.name»', «ENDFOR»'Ações']}
    
    '''

    private def updateView(Entity e)'''
        class «e.fullyQualifiedName»Update(LoginRequiredMixin,SuccessMessageMixin,UpdateView):
            login_url = '/login/'
            redirect_field_name = 'redirect_to'

            model = «e.fullyQualifiedName»
            success_url = reverse_lazy('«e.name.toLowerCase»_list')
            success_message = "«e.fullyQualifiedName» atualizado com sucesso"
    
    '''

    private def deleteView(Entity e)'''
        class «e.fullyQualifiedName»Delete(LoginRequiredMixin,SuccessMessageMixin,DeleteView):
            login_url = '/login/'
            redirect_field_name = 'redirect_to'
            
            model = «e.fullyQualifiedName»
            sucess_url = reverse_lazy('«e.name.toLowerCase»_list')
            success_message = "«e.fullyQualifiedName» atualizado com sucesso"
    
    '''

//------------ URL ----------
    private def createUrl(Resource resource)'''
        from django.contrib import admin
        from django.urls import path
        from django.conf.urls import url

        from .views import (HomePageView, signup, LoginUserView, logout_view, redirect_to_home,
            «FOR e : resource.allContents.toIterable.filter(Entity)»
                «e.importViews»
            «ENDFOR»
        )
        
        urlpatterns = [
            path('', redirect_to_home, name='void'),
            path('home/', HomePageView.as_view(), name='home_page'),
            path('signup/', signup, name='signup'),
            path('login/', LoginUserView.as_view(), name='login'),
            path('logout/', logout_view, name='logout'),
            «FOR e : resource.allContents.toIterable.filter(Entity)»«e.path»«ENDFOR»
        ]
    '''

    private def importViews(Entity e) '''
        «IF e.annotations.isEmpty»
            «e.name»List, «e.name»Create, «e.name»Update, «e.name»Delete,
        «ELSE»
            «FOR a : e.annotations»
                «IF a.name == 'Create'»
                    «e.name»Create, 
                «ENDIF»
                «IF a.name == 'List'»
                    «e.name»List, 
                «ENDIF»
                «IF a.name == 'Update'»
                    «e.name»Update, 
                «ENDIF»
                «IF a.name == 'Delete'»
                    «e.name»Delete, 
                «ENDIF»
            «ENDFOR»
        «ENDIF»
    '''

    private def path(Entity e) '''
        «IF e.annotations.isEmpty»
                path('«e.name.toLowerCase»/', «e.name»List.as_view(), name='«e.name.toLowerCase»_list'),
                path('«e.name.toLowerCase»/add/', «e.name»Create.as_view(), name='«e.name.toLowerCase»_add'),
                path('«e.name.toLowerCase»/<int:pk>/update/', «e.name»Update.as_view(), name='«e.name.toLowerCase»_update'),
                path('«e.name.toLowerCase»/<int:pk>/delete/', «e.name»Delete.as_view(), name='«e.name.toLowerCase»_delete'),
        «ELSE»
            «FOR a : e.annotations»
                «IF a.name == 'Create'»
                    path('«e.name.toLowerCase»/add/', «e.name»Create.as_view(), name='«e.name.toLowerCase»_add'),
                «ENDIF»
                «IF a.name == 'List'»
                    path('«e.name.toLowerCase»/', «e.name»List.as_view(), name='«e.name.toLowerCase»_list'),
                «ENDIF»
                «IF a.name == 'Update'»
                    path('«e.name.toLowerCase»/<int:pk>/update/', «e.name»Update.as_view(), name='«e.name.toLowerCase»_update'),
                «ENDIF»
                «IF a.name == 'Delete'»
                    path('«e.name.toLowerCase»/<int:pk>/delete/', «e.name»Delete.as_view(), name='«e.name.toLowerCase»_delete'),
                «ENDIF»
            «ENDFOR»
        «ENDIF»
    '''

//------------ Model ----------
	private def createModel(Resource resource)'''
		«FOR e : resource.allContents.toIterable.filter(Entity) »
			«e.compile»
            

		«ENDFOR»
	'''
	
	private def compile(Entity e) '''     
        class «e.name»«IF e.superType !== null
                »(«e.superType.fullyQualifiedName»)«
            ELSE»(models.Model)«
            ENDIF»:
            «FOR f : e.features»
                «f.compile»
            «ENDFOR»
    '''

    private def compile(Feature f) '''
        «f.name.toLowerCase» «
        IF f.type.name == "String"»= models.CharField(max_length=200)«
        ELSEIF f.type.name == "Integer"»= models.models.BigIntegerField()«
        ELSE»= models.ForeignKey(«f.type.name», on_delete=models.CASCADE)«
        ENDIF»
    '''

//------------ YML ----------
    private def createYml(Resource resource)'''
        image: joyzoursky/python-chromedriver:latest

        # Change pip's cache directory to be inside the project directory since we can
        # only cache local items.
        variables:
        PIP_CACHE_DIR: "$CI_PROJECT_DIR/.cache/pip"

        # Pip's cache doesn't store the python packages
        # https://pip.pypa.io/en/stable/reference/pip_install/#caching
        #
        # If you want to also cache the installed packages, you have to install
        # them in a virtualenv and cache it as well.
        cache:
        paths:
            - .cache/pip
            - venv/

        stages:
        - test
        - deploy

        test:
            stage: test
            script:
              - python -V  # Print out python version for debugging
              - pip install virtualenv
              - virtualenv venv
              - source venv/bin/activate
              - pip install -r requirements.txt
              - cd backdog
              - python manage.py behave
            only:
              - development


        deploy:
        stage: deploy
        script:
            - apt-get update -qy
            - apt-get install -y ruby-dev
            - gem install dpl
            - dpl --provider=heroku --app=backdog --api-key=525d0728-82ff-492d-9393-e3c539deeb1e
        only:
            - development

    '''
    
//------------ gitignore ----------   
    private def createGitignore(Resource resource)'''
        # Byte-compiled / optimized / DLL files
        __pycache__/
        *.py[cod]
        *$py.class

        # C extensions
        *.so

        # Distribution / packaging
        .Python
        build/
        develop-eggs/
        dist/
        downloads/
        eggs/
        .eggs/
        lib/
        lib64/
        parts/
        sdist/
        var/
        wheels/
        share/python-wheels/
        *.egg-info/
        .installed.cfg
        *.egg
        MANIFEST

        # PyInstaller
        #  Usually these files are written by a python script from a template
        #  before PyInstaller builds the exe, so as to inject date/other infos into it.
        *.manifest
        *.spec

        # Installer logs
        pip-log.txt
        pip-delete-this-directory.txt

        # Unit test / coverage reports
        htmlcov/
        .tox/
        .nox/
        .coverage
        .coverage.*
        .cache
        nosetests.xml
        coverage.xml
        *.cover
        .hypothesis/
        .pytest_cache/

        # Translations
        *.mo
        *.pot

        # Django stuff:
        *.log
        local_settings.py
        db.sqlite3

        # Flask stuff:
        instance/
        .webassets-cache

        # Scrapy stuff:
        .scrapy

        # Sphinx documentation
        docs/_build/

        # PyBuilder
        target/

        # Jupyter Notebook
        .ipynb_checkpoints

        # IPython
        profile_default/
        ipython_config.py

        # pyenv
        .python-version

        # celery beat schedule file
        celerybeat-schedule

        # SageMath parsed files
        *.sage.py

        # Environments
        .env
        .venv
        env/
        venv/
        ENV/
        env.bak/
        venv.bak/

        # Spyder project settings
        .spyderproject
        .spyproject

        # Rope project settings
        .ropeproject

        # mkdocs documentation
        /site

        # mypy
        .mypy_cache/
        .dmypy.json
        dmypy.json

        # Pyre type checker
        .pyre/

        ## Arquivos gerados por Mac
        *.DS_Store

        ##Staticfiles
        core/static

    '''

//------------ requirements ----------
    private def createRequirements(Resource resource)'''
        asgiref==3.2.10
        astroid==2.4.2
        behave==1.2.6
        behave-django==0.4.0
        colorama==0.4.3
        commitizen==1.23.0
        decli==0.5.1
        dj-database-url==0.5.0
        Django==3.0.8
        django-crispy-forms==1.9.2
        django-heroku==0.3.1
        gunicorn==20.0.4
        isort==4.3.21
        Jinja2==2.11.2
        lazy-object-proxy==1.4.3
        MarkupSafe==1.1.1
        mccabe==0.6.1
        packaging==20.4
        parse==1.16.0
        parse-type==0.5.2
        prompt-toolkit==3.0.5
        psycopg2==2.7.5
        pylint==2.5.3
        pylint-django==2.1.0
        pylint-plugin-utils==0.6
        pyparsing==2.4.7
        pytz==2020.1
        questionary==1.5.2
        selenium==2.53.6
        six==1.15.0
        sqlparse==0.3.1
        termcolor==1.1.0
        toml==0.10.1
        tomlkit==0.5.11
        typed-ast==1.4.1
        wcwidth==0.2.5
        whitenoise==5.2.0
        wrapt==1.12.1
    '''

//Documentação

////Class Diagram
    private def createClassDiagram(Resource resource) '''
        @startuml
        
        «FOR e : resource.allContents.toIterable.filter(Entity)»
            «IF e.superType.fullyQualifiedName != 'null'»
                «e.superType.name» <|-- «e.name»
            «ENDIF»

            «FOR f : e.features»«IF f.type.toString == 'Entity'»
                «e.name» --> «f.type.fullyQualifiedName»
            «ENDIF»«ENDFOR»
        «ENDFOR»
        
        @enduml
    '''
}
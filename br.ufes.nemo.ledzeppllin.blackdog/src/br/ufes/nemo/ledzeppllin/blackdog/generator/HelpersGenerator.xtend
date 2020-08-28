package br.ufes.nemo.ledzeppllin.blackdog.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import br.ufes.nemo.ledzeppllin.blackdog.blackDog.Entity

class HelpersGenerator extends AbstractGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		//Gera o yml
        fsa.generateFile("gitlab.yml", resource.createYml)

        //Gera o gitignore
        fsa.generateFile(".gitignore", resource.createGitignore)

        //Gera o requirements
        fsa.generateFile("requirements.txt", resource.createRequirements)
        
        //Gera o README
        fsa.generateFile("README.md", resource.createReadMe)
		
	}
	
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
    
//------------ README.md ---------- 
	private def createReadMe(Resource resource)'''
		# BlackDog
		Website de consulta em projetos .
		
		## Goal
		- Este sistema tem por objetivo criação, atualização, consulta e deleção de dados relacionados a projetos.
		
		## Enviroment
		- A aplicação foi construida para funcionar no servidor Pyhtonanywhere
		
		## Usage
		- Acesse o link http://koee.pythonanywhere.com/
		
		
		«FOR e : resource.allContents.toIterable.filter(Entity)» 
			«IF e.annotations !== null»
				«e.annotations.join»
			«ENDIF»
			«IF e.description !== null»
				   «e.description.textfield»
			«ENDIF»
			«e.name»«IF e.superType !== null»(«e.superType.name»)«ELSE»(models.Model)«ENDIF»:
			    «FOR f : e.features»
			       «f.name.toLowerCase»
	            «ENDFOR»
			            
		«ENDFOR»
	'''
}
	
	
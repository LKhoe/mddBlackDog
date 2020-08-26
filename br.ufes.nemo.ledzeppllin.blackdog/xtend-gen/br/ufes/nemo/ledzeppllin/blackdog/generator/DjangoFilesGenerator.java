package br.ufes.nemo.ledzeppllin.blackdog.generator;

import br.ufes.nemo.ledzeppllin.blackdog.blackDog.Annotation;
import br.ufes.nemo.ledzeppllin.blackdog.blackDog.Entity;
import br.ufes.nemo.ledzeppllin.blackdog.blackDog.Feature;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class DjangoFilesGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    fsa.generateFile("core/models.py", this.createModel(resource));
    fsa.generateFile("core/views.py", this.createView(resource));
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
    for (final Entity e : _filter) {
      boolean _isEmpty = e.getAnnotations().isEmpty();
      if (_isEmpty) {
        String _lowerCase = e.getName().toLowerCase();
        String _plus = ("core/templates/core/" + _lowerCase);
        String _plus_1 = (_plus + "_form.html");
        fsa.generateFile(_plus_1, this.formHtml(e));
        String _lowerCase_1 = e.getName().toLowerCase();
        String _plus_2 = ("core/templates/core/" + _lowerCase_1);
        String _plus_3 = (_plus_2 + "_list.html");
        fsa.generateFile(_plus_3, this.listHtml(e));
        String _lowerCase_2 = e.getName().toLowerCase();
        String _plus_4 = ("core/templates/core/" + _lowerCase_2);
        String _plus_5 = (_plus_4 + "_confirm_delete.html");
        fsa.generateFile(_plus_5, this.confirmDeleteHtml(e));
      } else {
        EList<Annotation> _annotations = e.getAnnotations();
        for (final Annotation a : _annotations) {
          {
            String _name = a.getName();
            boolean _equals = Objects.equal(_name, "Create");
            if (_equals) {
              String _lowerCase_3 = e.getName().toLowerCase();
              String _plus_6 = ("core/templates/core/" + _lowerCase_3);
              String _plus_7 = (_plus_6 + "_form.html");
              fsa.generateFile(_plus_7, this.formHtml(e));
            }
            String _name_1 = a.getName();
            boolean _equals_1 = Objects.equal(_name_1, "List");
            if (_equals_1) {
              String _lowerCase_4 = e.getName().toLowerCase();
              String _plus_8 = ("core/templates/core/" + _lowerCase_4);
              String _plus_9 = (_plus_8 + "_list.html");
              fsa.generateFile(_plus_9, this.listHtml(e));
            }
            String _name_2 = a.getName();
            boolean _equals_2 = Objects.equal(_name_2, "Update");
            if (_equals_2) {
              String _lowerCase_5 = e.getName().toLowerCase();
              String _plus_10 = ("core/templates/core/" + _lowerCase_5);
              String _plus_11 = (_plus_10 + "_form.html");
              fsa.generateFile(_plus_11, this.formHtml(e));
            }
            String _name_3 = a.getName();
            boolean _equals_3 = Objects.equal(_name_3, "Delete");
            if (_equals_3) {
              String _lowerCase_6 = e.getName().toLowerCase();
              String _plus_12 = ("core/templates/core/" + _lowerCase_6);
              String _plus_13 = (_plus_12 + "_confirm_delete.html");
              fsa.generateFile(_plus_13, this.confirmDeleteHtml(e));
            }
          }
        }
      }
    }
    fsa.generateFile("core/forms.py", this.createForm(resource));
    fsa.generateFile("core/urls.py", this.createUrl(resource));
    fsa.generateFile("gitlab.yml", this.createYml(resource));
    fsa.generateFile(".gitignore", this.createGitignore(resource));
    fsa.generateFile("requirements.txt", this.createRequirements(resource));
  }
  
  private CharSequence formHtml(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{% extends \'bootstrap/index.html\' %}");
    _builder.newLine();
    _builder.append("{% load crispy_forms_tags %}");
    _builder.newLine();
    _builder.append("{% block content %}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<h1>Criar ");
    String _name = e.getName();
    _builder.append(_name, "    ");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<form action=\"\" method=\"post\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("{% csrf_token %}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("{{ form|crispy }}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<input name=\"submit\" type=\"submit\" value=\"Criar\" />");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</form>");
    _builder.newLine();
    _builder.append("{% endblock %}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence listHtml(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{% extends \'bootstrap/index.html\' %}");
    _builder.newLine();
    _builder.append("{% load static %}");
    _builder.newLine();
    _builder.append("{% block content %}");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("{% comment %} <link rel=\"stylesheet\" type=\"text/css\" href=\"{% static \'vendor/datatables/dataTables.bootstrap4.min.css\' %}\"> {% endcomment %}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css\">");
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<h1 style=\"text-align: center\">");
    String _name = e.getName();
    _builder.append(_name);
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("<div style=\"margin: auto; width: 80%;\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<a href = \"{% url \'");
    String _lowerCase = e.getName().toLowerCase();
    _builder.append(_lowerCase, "    ");
    _builder.append("_add\' %}\" class=\"btn btn-success\" style=\"float: right; margin-bottom: 10px; margin-right: 10px;\">Criar</a>");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<div style=\"margin: auto; width: 80%; padding: 10px;\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<table id=\"table\" class=\"display\" style=\"width:100%\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<thead>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("{% for column in object_list.cols %}");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("<th>{{ column }}</th>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("{% endfor %}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</thead>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<tbody>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("{% for ");
    String _lowerCase_1 = e.getName().toLowerCase();
    _builder.append(_lowerCase_1, "            ");
    _builder.append(" in object_list.rows %}");
    _builder.newLineIfNotEmpty();
    _builder.append("                ");
    _builder.append("<tr>");
    _builder.newLine();
    {
      EList<Feature> _features = e.getFeatures();
      for(final Feature f : _features) {
        _builder.append("                    ");
        _builder.append("<td>{{ ");
        String _lowerCase_2 = e.getName().toLowerCase();
        _builder.append(_lowerCase_2, "                    ");
        _builder.append(".");
        String _name_1 = f.getName();
        _builder.append(_name_1, "                    ");
        _builder.append(" }}</td>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("                    ");
    _builder.append("<td>");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("<a href=\"{% url \'");
    String _lowerCase_3 = e.getName().toLowerCase();
    _builder.append(_lowerCase_3, "                        ");
    _builder.append("_update\' ");
    String _lowerCase_4 = e.getName().toLowerCase();
    _builder.append(_lowerCase_4, "                        ");
    _builder.append(".pk %}\">Atualizar</a>");
    _builder.newLineIfNotEmpty();
    _builder.append("                        ");
    _builder.append("<a href=\"{% url \'");
    String _lowerCase_5 = e.getName().toLowerCase();
    _builder.append(_lowerCase_5, "                        ");
    _builder.append("_delete\' ");
    String _lowerCase_6 = e.getName().toLowerCase();
    _builder.append(_lowerCase_6, "                        ");
    _builder.append(".pk %}\">Deletar</a>");
    _builder.newLineIfNotEmpty();
    _builder.append("                    ");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("{% endfor %}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</tbody>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</table>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<script>");
    _builder.newLine();
    _builder.append("$(\'#table\').DataTable();");
    _builder.newLine();
    _builder.append("</script>");
    _builder.newLine();
    _builder.append("{% endblock %} ");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence confirmDeleteHtml(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{% extends \'bootstrap/index.html\' %}");
    _builder.newLine();
    _builder.append("{% block content %}  ");
    _builder.newLine();
    _builder.append("<form action=\"\" method=\"post\">{% csrf_token %}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<p>Tem certeza que deseja deletar a ");
    String _lowerCase = e.getName().toLowerCase();
    _builder.append(_lowerCase, "    ");
    _builder.append(" \"{{ object.name }}\"?</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<input type=\"submit\" value=\"Confirm\" />");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<button type=\'button\' onclick=\"window.location.href={% url \'");
    String _lowerCase_1 = e.getName().toLowerCase();
    _builder.append(_lowerCase_1, "    ");
    _builder.append("_list\' %}\">No</button>");
    _builder.newLineIfNotEmpty();
    _builder.append("</form>");
    _builder.newLine();
    _builder.append("{% endblock %}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createForm(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from django import forms");
    _builder.newLine();
    _builder.append("from django.contrib.auth.forms import UserCreationForm");
    _builder.newLine();
    _builder.append("from django.contrib.auth.models import User");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class SignUpForm(UserCreationForm):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("first_name = forms.CharField(max_length=30, required=False, help_text=\'Optional.\')");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("last_name = forms.CharField(max_length=30, required=False, help_text=\'Optional.\')");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("email = forms.EmailField(max_length=254, help_text=\'Required. Inform a valid email address.\')");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("class Meta:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("model = User");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("fields = (\'username\', \'first_name\', \'last_name\', \'email\', \'password1\', \'password2\', )");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createView(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from django.shortcuts import render, redirect");
    _builder.newLine();
    _builder.append("from django.views.generic.base import TemplateView");
    _builder.newLine();
    _builder.append("from django.views.generic.edit import CreateView, UpdateView, DeleteView");
    _builder.newLine();
    _builder.append("from django.views.generic.list import ListView");
    _builder.newLine();
    _builder.append("from django.contrib.messages.views import SuccessMessageMixin");
    _builder.newLine();
    _builder.append("from .models import ");
    {
      Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
      for(final Entity e : _filter) {
        _builder.append(" ");
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
        _builder.append(_fullyQualifiedName);
        _builder.append(", ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("from django.urls import reverse_lazy");
    _builder.newLine();
    _builder.newLine();
    _builder.append("from django.contrib import messages");
    _builder.newLine();
    _builder.newLine();
    _builder.append("from .forms import SignUpForm");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Autenticação de usuário");
    _builder.newLine();
    _builder.append("from django.contrib.auth import login, authenticate");
    _builder.newLine();
    _builder.append("from django.contrib.auth.forms import UserCreationForm");
    _builder.newLine();
    _builder.append("from django.contrib.auth import views as auth_views");
    _builder.newLine();
    _builder.append("from django.contrib.auth import logout");
    _builder.newLine();
    _builder.append("from django.contrib.auth.mixins import LoginRequiredMixin");
    _builder.newLine();
    _builder.newLine();
    _builder.append("def redirect_to_home(request):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return redirect(\'home_page\')");
    _builder.newLine();
    _builder.newLine();
    _builder.append("## Registro");
    _builder.newLine();
    _builder.append("def signup(request):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if request.method == \'POST\':");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("form = SignUpForm(request.POST)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if form.is_valid():");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("form.save()");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("username = form.cleaned_data.get(\'username\')");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("raw_password = form.cleaned_data.get(\'password1\')");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("user = authenticate(username=username, password=raw_password)");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("login(request, user)");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return redirect(\'home_page\')");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("form = SignUpForm()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return render(request, \'bootstrap/register.html\', {\'form\': form})");
    _builder.newLine();
    _builder.newLine();
    _builder.append("## Login");
    _builder.newLine();
    _builder.append("class LoginUserView(auth_views.LoginView):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("template_name = \"bootstrap/login.html\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("def get_success_url(self):");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if self.request.user.is_superuser:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return reverse_lazy(\"admin\")");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return reverse_lazy(\"home_page\")");
    _builder.newLine();
    _builder.newLine();
    _builder.append("## Logout");
    _builder.newLine();
    _builder.append("def logout_view(request):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("logout(request)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return redirect(\'login\')");
    _builder.newLine();
    _builder.newLine();
    _builder.append("## Home");
    _builder.newLine();
    _builder.append("class HomePageView(LoginRequiredMixin,TemplateView):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("login_url = \'/login/\'");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("redirect_field_name = \'redirect_to\'");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("template_name = \"core/home.html\"");
    _builder.newLine();
    {
      Iterable<Entity> _filter_1 = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
      for(final Entity e_1 : _filter_1) {
        {
          boolean _isEmpty = e_1.getAnnotations().isEmpty();
          if (_isEmpty) {
            CharSequence _createView = this.createView(e_1);
            _builder.append(_createView);
            CharSequence _listView = this.listView(e_1);
            _builder.append(_listView);
            CharSequence _updateView = this.updateView(e_1);
            _builder.append(_updateView);
            CharSequence _deleteView = this.deleteView(e_1);
            _builder.append(_deleteView);
            _builder.newLineIfNotEmpty();
          } else {
            {
              EList<Annotation> _annotations = e_1.getAnnotations();
              for(final Annotation a : _annotations) {
                {
                  String _name = a.getName();
                  boolean _equals = Objects.equal(_name, "Create");
                  if (_equals) {
                    CharSequence _createView_1 = this.createView(e_1);
                    _builder.append(_createView_1);
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  String _name_1 = a.getName();
                  boolean _equals_1 = Objects.equal(_name_1, "List");
                  if (_equals_1) {
                    CharSequence _listView_1 = this.listView(e_1);
                    _builder.append(_listView_1);
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  String _name_2 = a.getName();
                  boolean _equals_2 = Objects.equal(_name_2, "Update");
                  if (_equals_2) {
                    CharSequence _updateView_1 = this.updateView(e_1);
                    _builder.append(_updateView_1);
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  String _name_3 = a.getName();
                  boolean _equals_3 = Objects.equal(_name_3, "Delete");
                  if (_equals_3) {
                    CharSequence _deleteView_1 = this.deleteView(e_1);
                    _builder.append(_deleteView_1);
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  private CharSequence createView(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName);
    _builder.append("Create(LoginRequiredMixin,SuccessMessageMixin,CreateView):");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("login_url = \'/login/\'");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("redirect_field_name = \'redirect_to\'");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("model = ");
    QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName_1, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("success_url = reverse_lazy(\'");
    String _lowerCase = e.getName().toLowerCase();
    _builder.append(_lowerCase, "    ");
    _builder.append("_list\')");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("success_message = \"");
    QualifiedName _fullyQualifiedName_2 = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName_2, "    ");
    _builder.append(" criado com sucesso\"");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence listView(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName);
    _builder.append("List(LoginRequiredMixin,ListView):");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("login_url = \'/login/\'");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("redirect_field_name = \'redirect_to\'");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("model = ");
    QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName_1, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("template_name = \"core/");
    String _lowerCase = e.getName().toLowerCase();
    _builder.append(_lowerCase, "    ");
    _builder.append("_list.html\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("def get_querySet(self):");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return {\'rows\' : ");
    QualifiedName _fullyQualifiedName_2 = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName_2, "        ");
    _builder.append(".objects.filter(),");
    _builder.newLineIfNotEmpty();
    _builder.append("                ");
    _builder.append("\'cols\' : [");
    {
      EList<Feature> _features = e.getFeatures();
      for(final Feature f : _features) {
        _builder.append("\'");
        String _name = f.getName();
        _builder.append(_name, "                ");
        _builder.append("\', ");
      }
    }
    _builder.append("\'Ações\']}");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence updateView(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName);
    _builder.append("Update(LoginRequiredMixin,SuccessMessageMixin,UpdateView):");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("login_url = \'/login/\'");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("redirect_field_name = \'redirect_to\'");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("model = ");
    QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName_1, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("success_url = reverse_lazy(\'");
    String _lowerCase = e.getName().toLowerCase();
    _builder.append(_lowerCase, "    ");
    _builder.append("_list\')");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("success_message = \"");
    QualifiedName _fullyQualifiedName_2 = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName_2, "    ");
    _builder.append(" atualizado com sucesso\"");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence deleteView(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName);
    _builder.append("Delete(LoginRequiredMixin,SuccessMessageMixin,DeleteView):");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("login_url = \'/login/\'");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("redirect_field_name = \'redirect_to\'");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("model = ");
    QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName_1, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("sucess_url = reverse_lazy(\'");
    String _lowerCase = e.getName().toLowerCase();
    _builder.append(_lowerCase, "    ");
    _builder.append("_list\')");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("success_message = \"");
    QualifiedName _fullyQualifiedName_2 = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    _builder.append(_fullyQualifiedName_2, "    ");
    _builder.append(" atualizado com sucesso\"");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createUrl(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from django.contrib import admin");
    _builder.newLine();
    _builder.append("from django.urls import path");
    _builder.newLine();
    _builder.append("from django.conf.urls import url");
    _builder.newLine();
    _builder.newLine();
    _builder.append("from .views import (HomePageView, signup, LoginUserView, logout_view, redirect_to_home,");
    _builder.newLine();
    {
      Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
      for(final Entity e : _filter) {
        _builder.append("    ");
        CharSequence _importViews = this.importViews(e);
        _builder.append(_importViews, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(")");
    _builder.newLine();
    _builder.newLine();
    _builder.append("urlpatterns = [");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path(\'\', redirect_to_home, name=\'void\'),");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path(\'home/\', HomePageView.as_view(), name=\'home_page\'),");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path(\'signup/\', signup, name=\'signup\'),");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path(\'login/\', LoginUserView.as_view(), name=\'login\'),");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path(\'logout/\', logout_view, name=\'logout\'),");
    _builder.newLine();
    _builder.append("    ");
    {
      Iterable<Entity> _filter_1 = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
      for(final Entity e_1 : _filter_1) {
        CharSequence _path = this.path(e_1);
        _builder.append(_path, "    ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("]");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence importViews(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isEmpty = e.getAnnotations().isEmpty();
      if (_isEmpty) {
        String _name = e.getName();
        _builder.append(_name);
        _builder.append("List, ");
        String _name_1 = e.getName();
        _builder.append(_name_1);
        _builder.append("Create, ");
        String _name_2 = e.getName();
        _builder.append(_name_2);
        _builder.append("Update, ");
        String _name_3 = e.getName();
        _builder.append(_name_3);
        _builder.append("Delete,");
        _builder.newLineIfNotEmpty();
      } else {
        {
          EList<Annotation> _annotations = e.getAnnotations();
          for(final Annotation a : _annotations) {
            {
              String _name_4 = a.getName();
              boolean _equals = Objects.equal(_name_4, "Create");
              if (_equals) {
                String _name_5 = e.getName();
                _builder.append(_name_5);
                _builder.append("Create, ");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              String _name_6 = a.getName();
              boolean _equals_1 = Objects.equal(_name_6, "List");
              if (_equals_1) {
                String _name_7 = e.getName();
                _builder.append(_name_7);
                _builder.append("List, ");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              String _name_8 = a.getName();
              boolean _equals_2 = Objects.equal(_name_8, "Update");
              if (_equals_2) {
                String _name_9 = e.getName();
                _builder.append(_name_9);
                _builder.append("Update, ");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              String _name_10 = a.getName();
              boolean _equals_3 = Objects.equal(_name_10, "Delete");
              if (_equals_3) {
                String _name_11 = e.getName();
                _builder.append(_name_11);
                _builder.append("Delete, ");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  private CharSequence path(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isEmpty = e.getAnnotations().isEmpty();
      if (_isEmpty) {
        _builder.append("path(\'");
        String _lowerCase = e.getName().toLowerCase();
        _builder.append(_lowerCase);
        _builder.append("/\', ");
        String _name = e.getName();
        _builder.append(_name);
        _builder.append("List.as_view(), name=\'");
        String _lowerCase_1 = e.getName().toLowerCase();
        _builder.append(_lowerCase_1);
        _builder.append("_list\'),");
        _builder.newLineIfNotEmpty();
        _builder.append("path(\'");
        String _lowerCase_2 = e.getName().toLowerCase();
        _builder.append(_lowerCase_2);
        _builder.append("/add/\', ");
        String _name_1 = e.getName();
        _builder.append(_name_1);
        _builder.append("Create.as_view(), name=\'");
        String _lowerCase_3 = e.getName().toLowerCase();
        _builder.append(_lowerCase_3);
        _builder.append("_add\'),");
        _builder.newLineIfNotEmpty();
        _builder.append("path(\'");
        String _lowerCase_4 = e.getName().toLowerCase();
        _builder.append(_lowerCase_4);
        _builder.append("/<int:pk>/update/\', ");
        String _name_2 = e.getName();
        _builder.append(_name_2);
        _builder.append("Update.as_view(), name=\'");
        String _lowerCase_5 = e.getName().toLowerCase();
        _builder.append(_lowerCase_5);
        _builder.append("_update\'),");
        _builder.newLineIfNotEmpty();
        _builder.append("path(\'");
        String _lowerCase_6 = e.getName().toLowerCase();
        _builder.append(_lowerCase_6);
        _builder.append("/<int:pk>/delete/\', ");
        String _name_3 = e.getName();
        _builder.append(_name_3);
        _builder.append("Delete.as_view(), name=\'");
        String _lowerCase_7 = e.getName().toLowerCase();
        _builder.append(_lowerCase_7);
        _builder.append("_delete\'),");
        _builder.newLineIfNotEmpty();
      } else {
        {
          EList<Annotation> _annotations = e.getAnnotations();
          for(final Annotation a : _annotations) {
            {
              String _name_4 = a.getName();
              boolean _equals = Objects.equal(_name_4, "Create");
              if (_equals) {
                _builder.append("path(\'");
                String _lowerCase_8 = e.getName().toLowerCase();
                _builder.append(_lowerCase_8);
                _builder.append("/add/\', ");
                String _name_5 = e.getName();
                _builder.append(_name_5);
                _builder.append("Create.as_view(), name=\'");
                String _lowerCase_9 = e.getName().toLowerCase();
                _builder.append(_lowerCase_9);
                _builder.append("_add\'),");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              String _name_6 = a.getName();
              boolean _equals_1 = Objects.equal(_name_6, "List");
              if (_equals_1) {
                _builder.append("path(\'");
                String _lowerCase_10 = e.getName().toLowerCase();
                _builder.append(_lowerCase_10);
                _builder.append("/\', ");
                String _name_7 = e.getName();
                _builder.append(_name_7);
                _builder.append("List.as_view(), name=\'");
                String _lowerCase_11 = e.getName().toLowerCase();
                _builder.append(_lowerCase_11);
                _builder.append("_list\'),");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              String _name_8 = a.getName();
              boolean _equals_2 = Objects.equal(_name_8, "Update");
              if (_equals_2) {
                _builder.append("path(\'");
                String _lowerCase_12 = e.getName().toLowerCase();
                _builder.append(_lowerCase_12);
                _builder.append("/<int:pk>/update/\', ");
                String _name_9 = e.getName();
                _builder.append(_name_9);
                _builder.append("Update.as_view(), name=\'");
                String _lowerCase_13 = e.getName().toLowerCase();
                _builder.append(_lowerCase_13);
                _builder.append("_update\'),");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              String _name_10 = a.getName();
              boolean _equals_3 = Objects.equal(_name_10, "Delete");
              if (_equals_3) {
                _builder.append("path(\'");
                String _lowerCase_14 = e.getName().toLowerCase();
                _builder.append(_lowerCase_14);
                _builder.append("/<int:pk>/delete/\', ");
                String _name_11 = e.getName();
                _builder.append(_name_11);
                _builder.append("Delete.as_view(), name=\'");
                String _lowerCase_15 = e.getName().toLowerCase();
                _builder.append(_lowerCase_15);
                _builder.append("_delete\'),");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  private CharSequence createModel(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
      for(final Entity e : _filter) {
        CharSequence _compile = this.compile(e);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
        _builder.append("            ");
        _builder.newLine();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  private CharSequence compile(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    String _name = e.getName();
    _builder.append(_name);
    {
      Entity _superType = e.getSuperType();
      boolean _tripleNotEquals = (_superType != null);
      if (_tripleNotEquals) {
        _builder.append("(");
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e.getSuperType());
        _builder.append(_fullyQualifiedName);
        _builder.append(")");
      } else {
        _builder.append("(models.Model)");
      }
    }
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    {
      EList<Feature> _features = e.getFeatures();
      for(final Feature f : _features) {
        _builder.append("    ");
        CharSequence _compile = this.compile(f);
        _builder.append(_compile, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private CharSequence compile(final Feature f) {
    StringConcatenation _builder = new StringConcatenation();
    String _lowerCase = f.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append(" ");
    {
      String _name = f.getType().getName();
      boolean _equals = Objects.equal(_name, "String");
      if (_equals) {
        _builder.append("= models.CharField(max_length=200)");
      } else {
        String _name_1 = f.getType().getName();
        boolean _equals_1 = Objects.equal(_name_1, "Integer");
        if (_equals_1) {
          _builder.append("= models.models.BigIntegerField()");
        } else {
          _builder.append("= models.ForeignKey(");
          String _name_2 = f.getType().getName();
          _builder.append(_name_2);
          _builder.append(", on_delete=models.CASCADE)");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence createYml(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("image: joyzoursky/python-chromedriver:latest");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Change pip\'s cache directory to be inside the project directory since we can");
    _builder.newLine();
    _builder.append("# only cache local items.");
    _builder.newLine();
    _builder.append("variables:");
    _builder.newLine();
    _builder.append("PIP_CACHE_DIR: \"$CI_PROJECT_DIR/.cache/pip\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Pip\'s cache doesn\'t store the python packages");
    _builder.newLine();
    _builder.append("# https://pip.pypa.io/en/stable/reference/pip_install/#caching");
    _builder.newLine();
    _builder.append("#");
    _builder.newLine();
    _builder.append("# If you want to also cache the installed packages, you have to install");
    _builder.newLine();
    _builder.append("# them in a virtualenv and cache it as well.");
    _builder.newLine();
    _builder.append("cache:");
    _builder.newLine();
    _builder.append("paths:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- .cache/pip");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- venv/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("stages:");
    _builder.newLine();
    _builder.append("- test");
    _builder.newLine();
    _builder.append("- deploy");
    _builder.newLine();
    _builder.newLine();
    _builder.append("test:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("stage: test");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("script:");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("- python -V  # Print out python version for debugging");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("- pip install virtualenv");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("- virtualenv venv");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("- source venv/bin/activate");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("- pip install -r requirements.txt");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("- cd backdog");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("- python manage.py behave");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("only:");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("- development");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("deploy:");
    _builder.newLine();
    _builder.append("stage: deploy");
    _builder.newLine();
    _builder.append("script:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- apt-get update -qy");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- apt-get install -y ruby-dev");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- gem install dpl");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- dpl --provider=heroku --app=backdog --api-key=525d0728-82ff-492d-9393-e3c539deeb1e");
    _builder.newLine();
    _builder.append("only:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- development");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createGitignore(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Byte-compiled / optimized / DLL files");
    _builder.newLine();
    _builder.append("__pycache__/");
    _builder.newLine();
    _builder.append("*.py[cod]");
    _builder.newLine();
    _builder.append("*$py.class");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# C extensions");
    _builder.newLine();
    _builder.append("*.so");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Distribution / packaging");
    _builder.newLine();
    _builder.append(".Python");
    _builder.newLine();
    _builder.append("build/");
    _builder.newLine();
    _builder.append("develop-eggs/");
    _builder.newLine();
    _builder.append("dist/");
    _builder.newLine();
    _builder.append("downloads/");
    _builder.newLine();
    _builder.append("eggs/");
    _builder.newLine();
    _builder.append(".eggs/");
    _builder.newLine();
    _builder.append("lib/");
    _builder.newLine();
    _builder.append("lib64/");
    _builder.newLine();
    _builder.append("parts/");
    _builder.newLine();
    _builder.append("sdist/");
    _builder.newLine();
    _builder.append("var/");
    _builder.newLine();
    _builder.append("wheels/");
    _builder.newLine();
    _builder.append("share/python-wheels/");
    _builder.newLine();
    _builder.append("*.egg-info/");
    _builder.newLine();
    _builder.append(".installed.cfg");
    _builder.newLine();
    _builder.append("*.egg");
    _builder.newLine();
    _builder.append("MANIFEST");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# PyInstaller");
    _builder.newLine();
    _builder.append("#  Usually these files are written by a python script from a template");
    _builder.newLine();
    _builder.append("#  before PyInstaller builds the exe, so as to inject date/other infos into it.");
    _builder.newLine();
    _builder.append("*.manifest");
    _builder.newLine();
    _builder.append("*.spec");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Installer logs");
    _builder.newLine();
    _builder.append("pip-log.txt");
    _builder.newLine();
    _builder.append("pip-delete-this-directory.txt");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Unit test / coverage reports");
    _builder.newLine();
    _builder.append("htmlcov/");
    _builder.newLine();
    _builder.append(".tox/");
    _builder.newLine();
    _builder.append(".nox/");
    _builder.newLine();
    _builder.append(".coverage");
    _builder.newLine();
    _builder.append(".coverage.*");
    _builder.newLine();
    _builder.append(".cache");
    _builder.newLine();
    _builder.append("nosetests.xml");
    _builder.newLine();
    _builder.append("coverage.xml");
    _builder.newLine();
    _builder.append("*.cover");
    _builder.newLine();
    _builder.append(".hypothesis/");
    _builder.newLine();
    _builder.append(".pytest_cache/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Translations");
    _builder.newLine();
    _builder.append("*.mo");
    _builder.newLine();
    _builder.append("*.pot");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Django stuff:");
    _builder.newLine();
    _builder.append("*.log");
    _builder.newLine();
    _builder.append("local_settings.py");
    _builder.newLine();
    _builder.append("db.sqlite3");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Flask stuff:");
    _builder.newLine();
    _builder.append("instance/");
    _builder.newLine();
    _builder.append(".webassets-cache");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Scrapy stuff:");
    _builder.newLine();
    _builder.append(".scrapy");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Sphinx documentation");
    _builder.newLine();
    _builder.append("docs/_build/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# PyBuilder");
    _builder.newLine();
    _builder.append("target/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Jupyter Notebook");
    _builder.newLine();
    _builder.append(".ipynb_checkpoints");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# IPython");
    _builder.newLine();
    _builder.append("profile_default/");
    _builder.newLine();
    _builder.append("ipython_config.py");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# pyenv");
    _builder.newLine();
    _builder.append(".python-version");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# celery beat schedule file");
    _builder.newLine();
    _builder.append("celerybeat-schedule");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# SageMath parsed files");
    _builder.newLine();
    _builder.append("*.sage.py");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Environments");
    _builder.newLine();
    _builder.append(".env");
    _builder.newLine();
    _builder.append(".venv");
    _builder.newLine();
    _builder.append("env/");
    _builder.newLine();
    _builder.append("venv/");
    _builder.newLine();
    _builder.append("ENV/");
    _builder.newLine();
    _builder.append("env.bak/");
    _builder.newLine();
    _builder.append("venv.bak/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Spyder project settings");
    _builder.newLine();
    _builder.append(".spyderproject");
    _builder.newLine();
    _builder.append(".spyproject");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Rope project settings");
    _builder.newLine();
    _builder.append(".ropeproject");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# mkdocs documentation");
    _builder.newLine();
    _builder.append("/site");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# mypy");
    _builder.newLine();
    _builder.append(".mypy_cache/");
    _builder.newLine();
    _builder.append(".dmypy.json");
    _builder.newLine();
    _builder.append("dmypy.json");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Pyre type checker");
    _builder.newLine();
    _builder.append(".pyre/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("## Arquivos gerados por Mac");
    _builder.newLine();
    _builder.append("*.DS_Store");
    _builder.newLine();
    _builder.newLine();
    _builder.append("##Staticfiles");
    _builder.newLine();
    _builder.append("core/static");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createRequirements(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("asgiref==3.2.10");
    _builder.newLine();
    _builder.append("astroid==2.4.2");
    _builder.newLine();
    _builder.append("behave==1.2.6");
    _builder.newLine();
    _builder.append("behave-django==0.4.0");
    _builder.newLine();
    _builder.append("colorama==0.4.3");
    _builder.newLine();
    _builder.append("commitizen==1.23.0");
    _builder.newLine();
    _builder.append("decli==0.5.1");
    _builder.newLine();
    _builder.append("dj-database-url==0.5.0");
    _builder.newLine();
    _builder.append("Django==3.0.8");
    _builder.newLine();
    _builder.append("django-crispy-forms==1.9.2");
    _builder.newLine();
    _builder.append("django-heroku==0.3.1");
    _builder.newLine();
    _builder.append("gunicorn==20.0.4");
    _builder.newLine();
    _builder.append("isort==4.3.21");
    _builder.newLine();
    _builder.append("Jinja2==2.11.2");
    _builder.newLine();
    _builder.append("lazy-object-proxy==1.4.3");
    _builder.newLine();
    _builder.append("MarkupSafe==1.1.1");
    _builder.newLine();
    _builder.append("mccabe==0.6.1");
    _builder.newLine();
    _builder.append("packaging==20.4");
    _builder.newLine();
    _builder.append("parse==1.16.0");
    _builder.newLine();
    _builder.append("parse-type==0.5.2");
    _builder.newLine();
    _builder.append("prompt-toolkit==3.0.5");
    _builder.newLine();
    _builder.append("psycopg2==2.7.5");
    _builder.newLine();
    _builder.append("pylint==2.5.3");
    _builder.newLine();
    _builder.append("pylint-django==2.1.0");
    _builder.newLine();
    _builder.append("pylint-plugin-utils==0.6");
    _builder.newLine();
    _builder.append("pyparsing==2.4.7");
    _builder.newLine();
    _builder.append("pytz==2020.1");
    _builder.newLine();
    _builder.append("questionary==1.5.2");
    _builder.newLine();
    _builder.append("selenium==2.53.6");
    _builder.newLine();
    _builder.append("six==1.15.0");
    _builder.newLine();
    _builder.append("sqlparse==0.3.1");
    _builder.newLine();
    _builder.append("termcolor==1.1.0");
    _builder.newLine();
    _builder.append("toml==0.10.1");
    _builder.newLine();
    _builder.append("tomlkit==0.5.11");
    _builder.newLine();
    _builder.append("typed-ast==1.4.1");
    _builder.newLine();
    _builder.append("wcwidth==0.2.5");
    _builder.newLine();
    _builder.append("whitenoise==5.2.0");
    _builder.newLine();
    _builder.append("wrapt==1.12.1");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createClassDiagram(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@startuml");
    _builder.newLine();
    _builder.newLine();
    {
      Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
      for(final Entity e : _filter) {
        {
          QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e.getSuperType());
          boolean _notEquals = (!Objects.equal(_fullyQualifiedName, "null"));
          if (_notEquals) {
            String _name = e.getSuperType().getName();
            _builder.append(_name);
            _builder.append(" <|-- ");
            String _name_1 = e.getName();
            _builder.append(_name_1);
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLine();
        {
          EList<Feature> _features = e.getFeatures();
          for(final Feature f : _features) {
            {
              String _string = f.getType().toString();
              boolean _equals = Objects.equal(_string, "Entity");
              if (_equals) {
                String _name_2 = e.getName();
                _builder.append(_name_2);
                _builder.append(" --> ");
                QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(f.getType());
                _builder.append(_fullyQualifiedName_1);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("@enduml");
    _builder.newLine();
    return _builder;
  }
}

from django.shortcuts import render, redirect
from django.views.generic.base import TemplateView
from django.views.generic.edit import CreateView, UpdateView, DeleteView
from django.views.generic.list import ListView
from django.contrib.messages.views import SuccessMessageMixin
from .models import  Organization,  Project,  Team,  ProjectTeam,  Person,  TeamMember, 
from django.urls import reverse_lazy

from django.contrib import messages
from django.contrib.auth.mixins import LoginRequiredMixin

class OrganizationCreate(LoginRequiredMixin,SuccessMessageMixin,CreateView):
    login_url = '/login/'
    redirect_field_name = 'redirect_to'

    model = Organization
    success_url = reverse_lazy('organization_list')
    success_message = "Organization criado com sucesso"
    
class OrganizationList(LoginRequiredMixin,ListView):
    login_url = '/login/'
    redirect_field_name = 'redirect_to'

    model = Organization
    template_name = "core/organization_list.html"

    def get_querySet(self):
        return {'rows' : Organization.objects.filter(),
                'cols' : ['name', 'cnpj', 'Ações']}
    
class OrganizationUpdate(LoginRequiredMixin,SuccessMessageMixin,UpdateView):
    login_url = '/login/'
    redirect_field_name = 'redirect_to'

    model = Organization
    success_url = reverse_lazy('organization_list')
    success_message = "Organization atualizado com sucesso"
    
class OrganizationDelete(LoginRequiredMixin,SuccessMessageMixin,DeleteView):
    login_url = '/login/'
    redirect_field_name = 'redirect_to'
    
    model = Organization
    sucess_url = reverse_lazy('organization_list')
    success_message = "Organization atualizado com sucesso"
    
class ProjectCreate(LoginRequiredMixin,SuccessMessageMixin,CreateView):
    login_url = '/login/'
    redirect_field_name = 'redirect_to'

    model = Project
    success_url = reverse_lazy('project_list')
    success_message = "Project criado com sucesso"
    
class ProjectList(LoginRequiredMixin,ListView):
    login_url = '/login/'
    redirect_field_name = 'redirect_to'

    model = Project
    template_name = "core/project_list.html"

    def get_querySet(self):
        return {'rows' : Project.objects.filter(),
                'cols' : ['name', 'org', 'Ações']}
    
class ProjectUpdate(LoginRequiredMixin,SuccessMessageMixin,UpdateView):
    login_url = '/login/'
    redirect_field_name = 'redirect_to'

    model = Project
    success_url = reverse_lazy('project_list')
    success_message = "Project atualizado com sucesso"
    
class ProjectDelete(LoginRequiredMixin,SuccessMessageMixin,DeleteView):
    login_url = '/login/'
    redirect_field_name = 'redirect_to'
    
    model = Project
    sucess_url = reverse_lazy('project_list')
    success_message = "Project atualizado com sucesso"
    
class ProjectTeamCreate(LoginRequiredMixin,SuccessMessageMixin,CreateView):
    login_url = '/login/'
    redirect_field_name = 'redirect_to'

    model = ProjectTeam
    success_url = reverse_lazy('projectteam_list')
    success_message = "ProjectTeam criado com sucesso"
    
class ProjectTeamList(LoginRequiredMixin,ListView):
    login_url = '/login/'
    redirect_field_name = 'redirect_to'

    model = ProjectTeam
    template_name = "core/projectteam_list.html"

    def get_querySet(self):
        return {'rows' : ProjectTeam.objects.filter(),
                'cols' : ['project', 'Ações']}
    
class ProjectTeamUpdate(LoginRequiredMixin,SuccessMessageMixin,UpdateView):
    login_url = '/login/'
    redirect_field_name = 'redirect_to'

    model = ProjectTeam
    success_url = reverse_lazy('projectteam_list')
    success_message = "ProjectTeam atualizado com sucesso"
    
class ProjectTeamDelete(LoginRequiredMixin,SuccessMessageMixin,DeleteView):
    login_url = '/login/'
    redirect_field_name = 'redirect_to'
    
    model = ProjectTeam
    sucess_url = reverse_lazy('projectteam_list')
    success_message = "ProjectTeam atualizado com sucesso"
    
class TeamMemberCreate(LoginRequiredMixin,SuccessMessageMixin,CreateView):
    login_url = '/login/'
    redirect_field_name = 'redirect_to'

    model = TeamMember
    success_url = reverse_lazy('teammember_list')
    success_message = "TeamMember criado com sucesso"
    
class TeamMemberList(LoginRequiredMixin,ListView):
    login_url = '/login/'
    redirect_field_name = 'redirect_to'

    model = TeamMember
    template_name = "core/teammember_list.html"

    def get_querySet(self):
        return {'rows' : TeamMember.objects.filter(),
                'cols' : ['team', 'Ações']}
    
class TeamMemberUpdate(LoginRequiredMixin,SuccessMessageMixin,UpdateView):
    login_url = '/login/'
    redirect_field_name = 'redirect_to'

    model = TeamMember
    success_url = reverse_lazy('teammember_list')
    success_message = "TeamMember atualizado com sucesso"
    
class TeamMemberDelete(LoginRequiredMixin,SuccessMessageMixin,DeleteView):
    login_url = '/login/'
    redirect_field_name = 'redirect_to'
    
    model = TeamMember
    sucess_url = reverse_lazy('teammember_list')
    success_message = "TeamMember atualizado com sucesso"
    

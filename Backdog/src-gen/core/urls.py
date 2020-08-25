from django.contrib import admin
from django.urls import path
from django.conf.urls import url

from .views import (
OrganizationList, OrganizationCreate, OrganizationUpdate, OrganizationDelete,
ProjectList, ProjectCreate, ProjectUpdate, ProjectDelete,
ProjectTeamList, ProjectTeamCreate, ProjectTeamUpdate, ProjectTeamDelete,
TeamMemberList, TeamMemberCreate, TeamMemberUpdate, TeamMemberDelete,
)

urlpatterns = [
    path('organization/', OrganizationList.as_view(), name='organization_list'),
    path('organization/add/', OrganizationCreate.as_view(), name='organization_add'),
    path('organization/<int:pk>/update/', OrganizationUpdate.as_view(), name='organization_update'),
    path('organization/<int:pk>/delete/', OrganizationDelete.as_view(), name='organization_delete'),
    path('project/', ProjectList.as_view(), name='project_list'),
    path('project/add/', ProjectCreate.as_view(), name='project_add'),
    path('project/<int:pk>/update/', ProjectUpdate.as_view(), name='project_update'),
    path('project/<int:pk>/delete/', ProjectDelete.as_view(), name='project_delete'),
    path('projectteam/', ProjectTeamList.as_view(), name='projectteam_list'),
    path('projectteam/add/', ProjectTeamCreate.as_view(), name='projectteam_add'),
    path('projectteam/<int:pk>/update/', ProjectTeamUpdate.as_view(), name='projectteam_update'),
    path('projectteam/<int:pk>/delete/', ProjectTeamDelete.as_view(), name='projectteam_delete'),
    path('teammember/', TeamMemberList.as_view(), name='teammember_list'),
    path('teammember/add/', TeamMemberCreate.as_view(), name='teammember_add'),
    path('teammember/<int:pk>/update/', TeamMemberUpdate.as_view(), name='teammember_update'),
    path('teammember/<int:pk>/delete/', TeamMemberDelete.as_view(), name='teammember_delete'),
]

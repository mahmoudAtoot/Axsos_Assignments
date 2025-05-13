from django.urls import path
from . import views

urlpatterns = [
    path('', views.index),
    path('register', views.register),
    path('login', views.login),
    path('logout', views.logout),
    path('dashboard', views.dashboard),
    path('create_project', views.create_project),
    path('add_project', views.add_project),
    path('project/<int:id>/details', views.show_project),
]

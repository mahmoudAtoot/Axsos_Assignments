from django.urls import path
from . import views

urlpatterns = [
    path('', views.index),
    path('guess/', views.great_num)
]

    
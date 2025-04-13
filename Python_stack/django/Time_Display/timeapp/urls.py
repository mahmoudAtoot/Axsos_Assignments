from django.contrib import admin
from django.urls import path
from . import views 
urlpatterns = [
    path('admin/', admin.site.urls),
    path('', views.index), 
    path('time_display/', views.index),  
]
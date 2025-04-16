from django.urls import path,include
from . import views
urlpatterns = [
    path('',views.index),
    path('dojo/create/',views.add_user),
    path('ninja/create/', views.create_ninja ),
]

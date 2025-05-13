from django.urls import path
from . import views

urlpatterns = [
    path('', views.index),
    path('register', views.register),
    path('login', views.login),
    path('logout', views.logout),
    path('books', views.books),
    path('add_book', views.add_book),
    path('books/<int:book_id>/', views.view_book, name='view_book'),
    path('books/<int:book_id>/favorite', views.favorite_book, name='favorite_book'),
    path('books/<int:book_id>/unfavorite', views.unfavorite_book, name='unfavorite_book'),
    path('books/<int:book_id>/edit', views.edit_book, name='edit_book'),
    path('books/<int:book_id>/delete', views.delete_book, name='delete_book'),
]

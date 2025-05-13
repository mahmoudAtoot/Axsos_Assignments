from django.urls import path
from . import views
urlpatterns = [
    
    path('', views.index ,name ='index'),
    path('books', views.books),
    path('authors', views.authors),
    path('add_book', views.add_book),
    path('add_author', views.add_author),
    path('books/<int:id>',views.book_detail),
    path('authors/<int:id>',views.author_detail),
    path('connection_with_author/<int:id>',views.connection_with_author),
    path('connection_with_book/<int:id>',views.connection_with_book),
    
    ]

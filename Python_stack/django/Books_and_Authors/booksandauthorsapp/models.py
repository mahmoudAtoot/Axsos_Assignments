from django.db import models
# Create your models here.


class Book(models.Model):
    title = models.CharField(max_length=100)
    description = models.TextField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    
    def add_book(postdata):
        Book.objects.create(title=postdata['title'],description=postdata['description'])
    
    def show_book():
        return Book.objects.all()
    
    def get_book_by_id(id):
        return Book.objects.get(id=id)
    
    def connection_with_author(postdata , id):
        author = Author.objects.get( id = postdata['author_id'])
        book = Book.objects.get(id =id)
        book.authors.add(author)
    
class Author(models.Model):
    first_name = models.CharField(max_length=100)
    last_name = models.CharField(max_length=100)
    note = models.TextField()
    books = models.ManyToManyField(Book, related_name="authors")
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    
    def add_author(postdata):
        Author.objects.create(first_name=postdata['firstname'],last_name=postdata['lasttname'],note=postdata['note'])
    
    def show_author():
        return Author.objects.all()
    
    def get_author_by_id(id):
        return Author.objects.get(id=id)
    
    def connection_with_book(postdata , id):
        book = Book.objects.get( id = postdata['book_id'])
        author = Author.objects.get(id =id)
        book.authors.add(author)
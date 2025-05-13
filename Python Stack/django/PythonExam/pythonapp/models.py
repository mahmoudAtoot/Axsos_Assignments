from django.db import models
import bcrypt
import re
# Create your models here.
class UserManager(models.Manager):
    def validate_login(self, postData):
        errors = {}
        if len(postData['email']) < 5:
            errors['email'] = "Email must be at least 5 characters"
        return errors
    def validate_register(self, postData):
        errors = {}
        EMAIL_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$')
        if len(postData['first_name']) < 2:
            errors['first_name'] = "First name must be at least 2 characters"
        if len(postData['last_name']) < 2:
            errors['last_name'] = "Last name must be at least 2 characters"
        if User.objects.filter(email=postData['email']).exists():
            errors['email'] = "Email already in use"
        if not EMAIL_REGEX.match(postData['email']):
            errors['email'] = "Invalid email address"
        if len(postData['password']) < 8:
            errors['password'] = "Password must be at least 8 characters"
        if postData['password'] != postData['confirm_password']:
            errors['password'] = "Passwords do not match"
        return errors
    

    def create_user(self, postData):
        hashed_pw = bcrypt.hashpw(postData['password'].encode(), bcrypt.gensalt()).decode()
        user = self.create(
            first_name=postData['first_name'],
            last_name=postData['last_name'],
            email=postData['email'],
            password=hashed_pw,
        )
        return user

    def authenticate_user(self, email, password):
        try:
            user = self.get(email=email)
            if bcrypt.checkpw(password.encode(), user.password.encode()):
                return (True, user)
            else:
                return (False, "Invalid email or password")
        except User.DoesNotExist:
            return (False, "Invalid email or password")

class User(models.Model):
    first_name = models.CharField(max_length=255)
    last_name = models.CharField(max_length=255)
    email = models.EmailField()
    password = models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    objects = UserManager()

    def get_user_by_id(user_id):
        return User.objects.get(id=user_id)


class ProjectManager(models.Manager):
    def validate_project(self, postData):
        errors = {}
        if len(postData['project_name']) < 3:
            errors['project_name'] = "Project name must be at least 3 characters."
        if len(postData['description']) < 10:
            errors['description'] = "Description must be at least 10 characters."
        if postData['start_date'] > postData['end_date']:
            errors['date'] = "End date must be after start date."
        return errors

    
   
class Project(models.Model):
    project_name = models.CharField(max_length=255)
    description = models.TextField()
    start_date = models.DateField()
    end_date = models.DateField()
    uploaded_by = models.ForeignKey(User, related_name="projects_uploaded", on_delete=models.CASCADE)
    users_who_joined = models.ManyToManyField(User, related_name="projects_joined")
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = ProjectManager()

    def create_project( postData, user_id):
        user = User.objects.get(id=user_id)
        project = Project.objects.create(
            project_name=postData['project_name'],
            description=postData['description'],
            start_date=postData['start_date'],
            end_date=postData['end_date'],
            uploaded_by=user
        )
        
        project.users_who_joined.add(user)
        
    def get_all_projects():
        return Project.objects.all()
    
    def get_book_by_id(book_id):
        book = Project.objects.get(id=book_id)
        return book   
        
def register_user(first_name, last_name, email, password):
    hashed = bcrypt.hashpw(password.encode(), bcrypt.gensalt()).decode()
    user = User.objects.create(first_name=first_name, last_name=last_name, email=email, password=hashed)
    return user

def login_user(email, password):
        user = User.objects.filter(email=email)
        if not user:
            return None
        if bcrypt.checkpw(password.encode(), user[0].password.encode()):
            return user[0]
        else:
            return None

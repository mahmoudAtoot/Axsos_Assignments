from django.db import models
import re
import bcrypt

class UserManager(models.Manager):
    def validate_registration(self, postData):
        errors = {}
        if len(postData['first_name']) < 2 or not postData['first_name'].isalpha():
            errors['first_name'] = "First name must be at least 2 letters and contain only letters"
        if len(postData['last_name']) < 2 or not postData['last_name'].isalpha():
            errors['last_name'] = "Last name must be at least 2 letters and contain only letters"
        EMAIL_REGEX = re.compile(r'^[\w\.-]+@[\w\.-]+\.\w+$')
        if not EMAIL_REGEX.match(postData['email']):
            errors['email'] = "Invalid email format"
        if self.filter(email=postData['email']).exists():
            errors['email_taken'] = "Email is already in use"
        if len(postData['password']) < 8:
            errors['password'] = "Password must be at least 8 characters"
        if postData['password'] != postData['confirm']:
            errors['confirm'] = "Passwords do not match"
        return errors

    def create_user(self, postData):
        pw_hash = bcrypt.hashpw(postData['password'].encode(), bcrypt.gensalt()).decode()
        return self.create(
            first_name=postData['first_name'],
            last_name=postData['last_name'],
            email=postData['email'],
            password=pw_hash
        )

    def authenticate_user(self, email, password):
        try:
            user = self.get(email=email)
            if bcrypt.checkpw(password.encode(), user.password.encode()):
                return (True, user)
            else:
                return (False, "Invalid email or password")
        except self.model.DoesNotExist:
            return (False, "Invalid email or password")

class User(models.Model):
    first_name = models.CharField(max_length=255)
    last_name = models.CharField(max_length=255)
    email = models.EmailField(unique=True)
    password = models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    objects = UserManager()

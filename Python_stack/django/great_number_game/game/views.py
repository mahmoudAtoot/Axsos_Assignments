import random
from django.shortcuts import render, redirect

def index(request):
    if 'random_number' not in request.session:
        request.session['random_number'] = random.randint(1, 100)

    message = request.session.get('message', "")
    return render(request, 'index.html', {'message': message})

def guess_number(request):
    if request.method == "POST":
        try:
            guess = int(request.POST.get("guess"))
        except ValueError:
            request.session['message'] = "Invalid input! Please enter a number."
            return redirect('/')

        random_number = request.session['random_number']

        if guess < random_number:
            request.session['message'] = "Too low! Try again."
        elif guess > random_number:
            request.session['message'] = "Too high! Try again."
        else:
            request.session['message'] = "🎉 Congratulations! You guessed it right!"
            request.session.pop('random_number')  # Reset the game

    return redirect('/')
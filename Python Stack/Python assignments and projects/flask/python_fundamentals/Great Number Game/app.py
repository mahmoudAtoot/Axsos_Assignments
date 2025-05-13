from flask import Flask, render_template, request, redirect, session
import random

app = Flask(__name__)
app.secret_key = "super_secret_key"

@app.route('/')
def index():
    if 'number' not in session:
        session['number'] = random.randint(1, 100)
        session['attempts'] = 0
        session['message'] = ''
        session['status'] = ''
    return render_template("index.html", message=session['message'], status=session['status'], attempts=session['attempts'])

@app.route('/guess', methods=['POST'])
def guess():
    guess = int(request.form['guess'])
    number = session['number']
    session['attempts'] += 1

    if guess < number:
        session['message'] = "Too low!"
        session['status'] = "low"
    elif guess > number:
        session['message'] = "Too high!"
        session['status'] = "high"
    else:
        session['message'] = f"Correct! You guessed it in {session['attempts']} attempts."
        session['status'] = "correct"

    return redirect('/')

@app.route('/reset')
def reset():
    session.clear()
    return redirect('/')

if __name__ == "__main__":
    app.run(debug=True)

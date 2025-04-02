from flask import Flask

app = Flask(__name__)

@app.route('/')
def home():
    return "Hello World!"

@app.route('/Champion')
def champion():
    return "Champion!"

@app.route('/say/<name>')
def say_name(name):
    return f"Hi {name}"

@app.route('/repeat/<int:num>/<word>')
def repeat_word(num , word):
    return (word + " ") * num

@app.errorhandler(404)
def page_not_found(e):
    return "Sorry! No response. Try again.", 404

if __name__ == '__main__':
    app.run(debug=True)
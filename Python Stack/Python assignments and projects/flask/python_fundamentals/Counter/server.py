from flask import Flask, session, redirect, url_for, render_template

app = Flask(__name__)
app.secret_key = 'super_secret_key'  
@app.route('/')
def home():
    if 'count' in session:
        session['count'] += 1
    else:
        session['count'] = 0

    return render_template('index.html', count=session['count'])

@app.route('/destroy_session')
def destroy_session():
    session.clear() 
    return redirect(url_for('home'))  
if __name__ == '__main__':
    app.run(debug=True , port=3000)
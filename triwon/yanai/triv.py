from flask import Flask, render_template
app=Flask(__name__)

# normal routing pages
#@app.route('/')
#def hay_flask():
    #return "<h2> Hey this is first application </h2>"
    #return render_template("home.html")

# Dynamic routing 
#@app.route('/about/<username>') # behaviour of the routing will be changed according to the receiving variables
	#def about_page(username):
	#return f'<h3> This is about page of {username} {} </h3>'

@app.route('/')
@app.route('/home')
def one():
    #return "<h2>'Check the server error:'</h2>"
    return render_template('one.html')

@app.route('/About_Us')
def two():
    return render_template('one.html')
    #return "<h4> This is about page </h4>"

'''
@app.route('/My_page')
def my_page():
    items = [
        {id:101, 'name': 'lakshmanan', 'mobile':9444509480, 'price':500}
        #{id:102, 'name': 'sahayarani', 'mobile':9444509463, 'price':600}
        #{id:103, 'name': 'janaishree', 'mobile':9444509880, 'price':700}
    ]
    return (items)

# Another method of flask connecting code

from flask import Flask, render _template
app=Flask(__name__)

@app.route('/')
def index():
    return render_template('index')

if __name__== '__main__':
    app.run(debug=True)  // app.route, app.run


    '''
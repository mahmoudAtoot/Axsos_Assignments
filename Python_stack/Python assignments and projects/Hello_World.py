 
# 1. TASK: print "Hello World"
print( 'hello world' )
# 2. print "Hello Noelle!" with the name in a variable
name = "Mahmoud"
print( 'hello',name )    # with a comma
print( 'hello'+ name )    # with a +    
# 3. print "Hello 42!" with the number in a variable
num = 4
print( 'hello',num )    # with a comma
print( 'hello'+ str(num) )    # with a +    -- this one should give us an error!
# 4. print "I love to eat sushi and pizza." with the foods in variables
fave_food1 = "burger"
fave_food2 = "pizza"
print( 'i love to eat {food_one} and {food_two}'.format(food_one=fave_food1,food_two=fave_food2) ) # with .format()
print(f"i love to eat {fave_food1} and {fave_food2}" ) # with an f string
 
 
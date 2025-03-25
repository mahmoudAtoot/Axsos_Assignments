def flex_countdown(lowNum, highNum, mult):
    for i in range (lowNum, highNum+1):
        if i % mult == 0:
            print (i)
            
flex_countdown(2, 9, 3)
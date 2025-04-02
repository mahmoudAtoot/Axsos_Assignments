#1-basic:

# for i in range(151):
#     print(i)
    
#2-Multiples of Five:

# for i in range(1 , 1001,1):
#     if i % 5 ==0:
#         print(i)
        
#3-Counting, the Dojo Way:

# for i in range(1 , 101 , 1):
#       if i%10==0:
#         print("Coding Dojo")
        
#       elif i%5 == 0:
#         print("Coding")
        
#       else:
#           print(i)
        
    
    
# #4-Whoa. That Sucker's Huge:

# Oddtotal = 0
# for i in range(0, 500001):
#     if i % 2 != 0:
#         Oddtotal = Oddtotal + i

# print(Oddtotal)

# #5-Countdown by Fours:

# def count_down_four():
#     for i in range(2018 , 0 , -4):
#         print(i)
# count_down_four()   


# #6- Flexible Counter:

def flex_countdown(lowNum, highNum, mult):
    for i in range (lowNum, highNum+1):
        if i % mult == 0:
            print (i)
            
flex_countdown(3, 12, 6)
    
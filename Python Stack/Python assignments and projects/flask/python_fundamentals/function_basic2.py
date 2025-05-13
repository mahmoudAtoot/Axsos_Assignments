#1-Countdown

def countdown(num):
    arr=[]
    for i in range(num , 0 , -1):
        arr.append(i)
        
    return arr
print(countdown(5))

#2-Print and Return

def print_and_return(nums):
    print(nums[0])
    return nums[1]
print(print_and_return([1,2]))

# #3-First Plus Length

def first_plus_length(arr):
   return arr[0]+len(arr)

print(first_plus_length([1,2,3,4,5]))


# #4-Values Greater than Second

def values_greater_than_second(lst):
    lst2=[]
    if len(lst)< 2:
        return False
    for i in range (0,len(lst),1):
        if lst[i]>lst[1]:
            lst2.append(lst[i])
    return lst2

    
    
            
   
print(values_greater_than_second([5,2,3,2,1,4]),len(values_greater_than_second([5,2,3,2,1,4])))
print(values_greater_than_second([3]))

# #5-This Length, That Value

def length_and_value(size , value):
    arr= []
    for i in range(size):
        arr.append(value)
    return arr  

print(length_and_value(4,7))
print(length_and_value(6,2))




















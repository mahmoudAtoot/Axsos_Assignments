def biggie_size(lst):
    for i in range(len(lst)):
        if lst[i] > 0:
            lst[i] = "big"
    return lst

    
print(biggie_size([-1, 3, 5, -5]))    

def count_positives(list):
     positive_count = sum(1 for num in list if num > 0)  
     list[-1] = positive_count  
     return list
print(count_positives([-1,1,1,1]))
print(count_positives([1,6,-4,-2,-7,-2]))


def sum_totall(list):
    return sum(list)
print(sum_totall([1,2,3,4]))
print(sum_totall([6,3,-2]))

def average(list):
    return sum(list) / len(list)
print(average([1,2,3,4]))

def length(list):
    return len(list)
print(length([37,2,1,-9]))
print(length([]))

def minimum(list):
    if not list:
        return False
    return min(list)   
print(minimum([37,2,1,-9]))
print(minimum([]))    

def maximum(list):
    if not list:
        return False
    return max(list)
print(maximum([37,2,1,-9]))
print(maximum([]))

def ultimate_analysis(list):
   return {
        'sumTotal': sum(list),  
        'average': sum(list) / len(list),  
        'minimum': min(list),  
        'maximum': max(list),  
        'length': len(list) 
        }

print(ultimate_analysis([37,2,1,-9]))


def reverse_list(list):
     list.reverse()
     return list
print(reverse_list([37,2,1,-9]))
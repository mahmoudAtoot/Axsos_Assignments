def biggie_size(lst):
    for i in range(len(lst)):
        if lst[i] > 0:
            lst[i] = "big"
    return lst

    
print(biggie_size([-1, 3, 5, -5]))    


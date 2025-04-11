x = [ [5,2,3], [10,8,9] ] 
students = [
     {'first_name':  'Michael', 'last_name' : 'Jordan'},
     {'first_name' : 'John', 'last_name' : 'Rosales'}
]
sports_directory = {
    'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
    'soccer' : ['Messi', 'Ronaldo', 'Rooney']
}
z = [ {'x': 10, 'y': 20} ]

x[1][0]=15
print(x)
students[0]['last_name'] = 'Bryant'
print(students)
sports_directory['soccer'][0]='Andres'
print(sports_directory)
z[0]['y']=30
print(z)


students2 = [
         {'first_name':  'Michael', 'last_name' : 'Jordan'},
         {'first_name' : 'John', 'last_name' : 'Rosales'},
         {'first_name' : 'Mark', 'last_name' : 'Guillen'},
         {'first_name' : 'KB', 'last_name' : 'Tonel'}
    ]


def iterateDictionary(list_of_dec):
    for i in range(len(list_of_dec)):
        print(list_of_dec[i])
iterateDictionary(students2) 

def iterateDictionary2(key,list_of_dec):
    for i in range(len(list_of_dec)):
        print(list_of_dec[i][key])
iterateDictionary2('first_name',students2)     
iterateDictionary2('last_name',students2)     

dojo = {
   'locations': ['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
   'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
}


def print_info(dec_of_list):
    for i in dec_of_list.keys():
        print(len(dec_of_list[i]),i)
        for val in range(len(dec_of_list[i])):
            print(dec_of_list[i][val])
        print("")    
print_info(dojo)
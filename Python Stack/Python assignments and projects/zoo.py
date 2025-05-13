from lions import Lions
from Monkeys import Monkey
from bears import Bears
class Zoo():
    def __init__(self, zoo_name):
        self.animals = []
        self.name = zoo_name
    def add_lions(self, name , age , health , happiens , speed):
        self.animals.append( Lions(name , age , health , happiens , speed) )
    def add_Bears(self,  name , age , health , happiens, weight):
        self.animals.append( Bears (name, age , health , happiens, weight) )
    def add_monkeys(self,  name , age , health , happiens, climbing_skill):
        self.animals.append( Monkey (name, age , health , happiens, climbing_skill) )
    def print_all_info(self):
        print("-"*30, self.name, "-"*30)
        for animal in self.animals:
            animal.display_info()
zoo1 = Zoo("World Zoo")
zoo1.add_lions("Nala" , 8 , 60 , 60 , 80)
zoo1.animals[0].feed()
zoo1.add_lions("Simba" , 6 , 60 , 60 , 60)
zoo1.animals[1].feed()
zoo1.add_Bears("Rajah" , 25 , 60 , 60 , 500)
zoo1.animals[2].feed()
zoo1.add_Bears("Shere Khan" ,  35 , 60 , 60 , 700)
zoo1.animals[3].feed()
zoo1.add_monkeys("Zaza" ,  25 , 60 , 60 , "climbing")
zoo1.animals[4].feed()
zoo1.add_monkeys("Moza" ,  30 , 60 , 60 , "climbing")
zoo1.animals[5].feed()
zoo1.print_all_info()
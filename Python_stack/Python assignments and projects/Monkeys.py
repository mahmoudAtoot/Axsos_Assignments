from animals import Animal


class Monkey(Animal):
    def __init__(self, name , age , health , happiens, climbing_skill):
        super().__init__(name, age , health , happiens)
        self.climbing_skill = climbing_skill


    def feed(self):
        self.health += 15
        self.happiens += 20

    def display_info(self):
        print(f" Name: {self.name} - Age: {self.age} - Health: {self.health} - Happines: {self.happiens} - skill {self.climbing_skill}")  
    
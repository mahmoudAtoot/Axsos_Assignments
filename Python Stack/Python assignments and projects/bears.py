from animals import Animal


class Bears(Animal):
    def __init__(self,  name , age , health , happiens, weight ):
        super().__init__(name, age , health , happiens)
        self.weight = weight
        
        
        
    def feed(self):
        self.health += 25
        self.happiens += 40
    
    
    def display_info(self):
        print(f" Name: {self.name} - Age: {self.age} - Health: {self.health} - Happines: {self.happiens} - weight {self.weight}")
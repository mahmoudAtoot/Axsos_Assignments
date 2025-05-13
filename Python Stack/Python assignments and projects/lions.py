from animals import Animal
  
class Lions(Animal):
    def __init__(self  , name , age , health , happiens , speed):
        super().__init__(name, age , health , happiens)
        self.speed = speed
      

    def feed(self):
        self.health += 30
        self.happiens += 35
        
    def display_info(self):
        print(f" Name: {self.name} - Age: {self.age} - Health: {self.health} - Happines: {self.happiens} - speed: {self.speed} ")     
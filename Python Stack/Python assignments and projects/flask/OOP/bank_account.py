class BankAccount:
    def __init__(self, int_rate , balance):
            self.int_rate = int_rate
            self.balance= balance
            balance = 0 
            int_rate = 0.01
    def deposit(self, amount):
        self.balance +=amount
        return self
    
    def withdraw(self, amount):
        if self.balance < amount:
            print("Insufficient funds: Charging a $5 fee")
            self.balance -= 5
        else:
            self.balance -=amount
        return self
        
    def display_account_info(self):
        print(f"balance:{self.balance}")
        return self
        
    def yield_interest(self):
        if self.balance > 0:
            self.balance = self.balance*self.int_rate
        return self
    
accout1 = BankAccount(int_rate=0.2 , balance= 200)
accout2 = BankAccount(int_rate=0.1 , balance= 100)

accout1.deposit(50).deposit(100).deposit(100).withdraw(100).yield_interest().display_account_info()
accout2.deposit(300).deposit(100).withdraw(100).withdraw(100).withdraw(100).withdraw(100).yield_interest().display_account_info()


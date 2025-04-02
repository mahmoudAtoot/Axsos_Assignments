from bank_account import BankAccount

class User():
    def __init__(self,name,balance,int_rate):
        self.name=name
        self.account=BankAccount(balance,int_rate)

    def display_account_info(self):
        print(f"name: {self.name}balance:{self.account.balance}")
        return self
    
add =User("Mahmoud",1000,0.03)
print(add.account.int_rate)
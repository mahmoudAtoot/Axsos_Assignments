from bank_account import BankAccount

class User:
    def __init__(self, name, starting_balance=0, interest_rate=0.03):
        self.name = name
        self.account = BankAccount(starting_balance, interest_rate)

    def deposit(self, amount):
        self.account.deposit(amount)

    def withdrawal(self, amount):
        self.account.withdraw(amount)

    def display_user_balance(self):
        print(f"{self.name}'s account balance: ${self.account.balance}")
    
mah =User("Mahmoud",1000 , 0.03)
mah.deposit(200)
mah.withdrawal(100)
mah.display_user_balance()

print(mah.account.int_rate)
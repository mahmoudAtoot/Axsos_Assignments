   
class User:
    def __init__(self, name, balance):
        self.name = name
        self.balance = balance
    
    def make_withdrawal(self, amount):
        if amount > 0 and self.balance >= amount:
            self.balance -= amount
            print(f"Withdrawal of ${amount} successful. New balance: ${self.balance}")
        else:
            print("Withdrawal failed: insufficient balance or invalid amount.")
        return self

    def display_user_balance(self):
        print(f"User: {self.name}, Balance: ${self.balance}")
        return self

    def transfer_money(self, other_user, amount):
        if amount > 0 and self.balance >= amount:
            self.balance -= amount
            other_user.balance += amount
            print(f"${amount} transferred from {self.name} to {other_user.name}. New balance: ${self.balance}")
        else:
            print("Transfer failed: insufficient balance or invalid amount.")
        return self
    def make_deposit(self, amount):
        if amount > 0:
            self.balance += amount
            print(f"{self.name} deposited ${amount}. New balance: ${self.balance}")
        else:
            print("Deposit failed: invalid amount.")
        return self



mahmoud = User("Mahmoud", 0)
omar = User("Omar", 0)
ahmad = User("Ahmad", 0)


mahmoud.make_deposit(50).make_deposit(75).make_deposit(25).make_withdrawal(50).display_user_balance()
omar.make_deposit(200).make_deposit(100).make_withdrawal(100).make_withdrawal(50).display_user_balance()
ahmad.make_deposit(400).make_withdrawal(50).make_withdrawal(25).make_withdrawal(75).display_user_balance()






   
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

    def display_user_balance(self):
        print(f"User: {self.name}, Balance: ${self.balance}")

    def transfer_money(self, other_user, amount):
        if amount > 0 and self.balance >= amount:
            self.balance -= amount
            other_user.balance += amount
            print(f"${amount} transferred to {other_user.name}. New balance: ${self.balance}")
        else:
            print("Transfer failed: insufficient balance or invalid amount.")
            
    def make_deposit(self, amount):
        if amount > 0:
            self.balance += amount
            print(f"{self.name} deposited ${amount}. New balance: ${self.balance}")
        else:
            print("Deposit failed: invalid amount.")


mahmoud = User("Mahmoud", 0)
omar = User("Omar", 0)
ahmad = User("Ahmad", 0)


mahmoud.make_deposit(50)
mahmoud.make_deposit(75)
mahmoud.make_deposit(25)
mahmoud.make_withdrawal(50)
mahmoud.display_user_balance()

omar.make_deposit(200)
omar.make_deposit(100)
omar.make_withdrawal(100)
omar.make_withdrawal(50)
omar.display_user_balance()

ahmad.make_deposit(400)
ahmad.make_withdrawal(50)
ahmad.make_withdrawal(25)
ahmad.make_withdrawal(75)
ahmad.display_user_balance()

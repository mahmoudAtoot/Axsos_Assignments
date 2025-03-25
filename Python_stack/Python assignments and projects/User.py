   
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


mahmoud = User("Mahmoud", 150)
omar = User("Omar", 100)



mahmoud.make_withdrawal(50)
mahmoud.display_user_balance()
mahmoud.transfer_money(omar, 50)
mahmoud.display_user_balance()
omar.display_user_balance()


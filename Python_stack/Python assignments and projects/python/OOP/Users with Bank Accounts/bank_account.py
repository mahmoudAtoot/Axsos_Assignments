class BankAccount:
    def __init__(self, balance=0,int_rate=0.03):
        self.balance=balance
        self.int_rate=int_rate

    def deposit(self,amount):
        self.balance+=amount
        return self
    
    def withdraw(self, amount):
        if amount <= self.balance:
            self.balance -= amount
        else:
            print("Insufficient funds!")

    def display_balance(self):
        print(f"Account balance: ${self.balance:.2f}")

    
    
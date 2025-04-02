class BankAccount:
    def __init__(self, balance=0,int_rate=0.03):
        self.balance=balance
        self.int_rate=int_rate

    def deposit(self,amount):
        self.balance+=amount
        return self
    
    def withdrawal(self,amount):
        if(self.balance-amount<0):
            self.balance-=5
            print("Insufficient funds: Charging a $5 fee")
            return
        else:
            self.balance-=amount
        return self
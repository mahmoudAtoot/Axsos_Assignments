public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts=0;
    private static double totalMoney=0; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        accounts++; 
    }
    
        // GETTERS
        // for checking, savings, accounts, and totalMoney

    public double getcheckingBalance(){
        return checkingBalance;
    }


    public double grtSavingBalance(){
        return savingsBalance;
    }

    public static int getAccounts(){
        return accounts;
    }

    public static int getTotalMoney(){
        return (int) totalMoney;
    }



    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void deposit(double amount, String accountType) {
        if (amount > 0) {
            if (accountType.equalsIgnoreCase("checking")) {
                checkingBalance += amount;
            } else if (accountType.equalsIgnoreCase("savings")) {
                savingsBalance += amount;
            } else {
                System.out.println("Invalid account type.");
                return;
            }
            totalMoney += amount; 
        }
    }


    // withdraw 
    // - users should be able to withdraw money from their checking or savings account

    public void withdraw(double amount, String accountType) {
        if (amount > 0) {
            if (accountType.equalsIgnoreCase("checking") && amount <= checkingBalance) {
                checkingBalance -= amount;
                totalMoney -= amount;
            } else if (accountType.equalsIgnoreCase("savings") && amount <= savingsBalance) {
                savingsBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient funds or invalid account type.");
                return;
            }
        }
    }

 

    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    // getBalance
    // - display total balance for checking and savings of a particular bank account

    public double getBalance() {
        return checkingBalance + savingsBalance;
    }


}
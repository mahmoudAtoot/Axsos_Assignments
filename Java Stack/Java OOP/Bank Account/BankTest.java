public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts

        BankAccount account1 = new  BankAccount();
        BankAccount account2 = new  BankAccount();
        BankAccount account3 = new  BankAccount();



        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney

        account1.deposit(500, "checking");
        System.out.println("Account 1 Checking Balance: $" + account1.getcheckingBalance());

        account2.deposit(1000, "saving");
        System.out.println("Account 2 Saving Balance: $" + account2.grtSavingBalance());

        account3.deposit(750, "checking");
        System.out.println("Account 3 Checking Balance: $" + account3.getcheckingBalance());


        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney

        account1.withdraw(200, "checking");
        System.out.println("Account 1 Balance After Withdrawal: $" + account1.getBalance());

        account2.withdraw(500, "savings");
        System.out.println("Account 2 Balance After Withdrawal: $" + account2.getBalance());

        account3.withdraw(800, "checking");
        System.out.println("Account 3 Balance After Withdrawal: $" + account3.getBalance());



        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("Total Bank Accounts: " + BankAccount.getAccounts());
        System.out.println("Total Money in Bank: $" + BankAccount.getTotalMoney());
    }


}

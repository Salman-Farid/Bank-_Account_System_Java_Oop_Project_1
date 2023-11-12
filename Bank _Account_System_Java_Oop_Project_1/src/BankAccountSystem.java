public class BankAccountSystem {
    public static BankAccount createAccount(int accountNumber, String accountName) {
        return new BankAccount(accountNumber, accountName);
    }

    public static void main(String[] args) {
        BankAccount account1 = createAccount(20301280, "John Doe");
        account1.deposit(1000);
        account1.withdraw(500);
        account1.deposit(200);
        account1.printStatement();
        System.out.println("Account 1 Balance: " + account1.getBalance());

        System.out.println();

        BankAccount account2 = createAccount(20301273, "Salman");
        account2.deposit(20000);
        account2.withdraw(5034);
        account2.withdraw(233);
        account2.withdraw(5040);
        account2.withdraw(505);
        account2.withdraw(50);
        account2.deposit(2000);
        account2.printStatement();
        System.out.println("Account 2 Balance: " + account2.getBalance());
        System.out.println();

        CheckingAccount account3 = new CheckingAccount(789012, "Mina", 10000);

        account3.deposit(50000);
        account3.deposit(5000);
        account3.deposit(5000);
        account3.withdraw(1000);
        account3.withdraw(2000);
        account3.printStatement();
        System.out.println("Account 3 Balance: " + account3.getBalance());
        System.out.println();
        SavingsAccount account4 =new SavingsAccount(56328, "Raju", (double) 20 /1000);
        account4.deposit(5000);
        account4.deposit(5000);
        account4.deposit(5000);
        account4.applyInterest();
        account4.applyInterest();
        account4.applyInterest();
        account4.printStatement();
        System.out.println("Account 4 Balance: " + account4.getBalance());
    }
}

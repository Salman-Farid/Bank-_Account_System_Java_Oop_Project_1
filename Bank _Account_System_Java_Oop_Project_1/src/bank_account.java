import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class BankAccount {
    private final int accountNumber;
    private double balance;
    private final List<Transaction> transactions;
    public BankAccount(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        Transaction transaction = new Transaction(new Date(), "Deposit", amount, balance);
        transactions.add(transaction);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            Transaction transaction = new Transaction(new Date(), "Withdrawal", amount, balance);
            transactions.add(transaction);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printStatement() {
        System.out.println("Statement for Account: " + accountNumber);
        for (Transaction total_transaction : transactions) {
            System.out.println(total_transaction);
        }
    }
}




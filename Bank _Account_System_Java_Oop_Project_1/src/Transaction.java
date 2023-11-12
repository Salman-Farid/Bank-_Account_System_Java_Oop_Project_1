import java.util.Date;

class Transaction {
    private final Date date;
    private final String type;
    private final double amount;
    private final double balanceAfterTransaction;

    public Transaction(Date date, String type, double amount, double balanceAfterTransaction) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.balanceAfterTransaction = balanceAfterTransaction;
    }

    @Override
    public String toString() {
        return "Date: " + date + ", Type: " + type + ", Amount: " + amount + ", Balance: " + balanceAfterTransaction;
    }
}

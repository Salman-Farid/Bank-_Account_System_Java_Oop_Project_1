class CheckingAccount extends BankAccount {
    private final double overdraftLimit;

    public CheckingAccount(int accountNumber, String accountName, double overdraftLimit) {
        super(accountNumber, accountName);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Exceeded overdraft limit");
        }
    }
}

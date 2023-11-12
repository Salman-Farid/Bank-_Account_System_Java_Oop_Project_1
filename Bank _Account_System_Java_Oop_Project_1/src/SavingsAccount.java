class SavingsAccount extends BankAccount {
    private final double interestRate;

    public SavingsAccount(int accountNumber, String accountName, double interestRate) {
        super(accountNumber, accountName);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }
}

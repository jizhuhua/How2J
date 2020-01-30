package how2j.ExceptionDemo;

public class Account {
    private double balance;

    public Account(double init) {
        this.balance = init;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        this.balance += amt;
    }

    public void withdraw(double amt) throws OverdraftException {
        if (balance < amt) {
            throw new OverdraftException("touzhi",amt-balance);
        }
        this.balance -= amt;
    }

}
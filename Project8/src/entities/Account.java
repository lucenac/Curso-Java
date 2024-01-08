package entities;

public class Account {
    private int number;
    private String holder;
    private double deposit;

    public Account() {
    }

    public Account (int number, String holder, double initalDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initalDeposit);
    }
    public Account (int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double deposit(double deposit) {
        this.deposit += deposit;
        return this.deposit;
    }

    public double newWithdraw(double withdraw) {
        this.deposit -= withdraw - 5.00;
        return this.deposit;
    }

    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $"
                + deposit;
    }

}

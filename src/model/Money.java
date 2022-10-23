package model;

/**
 * Knows user input
 * Manages user data and diagrams
 */
public class Money {

    private double amount;


    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount >= 0) {
            this.amount = amount;
        } else throw new IllegalArgumentException("Invalid amount entered");
    }
}

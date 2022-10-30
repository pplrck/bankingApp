package model;

import view.CreditPanel;

/**
 * Knows user input
 * Manages user data and diagrams
 */
public class Money {

    private double amount;
    private CreditPanel creditPanel;

    public Money(double amount) {
        this.amount = amount;
        creditPanel = new CreditPanel();
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount >= 0) {
            this.amount = amount;
        } else throw new IllegalArgumentException("Invalid amount entered");
    }

    /**
     * Get entered amount from user input in JTextArea
     */
    private void getCreditInput() {
        double input = Double.parseDouble(creditPanel.getCreditArea().toString());
        setAmount(input);
    }
}

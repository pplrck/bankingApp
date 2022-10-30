package view;

import javax.swing.*;
import java.awt.*;

/**
 * CreditPanel displays a JPanel to accept user input.
 * User is asked to enter credits here.
 * Also, CreditPanel display a history of the user entries
 */
public class CreditPanel extends JPanel {

    BorderLayout borderLayout;
    private JTextArea creditArea;
    private JButton saveButton, clearButton;

    public CreditPanel() {
        borderLayout = new BorderLayout();
        this.setLayout(borderLayout);

        initComponents();
        addToLayout();
    }

    public JTextArea getCreditArea() {
        if (creditArea == null) {
            throw new IllegalArgumentException("JTextArea is empty");
        } else return creditArea;
    }

    public void setCreditArea(JTextArea creditArea) {
        if (creditArea != null && creditArea.getText() != null) {
            this.creditArea = creditArea;
        } else throw new IllegalArgumentException("JTextArea must be empty");
    }

    /**
     * Initializes the Components
     */
    private void initComponents() {
        creditArea = new JTextArea();
        saveButton = new JButton("Speichern");
        clearButton = new JButton("Löschen");
    }

    /**
     * Adds elements to the layout
     */
    private void addToLayout() {
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(saveButton);
        buttonPanel.add(clearButton);
        this.add(buttonPanel, BorderLayout.PAGE_END); //this.add = füge DIESEM JPanel das ButtonPanel hinzu

        this.add(creditArea, BorderLayout.CENTER);
    }

    /**
     * Display the history of every credit entry
     */
    private void displayHistory() {

    }
}

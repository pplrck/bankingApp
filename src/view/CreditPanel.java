package view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * CreditPanel displays a JPanel to accept user input.
 * User is asked to enter credits here.
 * Also, CreditPanel display a history of the user entries
 */
public class CreditPanel extends JPanel {

    BorderLayout borderLayout;
    private JTextField creditText;
    private JButton saveButton, clearButton;
    private FlowLayout flowLayout;
    private ButtonGroup buttonGroup;

    public CreditPanel() {
        borderLayout = new BorderLayout();

        this.setLayout(borderLayout);
        flowLayout = new FlowLayout(FlowLayout.CENTER);
        borderLayout.addLayoutComponent();

        TitledBorder title = BorderFactory.createTitledBorder("Einnahmen eintragen");
        this.setBorder(title);

        initPanel();
        addToLayout();
    }


    /**
     * Initializes the layout
     */
    private void initPanel() {
        creditText = new JTextField();
        saveButton = new JButton("Speichern");
        clearButton = new JButton("Löschen");
    }

    /**
     * Adds elements to the layout
     */
    private void addToLayout() {
        this.add(creditText, BorderLayout.CENTER);
        this.add(saveButton);
        this.add(clearButton);
    }

    /**
     * Display the history of every credit entry
     */
    private void displayHistory() {

    }
}

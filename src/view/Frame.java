package view;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    private JButton credit, debit, save, open;
    CreditPanel creditPanel;
    ButtonGroup buttonGroup;

    /**
     * Displays the layout
     */
    public Frame() {
        super("Money App");

        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        MenuBar menu = new MenuBar();
        creditPanel = new CreditPanel();

        this.setJMenuBar(menu.getMenuBar());
        this.add(creditPanel, BorderLayout.CENTER);

        init();

        this.setSize(800, 600);
        this.setVisible(true);
    }

    private void init() {
        initJButtons();
    }

    private void initJButtons() {
        credit = new JButton("Einnahmen eintragen");
        debit = new JButton("Ausgaben eintragen");
        save = new JButton("Daten speichern");
        open = new JButton("Datei öffnen");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(credit);
        buttonGroup.add(debit);
        buttonGroup.add(save);
        buttonGroup.add(open);
    }

    private void initLayout() {

    }
}

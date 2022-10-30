package view;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    /**
     * Displays the layout
     */
    public Frame() {
        super("Money App");
        this.setSize(800, 600);

        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        MenuBar menu = new MenuBar();
        CreditPanel creditPanel = new CreditPanel();
        DebitPanel debitPanel = new DebitPanel();

        JTabbedPane tabPane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
        tabPane.addTab("Einnahmen eintragen", creditPanel);
        tabPane.addTab("Ausgaben eintragen", debitPanel);
        this.add(tabPane);

        this.setJMenuBar(menu.getMenuBar());

        this.setVisible(true);
    }
}

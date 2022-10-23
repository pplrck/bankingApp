package view;

import javax.swing.*;

public class Frame extends JFrame {

    private JButton credit, debit, save, open;

    /**
     * Displays the layout
     */
    public Frame(){
        super("Money App");
        this.setSize(800, 600);
        this.setVisible(true);
        MenuBar menu = new MenuBar();
        this.setJMenuBar(menu.getMenuBar());
    }

    private void init(){
        initJButtons();
    }

    private void initJButtons(){
        credit = new JButton("Einnahmen eintragen");
        debit = new JButton("Ausgaben eintragen");
        save = new JButton("Daten speichern");
        open = new JButton("Datei öffnen");
    }

    private void initLayout(){

    }
}

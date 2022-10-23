package view;

import javax.swing.*;

public class MenuBar extends JMenuBar {

    private JMenuBar menuBar;
    private JMenuItem save, load, close;
    private JMenu menu;

    public MenuBar() {
        menuBar = new JMenuBar();
        menu = new JMenu("Datei");
        save = new JMenuItem("Speichern");
        load = new JMenuItem("Datei öffnen");
        close = new JMenuItem("Schließen");
        menu.add(save);
        menu.add(load);
        menu.addSeparator();
        menu.add(close);
        menuBar.add(menu);
    }

    public JMenuItem getSave() {
        return save;
    }

    public JMenuItem getLoad() {
        return load;
    }

    public JMenuItem getClose() {
        return close;
    }

    public JMenuBar getMenuBar() {
        return menuBar;
    }
}

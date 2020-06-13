package com.VentanasMain;

import javax.swing.*;

public class App {
    private JPanel PrimerPanel;
    private JButton BotonUno;

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().PrimerPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

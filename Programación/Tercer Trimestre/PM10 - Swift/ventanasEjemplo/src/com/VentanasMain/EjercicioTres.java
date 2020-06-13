package com.VentanasMain;

import javax.swing.*;

public class EjercicioTres {
    private JPanel mainPanel;
    private JButton botón5Button;
    private JButton botón8Button;
    private JButton botón6Button;
    private JButton botón7Button;
    private JButton botón0Button;
    private JButton botón1Button;
    private JButton botón2Button;
    private JButton botón3Button;

    public static void main(String[] args) {
        JFrame frame = new JFrame("EjercicioTres");
        frame.setContentPane(new EjercicioTres().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

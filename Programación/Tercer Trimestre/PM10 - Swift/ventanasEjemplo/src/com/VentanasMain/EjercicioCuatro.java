package com.VentanasMain;

import javax.swing.*;

public class EjercicioCuatro {
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JRadioButton hRadioButton;
    private JRadioButton mRadioButton;
    private JCheckBox checkBox1;
    private JButton enviarButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("EjercicioCuatro");
        frame.setContentPane(new EjercicioCuatro().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

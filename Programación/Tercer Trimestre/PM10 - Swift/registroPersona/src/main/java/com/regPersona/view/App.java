package com.regPersona.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.regPersona.controller.Operaciones;
import com.regPersona.controller.exceptions.AlreadyExistsException;
import com.regPersona.controller.exceptions.FormatoException;
import com.regPersona.controller.exceptions.RegistroVacioException;
import com.regPersona.view.swingComps.KFrame;

public class App implements ActionListener {

    private static KFrame kframe = new KFrame();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    kframe.setResizable(false);
                    kframe.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Operaciones ourOP = new Operaciones(kframe);
        if (e.getSource().equals(kframe.btnAlta)) {
            try {
                if (ourOP.isCompleted() != null)
                    ourOP.addToFile(ourOP.isCompleted());
                else
                    throw new FormatoException("*", "Rellenar todos los datos.");
            } catch (ClassNotFoundException | FormatoException | IOException | AlreadyExistsException e1) {

                JOptionPane.showConfirmDialog(kframe.contentPane, e1.getMessage(), e1.getClass().toString(),
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);

            }
        } else {
            try {
                kframe.txaResult.setText(ourOP.readFileAlumno());
            } catch (RegistroVacioException ex) {

                JOptionPane.showConfirmDialog(kframe.contentPane, "El archivo está vacío.", "Corregir - Ingresar datos",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

            } catch (ClassNotFoundException | IOException e1) {

                JOptionPane.showConfirmDialog(kframe.contentPane, e1.getMessage(), e1.getClass().toString(),
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);

            }
        }
    }
}
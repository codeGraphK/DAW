package com.regPersona.view.swingComps;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorUIResource;

import com.regPersona.view.App;

public class KFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    public JPanel contentPane;
    public KButton btnAlta, btnListar;
    public KTextField txtNombre, txtApel, txtDni, txtDir, txtCiud, txtProv, txtCP, txtTel, txtEmail;
    public ArrayList<KTextField> listInputs = new ArrayList<>();
    public KComboBox<String> comCiclo;
    public KTextArea txaResult;

    public KFrame() {
        initComponents();
    }

    public void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Registro de Personas - Kevin Ruiz");
        setBounds(100, 100, 575, 390);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        contentPane.setBackground(new ColorUIResource(40, 42, 54));
        setContentPane(contentPane);

        JPanel dataIn = new JPanel();
        dataIn.setLayout(null);
        dataIn.setBackground(new ColorUIResource(40, 42, 54));
        dataIn.setBounds(20, 20, 535, 150);
        contentPane.add(dataIn);

        KLabel lbNombre = new KLabel("Nombre:");
        lbNombre.setBounds(0, 2, 45, 14);
        dataIn.add(lbNombre);

        txtNombre = new KTextField(10);
        txtNombre.setBounds(50, 0, 120, 18);
        txtNombre.setName("Nombre");
        listInputs.add(txtNombre);
        dataIn.add(txtNombre);

        KLabel lbApel = new KLabel("Apellidos:");
        lbApel.setBounds(190, 2, 53, 14);
        dataIn.add(lbApel);

        txtApel = new KTextField(10);
        txtApel.setBounds(250, 0, 120, 18);
        txtApel.setName("Apellido");
        listInputs.add(txtApel);
        dataIn.add(txtApel);

        KLabel lbDni = new KLabel("DNI:");
        lbDni.setBounds(420, 2, 25, 14);
        dataIn.add(lbDni);

        txtDni = new KTextField(8);
        txtDni.setBounds(450, 0, 85, 18);
        txtDni.setName("DNI");
        listInputs.add(txtDni);
        dataIn.add(txtDni);

        KLabel lbDir = new KLabel("Dirección:");
        lbDir.setBounds(0, 32, 54, 14);
        dataIn.add(lbDir);

        txtDir = new KTextField(12);
        txtDir.setBounds(60, 30, 120, 18);
        txtDir.setName("Dirección");
        listInputs.add(txtDir);
        dataIn.add(txtDir);

        KLabel lbCiud = new KLabel("Ciudad:");
        lbCiud.setBounds(201, 32, 42, 14);
        dataIn.add(lbCiud);

        txtCiud = new KTextField(10);
        txtCiud.setBounds(247, 30, 100, 18);
        txtCiud.setName("Ciudad");
        listInputs.add(txtCiud);
        dataIn.add(txtCiud);

        KLabel lbProv = new KLabel("Provincia:");
        lbProv.setBounds(380, 32, 53, 14);
        dataIn.add(lbProv);

        txtProv = new KTextField(10);
        txtProv.setBounds(435, 30, 100, 18);
        txtProv.setName("Provincia");
        listInputs.add(txtProv);
        dataIn.add(txtProv);

        KLabel lbCP = new KLabel("C.P:");
        lbCP.setBounds(0, 62, 24, 14);
        dataIn.add(lbCP);

        txtCP = new KTextField(10);
        txtCP.setBounds(30, 60, 50, 18);
        txtCP.setName("Código Postal");
        listInputs.add(txtCP);
        dataIn.add(txtCP);

        KLabel lbTel = new KLabel("Teléfono:");
        lbTel.setBounds(100, 62, 50, 14);
        dataIn.add(lbTel);

        txtTel = new KTextField(10);
        txtTel.setBounds(155, 60, 100, 18);
        txtTel.setName("Teléfono");
        listInputs.add(txtTel);
        dataIn.add(txtTel);

        KLabel lbEmail = new KLabel("Correo Electrónico:");
        lbEmail.setBounds(280, 62, 103, 14);
        dataIn.add(lbEmail);

        txtEmail = new KTextField(10);
        txtEmail.setBounds(385, 60, 150, 18);
        txtEmail.setName("Correo Electrónico");
        listInputs.add(txtEmail);
        dataIn.add(txtEmail);

        KLabel lbCiclo = new KLabel("Ciclo Formativo:");
        lbCiclo.setBounds(0, 92, 87, 14);
        dataIn.add(lbCiclo);

        comCiclo = new KComboBox<String>();
        comCiclo.setBounds(92, 90, 250, 18);
        comCiclo.addItem(null);
        comCiclo.addItem("Desarrollo de Aplicaciones Web");
        comCiclo.addItem("Desarrollo de Aplicaciones Multiplataforma");
        dataIn.add(comCiclo);

        btnAlta = new KButton("Alta Alumno");
        btnAlta.setBounds(435, 110, 100, 25);
        btnAlta.addActionListener(new App());
        dataIn.add(btnAlta);

        JPanel result = new JPanel();
        result.setLayout(null);
        result.setBackground(new ColorUIResource(40, 42, 54));
        result.setBounds(20, 165, 535, 170);
        contentPane.add(result);

        txaResult = new KTextArea();
        txaResult.setBounds(10, 5, 515, 130);
        result.add(txaResult);

        btnListar = new KButton("Mostrar Listado");
        btnListar.setBounds(425, 145, 110, 25);
        btnListar.addActionListener(new App());
        result.add(btnListar);
    }

}
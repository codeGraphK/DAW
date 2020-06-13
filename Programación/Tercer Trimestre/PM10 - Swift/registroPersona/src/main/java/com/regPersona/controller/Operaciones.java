package com.regPersona.controller;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.TreeSet;

import com.regPersona.controller.exceptions.AlreadyExistsException;
import com.regPersona.controller.exceptions.FormatoException;
import com.regPersona.controller.exceptions.RegistroVacioException;
import com.regPersona.model.Alumno;
import com.regPersona.view.swingComps.KFrame;
import com.regPersona.view.swingComps.KTextField;

public class Operaciones {

    private TreeSet<Alumno> treeAlumno = new TreeSet<Alumno>(new CompPersona());
    private File fileAlumnos = new File("/home/codegraphk/Documentos/registroPersona/RegAlumno.txt");
    private KFrame kFrame;

    public Operaciones(KFrame kfIn) {
        this.kFrame = kfIn;
    }

    public Operaciones(KFrame kfIn, File fIn) {
        this.kFrame = kfIn;
        this.fileAlumnos = fIn;
    }

    private boolean fileRegToSet(TreeSet<Alumno> tSet) throws IOException, ClassNotFoundException {
        FileInputStream flujoEntrada = new FileInputStream(this.fileAlumnos);
        ObjectInputStream filtroEntrada = new ObjectInputStream(flujoEntrada);

        try {
            tSet.clear();
            while (true)
                tSet.add((Alumno) filtroEntrada.readObject());
        } catch (EOFException e) {
            filtroEntrada.close();
            flujoEntrada.close();
        }

        return tSet.size() == 0;
    }

    private <E> void setToFileReg(TreeSet<E> tSet) throws IOException {
        FileOutputStream flujoSalida = new FileOutputStream(this.fileAlumnos);
        ObjectOutputStream filtroSalida = new ObjectOutputStream(flujoSalida);

        for (E p : tSet)
            filtroSalida.writeObject(p);

        filtroSalida.close();
        flujoSalida.close();
    }

    public void addToFile(Alumno alumIn) throws ClassNotFoundException, IOException, AlreadyExistsException {
        if (fileAlumnos.exists())
            fileRegToSet(treeAlumno);
        if (treeAlumno.contains(alumIn))
            throw new AlreadyExistsException();
        else
            treeAlumno.add(alumIn);
        setToFileReg(treeAlumno);
    }

    public String readFileAlumno() throws ClassNotFoundException, IOException, RegistroVacioException {
        String sResult = "";
        if (!fileRegToSet(treeAlumno)) {
            for (Alumno p : treeAlumno)
                sResult += p.getsApellido() + ", " + p.getsNombre()
                        + (p.getsApellido().length() + p.getsNombre().length() < 13 ? "\t\t" : "\t") + p.getsCiclo()
                        + "\t" + p.getsCorreoE() + "\t\t" + p.getiTelefono() + "\n";
        } else {
            throw new RegistroVacioException();
        }
        return sResult;
    }

    public Alumno isCompleted() throws FormatoException {
        Alumno aResult = null;
        String ci = "";
        int sz = kFrame.listInputs.size();
        boolean bKeep = kFrame.comCiclo.getSelectedItem() != null;

        String[] p = new String[sz];
        if (bKeep)
            ci = (((String) kFrame.comCiclo.getSelectedItem()).contains("Web")) ? "DAW" : "DAM";

        for (int i = 0; bKeep && i < sz; i++) {
            KTextField actual = kFrame.listInputs.get(i);
            if (!actual.getText().isEmpty()) {
                bKeep = isCorrect(actual);
                if (bKeep)
                    p[i] = actual.getText();
            } else
                throw new FormatoException(actual.getName(), "Debe rellenar el campo.");
        }

        if (bKeep)
            aResult = new Alumno(p[0], p[1], p[2], p[3], p[4], p[5], Integer.parseInt(p[6]), Integer.parseInt(p[7]),
                    p[8], ci);

        return aResult;
    }

    private boolean isCorrect(KTextField kIn) throws FormatoException {
        final char[] cListaLetras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
                'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
        boolean bResult = false;
        if (kIn.equals(kFrame.txtDni)) {
            if (kIn.getText().matches("[0-9]{8}[A-Z]")) {
                String dni = kIn.getText();
                char cLetra = cListaLetras[Integer.parseInt(dni.substring(0, 8)) % 23];
                if (dni.charAt(8) == cLetra)
                    bResult = !bResult;
                else
                    throw new FormatoException(kIn.getName(), "No le corresponde la letra.");
            } else {
                throw new FormatoException(kIn.getName(), "Ocho números y su letra mayús.");
            }
        } else if (kIn.equals(kFrame.txtEmail)) {
            bResult = kIn.getText().matches("[a-z0-9]+[@][a-z]+[.][a-z]{2,3}");
            if (!bResult)
                throw new FormatoException(kIn.getName(), "ejemplo@ejemplo.com");
        } else if (kIn.equals(kFrame.txtCP)) {
            bResult = kIn.getText().matches("[0-9]{5}");
            if (!bResult)
                throw new FormatoException(kIn.getName(), "Cinco números sin espacios.");
        } else if (kIn.equals(kFrame.txtTel)) {
            bResult = kIn.getText().matches("[0-9]{9}");
            if (!bResult)
                throw new FormatoException(kIn.getName(), "Nueve números sin espacios.");
        } else if (kIn.equals(kFrame.txtDir)) {
            bResult = kIn.getText().matches("^[A-Z][A-z0-9À-ÿ\s]*");
            if (!bResult)
                throw new FormatoException(kIn.getName(), "Inicie por mayús.");
        } else {
            bResult = kIn.getText().matches("^[A-Z][A-zÀ-ÿ\s]*");
            if (!bResult)
                throw new FormatoException(kIn.getName(), "Inicie por mayús y no contenga números.");
        }
        return bResult;
    }

}
package com.regPersona.model;

public class Alumno extends Persona {

    private static final long serialVersionUID = 1L;
    private String sCiclo;

    public Alumno(String sNombre, String sApellido, String sDni, String sDireccion, String sCiudad, String sProvincia,
            int iCodPostal, int iTelefono, String sCorreoE, String sCiclo) {
        super(sNombre, sApellido, sDni, sDireccion, sCiudad, sProvincia, iCodPostal, iTelefono, sCorreoE);
        this.sCiclo = sCiclo;
    }

    public String getsCiclo() {
        return sCiclo;
    }

    public void setsCiclo(String sCiclo) {
        this.sCiclo = sCiclo;
    }

}
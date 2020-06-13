package com.regPersona.model;

import java.io.Serializable;

public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    private String sNombre, sApellido, sDni, sDireccion, sCiudad, sProvincia, sCorreoE;
    private int iTelefono, iCodPostal;

    public Persona(String sNombre, String sApellido, String sDni, String sDireccion, String sCiudad, String sProvincia,
            int iCodPostal, int iTelefono, String sCorreoE) {
        this.sNombre = sNombre;
        this.sApellido = sApellido;
        this.sDni = sDni;
        this.sDireccion = sDireccion;
        this.sCiudad = sCiudad;
        this.sProvincia = sProvincia;
        this.sCorreoE = sCorreoE;
        this.iTelefono = iTelefono;
        this.iCodPostal = iCodPostal;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public String getsDni() {
        return sDni;
    }

    public void setsDni(String sDni) {
        this.sDni = sDni;
    }

    public String getsDireccion() {
        return sDireccion;
    }

    public void setsDireccion(String sDireccion) {
        this.sDireccion = sDireccion;
    }

    public String getsCiudad() {
        return sCiudad;
    }

    public void setsCiudad(String sCiudad) {
        this.sCiudad = sCiudad;
    }

    public String getsProvincia() {
        return sProvincia;
    }

    public void setsProvincia(String sProvincia) {
        this.sProvincia = sProvincia;
    }

    public String getsCorreoE() {
        return sCorreoE;
    }

    public void setsCorreoE(String sCorreoE) {
        this.sCorreoE = sCorreoE;
    }

    public int getiTelefono() {
        return iTelefono;
    }

    public void setiTelefono(int iTelefono) {
        this.iTelefono = iTelefono;
    }

    public int getiCodPostal() {
        return iCodPostal;
    }

    public void setiCodPostal(int iCodPostal) {
        this.iCodPostal = iCodPostal;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((sDni == null) ? 0 : sDni.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (sDni == null) {
            if (other.sDni != null)
                return false;
        } else if (!sDni.equals(other.sDni))
            return false;
        return true;
    }

}
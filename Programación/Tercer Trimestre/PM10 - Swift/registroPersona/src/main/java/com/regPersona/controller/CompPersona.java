package com.regPersona.controller;

import java.util.Comparator;

import com.regPersona.model.Persona;

public class CompPersona implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        int iResult = 0;
        if (!o1.equals(o2))
            iResult = o1.getsApellido().compareTo(o2.getsApellido()) + 1;
        return iResult;
    }

}
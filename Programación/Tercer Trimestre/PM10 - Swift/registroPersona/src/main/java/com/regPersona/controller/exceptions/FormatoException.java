package com.regPersona.controller.exceptions;

public class FormatoException extends Exception {

    private static final long serialVersionUID = 1L;

    public FormatoException(String campo, String info) {
        super("El campo " + campo + " no se encuentra en el formato deseado. " + info);
    }

}
package com.regPersona.controller.exceptions;

public class AlreadyExistsException extends Exception {

    private static final long serialVersionUID = 1L;

    public AlreadyExistsException() {
        super("El alumno ya existe.");
    }
}
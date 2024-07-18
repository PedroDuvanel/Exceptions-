package com.exceptions;

public class Minhaexception extends RuntimeExceptionException {

    private final String message;

    public Minhaexception() {
        super();
    }

    public Minhaexception(String message) {
        super(message);
    }

    public Minhaexception(String message, Throwable cause) {
        super(message, cause);
    }
}



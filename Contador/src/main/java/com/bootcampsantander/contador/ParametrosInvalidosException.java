package com.bootcampsantander.contador;

public class ParametrosInvalidosException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public String getMessage() {
        return " O segundo parametro deve ser maior que o primeiro.";
    }

}

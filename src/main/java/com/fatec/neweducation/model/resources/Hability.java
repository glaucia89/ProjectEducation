package com.fatec.neweducation.model.resources;

/**
 * Created by glaucia on 29/06/14.
 */
public enum Hability {

    FONETICA("Fonética"),
    VERBAL("Verbal");

    private String valor;

    Hability(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}

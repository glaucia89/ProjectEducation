package com.fatec.neweducation.model.resources;

/**
 * Created by glaucia on 29/06/14.
 */
public enum City {

    SAOJOSEDOSCAMPOS("São José dos Campos"),
    PIRACICABA("Piracicaba"),
    FORTALEZA("Fortaleza");

    private String valor;

    City(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}

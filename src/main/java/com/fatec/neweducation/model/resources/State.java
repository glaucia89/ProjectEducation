package com.fatec.neweducation.model.resources;

/**
 * Created by glaucia on 29/06/14.
 */
public enum State {

    SAOPAULO("São Paulo"),
    CEARA("Ceará");

    private String valor;

    State(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

}

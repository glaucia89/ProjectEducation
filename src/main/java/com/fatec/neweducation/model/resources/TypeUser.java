package com.fatec.neweducation.model.resources;

/**
 * Created by glaucia on 29/06/14.
 */
public enum TypeUser {

    EDUCADOR(1), USUARIO(2);

    private Integer valor;

    TypeUser(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

}

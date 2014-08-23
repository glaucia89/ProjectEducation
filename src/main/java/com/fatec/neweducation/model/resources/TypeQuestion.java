package com.fatec.neweducation.model.resources;

/**
 * Created by glaucia on 29/06/14.
 */
public enum TypeQuestion {

    FAE1(1),
    FAE2(2),
    FAE3(3),
    FAE4(4),
    FAE5(5),
    FAE6(6);

    private Integer valor;

    TypeQuestion(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

}

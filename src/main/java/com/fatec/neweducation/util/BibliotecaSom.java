/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fatec.neweducation.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author glaucia
 */
public class BibliotecaSom {

    private List<String> list;

    public BibliotecaSom() {
        this.buildSom();
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void buildSom() {
        this.list = new ArrayList<String>();

        this.list.add("aranha");
        this.list.add("boca");
        this.list.add("bola");
        this.list.add("bolha");
        this.list.add("bolinha");
        this.list.add("bolo");
        this.list.add("bomba");
        this.list.add("bombom");
        this.list.add("borboleta");
        this.list.add("branco");
        this.list.add("cachorro");
        this.list.add("castelo");
        this.list.add("chaveiro");
        this.list.add("chule");
        this.list.add("cola_2");
        this.list.add("coroa");
        this.list.add("disponibilidade");
        this.list.add("dorminhoca");
        this.list.add("espada");
        this.list.add("fala");
        this.list.add("farol");
        this.list.add("feia");
        this.list.add("futebol");
        this.list.add("gelo");
        this.list.add("gola");
        this.list.add("High1");
        this.list.add("ilha_2");
        this.list.add("ilha");
        this.list.add("lente");
        this.list.add("lua");
        this.list.add("macaco");
        this.list.add("mala");
        this.list.add("menuga");
        this.list.add("navio");
        this.list.add("nocivo");
        this.list.add("orelha");
        this.list.add("paralelepipedo");
        this.list.add("periquito");
        this.list.add("pincel");
        this.list.add("pista");
        this.list.add("plorito");
        this.list.add("pomba");
        this.list.add("ponto");
        this.list.add("prestigio");
        this.list.add("quadrado");
        this.list.add("ralo");
        this.list.add("rato");
        this.list.add("repolho");
        this.list.add("rua");
        this.list.add("sala");
        this.list.add("selo");
        this.list.add("soneca");
        this.list.add("sua");
        this.list.add("suja");
        this.list.add("teia");
        this.list.add("telefone");
        this.list.add("urso");
        this.list.add("vulcao");
        this.list.add("xicara");
        this.list.add("zebra");

        Collections.sort(list);

    }

}

package org.example;


public class Historico extends Setor {

    private static Historico historico = new Historico();

    private Historico() {};

    public static Historico getInstancia() {
        return historico;
    }
}


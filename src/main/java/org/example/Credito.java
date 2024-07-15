package org.example;

public class Credito extends Setor {

    private static Credito credito = new Credito();

    private Credito() {};

    public static Credito getInstancia() {
        return credito;
    }
}


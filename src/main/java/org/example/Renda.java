package org.example;

public class Renda extends Setor {

    private static Renda renda = new Renda();

    private Renda() {};

    public static Renda getInstancia() {
        return renda;
    }
}


package org.example;

public class Cliente {

    public boolean solicitarEmprestimo() {
        return ClienteFacade.verificarPendenciasEmprestimo(this);
    }
}

package org.example;

public class ClienteFacade {

    public static boolean verificarPendenciasEmprestimo(Cliente cliente) {
        if (Credito.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (Renda.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (Historico.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        return true;
    }
}


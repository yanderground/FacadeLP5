package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarPendenciaCreditoEmprestimo() {
        Cliente cliente = new Cliente();
        Credito.getInstancia().addClientePendente(cliente);

        assertFalse(cliente.solicitarEmprestimo());
    }

    @Test
    void deveRetornarPendenciaRendaEmprestimo() {
        Cliente cliente = new Cliente();
        Renda.getInstancia().addClientePendente(cliente);

        assertFalse(cliente.solicitarEmprestimo());
    }

    @Test
    void deveRetornarPendenciaHistoricoEmprestimo() {
        Cliente cliente = new Cliente();
        Historico.getInstancia().addClientePendente(cliente);

        assertFalse(cliente.solicitarEmprestimo());
    }

    @Test
    void deveRetornarClienteSemPendenciaEmprestimo() {
        Cliente cliente = new Cliente();

        assertTrue(cliente.solicitarEmprestimo());
    }
}

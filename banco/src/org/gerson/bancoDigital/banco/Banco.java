package org.gerson.bancoDigital.banco;

import org.gerson.bancoDigital.cliente.Cliente;
import org.gerson.bancoDigital.conta.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public void criarConta(Cliente cliente, Conta conta) {
        contas.add(conta);
        associarClienteConta(cliente, conta);
        clientes.add(cliente);
    }

    private void associarClienteConta(Cliente cliente, Conta conta) {
        conta.setCliente(cliente);
        cliente.setConta(conta);
    }

    public List<Conta> listarContas() {
        return contas;
    }
    public List<Cliente> listarClientes() {
        return clientes;
    }
}

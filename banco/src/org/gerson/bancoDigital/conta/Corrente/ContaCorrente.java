package org.gerson.bancoDigital.conta.Corrente;

import org.gerson.bancoDigital.cliente.Cliente;
import org.gerson.bancoDigital.conta.Conta;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void informacao() {
        System.out.println("==== EXTRATO CONTA CORRENTE ====");
        super.informacao();
    }
    public void sacar(double valor) {
        super.sacar(valor);
    }
    public void transferir(double valor,Conta conta) {
        super.transferir(valor,conta);
    }
    public void depositar(double valor) {
        super.depositar(valor);
    }


}

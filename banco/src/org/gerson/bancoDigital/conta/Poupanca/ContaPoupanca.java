package org.gerson.bancoDigital.conta.Poupanca;

import org.gerson.bancoDigital.cliente.Cliente;
import org.gerson.bancoDigital.conta.Conta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    public void informacao() {
        System.out.println("==== EXTRATO CONTA POUPANÇA ====");
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

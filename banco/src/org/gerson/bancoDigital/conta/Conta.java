package org.gerson.bancoDigital.conta;

import lombok.Data;
import org.gerson.bancoDigital.cliente.Cliente;
import org.gerson.bancoDigital.utils.HoraFormatter;

@Data
public class Conta {
    protected static int NUMERO_CONTA = 1;
    protected static int AGENCIA_PADRAO = 0001;
    String horaFormatada = HoraFormatter.getHoraFormatada();
    protected double saldo;
    protected int agencia;
    protected int numero;
    protected Cliente cliente;

    protected Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = NUMERO_CONTA++;
        this.cliente = cliente;
    }




    protected void transferir(double valor, Conta contaDestino)  {
        this.sacar(valor);
        contaDestino.depositar(valor);
        informacaoTransfencia(valor,contaDestino);

    }


    protected void depositar(double valor) {
        this.saldo += valor;
    }


    protected void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("saldo insuficiente");;
        }
    }

    //deixar publico por enquanto
    public void informacao() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    protected void informacaoTransfencia(double valor, Conta contaDestino) {
        System.out.println();
        System.out.println("===============================");
        System.out.println(" Comprovante de Transferência");
        System.out.println("===============================");
        System.out.println("Remetente:");
        System.out.printf("Cliente: %s%n", cliente.getNome());
        System.out.printf("Agência: %d   Conta: %d%n", this.agencia, this.numero);
        System.out.printf("Valor transferido: R$ %.2f%n", valor);
        System.out.println("Destinatário:");
        System.out.printf("Cliente: %s%n", contaDestino.getCliente().getNome());
        System.out.printf("Agência: %d   Conta: %d%n", contaDestino.getAgencia(), contaDestino.getNumero());
        System.out.println(String.format(horaFormatada));
        System.out.println("===============================");
        System.out.println();
    }
    protected void informacaoSaque(double valor){


        System.out.println("===============================");
        System.out.println("       Comprovante de Saque");
        System.out.println("===============================");
        System.out.printf("Cliente: %s%n", cliente.getNome());
        System.out.printf("Agência: %d   Conta: %d%n", this.agencia, this.numero);
        System.out.printf("Sacou o valor: R$ %.2f%n", valor);
        System.out.println(horaFormatada);
        System.out.println("===============================");
        System.out.println();

    }
}

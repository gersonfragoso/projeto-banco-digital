package org.gerson.bancoDigital.cliente;

import lombok.Data;
import org.gerson.bancoDigital.conta.Conta;

@Data
public class Cliente {
    private String id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private Conta conta;
    public Cliente(String nome, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }
}


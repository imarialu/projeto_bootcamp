package org.example.tratamentoDeExcecoes;

import lombok.Data;

@Data
public class Conta {

    private String tipoConta;
    private Double saldo;
    private Double taxaOperacao;

    public void sacar(Double valor) throws Exception{
        Double valorADescontar = valor + this.taxaOperacao;

        if(this.saldo <= 0 || this.saldo < valorADescontar){
            throw new Exception("Saldo insuficiente");
        }

        this.saldo -= valorADescontar;
    }
}

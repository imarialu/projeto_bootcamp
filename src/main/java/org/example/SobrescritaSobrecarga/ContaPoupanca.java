package org.example.SobrescritaSobrecarga;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Double saldo){
        super(saldo);
    }

    // Método sobrescrito
    @Override
    public void depositar(Double valor){
        this.saldo += valor;
    }
}

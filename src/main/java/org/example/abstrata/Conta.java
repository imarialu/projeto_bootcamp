package org.example.abstrata;

public abstract class Conta {
    private Double saldo;

    public Double getSaldo() { // Obtém o valor do atributo privado
        return saldo;
    }

    public void setSaldo(Double saldo) { // Define ou altera o valor do atributo privado
        this.saldo = saldo;
    }

    public abstract void imprimirExtrato(); // Será usado nas classes filhas, cada uma definirá seu comportamento
}

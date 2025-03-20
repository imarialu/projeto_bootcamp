package org.example.modificador;

public class TesteFinal {

    // Ao utilizar o >final<, os objetos não podem ser alterados, mas seus atributos sim
    final static Conta contaFinal = new Conta(500.00);

    public static void main(String[] args){
        contaFinal.setSaldo(600.00);
        System.out.println(contaFinal.getSaldo());
    }
}

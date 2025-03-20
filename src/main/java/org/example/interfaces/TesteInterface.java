package org.example.interfaces;

public class TesteInterface {

    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(5000.00);
        System.out.println("Saldo após depositar na corrente: " + cc.getSaldo());

        cc.sacar(1000.0);
        System.out.println("Saldo após sacar na corrente: " + cc.getSaldo());

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(15000.00);
        System.out.println("Saldo após depositar na poupança: " + cp.getSaldo());

        cp.sacar(3000.00);
        System.out.println("Saldo após sacar na poupança: " + cp.getSaldo());
    }
}

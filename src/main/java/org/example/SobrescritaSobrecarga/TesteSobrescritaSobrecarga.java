package org.example.SobrescritaSobrecarga;

public class TesteSobrescritaSobrecarga {

    public static void main(String[] args) {
        ContaPoupanca contaP = new ContaPoupanca(6000.00);
        contaP.depositar(500.00);

        ContaCorrente contaC = new ContaCorrente(9000.00);
        contaC.sacar(1000.00);

        ContaCorrente contaCComTaxa = new ContaCorrente(9000.00);
        contaCComTaxa.sacar(1000.00, 1.00);

        System.out.println("Saldo da conta poupança: " + contaP.getSaldo());
        System.out.println("Saldo da conta corrente sem taxa: " + contaC.getSaldo());
        System.out.println("Saldo da conta corrente com taxa: " + contaCComTaxa.getSaldo());
    }
}

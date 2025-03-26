package org.example.tratamentoDeExcecoes;

public class TesteExcecao {

    public static void main(String[] args) throws Exception{
        Conta conta = new Conta();
        conta.setSaldo(1000.00); // Atribui um valor ao saldo
        conta.setTaxaOperacao(1.00);

        try{
            System.out.println("Saldo da conta: " + conta.getSaldo());
            conta.sacar(300.00); // Tenta sacar
        }catch(Exception e){
            System.out.println(e.getMessage()); // Caso não consiga realizar, retornará a mensagem do exception
        }finally {
            System.out.println("Saldo da conta: " + conta.getSaldo());
        }
    }
}

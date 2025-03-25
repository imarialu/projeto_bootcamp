package org.example.Switch;

public class TesteSwitch {

    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();

        exibeTipoConta(contaCorrente);
        System.out.println("---------------------");
        exibeTipoContaJava17(contaPoupanca);
    }

    private static void exibeTipoConta(Conta conta){
        switch(conta.getTipoConta()){
            case "Conta Corrente":
                System.out.println("É uma conta corrente.");
                break;
            case "Conta Poupança":
                System.out.println("É uma conta poupança");
                break;
            case "Conta Comum":
                System.out.println("É uma conta comum");
                break;
            default:
                System.out.println("O tipo da conta não foi identificado");
        }
    };


    // Modo de contruir um switch a partir do java 17
    private static void exibeTipoContaJava17(Conta conta){
        String mensagem = switch (conta.getTipoConta()){
          case "Conta Corrente" -> "É uma conta corrente.";
          case "Conta Comum" -> "É uma conta comum";
          case "Conta Poupança" -> "É uma conta poupança";
          default -> "O tipo da conta não foi identificado";
        };

        System.out.println(mensagem);
    }
}

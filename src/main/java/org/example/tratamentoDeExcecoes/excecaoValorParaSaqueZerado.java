package org.example.tratamentoDeExcecoes;

public class excecaoValorParaSaqueZerado extends Exception{

    public String getMessage(){
        return "Valor para saque não pode ser zero";
    }
}

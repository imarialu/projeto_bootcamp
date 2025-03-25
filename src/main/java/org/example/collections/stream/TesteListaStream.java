package org.example.collections.stream;

import java.util.ArrayList;
import java.util.List;

public class TesteListaStream {

    public static void main(String[] args) {

        List<String> contas = new ArrayList();

        contas.add("Conta Poupança");
        contas.add("Conta Corrente");
        contas.add("Conta Pagamento");
        contas.add("Conta Poupança");

        // Stream: é uma forma de manipular listas, sets e maps
        contas.stream()
                .filter(conta -> filterLista(conta)) // conta chama a função filterLista
                .forEach(conta -> System.out.println("Tipo de conta: " + conta));

        long total = contas.stream()
                .filter(conta -> filterLista(conta))
                .count(); // Conta a quantidade de contas
        System.out.println("Total de contas poupanças: " + total); // Retorna a quantidade de contas, no caso, 2 poupanças
    }

    // Faz um filtro na lista para retornar apenas contas poupança
    public static Boolean filterLista(String conta){
        return conta.contains("Poupança");
    }

}

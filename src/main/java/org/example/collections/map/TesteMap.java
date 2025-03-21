package org.example.collections.map;


import java.util.HashMap;
import java.util.Map;

public class TesteMap {

    public static void main(String[] args) {

        // É necessário passar dois argumentos ao map, o tipo do valor da chave e o do conteúdo
        Map<String, String> contas = new HashMap<>();

        // put adiciona ao map
        contas.put("Conta Corrente", "Maria"); // Chave e valor
        contas.put("Conta Pagamento", "André");
        contas.put("Conta Poupança", "Jade");

        System.out.println(contas);
        System.out.println(contas.get("Conta Corrente")); // Acessa pelo valor da chave e retorna o conteúdo

        System.out.println(contas.keySet()); // Percorre o map e obtém seus valores
    }
}

package org.example.collections.set;

import java.util.HashSet;
import java.util.Set;

        public class TesteSet {

            public static void main(String[] args) {

                Set<String> contas = new HashSet<>(); // Lista de strings

                contas.add("Conta Poupança");
                contas.add("Conta Corrente");
                contas.add("Conta Pagamento");
                contas.add("Conta Poupança");

                contas.forEach(conta -> {
                    System.out.println("Conta -> " + conta);
                    System.out.println("Hash -> " + conta.hashCode());
                });


            }
        }

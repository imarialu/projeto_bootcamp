package org.example.collections.set;

import java.util.HashSet;
import java.util.Set;

public class TesteConta {

    public static void main(String[] args) {
        Set<Conta> contas = new HashSet<>();

        contas.add(new Conta(100L, 200.00));
        contas.add(new Conta(100L, 150.00));

        contas.forEach(conta -> System.out.println(conta));

    }
}

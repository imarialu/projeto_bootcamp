package org.example.exemploEqualsEIgualIgual;

public class TesteEqualsEIgualIgual {

    public static void main(String[] args){
        String nome1 = "André";
        String nome2 = "André";
        String nome3 = new String("André");

        // Equals: Compara as referencias, não o conteúdo do objeto
        // ==: Compara o conteúdo do dois objetos
        System.out.println("(nome1 == nome2): " + (nome1 == nome2)); // true
        System.out.println("(nome1 == nome3): " + (nome1 == nome3)); // false
        System.out.println("nome1.equals(nome2): " + nome1.equals(nome2)); // true
        System.out.println("nome1.equals(nome3): " + nome1.equals(nome3)); // true

        // equalsIgnoreCase: Ignora as diferenças do conteúdo
        String nome4 = "Maria";
        String nome5 = "maria";

        System.out.println("nome4.equals(nome5): " + nome4.equals(nome5)); // Retorna false, pois o java é case-sensitive, ou seja, diferencia maiúsculas de minúsculas
        System.out.println("nome4.equalsIgnoreCase(nome5): " + nome4.equalsIgnoreCase(nome5)); // true

    }
}

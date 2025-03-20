package org.example.lombok;

public class TestePessoa {

    public static void main(String[] args){
        Pessoa pessoaMaria = new Pessoa();

        pessoaMaria.setId(1L);
        pessoaMaria.setNome("Maria");
        pessoaMaria.setIdade(19);

        System.out.println("Id: " + pessoaMaria.getId());
        System.out.println("Nome: " + pessoaMaria.getNome());
        System.out.println("Idade: " + pessoaMaria.getIdade());

        System.out.println(pessoaMaria);
    }
}

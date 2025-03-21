package org.example.collections.set;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Conta {

    private Long numeroConta;
    private Double saldo;

    @Override
    public int hashCode(){
        return numeroConta.hashCode();
    }

    // Faz com que o hash não repita os objetos caso seus atributos sejam iguais
    @Override
    public boolean equals(Object obj) {
        Conta conta = (Conta) obj; // O object é do tipo conta
        return this.numeroConta.equals(conta.getNumeroConta());
    }
}

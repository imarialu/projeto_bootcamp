package org.example.lombok;

// Ao utilizar o lombok, não é necessário criar get e set para cada objeto, econimizando linha de código

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString //
public class Pessoa {

    private Long id;
    private String nome;
    private Integer idade;
}

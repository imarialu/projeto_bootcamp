package org.example.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class ExemploLocalDate {

    public static void main(String[] args){

        LocalDateTime data = LocalDateTime.now(); // Retorna as informações da data e hora atual
        System.out.println("Dia da semana: " +  data.getDayOfMonth());
        System.out.println("Mês: " + data.getMonthValue());
        System.out.println("Mês: " + data.getMonth());
        System.out.println("Ano: " + data.getYear());
        System.out.println("Hora: " + data.getHour());
        System.out.println("Minutos: " + data.getMinute());
        System.out.println("Segundos: " + data.getSecond());

        LocalDate outraData = LocalDate.of(2025, Month.FEBRUARY, 10);
        System.out.println(outraData);
        System.out.println(outraData.isLeapYear()); // Verifica se o é ano bissexto
        System.out.println(outraData.lengthOfMonth()); // Retorna a quantidade de dias no mês
    }
}

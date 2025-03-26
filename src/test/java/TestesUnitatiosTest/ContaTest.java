package TestesUnitatiosTest;

import static org.junit.Assert.assertEquals;
import org.example.TestesUnitarios.Conta;
import org.junit.Test;

public class ContaTest {

    Double saldo = 1000.00;
    Double taxaOperacao = 0.50;
    Double saldoFinal = 749.50;

    @Test
    public void sacarTest(){
        Conta conta = new Conta(saldo, taxaOperacao);
        conta.sacar(250.00);
        assertEquals(saldoFinal, conta.getSaldo());
    }
}

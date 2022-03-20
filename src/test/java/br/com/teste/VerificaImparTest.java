package br.com.teste;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerificaImparTest {

    private Valor valorTest;

    @Test
    public void testeVerificandoSeParEhImpar() {
        valorTest = new Valor(10);
        assertEquals(valorTest.verificaImpar(), true);
    }

    @Test
    public void testeVerificandoSeImparEhImpar() {
        valorTest = new Valor(5);
        assertEquals(valorTest.verificaImpar(), true);
    }
}

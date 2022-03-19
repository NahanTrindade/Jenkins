package br.com.teste;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerificaParTest {

    private Valor valorTest;

    @Test
    public void testeVerificandoSeImparEhPar() {
        valorTest = new Valor(5);
        assertEquals(valorTest.verificaPar(), false);
    }

    @Test
    public void testeVerificandoSeParEhPar() {
        valorTest = new Valor(10);
        assertEquals(valorTest.verificaPar(), true);
    }
}
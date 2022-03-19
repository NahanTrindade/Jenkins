package br.com.teste;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerificaParTest {

    private Valor valorTest;

    @BeforeEach
    public void setup(){
        valorTest = new Valor(10);
    }

    @Test
    public void testeVerificandoSeImparEhPar() {
        assertEquals(valorTest.verificaPar(), false);
    }

    @Test
    public void testeVerificandoSeParEhPar() {
        assertEquals(valorTest.verificaPar(), true);
    }
}
package br.com.teste;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerificaImparTest {

    private Valor valorTest;

    @BeforeEach
    public void setup(){
        valorTest = new Valor(10);
    }

    @Test
    public void testeVerificandoSeParEhImpar() {
        assertEquals(valorTest.verificaImpar(), false);
    }

    @Test
    public void testeVerificandoSeImparEhImpar() {
        assertEquals(valorTest.verificaImpar(), true);
    }
}
package org.example.modelo;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    public void testSumar() {
        double resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado, 0.0001);
    }

    @Test
    public void testRestar() {
        double resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado, 0.0001);
    }

    @Test
    public void testMultiplicar() {
        double resultado = calculadora.multiplicar(2, 3);
        assertEquals(6, resultado, 0.0001);
    }

    @Test
    public void testDividir() {
        double resultado = calculadora.dividir(6, 3);
        assertEquals(2, resultado, 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDividirPorCero() {
        calculadora.dividir(5, 0);  // Esto debería lanzar una ArithmeticException
    }
}

package org.example.controlador;

import org.example.modelo.Calculadora;
import org.example.vista.CalculadoraGui;

public class CalculadoraControlador {
    private Calculadora modelo;
    private CalculadoraGui vista;

    public CalculadoraControlador(Calculadora modelo, CalculadoraGui vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.setControlador(this);
    }

    public void realizarOperacion(String operacion, double a, double b) {
        try {
            double resultado;
            switch (operacion) {
                case "+" -> resultado = modelo.sumar(a, b);
                case "-" -> resultado = modelo.restar(a, b);
                case "*" -> resultado = modelo.multiplicar(a, b);
                case "/" -> resultado = modelo.dividir(a, b);
                default -> throw new IllegalArgumentException("Operación inválida");
            }
            vista.mostrarResultado(resultado);
        } catch (Exception e) {
            vista.mostrarError(e.getMessage());
        }
    }
}

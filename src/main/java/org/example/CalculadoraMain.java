package org.example;

import org.example.controlador.CalculadoraControlador;
import org.example.modelo.Calculadora;
import org.example.vista.CalculadoraGui;

public class CalculadoraMain {
    public static void main(String[] args)

    {

        Calculadora modelo = new Calculadora();
        CalculadoraGui vista = new CalculadoraGui();
        CalculadoraControlador controlador = new CalculadoraControlador(modelo, vista);


        vista.setVisible(true);
    }
}

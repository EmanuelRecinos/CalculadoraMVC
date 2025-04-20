package org.example.vista;


import org.example.controlador.CalculadoraControlador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGui extends JFrame {
    public JPanel panelPrincipal;
    public JTextField txtNumero1;
    public JTextField txtNumero2;
    public JComboBox<String> comboOperacion;
    public JButton btnCalcular;
    public JLabel lblResultado;

    private CalculadoraControlador controlador;

    public CalculadoraGui() {
        setContentPane(panelPrincipal);
        setTitle("Calculadora MVC");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        comboOperacion.addItem("+");
        comboOperacion.addItem("-");
        comboOperacion.addItem("*");
        comboOperacion.addItem("/");

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(txtNumero1.getText());
                    double b = Double.parseDouble(txtNumero2.getText());
                    String op = (String) comboOperacion.getSelectedItem();
                    controlador.realizarOperacion(op, a, b);
                } catch (NumberFormatException ex) {
                    mostrarError("Ingresar numeros validos");
                }
            }
        });
    }

    public void setControlador(CalculadoraControlador controlador) {
        this.controlador = controlador;
    }

    public void mostrarResultado(double resultado) {
        lblResultado.setText("Resultado: " + resultado);
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

}
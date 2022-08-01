/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_02;

import javax.swing.*;

/**
 *
 * @author educu
 */
public class Operaciones {
    //Atributos

    float numero1;
    float numero2;
    float suma;
    float resta;
    float multiplicar;
    float dividir;

    //Métodos
    //Método para pedir al usuario dos números
    public void leerNumeros() {
        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el Primer número: "));
        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el Segundo número: "));
    }

    public void sumar() {
        suma = numero1 + numero2;
    }

    public void restar() {
        resta = numero1 - numero2;
    }

    public void multiplicacion() {
        multiplicar = numero1 * numero2;
    }

    public void division() {
        dividir = numero1 / numero2;
    }

    public void muestraRsultados() {
        System.out.println("La Suma de : " + numero1 + " + " + numero2 + " Es => " + suma);
        System.out.println("La Resta de : " + numero1 + " - " + numero2 + " Es => " + resta);
        System.out.println("La División de : " + numero1 + " / " + numero2 + " Es => " + dividir);
        System.out.println("La Multiplicación de : " + numero1 + " * " + numero2 + " Es => " + multiplicar);

    }
}

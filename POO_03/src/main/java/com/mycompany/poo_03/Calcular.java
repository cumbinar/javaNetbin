/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_03;

/**
 *
 * @author educu
 */
public class Calcular {

    float suma;
    float resta;
    float multiplicar;
    float dividir;

    public void calculo(float numero1, float numero2) {
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicar = numero1 * numero2;
        dividir = numero1 / numero2;

        System.out.println("La Suma de : " + numero1 + " + " + numero2 + " Es => " + suma);
        System.out.println("La Resta de : " + numero1 + " - " + numero2 + " Es => " + resta);
        System.out.println("La División de : " + numero1 + " / " + numero2 + " Es => " + dividir);
        System.out.println("La Multiplicación de : " + numero1 + " * " + numero2 + " Es => " + multiplicar);

    }

}

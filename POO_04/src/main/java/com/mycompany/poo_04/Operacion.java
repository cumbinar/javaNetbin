/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_04;

/**
 *
 * @author educu
 */
public class Operacion {

    public float sumar(float numero1, float numero2) {
        float suma = numero1 + numero2;
        return suma;
    }

    public float restar(float numero1, float numero2) {
        float resta = numero1 - numero2;
        return resta;
    }

    public float multiplicacion(float numero1, float numero2) {
        float multiplicar = numero1 * numero2;
        return multiplicar;
    }

    public float division(float numero1, float numero2) {
        float dividir = numero1 / numero2;
        return dividir;
    }

    public void mostrarResultados(float numero1, float numero2, float suma, float resta, float multiplicar, float dividir){
    
        System.out.println("La Suma de : " + numero1 + " + " + numero2 + " Es => " + suma);
        System.out.println("La Resta de : " + numero1 + " - " + numero2 + " Es => " + resta);
        System.out.println("La División de : " + numero1 + " / " + numero2 + " Es => " + dividir);
        System.out.println("La Multiplicación de : " + numero1 + " * " + numero2 + " Es => " + multiplicar);
    }
}

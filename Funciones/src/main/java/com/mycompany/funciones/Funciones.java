/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.funciones;

/**
 *
 * @author educu
 */
public class Funciones {

    public static void main(String[] args) {
        saludar();

        int a = 10;
        int b = 25;
        System.out.println("el resultado sumar:  " + a + " + " + b + " es " + suma(a, b));

    }

    public static void saludar() {
        System.out.println("Hola esta es una función saludando");
    }

    public static int suma(int a, int b) {

        return a + b;

    }
}

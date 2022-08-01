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

        mayorQue(a, b);
        
        char caracter = '/';
        System.out.println("El caracter " + caracter + " tiene el código ASCII: " + codigoAscii(caracter));
        

    }

    public static void saludar() {
        System.out.println("Hola esta es una función saludando");
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static void mayorQue(int a, int b) {
        int mayor = 0;
        if (a > b) {
            mayor = a;
        } else {
            mayor = b;
        }

        System.out.println("a=" + a + " , b=" + b + " El número mayor es: " + mayor);
    }
    
    public static int codigoAscii(char caracter){
    
         return (int)caracter; //casting a entero un string pasado como parametro
         
    }

}

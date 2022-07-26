/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.primitivos;

import java.util.Scanner;

/**
 *
 * @author educu
 */
public class Primitivos {

    public static void main(String[] args) {

        //Tipos primitivos enteros: byte, short, int, long
        System.out.println("Tipos primitivos enteros: byte, short, int, long");
        System.out.println("Valor mínimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo byte: " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo int: " + Integer.MAX_VALUE);

        Scanner entrada = new Scanner(System.in); //inicializa el Scanner

        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();  //captura la entrada de un integer por teclado

        System.out.println("tu nombre es: " + nombre + " y tu edad es: " + edad);

        System.out.println("Ingrese un valor flotante: ");
        float f = entrada.nextFloat();
        System.out.println("Ingresaste un número flotante: " + f);

    }
}

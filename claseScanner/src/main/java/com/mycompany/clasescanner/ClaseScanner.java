/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clasescanner;


/**
 *
 * @author educu
 */
import java.util.Scanner; //importar esta clase para capturar datos por teclado

public class ClaseScanner {

    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in); //para capturar datos por teclado
        System.out.println("Hola: Escribe tu nombre:  ");
        var nombre = entrada.nextLine(); //método para capturar toda la línea que escribe el usuario
        System.out.println("Escribe tu apellido: ");
        var apellido = entrada.nextLine();
        System.out.println("Tu nombre es: " + nombre + " y tu apellido es "+ apellido);
        
        
    }
}

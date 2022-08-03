/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_05;

/**
 *
 * @author educu
 */
public class Main {

    public static void main(String[] args) {
        Persona cumbi = new Persona("Cumbi Tara Nar", 62);
        cumbi.mostrarDatos();

        System.out.println("");
        Mascota perro1 = new Mascota("Mechas", "Canino", 6);
        perro1.mostrarDatos();
        perro1.comer();

        System.out.println("");

        Prendas camisa1 = new Prendas(1, "Camisa", "L-36", 5000);
        camisa1.mostrarProducto();

        System.out.println("");

        Prendas pantalon1 = new Prendas(10, "Pantalón ", "XL-38", 95000);
        pantalon1.mostrarProducto();

    }
}

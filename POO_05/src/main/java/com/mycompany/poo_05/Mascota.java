/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_05;

/**
 *
 * @author educu
 */
public class Mascota {

    String nombre;
    String especie;
    int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("El nombre de la mascota es: " + nombre);
        System.out.println("La especie es: " + especie);
        System.out.println("La edad es: " + edad);
    }

    public void comer() {
        System.out.println("La mascota " + nombre + " Especie: " + especie + " , está comiendo");
    }
}

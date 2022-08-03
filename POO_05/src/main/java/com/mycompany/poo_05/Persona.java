/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_05;

/**
 *
 * @author educu
 */
public class Persona {
    //Atributos

    String nombre;
    int edad;

    //Métodos
    //Método constructor, ayuda a inicializar los atributos de la clase
    public Persona(String _nombre, int _edad) {

        nombre = _nombre;
        edad = _edad;
    }

    public void mostrarDatos() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }
}

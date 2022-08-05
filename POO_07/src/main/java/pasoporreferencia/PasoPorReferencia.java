/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasoporreferencia;

import clases.Persona;

/**
 *
 * @author educu
 */
public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.nombre = "Cumbi";
        persona1.apellido = "Tara";
        System.out.println("Nombre: " + persona1.nombre + " Apellido " + persona1.apellido);
        cambiarValor(persona1);
        System.out.println("Nombre nuevo " + persona1.nombre + ", y Nuevo Apellido " + persona1.apellido);
    }

    public static void cambiarValor(Persona persona) {
        persona.nombre = "Ansanas";
        persona.apellido = "Del Pepo";
    }
}

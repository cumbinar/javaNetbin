/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palabrathis;

/**
 *
 * @author educu
 */
public class PalabraThis {

    public static void main(String[] args) {
        Persona persona = new Persona("Cumbi", "Tara");
        System.out.println("Esta es la dirección de memoria y package del objeto persona");
        System.out.println("Datos de persona => " + persona);
        System.out.println("Tu nombre es =>  " + persona.nombre + " y tu apellido es => " + persona.apellido);
        
        System.out.println("");
        
        Persona persona2 = new Persona("Chistan", "Tirubio");
        System.out.println("Esta es la dirección de memoria y package del objeto persona");
        System.out.println("Datos de persona => " + persona2);
        System.out.println("Tu nombre es =>  " + persona2.nombre + " y tu apellido es => " + persona2.apellido);
    }
}

class Persona {

    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Mostrar objeto persona empleando this => " + this);
    }
}

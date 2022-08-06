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
public class Return {
    public static void main(String[] args) {
        Persona persona2 = new Persona();

        persona2.nombre = "Quilinar";
        persona2.apellido = "Tambonis";
        System.out.println("Nombre: " + persona2.nombre + " Apellido " + persona2.apellido);
        persona2 = cambiarValor(persona2);
        System.out.println("Nombre nuevo " + persona2.nombre + ", y Nuevo Apellido " + persona2.apellido);
    }

    public static Persona cambiarValor(Persona persona) {
        persona.nombre = "Cumbi";
        persona.apellido = "Tara Nar";
        return persona;
    }
}

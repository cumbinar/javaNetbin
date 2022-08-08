/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import dominio.Persona;
/**
 *
 * @author educu
 */
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Cumbi", 5500.50, false);
        System.out.println("El nombre de la persona 1 es => " + persona1.getNombre());
        
        persona1.setNombre("Cumbi Tara");
        
        System.out.println("El nombre modificado de persona 1 es => "+ persona1.getNombre());
        
    }
}

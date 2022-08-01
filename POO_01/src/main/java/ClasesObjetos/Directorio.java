/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesObjetos;

/**
 *
 * @author educu
 */
public class Directorio {
    
    int id;
    String nombre; 
    String telefono;
    
    public static void main(String[] args) {
        Directorio contacto1 = new Directorio();
        
        contacto1.id = 1;
        contacto1.nombre = "Cumbi Tara Nar";
        contacto1.telefono = "77 2345 3456";
        
        System.out.println(contacto1.nombre + " Teléfono => " + contacto1.telefono);
        
        
        Directorio contacto2 = new Directorio();
        
        contacto2.id = 1;
        contacto2.nombre = "Chirimoyo Gualguan Champutiz";
        contacto2.telefono = "77 9999 3456";
        
        System.out.println(contacto2.nombre + " Teléfono => " + contacto2.telefono);
        
        
    }
    
    
}

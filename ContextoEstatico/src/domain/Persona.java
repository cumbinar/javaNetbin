/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author educu
 */
public class Persona {

    
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;
    
    
    //se crea el constructor
    public Persona(String nombre){
    this.nombre = nombre;
    //incrementar el contador por cada objeto nuevo
    Persona.contadorPersonas ++; //el contador stá relacionado con la clase persona
    //se asigna el valor a la variable idPersona
    this.idPersona = Persona.contadorPersonas;
    
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
}

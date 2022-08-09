/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author educu
 */
public class Persona {
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    public Persona (String nombre, double sueldo, boolean eliminado){
    this.nombre = nombre;
    this.sueldo = sueldo;
    this.eliminado = eliminado;
    
    
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    
    public static void imprimir(Persona persona){
        System.out.println("Esta persona " + persona);
    
    }
    public String toString(){
    return "Nombre => "+ this.nombre+
           ", Sueldo => "+ this.sueldo+
            " ¿Está eliminada? => "+ this.isEliminado();
    }
}

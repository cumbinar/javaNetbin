/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import domain.Persona;

/**
 *
 * @author educu
 */
public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;  //con final miVariable se convierte en una constante y no se puede modificar
        System.out.println("miVariable "+ miVariable);
      Persona.imprimir();
        
    }
}

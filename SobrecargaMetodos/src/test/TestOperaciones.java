/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import operaciones.Operaciones;

/**
 *
 * @author educu
 */
public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(5,3);
        System.out.println("Resultado = "+ resultado);
        System.out.println("");
        
        var resultado2 = Operaciones.sumar(2045.89, 30);
        System.out.println("Resultado = "+ resultado2);
        System.out.println("");
        
        var resultado3 = Operaciones.sumar(1.618f, 0.618f);
        System.out.println("Resultado = "+ resultado3);
    }
 
}

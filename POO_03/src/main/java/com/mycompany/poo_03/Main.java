/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_03;
import javax.swing.*;
/**
 *
 * @author educu
 */
public class Main {
    public static void main(String[] args) {
        float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el Primer número: "));
        float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el Segundo número: "));
        
        Calcular operaciones =  new Calcular();
        operaciones.calculo(numero1, numero2);
        
        
    } 
}

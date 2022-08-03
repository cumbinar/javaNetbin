/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_04;
import javax.swing.JOptionPane;
/**
 *
 * @author educu
 */
public class Main {
    public static void main(String[] args) {
        float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el Primer número: "));
        float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el Segundo número: "));
        Operacion calcular = new Operacion();
        
        float suma = calcular.sumar(numero1, numero2);
        float resta = calcular.restar(numero1, numero2);
        float multipli = calcular.multiplicacion(numero1, numero2);
        float divi = calcular.division(numero1, numero2);
        
        calcular.mostrarResultados(numero1, numero2, suma, resta, multipli, divi);
        
    }
}

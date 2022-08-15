/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Empleado;
import domain.Cliente;
import java.util.Date;

/**
 *
 * @author educu
 */
public class TestHerencia {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Cumbi", 131313.23);
        System.out.println("empleado1" + empleado1);

        Cliente cliente1 = new Cliente(new Date(), true, "Guara Kaso", 'F', 28, "calle 13 20 30");
        System.out.println("Datos del Cliente 1: => " + cliente1);

    }
}

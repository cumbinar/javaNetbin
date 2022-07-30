/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swing;

import controlador.Controlador;
import vista.Interfaz;
import modelo.Modelo;


/**
 *
 * @author educu
 */
public class directorio {
     public static void main(String[] args) throws ClassNotFoundException {
        
        Class.forName("org.sqlite.JDBC");
        
        Interfaz ventana = new Interfaz();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(modelo,ventana);
        ventana.setVisible(true);        
    }
}

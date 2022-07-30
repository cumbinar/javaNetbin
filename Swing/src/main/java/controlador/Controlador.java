/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author educu
 */

import modelo.Modelo;
import vista.Interfaz;
import modelo.Consulta;

public class Controlador implements ActionListener {

    private Modelo modelo;
    private Interfaz ventana;

    public Controlador(Modelo modelo, Interfaz ventana) {
        this.modelo = modelo;
        this.ventana = ventana;
        this.ventana.botonAgregar.addActionListener(this);
        this.ventana.botonEliminar.addActionListener(this);
        this.ventana.botonModificar.addActionListener(this);
        this.ventana.botonMostrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //cargar los datos en el modelo
        Consulta consulta = new Consulta();
        
        if (e.getSource() == ventana.botonMostrar) {

        }

    }
}

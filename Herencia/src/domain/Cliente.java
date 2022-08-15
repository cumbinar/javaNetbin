/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.Date;

/**
 *
 * @author educu
 */
public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;
    
    public Cliente(Date fechaRegistro, boolean vip, String nombre, 
            char genero, int edad, String direccion){
        super(nombre, genero, edad, direccion);
        this.idCliente = ++ Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        
        
    }
}

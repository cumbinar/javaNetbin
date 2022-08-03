/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_05;

/**
 *
 * @author educu
 */
public class Prendas {

    int item;
    String tipo;
    String talla;
    float valorBase;

    public Prendas(int item, String tipo, String talla, float valorBase) {
        this.item = item;
        this.tipo = tipo;
        this.talla = talla;
        this.valorBase = valorBase;

    }

    public void mostrarProducto() {
        System.out.println("La prenda Item: " + item + " Tipo: " + tipo + " Talla: " + talla + " Precio de venta: " + valorBase * 1.20);
    }

}

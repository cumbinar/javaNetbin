/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesObjetos;

/**
 *
 * @author educu
 */
//Atributos
public class Coche {

    String color;
    String marca;
    int modelo;

    //Método
    public static void main(String[] args) {
        System.out.println("Los coches de la la colección CUMBI");

        Coche coche1 = new Coche(); //se instancia coche1 es decir se crea el objeto

        // se agregan los atributos
        coche1.color = "Negro";
        coche1.marca = "Renault";
        coche1.modelo = 2022;

        System.out.println("El color del COCHE-1 es " + coche1.color + " , la marca es " + coche1.marca
                + " y el modelo es " + coche1.modelo);

        Coche coche2 = new Coche();

        coche2.color = "Gris plateado";
        coche2.marca = "Pontiac";
        coche2.modelo = 1960;

        System.out.println("El color del COCHE-2 es " + coche2.color + " , la marca es " + coche2.marca
                + " y el modelo es " + coche2.modelo);

        Coche coche3 = new Coche();

        coche3.color = "Cueche";
        coche3.marca = "Cumbi";
        coche3.modelo = 2023;

        System.out.println("El color del COCHE-3 es " + coche3.color + " , la marca es " + coche3.marca
                + " y el modelo es " + coche3.modelo);

        Coche cumbinova = new Coche();

        cumbinova.color = "Rojo";
        cumbinova.marca = "CarCuy";
        cumbinova.modelo = 1810;

        System.out.println("El color del COCHE CumbiNova es " + cumbinova.color + " , la marca es " + cumbinova.marca
                + " y el modelo es " + cumbinova.modelo);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.intro;

/**
 *
 * @author educu
 */
public class Intro {

    public static void main(String[] args) {
        System.out.println("Hola Cumbi");

        int miVariableEntera = 5838;
        System.out.println("Esta es mi miVariableEntera: " + miVariableEntera);

        miVariableEntera = 38;
        System.out.println("Esta es mi miVariableEntera: " + miVariableEntera);

        String miVariableCadena = "Cumbi Tara Nar";
        System.out.println("Me llamo " + miVariableCadena);

        miVariableCadena = "Esta es otra cadena";
        System.out.println("Variable modificada: " + miVariableCadena);

        var nuevaVariable = 1940.210;  //Se puede definir una variable con la palabra reservada var
        // java la inf iere a partir del literal 1940.21
        System.out.println("nueva Variable con var: " + nuevaVariable);

        var cadena = "Variable cadena con palabra reservada var";
        System.out.println(cadena);

        var nombre = "Filomeno Champutis Mayagues";
        System.out.println("nombre = " + nombre);

        System.out.println("Concatenación " + cadena + " concatenada con  " + nombre);

        //valores permitidos en el nombre de nuestras variables:
        var miVariable = true;
        var _miVariable = "Cumbi";
        var $miVariable = 19.34;

        //Concatenación
        var nombre1 = "Cumbi";
        var apellido1 = "Tara";
        var apellido2 = "Nar";

        var nombreCompleto = nombre1 + " " + apellido1 + " " + apellido2;
        System.out.println("Nombre competo = " + nombreCompleto);

        //contexto cadena Si primero encuentra una cadena, lo siguiente será cadena:
        var i = 7;
        var j = 10;
        System.out.println("Contexto cadena" + nombre + " " + i + " " + j);

        System.out.println(i + j + " " + nombre);

        System.out.println(nombre + " " + (i + j)); //el paréntesis es prioritario

    }
}

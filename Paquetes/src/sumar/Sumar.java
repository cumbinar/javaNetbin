/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumar;

/**
 *
 * @author educu
 */
public class Sumar {

    public static void sumando(float a, float b) {
        float suma = a + b;
        float resta = a -b;
        float multiplicar = a*b;
        float dividir = a/b;
        
        System.out.println("Los números son: "+ a+" y "+ b);
        System.out.println("la suma es "+ suma);
        System.out.println("La resta es "+resta);
        System.out.println("La multiplicación es: "+ multiplicar);
        System.out.println("La división es: "+ dividir);
      
    }
    
    
 public static void imprimiendo(String s) {
        System.out.println(s);
    }
}

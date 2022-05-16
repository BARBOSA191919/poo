/*  2.En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”,
dicha promoción consiste en lo siguiente:
• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si
se compran de cinco a 10 y de U$50 si se compran más de 10.
• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las
llantas que compra y la que tiene que pagar por el total de la compra.
package poo;
*/
package Tallerpoo;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float llantas = 0, compra, compratotal = 0, precio;
        System.out.println("Estimado cliente digite la compra de llantas");
        compra = entrada.nextFloat();
        if (compra < 5) {
            precio = 100;
            llantas = precio * compra / compra;
            compratotal = precio * compra;

        } else if (compra >= 5 || compra <= 10) {
            precio = 75;
            llantas = precio * compra / compra;
            compratotal = precio * compra;
        }
        if (compra > 10) {
            precio = 50;
            llantas = precio * compra / compra;
            compratotal = precio * compra;
        }
        System.out.println("La cantidad de dinero que una persona tiene que pagar por cada una de las llantas que compra es : " + llantas+ " U$ " );
        System.out.println("El total de dinero que tiene que pagar es : " +compratotal+ " U$ ");

    }

}

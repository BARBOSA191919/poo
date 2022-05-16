//1. En una fábrica de computadoras se planea ofrecer a los clientes un descuento que
//dependerá del número de computadoras que compre. Si las computadoras son menos
//de cinco se les dará un 10% de descuento sobre el total de la compra; si el número de
//computadoras es mayor o igual a cinco pero menos de diez se le otorga un 20% de
//descuento; y si son 10 o más se les da un 40% de descuento. El precio de cada computadora es de U$500
package TallerPOO;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Float descuento, descuento1, descuento2, totalcompra, valorcompra, precio;
        Float numerodepc;
        System.out.println(" Estimado cliente ingrese el numero de computadores que desea comprar: ");
        valorcompra = entrada.nextFloat();
        precio = 500 * valorcompra;
        descuento = 10 * valorcompra;
        descuento1 = 20 * valorcompra;
        descuento2 = 40 * valorcompra;

        if (valorcompra < 5) {
            totalcompra = valorcompra - descuento + precio;
            System.out.println("el total de la compra es: " + totalcompra);
            System.out.println("el decuento de su compra es : " + descuento + '$');
        } else if (valorcompra >= 5 && valorcompra < 10) {
            totalcompra = valorcompra-descuento1 + precio;
            System.out.println("el total de la compra es: " + totalcompra);
            System.out.println("el descuento de su compra es  : " + descuento1 + '$');
        } else {
            totalcompra = valorcompra - descuento2 + precio;
            System.out.println("el total de la compra es: " + totalcompra + '$');
            System.out.println("el descuento de su compra es : " + descuento2 + '$');
        }
        {
        }
    }
}
    


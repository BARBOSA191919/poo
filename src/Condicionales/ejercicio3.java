// Una farmacia desea un programa para ingresar el valor de compra y calcular lo siguiente:
//si el pago se efectúa al “contado”, calcular un descuento del 5%; pero si el pago es con “tarjeta”
//se incrementa un recargo del 3% al valor de compra. Calcular y visualizar el descuento o recargo según sea el caso y el total a pagar de la compra.
package Condicionales;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor, descuento, recargo, total;
        String tipo_pago;
        System.out.print("Ingrese el valor de la compra: ");
        valor = entrada.nextDouble();
        System.out.print("Ingrese tipo de pago: ");
        tipo_pago = entrada.next();
        descuento = 0.05 * valor;
        recargo = 0.03 * valor;

        if (tipo_pago.equalsIgnoreCase("contado")) {
            System.out.println("El descuento es: " + descuento);
            total = valor - descuento;
            System.out.println("El total es: " + total);
        } else {
            System.out.println("El recargo es: " + recargo);
            total = valor + recargo;
            System.out.println("El total es: " + total);
        }
    }
}


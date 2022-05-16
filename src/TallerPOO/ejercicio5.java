/*3.Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio
sin IVA, de algún aparato, si esta cuesta U$500 o más. Además, independientemente
de esto, ofrece un 5% de descuento si la marca es “NOSY”. Determinar cuánto pagara,
con IVA incluido, un cliente cualquiera por la compra de su aparato. El IVA es del 19%.
 */
package TallerPOO;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int marca = 0;
        System.out.println("ingresa la marca ");
        String cadena = entrada.nextLine();
        double precio, total, iva, porcentaje = 0;
        double descuento = 0;
        System.out.println("Ingresa el precio del aparato");
        precio = entrada.nextFloat();

        int NOSY = 0;
        int nosy = 0;
        System.out.println("Ingresa el porcentaje de iva");
        iva = entrada.nextFloat();

        if (precio >= 500) {
            descuento = precio * 0.10;
        }

        if (marca == NOSY || marca == nosy) {
            descuento = precio * 0.5 + descuento;
        }
        total = precio - descuento;
        iva = total * porcentaje / 100;
        System.out.println("El total a pagar es : U$" + precio);
        System.out.println("El descuento aplicado es: U$ " + descuento);
        System.out.println("El iva aplicado es: U$" + iva);
        System.out.println("El total a pagar ya con iva incluido es:U$" + total);
    }
}

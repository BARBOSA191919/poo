/* 2.Una heladería desea obtener un reporte semanal de ventas. Para ello debe
capturar en un sistema todas las facturas de ventas realizadas. Cada factura
contiene la cantidad y el sabor de las paletas vendidas. Los sabores y los
precios son: limón ($2500), nuez ($2800), lulo ($2600), fresa ($2000) y crema
($3000). El sistema debe imprimir la cantidad de paletas vendidas de cada
sabor, el valor vendido y la venta total. Considere que una factura puede tener
varias paletas de diferentes sabores.*/
package TallerPOO;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        float limon = 2500, nuez = 2800, lulo = 2600, fresa = 2000, crema = 3000;
        int sabor = 0;
        float precio = 0;
        float valorven = 0;
        float ventatotal = 0;
        

        for (int i = 1; i <= 7; i++) {
            System.out.println("factura n " + i);
            System.out.println("Digite el sabor de la paleta " );
             System.out.println("1.Limon , 2. Nuez , 3. lulo, 4.fresa , 5.crema");
           sabor=sc.nextInt();
            System.out.println("digite la cantidad de paletas vendidas");
            cantidad = sc.nextInt();
            System.out.println("Digite el precio de las paletas ");
            precio = sc.nextFloat();
            
            
            if (precio == 2500) {
                System.out.println("las paletas es de  limon  " + precio);

            }
            if (precio == 2800) {
                System.out.println("las paletas es de nuez es de " + precio);
            }
            if (precio == 2600) {
                System.out.println("las paletas es de  lulo es  de " + precio);

            }
            if (precio == 2000) {
                System.out.println("las paletas es de  fresa es de " + precio);

            }
            if (precio == 3000) {
                System.out.println("las paletas es de  crema  es de " + precio)   ;
         
            
            }
          
            ventatotal = precio * cantidad*7 ;
            valorven = precio * cantidad/7;

        }

        System.out.println(" el valor vendido  de ese dia es : " + valorven + "$");
        System.out.println("La venta total semanal es de:" + ventatotal + "$");
        
    }
}

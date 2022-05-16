/*11. Una empresa quiere hacer una compra de varias piezas de la misma clase a una fábrica
de refacciones. La empresa, dependiendo del monto total de la compra, decidirá qué
hacer para pagar al fabricante.
• Si el monto total de la compra excede de $500.000 la empresa tendrá la capacidad
de invertir de su propio dinero un 55% del monto de la compra, pedir prestado al
banco un 30% y el resto lo pagará solicitando un crédito al fabricante.
• Si el monto total de la compra no excede de $500.000 la empresa tendrá capacidad
de invertir de su propio dinero un 70% y el restante 30% lo pagará solicitando crédito
al fabricante.
• El fabricante cobra por concepto de intereses un 20% sobre la cantidad que se le pague a crédito.
*/

package TallerPOO;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);
     double costo,total,inversion,credito,interes,banco; 
     int n;
        System.out.println("Ingresa el numero de piezas a comprar");
        n=entrada.nextInt();
        System.out.println("Ingrese el costo de la pieza");
        costo=entrada.nextFloat();
        
        total = n *costo;
                if(total>500.000){
                    
               inversion = total  * 0.55;
               banco = total * 0.30 ;
               credito =total * 0.15;
                             
                } else{
                inversion = total *0.70;
                        banco = 0;
                        credito=total*0.30; 
                }
                {
                              interes= credito*0.20;
        System.out.println("la inversion es de: $" +inversion);
                            System.out.println("El prestamo del banco es de: $ " +banco);
                            System.out.println("El credito a pagar es: $ " +credito);
                            System.out.println("El interes por el credito es: $ " +interes)   ;
           

}
}
}
        
                            
        
         

        
        
  
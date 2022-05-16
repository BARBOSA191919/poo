/*Una empresa paga a sus empleados como gerentes (quienes reciben un salario semanal fijo), trabajadores por horas
(que reciben un sueldo fijo por hora para las primeras 40 horas que trabajen y “tiempo y medio”, 1.5 veces su sueldo
por horas, para las horas extra trabajadas), empleados por comisión (que reciben $500 de base más 8.5% de sus
ventas totales por semana), o trabajadores por piezas (que reciben una cantidad fija de dinero por cada artículo que
producen; cada trabajador por piezas en esta empresa trabaja solo en un tipo de artículo).
Escriba un programa para calcular el sueldo semanal para cada empleado. No se necesita saber cuántos empleados
hay de antemano. Cada tipo de empleado tiene su propio código de pago: los gerentes tienen el código 1, los
trabajadores por horas tienen el código 2, los trabajadores por comisión tienen el código 3 y los trabajadores por
piezas tienen el código 4.
Condiciones adicionales:
- En la empresa hay tres niveles de gerentes, en el que el nivel 1 tiene un sueldo de $1.000 y los dos niveles
siguientes tiene un incremento del 20% con respecto al nivel anterior.
- En los trabajadores por hora se ingresa el total de las horas trabajadas en la semana y no se debe separar
las horas extra. El valor de la hora es variable entre $15 y $20.
- Los trabajadores por piezas producen tres tipos artículos, cuyos preciosson $10, $15 y $20 por pieza de cada
uno.
Al finalizar el programa debe generar un informe que le indique la siguiente información:
- Cantidad total de empleados a los que se liquidó el sueldo de la semana.
- Cantidad de empleados de cada tipo a los que se liquidó el sueldo de la semana.
- Valor total pagado y discriminado por cada tipo de trabajador
*/

package TallerPOO;

import java.util.Scanner;

class Parcial1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double gere1 = 1000;
        double gere2 = 1000;
        double gere3 = 1000;
        int gere4 = 0;
        int codigo;
        int ar;
        int artt;
        double total = 0;
        double art;
        int ar1=10, ar2=15, ar3=20;
        double comision = 500;
        double venta = 0;
        int horas = 30000;
        int horastrabajadas = 0;
        int horasextras = 0;
        double sueldo = 0;
        double i=1,contador = 0;
        double suma;
        int piezas = 0;
        String nombre;
        System.out.println("Empleado por favor ingrese Su codigo de pago");
        codigo = entrada.nextInt();
        switch (codigo) {
            case 1:
                System.out.println("elegiste los gerentes");
                System.out.println("escoge el numero de gerentes");
                gere4=entrada.nextInt();
                  
                System.out.println("digite el sueldo");
                sueldo = entrada.nextDouble();
                if (sueldo == 1000) {
                    System.out.println("el sueldo es de nivel 1 por ende su valor es de " + gere1);
                    
                } else if (sueldo > 1000 && sueldo<=10000) {
                    gere2 = sueldo * 0.20;
                    System.out.println("el sueldo es de nivel 2 y tiene un incremento del 20% que es:" + gere2);
                } else if (sueldo > 10000){
                    gere3 = sueldo * 0.20;
                    System.out.println("el sueldo es de nivel 3 y tiene un incrementos del 20% " + gere3);
                     
        }

                break;
            case 2:
                System.out.println("elegiste los trabajadores por horas");
                System.out.println("escoge el numero de empleados");
                contador = entrada.nextInt();

                System.out.println("Digite el total de las horas trabajadas");
                horastrabajadas = entrada.nextInt();

                System.out.println("digite el valor por hora");
                horas = entrada.nextInt();
                if (horas >= 15000 || horas >= 20000) {

                    System.out.println("el valor esta entre entre 15 y 20  ");
                    sueldo = horastrabajadas * horas;
                    System.out.println("el sueldo del total de las horas es:" + sueldo);
                }
                if (horastrabajadas > 40) {
                    sueldo = horastrabajadas * 1.5 * horas;
                    System.out.println("trabajaste hora extras, tienes incremento de tu sueldo " + sueldo);
                }
                break;

            case 3:
                System.out.println("elegiste los trabajadores por comision");
                System.out.println("escoja los trabajadores que desea ");
                i = entrada.nextInt ();
               while (i >=10 ){
                System.out.println("digite la venta por semana");
                venta = entrada.nextFloat();
                venta = comision * 8.5 * venta;
                System.out.println(" la venta por semana es de :" + venta+ " con su respectiva comision");
                i++;
               }
                break;

            case 4:
                System.out.println("Elegiste los trabajadores por piezas");
                System.out.println("digite cuantos trabajadores de piezas que desea");
                piezas = entrada.nextInt();
                System.out.println("digite el tipo de articulo");
                ar=entrada.nextInt();
                System.out.println("digite el valor de la pieza");
                art= entrada.nextDouble();
                System.out.println("digite la cantidad de pieza");
                artt=entrada.nextInt();
                if(ar==1){
                  total=ar1*art*artt;  
                    System.out.println("el valor de la pieza:"+total);
                }
                if(ar==2){
                    total=ar2*art*artt;  
                    System.out.println("el valor de la pieza es:"+total);
                }
                if(ar==3){
                   total=ar3*ar*artt;
                    System.out.println("el valor de la pieza es"+total);
                        break;
                }
      
                System.out.println("es del 1 al 4");
                break;

                }
        
          suma = gere4+contador+i+piezas;
                System.out.println("el total de empleados a los que se liquido fue:" +suma);
                System.out.println("cantidad de empleados de cada tipo de trabjador es:" +gere4+ " gerentes" +contador+"trabajadores por horas"+i+ "trabajadores por comision"+piezas+"trabajadores por piezas" );
                System.out.println("el valor total pagado y descriminado es de : " +gere1+ "los gerentes"+sueldo+"trabajadores por horas"+venta+"trabajadores por comision"+total+"trabajdores por piezas"   );
                
    }

}

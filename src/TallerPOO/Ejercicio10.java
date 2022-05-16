/* 3. El sistema meteorológico local requiere un sistema para capturar la temperatura
promedio de cada día de la semana e imprimir el nombre del día y un mensaje
de la percepción de la temperatura de acuerdo con el valor capturado según la
siguiente tabla:
Temperatura Mensaje
Menor o igual que cero Congelante
1 a 10°C Muy frío
11 a 20°C Frío
21 a 24°C Templado
25 a 29°C Agradable
30 a 35°C Caliente
36°C o más Muy caliente
*/
package Tallerpoo;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ndias = 0, op;
        float[] temps = new float[8];
        System.out.println("Menú Opciones - Seleecione la temperatura a promedio...");
        System.out.println("1. 0 C");
        System.out.println("2. 1 a 10 C");
        System.out.println("3. 11 a 20 C");
        System.out.println("4. 21 a 24 C");
        System.out.println("5. 25 a 29 C");
        System.out.println("6. 30 a 35 C");
        System.out.println("7. 36 C o mas");
        System.out.println("0. Salir...");
        System.out.print("Seleccione la opcion: ");
        op = s.nextInt();
        int[] ndiasA = {1, 2, 3, 4, 5, 6, 7};
        switch (op) {
            case 1:
                System.out.println(" la percepcion de la temperatura es del DIA LUNES ;");

                break;
            case 2:
                System.out.println("la percepcion de la temperatura es del DIA MARTES");

                break;
            case 3:
                System.out.println("la percepcion de la temperatura es de del MIERCOLES");

                break;
            case 4:
                System.out.println("la percepcion de la temperatura es del DIA JUEVES");

                break;
            case 5:
                System.out.println("la percepcion de la temperatura es deL DIA VIERNES");

                break;
            case 6:
                System.out.println("la percepcion de la temperatura es del DIA SABADO");

                break;
            case 7:
                System.out.println("la percepcion de la temperatura es del DIA DOMINGO");

                ndias = ndiasA[op - 1];
                break;

            case 0:
                System.out.println("Gracias por utilizar nuestro programa...");
                break;
            default:
                System.out.println("Error... intente nuevamente");
                break;
        }

        for (int i = 1; op >= i; i++) {
            if (temps[i] > 0 || temps[i] == 0) {
                System.out.println("segun la tabla la temperatura del lunes es MUY CONGELANTE");
                break;
            }
        }
        for (int i = 2; op >= i; i++) {
            if (temps[i] >= 1 || temps[i] <= 10) {
                System.out.println("segun la tabla la temperatura del  martes es MUY FRIA");
                break;
            }
        }
        for (int i = 3; op >= i; i++) {
            if (temps[i] >= 11 || temps[i] <= 20) {
                System.out.println("segun la tabla la temperatura del miercoles  es FRIA");
                 break;
            }
        }
        for (int i = 4; op >= i; i++) {
            if (temps[i] >= 21 || temps[i] <= 24) {
                System.out.println(" segun la tabla la temperatura del jueves es TEMPLADA");
                 break;
            }
        }
        for (int i = 5; op >= i; i++) {
            if (temps[i] >= 25 || temps[i] <= 29) {
                System.out.println("segun la tabla la temperatura del viernes es AGRADALE");
                 break;
            }
        }
        for (int i = 6; op >= i; i++) {
            if (temps[i] >= 30 || temps[i] <= 35) {
                System.out.println(" segun la tabla la temperatura del sabado es CALIENTE");
                 break;
            }
        }
        for (int i = 7 ; op >= i; i++) {
            if (temps[i] >= 30 || temps[i] <= 100) {
                System.out.println(" segun la tabla la temperatura del domingo es muy CALIENTE");
                 break;
            }

        }

    }
}

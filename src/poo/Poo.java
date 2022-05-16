
package poo;

import java.util.Scanner;

public class Poo {

    public static void main(String[] args) {

        System.out.println("Hola mundo!");
        System.out.println("desde el 142.");
        System.out.println("buenas tardes...");

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int i = sc.nextInt();
        System.out.println("El numero que ingreso fue: " + i + 1);

        byte b = (byte) i;
        System.out.println("i=" + i + " b=" + b);

        String s = "cadena";
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}

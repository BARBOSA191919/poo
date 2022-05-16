//ingrese 2 números enteros diferentes y visualizar el mayor de ellos.

package Condicionales;
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int num1,num2;
        System.out.println("Ingrese el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = entrada.nextInt();
        if (num1>num2) {
            System.out.println("el numero mayor es: " + num1);
            
        } else {
            System.out.println("el numero mayor es:" +num2);
            
        }
         
    }
}

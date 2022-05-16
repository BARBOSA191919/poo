//Ejercicio 1: Si a, b y c son variables enteras con valores a=8, b=3, c=-5, 
//determina el valor de las siguientes expresiones aritméticas:
package Operadores;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = 8, b = 3, c = -5, suma, resta, mul, mul1, mul2, mul3, mul4, mul5, mul6, div1, div, mod, mod1, mod2;

//el valor de las siguietnes expreseiones aritmeticas
        suma = a + b + c;
        div = a / b;
        div1 = a / c;
        mul = a * b / c;
        mul1 = (a * c) % c;
        mul2 = (3 * a - 2 * b) % (2 * a - c);
        mul3 = (a - 3 * b) % (c + 2 * a) / (a - c);
        mul4 = 2 * b + 3 * (a - c);
        mod = a & b;
        mod1 = a & c;
        mul5 = a * (b / c);
        mul6 = a * (c & b);
        mod2 = 2 * (a / 5 + (4 - b * 3)) % (a + c - 2);
        resta = a - b - c * 2;

        System.out.println("La suma de los tres numeros es:" + suma);
        System.out.println("La division de los numeroes es " + div);
        System.out.println("la division de los numeros es" + div1);
        System.out.println("El resultado de las variables es: " + mul);
        System.out.println("El resultado de las variables es: " + mul1);
        System.out.println("El resultado de las variables es: " + mul2);
        System.out.println("El resultado de las variables es" + mul3);
        System.out.println("el modulo de los numeroes es " + mod);
        System.out.println("el modulo de los numeroes es " + mod1);
        System.out.println("eEl resultado de las variables es " + mul5);
        System.out.println("El resultado de las variables es " + mul6);
        System.out.println("El resultado de las variables es " + mod2);
        System.out.println("El resultado de las variables es " + resta);

    }

}

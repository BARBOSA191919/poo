
package Arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class arreglos1 {

    public static void main(String[] args) {
        int nElementos;
            Scanner entrada = new Scanner(System.in);

        nElementos = Integer.parseInt(JOptionPane.showInputDialog(("Digite la cantidad de elementos del arreglo ")));

        char[] letras = new char[nElementos];

        System.out.println("Digite los elementos del arreglos");
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i + 1) + ". Digite un caracter: ");
            letras[i] = entrada.next().charAt(0);
        }
        System.out.println("\nLos caracteres de arreglo son: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(letras[i] + "  ");
        }
    }
}

/* : A farmer has collected 792,671 eggs from the chickens on his farm, and he
wishes to sell them in cartons to commercial shopping outlets and supermarkets in regional
north Queensland. How many full cartons worth of eggs does the farmer have (assuming 12 
85
eggs fill a single carton)? How many eggs does he have left over for his own breakfast (hint: use
the modulus operator)? */
package poo;

import java.util.Scanner;

public class huevos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int eggsTotal;
        int eggsXPack;
        System.out.println("Cuantos hevos tiene para la venta:");
        eggsTotal = in.nextInt();
        System.out.println("Cantidades de huevos de empaque");
        eggsXPack = in.nextInt();
        int cartons = eggsTotal / 12;
        int eggsLeftOver = eggsTotal % 12;
        System.out.println("The farmer has " + cartons + " cartons of eggs, " + "and " + eggsLeftOver + " eggs left over for breakfast.");
    }
}

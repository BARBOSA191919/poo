/* Una frutería ofrece las manzanas con descuento según la siguiente tabla:
NUM. DE KILOS COMPRADOS % DESCUENTO
0 - 2 0%
2.01 - 5 10%
5.01 - 10 15%
10.01 en adelante 20%
*/

      package  TallerPOO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
    import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double descuento;
		int kilo;
		double precio;
		double total;
		System.out.println("Ingresa los kilos de manzanas");
		kilo = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingresa el precio del kilo de manzanas");
		precio = Double.parseDouble(bufEntrada.readLine());
		total = precio*kilo;
		if (kilo<=2) {
			descuento = 0;
		} else {
			if (kilo>=2.01 && kilo<=5) {
				descuento = total*.10;
				System.out.println("Se aplico un 10% de descuento");
			} else {
				if (kilo>=5.01 && kilo<=10) {
					descuento = total*.15;
					System.out.println("Se aplico un 15% de descuento");
				} else {
					descuento = total*.20;
					System.out.println("Se aplico un 20% de descuento");
				}  
			}
		}
		System.out.println("El descuento aplicado es: $"+descuento);
		System.out.println("El total a pagar por "+kilo+" kilos de manzana es: $"+total+-descuento); 
	}

}


//13. Un supermercado realiza una tómbola con todos los clientes, si son hombres tienen que sacar de una canasta una bolita la cual tiene un número grabado 
//y si son mujeres lo mismo pero de otra canasta, los premios se dan bajo la siguiente tabla:
// Hombres                                                      Mujeres
// # Bolita   Premio                             # Bolita                  Premio
//1             Desodorante                       1                         Loción
//2             SixPack de cerveza                2                         Bik ini
//3             Boxer                             3                         Crema para la cara
//4             Rasuradora                        4                         Plancha
//5             Sudadera                          5                         Barniz de uñas
package TallerPOO;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sexo;
        System.out.println("Ingrese cual es el sexo: M,F");
        String cadena = entrada.nextLine();
        int m = 0;
        int f = 0;
        int bolita = 0;
    
        if (bolita == m) {
            System.out.println("Escoge una bolita de la canasta de los hombres e ingresa el numero");
            bolita = entrada.nextInt();

            switch (bolita) {
                case 1:
                    System.out.println(" TE GANASATE UN DESODORANTE SI ELIGIO MASCULINO ");
                    break;

                case 2:
                    System.out.println("TE GANASTA UN SIX-PACK DE CERVEZA SI ELIGIO MASCULINO");
                    break;

                case 3:
                    System.out.println("TE GANASTE UNA CAMISETA SI ELIGIO MASCULINO");
                    break;

                case 4:
                    System.out.println("TE GANASTE UNA PANTALONETA SI ELIGIO MASCULINO");
                    break;

                case 5:
                    System.out.println("TE GANASTE UNA SUDADERA SI ELIGIO MASCULINO");
                    break;

                default:
                    System.out.println("ESCOGE UNA OPCION VALIDA");
                    break;
            }
        } else if (bolita == f) {

            System.out.println("Escoge una bolita de la canasta de las mujeres e ingresa el numero");
            bolita = entrada.nextInt();
        }
        switch (bolita ) {

            case 1:
                System.out.println("TE GANASTE UNA LOCION SI ELIGIO FEMENINO");
                break;
            case 2:
                System.out.println("TE GANASTE UN BIKINI SI ELIGIO FEMENINO");
                break;
            case 3:
                System.out.println("TE GANASTE UNA CREMA PARA LA CARA SI ELIGIO FEMENINO");
                break;
            case 4:
                System.out.println("TE GANASTE UNA PLANCHA PARA EL CABELLO SI ELIGIO FEMENINO");
                break;
            case 5:
                System.out.println("TE GANASTE UN ESMALTE DE UÑAS SI ELIGIO FEMENINO");
                break;
            default:
                System.out.println("ESCOGE UNA OPCION VALIDA SI ELIGIO FEMENINO ");
                break;
        }
        
        if (true) {

        } else {
            System.out.println("DEBES DE TENER SU SEXO DEFINIDO ENTRE M,F");
        }
    }
    }

        

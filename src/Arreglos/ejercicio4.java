//Dado un array de números de 5 posiciones con los siguiente valores {1,2,3,4,5}, guardar los valores de este array en otro array distinto pero con los valores invertidos, es decir, que el segundo array debera tener los valores {5,4,3,2,1}.
package Arreglos;
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] array1={1,2,3,4,5};
        
        int[] array2=new int[array1.length];
        
        for (int i = (array1.length-1), j=0; i>=0; i--, j++ ){
            array2[j]= array1[i];
            System.out.println(array2[j]);           
        
    }
    }    
}

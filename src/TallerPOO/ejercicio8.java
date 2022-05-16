/*9. Calcular la utilidad que un trabajador recibe en el reparto anual de utilidades si a este
se le asigna un porcentaje de su salario mensual que depende de su antigüedad en la
empresa de acuerdo con la siguiente tabla:
Tiempo Utilidad
Menos de 1 año 5 % del salario
1 año o más y menos de 2 años 7% del salario
2 años o más y menos de 5 años 10% del salario
5 años o más y menos de 10 años 15% del salario
10 años o más 20% del salario
*/
package TallerPOO;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, antiguedad, utilidad = 0;
        salario = Integer.parseInt(JOptionPane.showInputDialog("Escribe tu salario mensual: "));
        antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Digite tu antiguedad por años: "));

        if (antiguedad < 1) {
            utilidad = salario * .05;

        } else if (antiguedad >= 1 && antiguedad < 2) {
            utilidad = salario * .07;
        } else if (antiguedad >= 2 && antiguedad < 5) {
            utilidad = salario * .10;
        } else if (antiguedad >= 5 && antiguedad < 10) {
            utilidad = salario * .15;
        } else if (antiguedad >= 10) {
            utilidad = salario * .20;
        }
         JOptionPane.showMessageDialog(null, "La utilidad de acuerdo a: " + antiguedad + " años de servicio es:  $ "+utilidad);
                  JOptionPane.showMessageDialog(null, "Tu salario total ya con la utilidad: " +salario+utilidad);
    }
   
        }
    

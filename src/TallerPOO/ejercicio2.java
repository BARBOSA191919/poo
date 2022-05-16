//10. Un obrero necesita calcular su salario semanal, el cual se obtiene de la sig. manera:
//Si trabaja 40 horas o menos se le paga $5000 por hora
//Si trabaja más de 40 horas se le paga $5000 por cada una de las primeras 40 horas y un aumento del 20% por cada hora extra.
package TallerPOO;

import javax.swing.JOptionPane;

public class ejercicio2 {

    public static void main(String[] args) {

        int horastrabajadas;
        float salariototal = 0; 
       
        horastrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite el total de horas trabajadas: "));

        if (horastrabajadas <= 40) {
            salariototal = horastrabajadas * 5000;

        } else  {
            salariototal = (5000*40)+ (horastrabajadas-40)*6000;
                 
        }
        JOptionPane.showMessageDialog(null, "El salario total es: " + salariototal + '$');
    }

}

package TallerPOO;

import java.util.Scanner;

public class solucion_parcial_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sig=0, ite=0;
        int tipoEmp;
        int[] cantxTipoemp={0,0,0,0};
        float[] totalPagoxTipoEmp={0,0,0,0};
        String[] tiposEmp={"Gerentes","Por Horas","Por comisión","Por piezas"};
        float sueldoEmp=0;
        String descEmp=null;
        //System.out.println(sig.equalsIgnoreCase("s"));
        while (sig==0){
            System.out.println("Menú Tipo Empleado");
            System.out.println("1. Gerentes");
            System.out.println("2. Por horas");
            System.out.println("3. Por comisión");
            System.out.println("4. Por piezas");
            System.out.print("Ingrese el tipo de empleado: ");
            tipoEmp = s.nextInt();
            switch (tipoEmp) {
                case 1:
                    ite=0;
                    System.out.println("Gerentes...");
                    int tipoGerente = 0;
                    System.out.println("Menú Tipo Gerente");
                    System.out.println("1. Gerente 1");
                    System.out.println("2. Gerente 2");
                    System.out.println("3. Gerente 3");
                    System.out.print("Ingrese el tipo de Gerente: ");
                    tipoGerente = s.nextInt();
                    while (tipoGerente!=0){
                        switch (tipoGerente){
                            case 1: 
                                sueldoEmp=1000;
                                cantxTipoemp[ite]++;
                                totalPagoxTipoEmp[ite]+=sueldoEmp;
                                descEmp="Gerente 1";
                                break;
                            case 2: 
                                sueldoEmp=1200;
                                cantxTipoemp[ite]++;
                                totalPagoxTipoEmp[ite]+=sueldoEmp;
                                descEmp="Gerente 2";
                                break;
                            case 3: 
                                sueldoEmp=(float)(1200*1.2);
                                cantxTipoemp[ite]++;
                                totalPagoxTipoEmp[ite]+=sueldoEmp;
                                descEmp="Gerente 3";
                                break;
                            default:
                                System.out.print("Error en Tipo de Gerente");
                        }
                        tipoGerente=0;
                    }
                    System.out.println("Empleado: " + descEmp + " Sueldo Semanal: $ "+ sueldoEmp);
                    break;
                case 2: 
                    int cantHoras;
                    descEmp="Por horas";
                    float valorHora=0;
                    ite=1;
                    System.out.println("Empleado por horas...");
                    System.out.print("Ingrese la cantidad de horas trabajadas:");
                    cantHoras=s.nextInt();
                    //Validar la cantidad de horas
                    while(valorHora<15 || valorHora>20){
                        System.out.print("Ingrese el valor de la Hora (Entre $15 y $20):");
                        valorHora=s.nextFloat();
                    }
                    if(cantHoras>40)
                        sueldoEmp=(float)((valorHora*40)+(valorHora*1.5*(cantHoras-40)));
                    else
                        sueldoEmp=(float)(valorHora*cantHoras);
                    cantxTipoemp[ite]++;
                    totalPagoxTipoEmp[ite]+=sueldoEmp;
                    System.out.println("Empleado: " + descEmp + " Sueldo Semanal: $ "+ sueldoEmp);
                    break;
                case 3:
                    ite=2;
                    descEmp="Por comisión";
                    float valorVentas=0;
                    System.out.println("Empleado Por comisión...");
                    System.out.print("Ingrese el monto de las ventas:");
                    valorVentas=s.nextFloat();
                    //Validar el valor de las ventas
                    sueldoEmp=(float)((valorVentas*0.085)+500);
                    cantxTipoemp[ite]++;
                    totalPagoxTipoEmp[ite]+=sueldoEmp;
                    System.out.println("Empleado: " + descEmp + " Sueldo Semanal: $ "+ sueldoEmp);
                    break;
                case 4:
                    ite=3;
                    int cantPiezas=0;
                    System.out.println("Empleado Por piezas...");
                    System.out.print("Ingrese la cantidad de piezas elaboradas:");
                    cantPiezas=s.nextInt();
                    //Validar la cantidad de piezas
                    int tipoProducto = 0;
                    System.out.println("Menú Tipo Producto");
                    System.out.println("1. Producto 1");
                    System.out.println("2. Producto 2");
                    System.out.println("3. Producto3");
                    System.out.print("Ingrese el tipo de Producto: ");
                    tipoProducto = s.nextInt();
                    while (tipoProducto!=0){
                        switch (tipoProducto){
                            case 1: 
                                sueldoEmp=(float)(cantPiezas*10);
                                cantxTipoemp[ite]++;
                                totalPagoxTipoEmp[ite]+=sueldoEmp;
                                descEmp="Por Piezas 1";
                                break;
                            case 2: 
                                sueldoEmp=(float)(cantPiezas*15);
                                cantxTipoemp[ite]++;
                                totalPagoxTipoEmp[ite]+=sueldoEmp;
                                descEmp="Por Piezas 2";
                                break;
                            case 3: 
                                sueldoEmp=(float)(cantPiezas*20);
                                cantxTipoemp[ite]++;
                                totalPagoxTipoEmp[ite]+=sueldoEmp;
                                descEmp="Por Piezas 3";
                                break;
                            default:
                                System.out.print("Error en Tipo de Producto");
                        }
                    tipoProducto=0;
                    }
                     System.out.println("Empleado: " + descEmp + " Sueldo Semanal: $ "+ sueldoEmp);
                    break;
                default:
                    System.out.println("Error en el tipo de empleado...");
            }
            System.out.print("Para otro trabajador presione la tecla 0. Otra tecla para termina: ");
            sig = s.nextInt();
        }
        System.out.println("Resumen");
        System.out.println("Tipo empleado\tCantidad\tValor Pagado");
        for (int k = 0; k < 4; k++) {
            System.out.println(tiposEmp[k] + "\t" + cantxTipoemp[k] + "\t" + totalPagoxTipoEmp[k]);

        }
    }
    
}
    


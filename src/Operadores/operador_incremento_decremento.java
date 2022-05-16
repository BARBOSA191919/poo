package Operadores;
//x++ primero  evalua el numero  y luego incrementa 
//++x primero incrementa y luego evalua el numero

public class operador_incremento_decremento {

    public static void main(String[] args) {
        int x = 5, y;

        y = --x;

        System.out.println(y);
        System.out.println(x);

    }
}

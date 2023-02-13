package Excepciones;

import java.io.IOException;



public class Punto7 {

    public static int dividePorCero(int a, int b) throws ArithmeticException {
        int resultado = a/b;

        return resultado;
    }

    public static void main(String[] args) {
        try {
            dividePorCero(8,0);
            System.out.println("Demo de Codigo");
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerce");
        }

        }


}




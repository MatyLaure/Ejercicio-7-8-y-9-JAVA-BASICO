package ArrayList2;

import java.util.ArrayList;

public class Punto6 {

    public static void main(String[] args) {

        int num = 10;
        int x = 0;

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 1; i < num+1; i++) {

            numeros.add(i);
        }
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i) + " ");
        }

        int i = 1;
        while (i<11){
            System.out.print( i + " , ");
            i+=2;
        }
    }
}

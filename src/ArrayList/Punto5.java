package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Punto5 {

    public static void main(String[] args) {

        ArrayList<String> provinciasArgentinas = new ArrayList<String>();
        provinciasArgentinas.add("Buenos Aires");
        provinciasArgentinas.add("Misiones");
        provinciasArgentinas.add("Cordoba");
        provinciasArgentinas.add("Tierra del Fuego");

        for (String provincias : provinciasArgentinas) {
            System.out.println(provincias);

        LinkedList<String> provinciasArg = new LinkedList<String>(provinciasArgentinas);

            for (String provin : provinciasArg) {
                System.out.println(provin);
            }

        }

    }
}

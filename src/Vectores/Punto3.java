package Vectores;

import java.util.Vector;

public class Punto3 {

    public static void main(String[] args) {
        Vector<String> nombres = new Vector();

        nombres.add("Matias");
        nombres.add("Julian");
        nombres.add("Javier");
        nombres.add("Andres");
        nombres.add("Roberto");

        System.out.println("Los 5 elementos que elegi son los siguientes nombres: " + nombres);

        nombres.remove("Javier");
        nombres.remove("Andres");

        System.out.println("Los nombres que me quedan eliminando el 2 y 3 elemento son: " + nombres);


    }
}

// El problema de usar un vector cuando tengo mil elementos es que la
// capacidad de memoria ya que a medida que lleno el array superior se crea
// la copia y en lugar de tener un espacio de memoria de 1000 tengo un espacio de 3000
// ya que son los 1000 del array principal + la copia que son 1000 + el doble de espacio vacio para llenar.
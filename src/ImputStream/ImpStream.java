package ImputStream;

import java.io.*;

public class ImpStream {
    public static void main(String[] args) {
        try {
            InputStream fichero = new FileInputStream("C:\\Windows\\System32");
            OutputStream copiaFichero = new FileOutputStream("mio.txt");
            PrintStream salida = new PrintStream(copiaFichero);
            try {
                int dato = fichero.read();
                while (dato != -1) {
                    System.out.println((char)dato);
                    dato = fichero.read();
                }
            } catch (IOException e) {
                System.out.println("No se puede leer el fichero: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error del fichero: " + e.getMessage());
        }

    }
}

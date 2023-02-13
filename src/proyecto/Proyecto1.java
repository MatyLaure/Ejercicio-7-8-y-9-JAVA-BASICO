package proyecto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Proyecto1 {
    public static void main(String[] args) {
        try {
            InputStream proyecto = new FileInputStream("mio.txt");
            Scanner scanner = new Scanner(System.in);
        } catch (FileNotFoundException e) {
            System.out.println("Error del proyecto: " + e.getMessage());
        }

        HashMap<String, Integer> mapa = new HashMap<>();
    }
}

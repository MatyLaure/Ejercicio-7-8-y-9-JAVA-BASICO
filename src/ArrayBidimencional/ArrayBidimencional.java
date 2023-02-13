package ArrayBidimencional;

public class ArrayBidimencional {
    public static void main(String[] args) {

        int arrayBidi[][] = new int[2][5];
        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;
        arrayBidi[0][4] = 5;

        arrayBidi[1][0] = 10;
        arrayBidi[1][1] = 30;
        arrayBidi[1][2] = 50;
        arrayBidi[1][3] = 70;
        arrayBidi[1][4] = 90;

        for (int i = 0; i < arrayBidi.length; i++) {
            System.out.println("Fila numero: " + i);

            for (int j = 0; j < arrayBidi[i].length; j++) {
                System.out.println("la columas N° " + j + " vale: ");
                System.out.println(arrayBidi[i][j]);
            }
        }
    }
}

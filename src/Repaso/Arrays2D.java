package Repaso;

public class Arrays2D {
    private static int [][] arrayA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
    };
    public static void main(String[] args) {
        System.out.print(arrayA.length + "\t"+arrayA[0].length);

        //Imprimir por filas
        System.out.println("\nImprimir por filas: ");
        printInRows(arrayA);

        //Imprimir por columnas
        printInColumns(arrayA);
    }

    public static void printInRows(int[][] array){
        //Row i
        for (int i = 0; i<array.length; i++){
            //Each column j
            for (int j = 0; j<array[0].length; j++){

                System.out.println(array[i][j]);
            }
        }
    }

    public static void printInColumns(int[][] array){
        //Column i
        for (int i = 0; i<array[0].length; i++){
            //Each row j
            for (int j = 0; j<array.length; j++){
                System.out.println(array[j][i]); //Girar i-j
            }
        }
    }
}

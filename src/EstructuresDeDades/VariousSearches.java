package EstructuresDeDades;

import java.util.Arrays;

public class VariousSearches {
    private static int[] A = {10, 5, 18, 33, 44, 76, 8, 95};

    public static int linealSearch(int[] A, int value){
        for (int i=0; i<A.length; i++){
            if (A[i] == value) return i;
        }
        return -1;
    }

    //Para arreglos ordenados
    public static int orderedLinealSerch(int[] A, int value){
        for (int i=0; i<A.length; i++){
            if ((A[i] == value)){
                return i;
            }
            else if(A[i]>value){
                //Valor no encontrado
                return -1;
            }
        }
        return -1;
    }

    //Para arreglos ordenados
    public static int binarySearch(int[] A, int value, int bot, int top){
        while(bot<=top){ //Descartamos mitad por mitad
            int mid = (bot + top) / 2;
            if (A[mid]==value) return mid;
            else if(A[mid]>value) top = mid-1;
            else if(A[mid]<value) bot = mid+1;
        }
        return -1;
    }
    public static int recursiveBinarySearch(int[] A, int value, int bot, int top){
        if (bot<=top){
            int mid = (bot +  top) / 2;
            if (A[mid]==value){
                return mid;
            }
            else if(A[mid]>value){
                return recursiveBinarySearch(A, value, bot, mid-1);
            }
            else if (A[mid]<value) {
                return recursiveBinarySearch(A, value,mid+1, top);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(linealSearch(A, 44));

        Arrays.sort(A);
        System.out.println("Sorted array: ");
        for (int value : A) System.out.print(value+",");

        System.out.println("\nOrderedLinealSearch: ");
        System.out.println(orderedLinealSerch(A, 44));

        System.out.println("\nBinarySearch: ");
        System.out.println(binarySearch(A, 49, 0, A.length-1));

        System.out.println("\nRecursiveBinarySearch: ");
        System.out.println(recursiveBinarySearch(A, 44, 0, A.length-1));
    }
}

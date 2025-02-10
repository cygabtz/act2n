package EstructuresDeDades;

import java.util.Arrays;

public class InsertionSort {

    //Array ejemplo
    private static int[] arr = {22, 8, 4, 1, 7, 9};

    public static void main(String[] args) {
        System.out.println("Array original: ");
        System.out.println(Arrays.toString(arr));

//        System.out.println("insertionSort: ");
//        insertionSort(arr);
//        System.out.println(Arrays.toString(arr));

        System.out.println("recursiveBubbleSort: ");
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void insertionSort(int[] arr) {
        //Iteramos n-1 veces, n:tamaño
        for (int k = 1; k<arr.length; k++) {
            int temp = arr[k];
            int j = k-1;

            //Recorremos de derecha a izquierda si arr[k]<=arr[j]
            while (j>=0 && temp<=arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    //no funciona
    public static void selectionSort(int[] arr){
        for (int i = 1; i<arr.length; i++) {
            int j = min(arr, i);
            swap(arr, i, j);
        }
    }

    private static int min(int[] arr, int i) {
        int min = arr[i];
        int pos = i;

        //Recorrer arr de i hasta .length
        for (int j = i+1; j<arr.length; j++) {
            if (arr[j]<min) {
                min = arr[j];
                pos = j;
            }
        }
        return pos;
    }

    public static void bubbleSort(int[] arr) {
        //n iteraciones
        for (int i = 0; i<arr.length; i++) {
            //n-1 iteraciones
            for (int j = i+1; j<arr.length; j++) {
                if (arr[i]>arr[j]) swap(arr, i, j);
            }
        }
    }

    public static void recursiveBubbleSort(int[] arr, int end){
        if(end>0) {
            for (int i = 0; i<end; i++) if (arr[i]>arr[i+1]) swap(arr, i, i+1);
            recursiveBubbleSort(arr, end-1);
        }
    }

    private static void mergeSort(int[] arr, int bot, int top) {
        if (bot<top) {
            int mid = (bot + top) / 2;

            mergeSort(arr, bot, mid);
            mergeSort(arr, mid+1, top);

            merge(arr, bot, mid, top);
        }
    }

    private static void merge(int[] A, int b, int m, int e){

        int i = b;
        int j = m + 1;
        int index = b;
        int k;

        int[] temp = new int[A.length];

        while(i<=m && j<=e){
            if(A[i]<A[j]){
                temp[index] = A[i];
                i = i+1;
            }
            else {
                temp[index] = A[j];
                j = j+1;
            }
            index++;
        }

        if(i>m){
            while(j<=e){
                temp[index] = A[j];
                index++;
                j++;
            }
        }
        else   {
            while(i<=m){
                temp[index] = A[i];
                index++;
                i++;
            }
        }
        k = b;
        while(k<index)  {
            A[k]=temp[k];
            k++;
        }
    }

}

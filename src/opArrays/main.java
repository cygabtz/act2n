package opArrays;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
//        int[] A = {2,5, 5, 9};
//        int[] B = {3, 7, 4, 8};
//        int[] C;
//
//        printArray(unioArrays(A, B));

        int[] p = {4, 5, 6, 3, 6, 5, 4};
        printArray(p);
        System.out.print(" is palindrome? " + isPalindrome(p));


    }

    public static void printArray(int[] N){
        System.out.print("[");
        for (int i = 0; i<N.length; i++){
            System.out.print(N[i] + " ,");
        }
        System.out.print("]");
    }

    public static int[] unioArrays(int[] a, int[] b){
        int c[] = new int[a.length+b.length];
        for (int i=0; i<a.length; i++){
            c[i] = a[i];
        }
        for (int i = 0; i<b.length; i++){
            c[a.length + i] = b[i];
        }
        return c;
    }
    //rep
    public static int[] unioArraysNoRep(int[] a, int[] b){
        int c[] = new int[a.length+b.length];

        for (int i=0; i<a.length; i++){
            c[i] = a[i];
        }

        boolean rep = false;
        int n = 0;
        for (int i = 0; i<b.length; i++){
            int x = b[i];
            for (int j = 0; j<c.length; j++){
                if (c[j] == x) {
                    rep = true;
                    break;
                }
            }
            if(!rep){
                c[a.length + n] = x;
                n++;
            }
        }
        return c;
    }

    public int[] diferenciaArrays(int[] a, int[] b){
        int c[] = new int[a.length];
        int n = 0;
        for (int i = 0; i<a.length; i++){

            boolean rep = false;
            for (int j = 0; j<b.length-1; j++){
                if (a[i] == b[j]){
                    rep = true;
                    break;
                }
            }
            if (!rep){
                c[n] = a[i];
                n++;
            }
        }
        return c;
    }
    public int[] interseccioArrays(int[] a, int[] b){

        int c[] = new int[Math.min(a.length,b.length)];
        int n = 0;
        for (int i = 0; i<a.length; i++){
            int x = a[i];

            for (int j = 0; j<b.length-1; j++){
                if (b[i] == x){
                    c[n] = x;
                    n++;
                    break;
                }
            }
        }
        return c;
    }

    public static boolean isPalindrome(int[] array){
        if (array.length==1){
            return true;
        }
        if(array.length == 2){
            return array[0] == array[array.length - 1];
        }
        else{
            return isPalindrome(Arrays.copyOfRange(array, 1, array.length - 1));
        }
    }

    public static void printArray(Float[] prices){
        for (int i = 0; i<prices.length; i++){
            System.out.println(prices[i]);
        }
    }
}


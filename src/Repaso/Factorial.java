package Repaso;

public class Factorial {
    public static void main(String [] args){
        System.out.println(factorial(10));
        System.out.println(factorial2(10));
    }

    private static int factorial(int n){
        int total = n;
        while (n>1){
            total *= (n-1);
            n--;
        }
        return total;
    }

    private static int factorial2(int n){
        //caso base
        if(n==1){return 1;}
        //caso recursivo
        else{
            return n*factorial(n-1);
        }
    }
}

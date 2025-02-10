package Repaso;

public class Numeros {
    public static void main(String[] args) {
        int n = 17;
        System.out.println("¿Es n primo? " + esPrimo(n));
    }

    public static int contarCifrasImpares (int numero){
        int index = 0;
        while (numero != 0) {
            int cifra = numero % 10;
            if (cifra % 2 != 0) {
                index++; //la cifra es impar
            }
            numero /= 10;
        }
        return index;
    }

    public static boolean esPrimo(int num){
        if (num<=0){
            return false;
        }


        for (int i = 2; i<Math.sqrt(num); i++){
            if (num%i==0){
                return false;
            }
        }

        return true;
    }
}

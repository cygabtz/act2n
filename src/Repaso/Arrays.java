package Repaso;

public class Arrays {
    public static int[] nums = {2, 4, 5, 2, 6,34, 7, 23};
    public static String[] names = {"GAB", "MATT", "JOAN"};
    public static void main(String[] args) {
        String s = null;
        //System.out.println(s.concat("ss")); ---> NullPointerException

        //Mediana
        System.out.print(mediana(nums));

        //subArray
        System.out.println("\n");
        opArrays.main.printArray(subArray(0, 6, nums));

        //Array Potencies
        opArrays.main.printArray(arrayPotencias(5, 0));

        //Array Iguales
        int[] arrayA = {1, 2, 3};
        int[] arrayB = {4, 5, 5, 5};
        System.out.println("\n¿Son A y B iguales? : "+ areEqual(arrayA, arrayB));

        //Unión de arrays
        opArrays.main.printArray(merge(arrayA, arrayB));

    }

    public static void recorrerAlReves(int [] nums){
        //Recorrer al revés INT
        for (int i = nums.length-1; i>=0; i--){
            System.out.println(nums[i]);
        }
        //ArrayIndexOutOfBounds
        //A un string: .lenGTH() en canvi a un array .lenGTH
    }

    public static float mediana(int [] nums){
        if(nums.length == 0){
            return 0;
        }

        float total = 0;
        for (int i = 0; i<nums.length; i++){
            total+= (float) nums[i];
        }
        return total/nums.length;
    }

    public static int [] subArray(int indexA, int indexB, int [] array){
        //indexA, indexB son índices no posiciones
        int [] subArray = new int[indexB - indexA + 1]; //aquí es una posición no índice

        for (int i = 0; i<subArray.length; i++){
            subArray[i] = array[i+indexA];
        }
        return subArray;
    }

    public static int[] arrayPotencias(int num, int power){
        if(num == 0 || power == 0){
            return new int[]{0};
        }
        int [] result = new int[power];

        result[0] = num;
        for (int i = 1; i<result.length; i++){
            result[i] = num * result[i-1];
        }
        return result;
    }

    public static boolean areEqual(int [] arrayA, int[] arrayB){
        if (arrayA.length!=arrayB.length){
            return false;
        }
        boolean equal = true;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] != arrayB[i]) {
                equal = false;
                break;
            }
        }
        return equal;
    }

    public static int[] merge(int[] arrayA, int[] arrayB){
        int totalLength = arrayA.length + arrayB.length;
        int[] result = new int[totalLength];
        for (int i = 0; i<totalLength; i++){
            if (i<=arrayA.length-1){
                result[i] = arrayA[i];
            }else{
                result[i] = arrayB[i-arrayA.length];
            }
        }
        return result;
    }
}

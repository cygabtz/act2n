package Repaso;

public class Random {
    public static void main(String[] args) {

        for(int i = 0; i<20; i++){
            System.out.println("I "+i+": "+randomNumInRange(5, 7)); //7 no incluído
        }


    }

    public static int randomNumInRange(int min, int max){
        return (int) (Math.random() * (max - min) + min);
    }
}

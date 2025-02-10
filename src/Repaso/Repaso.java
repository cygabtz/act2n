package Repaso;

import java.util.Scanner;
public class Repaso {
    public static float f;
    public static enum Sexe {HOME, DONA};

    Sexe persona2 = Sexe.DONA;
    public static void main(String [] args){
        //FLOAT
        f = 9.3f + 4;
        int a = 10;
        double b = 0.5;
        float c = a + (float) b;
        //SPECIAL NUMBERS
        int bin = 0b110;
        int hex = 0xFFFF;
        int oct = 0110;
        System.out.println("Binary: "+bin + "\nDecimal: " + hex + "\nOctal: " + oct);
        //UNICODE
        char uhex = '\u2030'; //hex
        char uoct = '\302';
        System.out.println("\nUnicode Hex: "+uhex+"\nUnicode Octal: "+uoct);



        for (char i = 'A', j = 'G'; i<='G' && j>='A'; i++, j--){
            if (i == 'C'){
                continue;
            }
            System.out.println(i + "\t" + j);
        }
    }
}

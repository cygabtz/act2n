package Repaso;

public class API_String {
    public static void main(String[] args) {
        String s = "Hola";
        System.out.println(s.charAt(0));
        String s2 = s.concat(" Manola");

        System.out.println(s2);
        System.out.println(s2.indexOf('o'));
        System.out.println(s2.lastIndexOf('o'));

        System.out.println(s2.substring(3)); //Incluído
        System.out.println("S length: "+s.length()); //lenGTH()
        System.out.println(s.substring(3, 4)); //1r arg: índice, 2o arg: posición
    }
}

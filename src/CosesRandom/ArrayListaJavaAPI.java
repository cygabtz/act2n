package CosesRandom;

import java.util.ArrayList;

public class ArrayListaJavaAPI {
    public static void main(String[] args) {
        //Declaración e inicialización
        ArrayList<String> llistaCompra = new ArrayList<>();

        //Añadir elementos
        llistaCompra.add("Pan");
        llistaCompra.add("Leche");
        llistaCompra.add("Verdura");

        llistaCompra.remove("Verdura");

        System.out.println(llistaCompra);

        System.out.println(llistaCompra.get(1));

        //Borrar todos los elementos
        llistaCompra.clear();

        //Recorrer la lista
        for (String producto : llistaCompra){
            System.out.println(producto);
        }

        //Mirar tamaño
        System.out.println(llistaCompra.size());
    }
}

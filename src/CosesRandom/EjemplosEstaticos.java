package CosesRandom;

public class EjemplosEstaticos {
    //Clase estática porque se usa en un contexto estático (main())
    //Si estuviera en otro archivo no haría falta
    public static class Cosa {
        static int n = 0;   //Propiedad estática de Cosa
        String nombre;      //Propiedad no estática

        public Cosa(int n, String nombre) {
            this.n = n;
            this.nombre = nombre;
        }
    }

    public static class Producto {
        public String nombre;
        public int precio;
        public static int total;

        public Producto(String nombre, int precio) {
            this.nombre = nombre;
            this.precio = precio;
            total += precio;
        }

        public void metodo1() {
        }

        public static void metodo2() {
        }
    }

    public static void main(String[] args) {

        //VARIABLES ESTÁTICAS

        Cosa c1 = new Cosa(22, "Cosa1");

        //Podemos acceder a las propiedades no estáticas
        System.out.println(c1.nombre);

        //Las propiedades estáticas no pertenecen al objeto, sinó a la clase (Cosa)
        //Por tanto, se accede a ellas a través de la clase.
        System.out.println(Cosa.n); //--> 22

        Cosa c2 = new Cosa(15, "Cosa2");
        System.out.println(Cosa.n); //--> 15

        //Cosa.n almacena el valor declarado en la última instancia de un objeto Cosa hecha.

        //Cosa.n = 22 se pierde al crear el objeto c2;
        //Cuando se crea el primer objeto Cosa, Java guarda un espacio de memoria para las
        //variables y métodos estáticos. Esta espacio se comparte entre todas las instancias
        //de la clase Cosa

        //Ejemplo 2:

        Producto p1 = new Producto("Manzana", 5);
        Producto p2 = new Producto("Plátano", 4);

        System.out.println("Total productos: " + Producto.total); //--> 5+4=9

        //MÉTODOS ESTÁTICOS

        //Llamadas a métodos no estáticos
        p1.metodo1();
        p2.metodo1();

        //Llamada al método estático
        Producto.metodo2(); //Es un único método compartido entre todas las instancias

    }
}

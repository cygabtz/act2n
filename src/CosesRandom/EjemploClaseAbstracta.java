package CosesRandom;

public class EjemploClaseAbstracta {

    public static abstract class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }


    }

    public static class Alumno extends Persona {
        private int curso;

        public Alumno(String nombre, int edad, int curso) {
            super(nombre, edad);
            this.curso = curso;
        }
    }

    public static void main(String[] args) {
        //Clase abstracta --> no se puede instanciar
        //Persona pers = new Persona("sf", 3);

        //Clase instanciable porque solo hereda de un abstracto
        Alumno alumno = new Alumno("Paco", 20, 3);

    }

}

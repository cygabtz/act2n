package CosesRandom;

import javax.swing.plaf.metal.MetalLabelUI;

public class EjemploOverride {

    public static abstract class Persona {
        public String nombre;
        public int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public void imprimir(){}

    }

    public static class Alumno extends Persona {
        private int curso;

        public Alumno(String nombre, int edad, int curso) {
            super(nombre, edad);
            this.curso = curso;
        }

        //Hay sobrecarga
        public void imprimir(){System.out.println(this.nombre.toUpperCase());}

        //Si sobrecarga
        public void imprimir2(){System.out.println(this.nombre.toUpperCase());}
    }

    public static class Profesor extends Persona {
        private int curso;

        public Profesor(String nombre, int edad, int curso) {
            super(nombre, edad);
            this.curso = curso;
        }

        //Hay sobregarga
        public void imprimir(){System.out.println(this.nombre.toLowerCase());}

        //Sin sobrecarga
        public void imprimir2(){System.out.println(this.nombre.toUpperCase());}

    }

    public static void main(String[] args) {
        Persona[] personas = new Persona[3];

        personas[0] = new Alumno("Pep", 23, 2);
        personas[1] = new Profesor("Pablo", 45, 2);
        personas[2] = new Alumno("Bel", 19, 3);

        //Sobrecarga --> + facil
        for (Persona persona : personas) persona.imprimir();

        //Sin sobrecarga --> Es necesario hacer conversión de tipos
        for (Persona persona : personas){
            if (persona instanceof Alumno){
                ((Alumno) persona).imprimir2();
            }
            else if (persona instanceof Profesor){
                ((Profesor) persona).imprimir2();
            }
        }
    }
}

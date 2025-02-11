package CosesRandom;

public class Ejemplos2 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Paco", "45678761K", Persona.SEXO.HOMBRE);

        System.out.println(p1); //Imprime el toString() modificado

    }

    public static class Persona {
        String nombre, dni;

        enum SEXO {HOMBRE, MUJER, OTROS}

        SEXO sexo;

        public Persona (String n, String dni, SEXO s){
            this.nombre = n;
            this.dni = dni;
            this.sexo = s;
        }

        @Override
        public String toString() {
            return this.nombre + ", " + dni + " (" + this.sexo + ")";
        }
    }

}

package CosesRandom;

public class Ejemplos2 {
    public static void main(String[] args) {
        Coche c1 = new Coche("PM12345CL");
        Coche c2 = new Coche("PM12345CL");

        if (c1 == c2) System.out.println("IGUALS");
        else System.out.println("DIFF");
        //El hashCode() es diferente

        if (c1.equals(c2)) System.out.println("IGUALS");
        else System.out.println("DIFF");
    }

    public static class Coche {
        String matricula;
        int numPuertas;

        enum COLOR {ROJO, VERDE, AZUL}

        COLOR color;

        public Coche(String m) {
            this.matricula = m;
            this.numPuertas = 5;
            this.color = COLOR.AZUL;
        }

        @Override
        public boolean equals(Object obj) {
            return this.matricula.equals( ((Coche) obj).matricula)
                    && this.numPuertas==((Coche) obj).numPuertas;
        }
    }

}

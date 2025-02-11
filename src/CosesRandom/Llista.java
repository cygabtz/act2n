package CosesRandom;

public class Llista<E> {
    E[] array;
    int tail;

    Llista() {
        array = (E[]) new Object [100];
        tail = -1;
    }

    void prepend(E n) {
        //Desplazamos todos los valores
        for (int i = tail; i > 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = n;
        tail++;
    }

    void append(E n) {
        tail++;
        array[tail] = n;
    }

    void insertAt(int p, E n) {
        for (int i = tail + 1; i > p; i--) {
            array[i] = array[i - 1];
        }
        array[p] = n;
        tail++;
    }

    boolean isEmpty() {
        return tail == -1;
    }

    boolean isFull() {
        return tail == array.length - 1;
    }

    int numElements() {
        return tail + 1;
    }

    E getElementAt(int p) {
        return array[p];
    }

    E getFirst() {
        return array[0];
    }

    E getLast() {
        if (!isEmpty()) {
            return array[tail];
        } else {
            return null;
        }
    }

    E removeAt(int p) {
        //También retorna
        E value = array[p];

        for (int i = p; i < tail; i++) {
            array[i] = array[i + 1];
        }
        tail--;
        return value;
    }
    @Override
    public String toString(){
        String s = "";
        for (int i=0; i<=tail; i++) s +=array[i].toString();
        return s;
    }

    public static void main(String[] args) {
        Llista<String> llistaString;
        Llista<Integer> llistaNum;
        Llista<Float> llistaFloats;

        llistaString = new Llista<>();
    }
}

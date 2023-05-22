package Ejercicio5;

import java.util.Vector;

public class TrabajoVectores {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Elemento1");
        vector.add("Elemento2");
        vector.add("Elemento3");
        vector.add("Elemento4");
        vector.add("Elemento5");

        System.out.println("Vector original: " + vector);

        vector.remove(1);
        vector.remove(2);

        System.out.println("Vector modificado: " + vector);
    }
}

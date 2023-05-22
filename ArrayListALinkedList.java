package Ejercicio5;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListALinkedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Elemento1");
        arrayList.add("Elemento2");
        arrayList.add("Elemento3");
        arrayList.add("Elemento4");

        LinkedList<String> linkedList = new LinkedList<>(arrayList);

        System.out.println("ArrayList:");
        for (String element : arrayList) {
            System.out.println(element);
        }

        System.out.println("LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}

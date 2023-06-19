package ejercicios;

import java.util.Scanner;

public class Cajero {
    private static int sueldo = 1000;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        while (choice != 1 && choice != 2) {
            System.out.print("¿Qué acción desea realizar? (1 - Ingresar, 2 - Retirar) -> ");
            choice = scanner.nextInt();

            if (choice == 1) {
                ingresar();
            } else if (choice == 2) {
                retirar();
            } else {
                System.out.println("Opción inválida. Por favor, elija 1 o 2.");
            }
        }
    }
    public static void ingresar() {
        System.out.println("Ingresar: ");
        int monto = scanner.nextInt();
        sueldo += monto;
        System.out.println("Sueldo actual: " + sueldo);
    }

    public static void retirar() {
        System.out.println("Retirar: ");
        int monto = scanner.nextInt();
        if (monto > sueldo) {
            System.out.println("No tienes suficiente dinero.");
        } else {
            sueldo -= monto;
            System.out.println("Sueldo actual: " + sueldo);
        }
    }
}
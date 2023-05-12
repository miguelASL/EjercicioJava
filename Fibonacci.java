import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rango;
        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.print("Escribe el rango: ");
        rango = s.nextInt();

        for (int i = 2; i < rango; i++){
            num3 = num1 + num2;
            System.out.println(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
package ejercicios;

import java.util.Scanner;

public class AdivinarNumeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int prediccion = 0;

        int numero = (int)(Math.random()* 100) + 1;

        while (prediccion != numero) {
            System.out.print("Di el numero: ");
            prediccion = s.nextInt();

            if(prediccion > numero) {
                System.out.println("Di un numero mas pequeño. Sigue intentandolo");
            } else if (prediccion == numero) {
                System.out.println("Correcto, tu numero: " + prediccion + " y " + "El numero aleatorio : " +
                        numero + " Son iguales." );
            }else {
                System.out.println("Di uno mas grande, Sigue intentandolo");
            }
        }

    }
}

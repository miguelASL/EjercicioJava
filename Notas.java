package ejercicios;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double nota;
        int aprobados=0, suspendidos=0, condicionados=0;

        for (int i = 0; i < 6; i++) {
            do {
                System.out.println("Notas: ");
                nota= s.nextFloat();
            }while(nota < 0 || nota > 10);
            if (nota==4){
                condicionados++;
            } else if (nota > 4) {
                aprobados++;
            }else {
                suspendidos++;
            }
        }
        System.out.println("aprobados:" + aprobados);
        System.out.println("suspendidos:" + suspendidos);
        System.out.println("condicionados:" + condicionados);
    }
}

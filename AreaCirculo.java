import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        //Fórmula área del círculo = pi * radio ^ 2
        Scanner s = new Scanner(System.in);

        double pi = Math.PI;
        float radio;
        System.out.print("Por favor diga cuanto es el radio: ");
        radio = s.nextFloat();
        System.out.println("EL area del circulo es : " + pi* Math.pow(radio, 2));
    }
}

package PoligonoEjercicio;

import java.util.Scanner;

public class Rectangulo extends Poligono {

    Scanner s = new Scanner(System.in);
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public double Area() {
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo: \n" +
                super.toString() +
                "\nEl lado 1 mide " + lado1 +
                "\nEl lado 2 mide " + lado2;
    }
}

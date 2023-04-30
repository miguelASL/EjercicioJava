package PoligonoEjercicio;

public class Triangulo extends Poligono{
    private double lado1;
    private double lado2;
    private double lado3;


    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override
    public double Area() {
        double p = (lado1 + lado2 + lado3)/2 ;
        return Math.sqrt((p * (p - lado1) * (p - lado2) * (p - lado3)));

    }

    @Override
    public String toString() {
        return "Triangulo: \n" +
                super.toString() +
                "\nLado 1 mide " + lado1 +
                "\nLado 2 mide " + lado2 +
                "\nLado 3 mide " + lado3;
    }
}

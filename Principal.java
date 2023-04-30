package PoligonoEjercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        //Llenar poligono.
        llenarPoligono();
        //mostrar los datos y el área de cada poligono.
        mostrarResultados();
    }
    public static void llenarPoligono(){
        char respuesta;
        int opcion;
        do {
            do {
                System.out.println("Diga que poligono desea: ");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.print("Opcion: ");
                opcion = s.nextInt();

            }while(opcion < 1 || opcion > 2);

            switch (opcion){
                case 1: llenarTriangulo();
                    break;
                case 2: llenarRectangulo();
                    break;
            }
            System.out.println("\nDesea introducir otro poligono(s/n)? ");
            respuesta = s.next().charAt(0);
            System.out.println("");
        }while(respuesta == 's' || respuesta == 'S');
    }
    public static void llenarTriangulo(){
        double lado1, lado2, lado3;
        System.out.print("\nDiga el lado 1 del triangulo : ");
        lado1 = s.nextDouble();
        System.out.print("\nDiga el lado 2 del triangulo : ");
        lado2 = s.nextDouble();
        System.out.print("\nDiga el lado 3 del triangulo : ");
        lado3 = s.nextDouble();

        Triangulo tri = new Triangulo(lado1, lado2, lado3);
        poligono.add(tri); //Aquí "almacenamos" en nuestro Array el objeto "tri".
    }
    public static void llenarRectangulo(){
        double lado1, lado2;
        System.out.print("\nDiga el lado 1 del rectangulo : ");
        lado1 = s.nextDouble();
        System.out.print("\nDiga el lado 2 del rectangulo : ");
        lado2 = s.nextDouble();

        Rectangulo rec = new Rectangulo(lado1, lado2);
        poligono.add(rec);//Aqui "almacenamos" en nuestro Array el objeto "rec".
    }
    public static void mostrarResultados(){
        for (Poligono pol: poligono) {
            System.out.println(pol.toString());
            System.out.println("El area es " + pol.Area());
            System.out.println("");
        }
    }
}

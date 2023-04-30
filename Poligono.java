package PoligonoEjercicio;

public abstract class Poligono {

    protected int nLados;

    public Poligono(int nLados) {
        this.nLados = nLados;
    }

    public int getnLados() {
        return nLados;
    }

    public abstract double Area();

    @Override
    public String toString() {
        return "\nNumero de lados = " + nLados;
    }
}


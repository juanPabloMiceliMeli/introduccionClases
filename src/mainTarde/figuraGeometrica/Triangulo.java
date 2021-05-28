package mainTarde.figuraGeometrica;

public class Triangulo extends FiguraGeometrica{

    double largo;
    double altura;

    public Triangulo(double largo, double altura) {
        this.largo = largo;
        this.altura = altura;
    }

    @Override
    public double area() {
        return this.largo*this.altura/2;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "largo=" + largo +
                ", altura=" + altura +
                '}';
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

package ex35;

public class Circulo implements FormaGeometrica{
    @Override
    public void calcularArea() {
        System.out.println("Area calculada");
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro calculado");
    }
}

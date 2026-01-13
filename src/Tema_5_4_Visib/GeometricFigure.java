package Tema_5_4_Visib;

abstract class GeometricFigure {
    protected String color;

    public GeometricFigure(String color) {
        this.color = color;
    }

    // Método abstracto que cada figura debe implementar
    public abstract double calculateArea();

    @Override
    public String toString() {
        return "Color: " + color + ", Área: " + calculateArea();
    }
}

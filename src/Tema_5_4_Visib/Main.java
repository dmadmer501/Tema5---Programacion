package Tema_5_4_Visib;

public class Main {
    public static void main(String[] args) {
        GeometricFigure[] figures = new GeometricFigure[3];

        figures[0] = new Circle("Rojo", 5);
        figures[1] = new Rectangle("Azul", 4, 10);
        figures[2] = new Triangle("Verde", 6, 8);

        for (GeometricFigure figure : figures) {
            System.out.println("--- " + figure.getClass().getSimpleName() + " ---");
            System.out.println("Área individual: " + figure.calculateArea());
            System.out.println("Método toString: " + figure);
            System.out.println();
        }
    }
}

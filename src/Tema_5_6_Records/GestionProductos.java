package Tema_5_6_Records;

public class GestionProductos {
    public static void main(String[] args) {
        
        try {
            Producto p1 = new Producto(1, "Portatil", 1200.0);
            Producto p2 = new Producto(2, "Ratón", 25.50);

            System.out.println("Productos iniciales: ");
            System.out.println(p1);
            System.out.println(p2);

            Producto p1Rebajado = p1.aplicarDescuento(10);
            System.out.println("\nProducto tras aplicar 10% de descuento: ");
            System.out.println(p1Rebajado);

            System.out.println("\nIntentado crear producto con precio negativo...");
            Producto pError = new Producto(3, "teclado", -10.0);
            System.out.println(pError);

        } catch (IllegalArgumentException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }

}

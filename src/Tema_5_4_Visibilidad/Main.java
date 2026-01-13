package Tema_5_4_Visibilidad;

public class Main {
    public static void main(String[] args) {
        Televisor miTV = new Televisor();

        miTV.cambiarCanal(5);
        
        System.out.println("Canal actual: " + miTV.getCanal());

        miTV.cambiarCanal(-10); 
        
        System.out.println("Canal tras intento inválido: " + miTV.getCanal());
        
        }
}
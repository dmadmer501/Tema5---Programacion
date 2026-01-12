package Tema_5_3_Constructores;

public class Main_ej3 {

    public static void main(String[] args) {
        
        Student s = new Student(101, "Pepe");

        System.out.println("---Estado inicial---");
        System.out.println(s);

        s.registrarNotas(3.2f, 8.9f);
        System.out.println("---Despues de registrar---");
        System.out.println(s);

    }
}

package Tema_5_3_Constructores;

public class Student {
    private int registration;
    private String name;
    private float nota1;
    private float nota2;

    public Student(int registration, String name) {
        this.registration = registration;
        this.name = name;
    }

    public void registrarNotas(float nota1, float nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public float notaMedia() {
        return (nota1 + nota2) / 2;
    }

    public String toString() {
        return String.format("La nota media del alunmo %s, con matricula numero %d, es %.2f", name, registration, notaMedia());
    }

}

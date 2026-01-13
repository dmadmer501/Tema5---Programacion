package Tema_5_4_Visibilidad;

public class Televisor {
    // ATRIBUTOS PRIVADOS: El usuario no debe tocar los cables internos
    private int canal;
    @SuppressWarnings("unused")
    private int volumen;

    // CONSTRUCTOR PÚBLICO: Para que el usuario pueda "comprar" (crear) la TV
    public Televisor() {
        this.canal = 1;
        this.volumen = 10;
    }

    // MÉTODOS PÚBLICOS: El mando a distancia (la interfaz)
    public void cambiarCanal(int nuevoCanal) {
        if (esCanalValido(nuevoCanal)) { // Uso de un método privado
            this.canal = nuevoCanal;
        }
    }

    // MÉTODO PRIVADO: El usuario no necesita ver cómo la TV comprueba los canales
    private boolean esCanalValido(int c) {
        return c > 0 && c < 100;
    }
    
    // GETTER PÚBLICO: Para que el usuario vea en qué canal está
    public int getCanal() {
        return canal;
    }
}

package biblioteca.modelo;

public class libro {

    private String titulo;
    private String autor;
    private boolean disponible;

    public libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;   // un libro nuevo queda disponible
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void prestar() {
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }

    public void mostrarInformacion() {
        System.out.println(titulo + " de " + autor + " | disponible: " + disponible);
    }
}

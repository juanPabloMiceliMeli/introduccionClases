package mainManiana;

public class Libro {

    private String titulo;
    private String autor;
    private String genero;
    private boolean disponible;

    public Libro() {
        setTitulo("N/N");
        setAutor("N/N");
        setGenero("N/N");
        setDisponible(true);
    }

    public Libro(String titulo, String autor, String genero) {
        setTitulo(titulo);
        setAutor(autor);
        setGenero(genero);
        setDisponible(true);
    }

    public boolean prestamo(){
        if(!isDisponible()){
            return false;
        }
        setDisponible(false);
        return true;
    }

    public boolean depositar(){
        if(isDisponible()){
            return false;
        }
        setDisponible(true);
        return true;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    private void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    private void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

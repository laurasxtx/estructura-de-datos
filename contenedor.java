

public class contenedor {

    private int id;
    private String origen;
    private int peso;

    public contenedor(int id, String origen, int peso) {
        this.id = id;
        this.origen = origen;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Contenedor [id=" + id + ", origen=" + origen + ", peso=" + peso + "]";
    }
}
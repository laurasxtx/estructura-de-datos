public class Contenedor {

    private int id;
    private String origen;
    private int peso;

    public Contenedor(int id, String origen, int peso) {
        this.id = id;
        this.origen = origen;
        this.peso = peso;
    }

    
    public int getPeso() {
        return peso;
    }

    public String getOrigen() {
    return origen;
}

    
    public static int calcularPesoTotal(Contenedor[] contenedores) {
        int total = 0;
        for (Contenedor c : contenedores) {
            total += c.getPeso();
        }
        return total;
    }

    
    public static double calcularPesoPromedio(Contenedor[] contenedores) {
        int total = calcularPesoTotal(contenedores);
        return (double) total / contenedores.length;
    }

    @Override
    public String toString() {
        return "Contenedor [id=" + id + ", origen=" + origen + ", peso=" + peso + "]";
    }
}


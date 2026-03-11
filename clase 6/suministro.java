


public class suministro {

    private String id; 

    private int energia;

    private String estandar;

    public suministro(String id, int energia, String estandar) {
        this.id = id;
        this.energia = energia;
        this.estandar = estandar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getEstandar() {
        return estandar;
    }

    public void setEstandar(String estandar) {
        this.estandar = estandar;
    }

    @Override
    public String toString() {
        return "suministro [id=" + id + ", energia=" + energia + ", estandar=" + estandar + "]";
    }

    

}

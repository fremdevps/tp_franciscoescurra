package trabajo2;

//Francisco Escurra 5920140 11/05/2024
//Francisco Escurra 5920140
public abstract class Producto {
    private String fechaCaducidad;
    private String numeroLote;

    public Producto(String fechaCaducidad, String numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public abstract void mostrarInformacion();
}

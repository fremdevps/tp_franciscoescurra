package trabajo2;

/*Los productos congelados por nitrógeno deben llevar la información del método de
congelación empleado y del tiempo de exposición al nitrógeno expresada en
segundos.*/
public class ProductoCongeladoNitrogeno extends ProductoCongelado {
    private String metodoCongelacion;
    private double tiempoExposicionNitrógeno;

    public ProductoCongeladoNitrogeno(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen,
            double temperaturaMantenimientoRecomendada, String metodoCongelacion, double tiempoExposicionNitrógeno) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimientoRecomendada);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicionNitrógeno = tiempoExposicionNitrógeno;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public double getTiempoExposicionNitrógeno() {
        return tiempoExposicionNitrógeno;
    }

    public void setTiempoExposicionNitrógeno(double tiempoExposicionNitrógeno) {
        this.tiempoExposicionNitrógeno = tiempoExposicionNitrógeno;
    }

    public void mostrarInformacion() {
        System.out.println("Producto Congelado por Nitrógeno");
        System.out.println("Fecha de caducidad: " + getFechaCaducidad());
        System.out.println("Numero de lote: " + getNumeroLote());
        System.out.println("Fecha de envasado: " + getFechaEnvasado());
        System.out.println("Pais de origen: " + getPaisOrigen());
        System.out.println("Temperatura de mantenimiento recomendada: " + getTemperaturaMantenimientoRecomendada());
        System.out.println("Metodo de congelacion: " + getMetodoCongelacion());
        System.out.println("Tiempo de exposicion al nitrógeno: " + getTiempoExposicionNitrógeno());
    }

}

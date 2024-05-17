package trabajo2;

//Francisco Escurra 5920140 11/05/2024
/*Los productos congelados deben llevar la fecha de envasado, el país de origen y
la temperatura de mantenimiento recomendada. */
public abstract class ProductoCongelado extends ProductoEnvasado {

    private double temperaturaMantenimientoRecomendada;

    public ProductoCongelado(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen,
            double temperaturaMantenimientoRecomendada) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
        this.temperaturaMantenimientoRecomendada = temperaturaMantenimientoRecomendada;
    }

    public double getTemperaturaMantenimientoRecomendada() {
        return temperaturaMantenimientoRecomendada;
    }

    public void setTemperaturaMantenimientoRecomendada(double temperaturaMantenimientoRecomendada) {
        this.temperaturaMantenimientoRecomendada = temperaturaMantenimientoRecomendada;
    }

    public abstract void mostrarInformacion();

}

package trabajo2;

/*Los productos congelados por aire deben llevar la información de la composición
del aire con que fue congelado (% de Nitrogeno, % de oxígeno, % de dióxido de
carbono y % de vapor de agua).*/
public class ProductoCongeladoAire extends ProductoCongelado {
    private double porcentajeNitrogeno;
    private double porcentajeOxigeno;
    private double porcentajeDioxidoCarbono;
    private double porcentajeVaporAgua;

    public ProductoCongeladoAire(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen,
            double temperaturaMantenimientoRecomendada, double porcentajeNitrogeno, double porcentajeOxigeno,
            double porcentajeDioxidoCarbono, double porcentajeVaporAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimientoRecomendada);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    public double getporcentajeNitrogeno() {
        return porcentajeNitrogeno;
    }

    public void setporcentajeNitrogeno(double porcentajeNitrogeno) {
        this.porcentajeNitrogeno = porcentajeNitrogeno;
    }

    public double getPorcentajeOxigeno() {
        return porcentajeOxigeno;
    }

    public void setPorcentajeOxigeno(double porcentajeOxigeno) {
        this.porcentajeOxigeno = porcentajeOxigeno;
    }

    public double getPorcentajeDioxidoCarbono() {
        return porcentajeDioxidoCarbono;
    }

    public void setPorcentajeDioxidoCarbono(double porcentajeDioxidoCarbono) {
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
    }

    public double getPorcentajeVaporAgua() {
        return porcentajeVaporAgua;
    }

    public void setPorcentajeVaporAgua(double porcentajeVaporAgua) {
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    public void mostrarInformacion() {
        System.out.println("Producto Congelado por Aire");
        System.out.println("Fecha de caducidad: " + getFechaCaducidad());
        System.out.println("Numero de lote: " + getNumeroLote());
        System.out.println("Fecha de envasado: " + getFechaEnvasado());
        System.out.println("Pais de origen: " + getPaisOrigen());
        System.out.println("Temperatura de mantenimiento recomendada: " + getTemperaturaMantenimientoRecomendada());
        System.out.println("Porcentaje de Nitrogeno: " + getporcentajeNitrogeno());
        System.out.println("Porcentaje de oxígeno: " + getPorcentajeOxigeno());
        System.out.println("Porcentaje de dióxido de carbono: " + getPorcentajeDioxidoCarbono());
        System.out.println("Porcentaje de vapor de agua: " + getPorcentajeVaporAgua());
    }

}

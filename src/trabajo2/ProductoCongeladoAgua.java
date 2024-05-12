package trabajo2;

/*Los productos congelados por agua deben llevar la información de la salinidad del
agua con que se realizó la congelación en gramos de sal por litro de agua. */
public class ProductoCongeladoAgua extends ProductoCongelado {
    private double salinidadAgua;

    public ProductoCongeladoAgua(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen,
            double temperaturaMantenimientoRecomendada, double salinidadAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimientoRecomendada);
        this.salinidadAgua = salinidadAgua;
    }

    public double getSalinidadAgua() {
        return salinidadAgua;
    }

    public void setSalinidadAgua(double salinidadAgua) {
        this.salinidadAgua = salinidadAgua;
    }

    public void mostrarInformacion() {
        System.out.println("Producto Congelado por Agua");
        System.out.println("Fecha de caducidad: " + getFechaCaducidad());
        System.out.println("Numero de lote: " + getNumeroLote());
        System.out.println("Fecha de envasado: " + getFechaEnvasado());
        System.out.println("Pais de origen: " + getPaisOrigen());
        System.out.println("Temperatura de mantenimiento recomendada: " + getTemperaturaMantenimientoRecomendada());
        System.out.println("Salinidad del agua: " + getSalinidadAgua());
    }

}

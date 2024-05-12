package trabajo2;

/*Los productos refrigerados deben llevar el código del organismo de supervisión
alimentaria, la fecha de envasado, la temperatura de mantenimiento recomendada
y el país de origen.  */
public class ProductoRefrigerado extends ProductoEnvasado {

    private String codigoOrganismoSupervision;
    private Double temperaturaMantenimientoRecomendada;

    public ProductoRefrigerado(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen,
            String codigoOrganismoSupervision, Double temperaturaMantenimientoRecomendada) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
        this.codigoOrganismoSupervision = codigoOrganismoSupervision;
        this.temperaturaMantenimientoRecomendada = temperaturaMantenimientoRecomendada;
    }

    public String getCodigoOrganismoSupervision() {
        return codigoOrganismoSupervision;
    }

    public void setCodigoOrganismoSupervision(String codigoOrganismoSupervision) {
        this.codigoOrganismoSupervision = codigoOrganismoSupervision;
    }

    public Double getTemperaturaMantenimientoRecomendada() {
        return temperaturaMantenimientoRecomendada;
    }

    public void setTemperaturaMantenimientoRecomendada(Double temperaturaMantenimientoRecomendada) {
        this.temperaturaMantenimientoRecomendada = temperaturaMantenimientoRecomendada;
    }

    public void mostrarInformacion() {
        System.out.println("Producto Refrigerado");
        System.out.println("Fecha de caducidad: " + getFechaCaducidad());
        System.out.println("Numero de lote: " + getNumeroLote());
        System.out.println("Fecha de envasado: " + getFechaEnvasado());
        System.out.println("Pais de origen: " + getPaisOrigen());
        System.out.println("Codigo del organismo de supervision: " + getCodigoOrganismoSupervision());
        System.out.println("Temperatura de mantenimiento recomendada: " + getTemperaturaMantenimientoRecomendada());
    }
}

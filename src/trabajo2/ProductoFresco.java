package trabajo2;

//Francisco Escurra 5920140 11/05/2024
/*Los productos frescos deben llevar la fecha de envasado y el país de origen.  */
public class ProductoFresco extends ProductoEnvasado {
	private String paisOrigen;
	private String fechaEnvasado;

	public ProductoFresco(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
		this.paisOrigen = paisOrigen;
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public void mostrarInformacion() {
		System.out.println("Producto Fresco");
		System.out.println("Fecha de caducidad: " + getFechaCaducidad());
		System.out.println("Numero de lote: " + getNumeroLote());
		System.out.println("Fecha de envasado: " + getFechaEnvasado());
		System.out.println("Pais de origen: " + getPaisOrigen());
	}
}

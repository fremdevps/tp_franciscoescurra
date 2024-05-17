package trabajo2;

//Francisco Escurra 5920140 11/05/2024
public abstract class ProductoEnvasado extends Producto {
	private String fechaEnvasado;
	private String paisOrigen;

	public ProductoEnvasado(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, numeroLote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public abstract void mostrarInformacion();
}

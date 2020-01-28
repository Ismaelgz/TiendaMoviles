
public class Venta {
	private Movil movil;
	private Cliente cliente;
	private String fechaVenta;

	public Venta(Movil movil, Cliente cliente, String fechaVenta) {
		super();
		this.movil = movil;
		this.cliente = cliente;

		this.fechaVenta = fechaVenta;
	}

}

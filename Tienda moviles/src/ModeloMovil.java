
// POJO
public class ModeloMovil {
	private String codigoModelo, caracteristicas;
	private float precio;
	
	private Estado estado;
	
	public ModeloMovil(String codigoModelo, String caracteristicas, float precio) {
		super();
		this.codigoModelo = codigoModelo;
		this.caracteristicas = caracteristicas;
		this.precio = precio;
		estado=Estado.produciendose;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getCodigoModelo() {
		return codigoModelo;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}
	
}


public class Cliente {

  private String CIF, datosPersonales, cuentaCorriente;

	
	public Cliente(String cIF, String dp, String ncc) {
		super();

		CIF = cIF;
		this.datosPersonales = dp;
		this.cuentaCorriente = ncc;
	}

	public String getCuentaCorriente() {
		return cuentaCorriente;
	}

	public void setCuentaCorriente(String cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}

	public String getCIF() {
		return CIF;
	}

	public String getDatosPersonales() {
		return datosPersonales;
	}
  
  
  
}


public class Movil {
	private String codReferencia;
	private Color color;
	private ModeloMovil modelo;


	public Movil(String codReferencia, Color color, ModeloMovil modelo) {
		super();
		this.codReferencia = codReferencia;
		this.color = color;
		this.modelo = modelo;
	}


	public String getCodReferencia() {
		return codReferencia;
	}

	public Color getColor() {
		return color;
	}

	public ModeloMovil getModelo() {
		return modelo;
	}

}


package es.escueladeprogramacion.red_neuronal;

public class Input implements Connectable{
	
	private Double value;

	/**
	 * Constructor por defecto.
	 */
	public Input() {}
	
	/**
	 * Constructor parametrizado
	 * @param value Valor de la entrada.
	 */
	public Input(double value) {
		this.value = value;
	}

	//Getters y Setters
	@Override
	public Double getValue() {
		return this.value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

}

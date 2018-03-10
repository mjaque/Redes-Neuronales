package es.escueladeprogramacion.red_neuronal;

public class Connection {
	private Double weight;
	private final Connectable input;
	
	/**
	 * Crea una nueva conexión asignándole un peso aleatorio
	 * @param neuron Neurona de entrada en la conexión
	 */
	public Connection(Connectable input) {
		this.input = input;
		this.weight = Math.random() * Double.MAX_VALUE;
		if (Math.random() < 0.5)
			this.weight *= -1;
	}

	//Getters y Setters
	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Connectable getInput() {
		return input;
	}

	@Override
	public String toString() {
		return "Connection [weight=" + weight + ", input=" + input + "]";
	}


}

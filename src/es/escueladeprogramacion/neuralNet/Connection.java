package es.escueladeprogramacion.neuralNet;

public class Connection {
	private Double weight;
	private final Neuron neuron;
	
	/**
	 * Crea una nueva conexión asignándole un peso aleatorio
	 * @param neuron Neurona de entrada en la conexión
	 */
	public Connection(Neuron input) {
		this.neuron = input;
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

	public Neuron getNeuron() {
		return neuron;
	}

	@Override
	public String toString() {
		return "Connection [weight=" + weight + ", neuron=" + neuron + "]";
	}


}

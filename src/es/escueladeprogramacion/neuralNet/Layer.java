package es.escueladeprogramacion.red_neuronal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Layer {
	private final Set<Neuron> neurons = new HashSet<>();

	public Layer(int numberOfNeurons, Layer previousLayer) {
		this(numberOfNeurons, new HashSet<>(previousLayer.getNeurons()));
	}

	public Layer(int numberOfNeurons, Set<Connectable> connectables) {
		// Creamos las neuronas con sus conexiones
		for (int i = 0; i < numberOfNeurons; i++) { // Para cada neurona
			Set<Connection> connections = new HashSet<>();
			for (Connectable connectable : connectables) // Creamos una conexión para cada entrada
				connections.add(new Connection(connectable));
			//Para poner otra función de activiación que no esté predefinida en ActivationFunction
			//new Neuron(connections, (value) -> {return value*2.0;}, bias);
			this.getNeurons().add(new Neuron(connections, ActivationFunction.step(), null));
		}
	}

	/**
	 * Constructor por defecto. Se utiliza para la capa de entrada, que no tiene
	 * capa previa.
	 */
	public Layer() {
		// No hacer nada
	}

	/**
	 * Computa los valores de todas las neuronas de la capa.
	 */
	public void compute() {
		for (Neuron neuron : this.neurons)
			neuron.compute();
	}

	// Getters y Setters
	public Set<Neuron> getNeurons() {
		return neurons;
	}
	
	@Override
	public String toString() {
		String description = this.getClass().getSimpleName() + ": ";
		for(Neuron neuron : this.neurons)
			description += "\n\t\t" + neuron.toString();
		
		return description;
	}

}

package es.escueladeprogramacion.red_neuronal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Capa de entrada. Está formada por una neurona por valor de entrada. 
 * @author mjaque
 *
 */
public class InputLayer extends Layer {
	
	private List<Input> inputs;
	
	/**
	 * Crea una capa de entrada con el número de entradas indicado.
	 * @param inputs Número de entradas.
	 */
	public InputLayer(List<Input> inputs) {
		super(inputs.size(), new HashSet<>(inputs));
		this.inputs = inputs;
		
		//Ponemos todos los pesos a cero.
		//En la capa de entrada no se ponderan las entradas
		for (Neuron neuron : this.getNeurons()) 	//Para cada neurona
			for (Connection connection : neuron.getInputs()) 
				connection.setWeight(1.0);
	}
	
	//Getters y Setters
	public List<Input> getInputs() {
		return inputs;
	}

}

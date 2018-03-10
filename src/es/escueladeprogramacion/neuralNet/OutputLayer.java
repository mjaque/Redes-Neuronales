package es.escueladeprogramacion.neuralNet;

import java.util.ArrayList;
import java.util.List;

/**
 * Capa de salida.
 * Tiene una neurona por cada valor de salida de la red.
 * @author mjaque
 *
 */
public class OutputLayer extends Layer {
	private List<Neuron> outputs;

	public OutputLayer(int numberOfOutputs, Layer previousLayer) {
		super(numberOfOutputs, previousLayer);
		
		this.outputs = new ArrayList<>();
		for(Neuron neuron : this.getNeurons())
			this.outputs.add(neuron);
	}

	public Double[] getOutputs() {
		Double[] outputs = new Double[this.outputs.size()];
		for (int i = 0; i < outputs.length; i++) {
			outputs[i] = this.outputs.get(i).getValue();
		}
		
		return outputs;
	}
	
}

package es.escueladeprogramacion.neuralNet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import es.escueladeprogramacion.neuralNet.exceptions.InvalidInputDimensionException;

public class NeuralNet {
	private InputLayer inputLayer;						//capa de entrada
	private List<HiddenLayer> hiddenLayers;				//lista de capas ocultas
	private OutputLayer outputLayer;					//capa de salida
	
	/**
	 * Constructor
	 * @param numberOfInputs Número de valores de entrada a la red.
	 * @param dimeOfHiddenLayers Dimensiones de las capas ocultas. 
	 * @param numberOfOutputs Número de valores de salida de la red.
	 */
	public NeuralNet(int numberOfInputs, int[] dimsOfHiddenLayers, int numberOfOutputs) {
		
		//Creamos la capa de entrada
		this.inputLayer = new InputLayer(numberOfInputs);
		
		//Creamos las capas ocultas
		this.hiddenLayers = new ArrayList<>();
		for (int i = 0; i < dimsOfHiddenLayers.length; i++) {
			if (i == 0)
				this.hiddenLayers.add(new HiddenLayer(dimsOfHiddenLayers[0], this.inputLayer));
			else
				this.hiddenLayers.add(new HiddenLayer(dimsOfHiddenLayers[i], this.hiddenLayers.get(i-1)));
		}
		
		//Creamos la capa de salida
		if (dimsOfHiddenLayers.length == 0)
			this.outputLayer = new OutputLayer(numberOfOutputs, this.inputLayer);
		else
			this.outputLayer = new OutputLayer(numberOfInputs, this.hiddenLayers.get(this.hiddenLayers.size()-1));
		
	}
	
	//Getters y Setters
	
	public InputLayer getInputLayer() {
		return inputLayer;
	}

	public List<HiddenLayer> getHiddenLayers() {
		return hiddenLayers;
	}

	public OutputLayer getOutputLayer() {
		return outputLayer;
	}

	public void setInputs(Double[] inputs) throws Exception {
		if (inputs.length != this.getInputLayer().getInputs().size())
			throw new InvalidInputDimensionException();
		for (int i = 0; i < inputs.length; i++)
			this.getInputLayer().getInputs().get(i).setValue(inputs[i]);
	}
	
	@Override
	public String toString() {
		String description = "NeuralNet:";
		description += "\n\t" + this.inputLayer.toString();
		for(HiddenLayer hiddenLayer : this.hiddenLayers)
			description += "\n\t" + hiddenLayer.toString();
		description += "\n\t" + this.outputLayer.toString();
		
		return description;
	}

	/**
	 * Pone los valores recibidos a la entrada de la red.
	 * @param inputValues Valores para las neuronas de la capa de entrada.
	 * @throws Exception 
	 */
	public void setInputValues(Double[] inputValues) throws InvalidInputDimensionException {
		if(inputValues.length != this.inputLayer.getInputs().size())
			throw new InvalidInputDimensionException();
		for (int i = 0; i < inputValues.length; i++) 
			this.inputLayer.getInputs().get(i).setValue(inputValues[i]);
	}

	/**
	 * Devuelve los valores de las neuronas de la capa de salida. Se debe llamar después de compute().
	 * @return Valores de las neuronas de la capa de salida.
	 */
	public Double[] getOutputValues() {
		return this.outputLayer.getOutputs();
	}

	/**
	 * Calcula los valores de salida en función de los valores de entrada.
	 */
	public void compute() {
		for(Neuron neuron : this.getInputLayer().getNeurons())
			neuron.compute();
		for(HiddenLayer hiddenLayer : this.getHiddenLayers())
			for(Neuron neuron : hiddenLayer.getNeurons())
				neuron.compute();
		for(Neuron neuron : this.getOutputLayer().getNeurons())
			neuron.compute();
	}

}

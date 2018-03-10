package es.escueladeprogramacion.red_neuronal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NeuralNet {
	private final List<Input> inputs;						//Valores de entrada
	private InputLayer inputLayer;							//capa de entrada
	private List<HiddenLayer> hiddenLayers;			//lista de capas ocultas
	private OutputLayer outputLayer;						//capa de salida
	
	/**
	 * Constructor
	 * @param numberOfInputs Número de valores de entrada a la red.
	 * @param dimeOfHiddenLayers Dimensiones de las capas ocultas. 
	 * @param numberOfOutputs Número de valores de salida de la red.
	 */
	public NeuralNet(int numberOfInputs, int[] dimsOfHiddenLayers, int numberOfOutputs) {
		
		//Creamos los inputs de la red
		this.inputs = new ArrayList<>();
		for (int i = 0; i < numberOfInputs; i++)
			this.inputs.add(new Input());
		
		//Creamos la capa de entrada
		this.inputLayer = new InputLayer(this.inputs);
		
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

	public List<Input> getInputs() {
		return inputs;
	}
	
	public void setInputs(Double[] inputs) throws Exception {
		if (inputs.length != this.inputs.size())
			throw new Exception("Wrong number of inputs. Should be " + this.inputs.size() + " instead of " + inputs.length);
		for (int i = 0; i < inputs.length; i++)
			this.inputs.get(i).setValue(inputs[i]);
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
	 */
	public void setInputValues(Double[] inputValues) {
		// TODO Auto-generated method stub
	}

	/**
	 * Devuelve los valores de las neuronas de la capa de salida. Se debe llamar después de compute().
	 * @return Valores de las neuronas de la capa de salida.
	 */
	public Double[] getOutputValues() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Calcula los valores de salida en función de los valores de entrada.
	 */
	public void compute() {
		// TODO Auto-generated method stub
		
	}

}

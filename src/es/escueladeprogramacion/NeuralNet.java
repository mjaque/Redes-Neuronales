package es.escueladeprogramacion;

import java.util.ArrayList;

public class NeuralNet {
	private InputLayer inputLayer;
	private ArrayList<HiddenLayer> listOfHiddenLayers;
	private OutputLayer outputLayer;
	
	public NeuralNet(int numberOfNeuronsInInputLayer, int[] numberOfNeuronsInHiddenLayers, int numberOfNeuronsInOutputLayer) {
		this.inputLayer = new InputLayer(numberOfNeuronsInInputLayer, numberOfNeuronsInHiddenLayers[0]);
		int numberOfNeuronsInPreviousLayer = numberOfNeuronsInInputLayer;
		this.listOfHiddenLayers = new ArrayList<>();
		for (int i = 0; i < numberOfNeuronsInHiddenLayers.length; i++) {
			int numberOfNeuronsInNextLayer = numberOfNeuronsInOutputLayer;
			if (i < numberOfNeuronsInHiddenLayers.length - 1)
				numberOfNeuronsInNextLayer = numberOfNeuronsInHiddenLayers[i+1];
			listOfHiddenLayers.add(new HiddenLayer(numberOfNeuronsInPreviousLayer, numberOfNeuronsInHiddenLayers[i], numberOfNeuronsInNextLayer));
			numberOfNeuronsInPreviousLayer = numberOfNeuronsInHiddenLayers[i];
		}
		this.outputLayer = new OutputLayer(numberOfNeuronsInHiddenLayers[numberOfNeuronsInHiddenLayers.length - 1], numberOfNeuronsInOutputLayer);
	}

	@Override
	public String toString() { 
		String description = "\nNEURALNET\n" + this.inputLayer.toString();
		for (HiddenLayer hiddenLayer : this.listOfHiddenLayers) 
			description += hiddenLayer.toString();
		description += this.outputLayer.toString();
		
		return description;
	}
	
	
}

package es.escueladeprogramacion;

import java.util.ArrayList;
import java.util.Iterator;

public class Layer {
	private ArrayList<Neuron> listOfNeurons;
	
	public Layer(int numberOfNeuronsInPreviousLayer, int numberOfNeuronsInLayer, int numberOfNeuronsInNextLayer) {
		this.listOfNeurons = new ArrayList<>();
		while (numberOfNeuronsInLayer-- > 0) 
			this.listOfNeurons.add(new Neuron(numberOfNeuronsInPreviousLayer, numberOfNeuronsInNextLayer));
	}
	
	public ArrayList<Neuron> getListOfNeurons() {
		return listOfNeurons;
	}
	public void setListOfNeurons(ArrayList<Neuron> listOfNeurons) {
		this.listOfNeurons = listOfNeurons;
	}

	@Override
	public String toString() {
		String description = "";
		for (Neuron neuron : this.listOfNeurons) {
			description += neuron.toString(); 
		}
		return description;
	}

	
}

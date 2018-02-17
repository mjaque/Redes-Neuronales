package es.escueladeprogramacion;

import java.util.ArrayList;
import java.util.Iterator;

public class Layer {
	private ArrayList<Neuron> listOfNeurons;
	
	public Layer(int numberOfNeuronsInPreviousLayer, int numberOfNeuronsInLayer, int numberOfNeuronsInNextLayer) {
		//TODO:
	}
	
	public ArrayList<Neuron> getListOfNeurons() {
		return listOfNeurons;
	}
	public void setListOfNeurons(ArrayList<Neuron> listOfNeurons) {
		this.listOfNeurons = listOfNeurons;
	}

	@Override
	public String toString() {
		//TODO:
	}

	
}

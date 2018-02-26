package es.escueladeprogramacion;

import java.util.ArrayList;

public class HiddenLayer extends Layer {

	public HiddenLayer(int numberOfNeuronsInPreviousLayer, int numberOfNeuronsInLayer, int numberOfNeuronsInNextLayer) {
		super(numberOfNeuronsInPreviousLayer, numberOfNeuronsInLayer, numberOfNeuronsInNextLayer);
	}
	
	@Override
	public String toString() {
		return "\n\nHIDDENLAYER" + super.toString();
	}

}

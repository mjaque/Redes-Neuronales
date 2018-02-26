package es.escueladeprogramacion;

public class InputLayer extends Layer {

	public InputLayer(int numberOfNeurons, int numberOfNeuronsInNextLayer) {
		super(numberOfNeurons, numberOfNeurons, numberOfNeuronsInNextLayer);
	}

	@Override
	public String toString() {
		return "\n\nINPUTLAYER" + super.toString();
	}
}

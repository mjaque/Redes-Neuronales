package es.escueladeprogramacion;

public class OutputLayer extends Layer {

	public OutputLayer(int numberOfNeuronsInPreviousLayer, int numberOfNeuronsInOutputLayer) {
		super(numberOfNeuronsInPreviousLayer, numberOfNeuronsInOutputLayer, numberOfNeuronsInOutputLayer);
	}
	
	@Override
	public String toString() {
		return "\n\nOUTPUTLAYER" + super.toString();
	}
}

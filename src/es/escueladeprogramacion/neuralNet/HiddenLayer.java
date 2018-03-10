package es.escueladeprogramacion.red_neuronal;

public class HiddenLayer extends Layer {

	/**
	 * Crea una capa oculta.
	 * @param numberOfNeurons Número de neuronas en la capa.
	 * @param previousLayer Capa anterior con la que se conecta la nueva capa oculta.
	 */
	public HiddenLayer(int numberOfNeurons, Layer previousLayer) {
		super(numberOfNeurons, previousLayer);
	}

}

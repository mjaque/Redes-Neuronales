package es.escueladeprogramacion.red_neuronal;

/**
 * Capa de salida.
 * Tiene una neurona por cada valor de salida de la red.
 * @author mjaque
 *
 */
public class OutputLayer extends Layer {

	public OutputLayer(int numberOfOutputs, Layer previousLayer) {
		super(numberOfOutputs, previousLayer);
	}

	
}

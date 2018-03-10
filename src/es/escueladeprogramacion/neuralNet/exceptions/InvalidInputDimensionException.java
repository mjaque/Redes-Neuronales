package es.escueladeprogramacion.neuralNet.exceptions;

public class InvalidInputDimensionException extends Exception {

	public InvalidInputDimensionException() {
		super("La dimensión de los valores de entrada debe coincidir con el número de neuronas en la capa de entrada.");
	}
}

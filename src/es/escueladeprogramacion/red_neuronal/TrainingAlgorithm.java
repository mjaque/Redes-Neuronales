package es.escueladeprogramacion.red_neuronal;

public abstract class TrainingAlgorithm {
	
	/**
	 * Entrena una red neuronal utilizando un algoritmo concreto
	 * @param n Red neuronal a entrenar.
	 * @return Red neuronal entrenada.
	 */
	public abstract NeuralNet train(NeuralNet n);

}

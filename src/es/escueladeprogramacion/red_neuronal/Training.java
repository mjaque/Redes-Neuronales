package es.escueladeprogramacion.red_neuronal;

import java.util.ArrayList;

public class Training {
	//Atributos
	private int epochs; 	//ciclo de entrenamiento.
	private double error;	//error entre la salida real y la esperada.
	private double mse;		//error cuadrático medio.
	
	//Enumeraciones
	public enum TrainingType { PERCEPTRON, ADALINE };
	public enum ActivationFunc { STEP, LINEAR, SIGLOG, HYPERTAN };
	
	//Métodos
	/**
	 * Entrena una red neuronal
	 * @param n Red Neuronal a entrenar.
	 * @return Red Neuronal entrenada, con los pesos modificados.
	 */
	public NeuralNet train(NeuralNet n) {
		//TODO:
		return null;
	}

	/**
	 * Entrena las neuronas de una capa, modificando sus pesos.
	 * @param numberOfInputNeurons Número de neuronas de entrada en la red neuronal.
	 * @param line Número de la línea de muestras ¿?
	 * @param n	Red neuronal a entrenar.
	 * @param netValue Valor de salida de la red neuronal ¿?
	 * @return Lista de neuronas entrenadas ¿?
	 */
	public ArrayList<Neuron> teachNeuronsOfLayer(int numberOfInputNeurons, int line, NeuralNet n, double netValue){
		//TODO:
		return null;
	}
	
	/**
	 * Calcula el nuevo peso de una neurona.
	 * @param trainingType	Tipo de entrenamiento.
	 * @param oldInputWeight	Peso anterior de la neurona.
	 * @param n	Red neuronal a entrenar.
	 * @param error	¿?
	 * @param trainSample	Valor de la muestra de entrenamiento. ¿?
	 * @param netValue Valor de salida de la red. ¿?
	 * @return	Nuevo peso.
	 */
	private double calculateNewWeight(TrainingType trainingType, double oldInputWeight, NeuralNet n, double error, double trainSample, double netValue) {
		//TODO:
		return 0;
	}
	
	/**
	 * ¿Decide? la función de activación a utilizar y llama al método para calcular su valor.
	 * @param activationFunc Función de activación.
	 * @param value	Valor de entrada.
	 * @return	Valor de la función de activación.
	 */
	public double activationFunc(ActivationFunc activationFunc, double value) {
		//TODO:
		return 0;
	}
	
	/**
	 * ¿Decide? qué función de activación utilizar y llama al método para calcular el valor de su derivada
	 * @param activationFunc Función de activación.
	 * @param value Valor de entrada.
	 * @return Valor de la derivada.
	 */
	public double derivativeActivationFunc(ActivationFunc activationFunc, double value) {
		//TODO:
		return 0;
	}
	
	/**
	 * Calcula la función de STEP
	 * @param value Valor de entrada.
	 * @return Valor de salida de la función STEP
	 */
	private double stepFunc(double value) {
		//TODO:
		return 0;
	}
	
	/**
	 * Calcula la función de LINEAR
	 * @param value Valor de entrada.
	 * @return Valor de salida de la función LINEAR
	 */
	private double linearFunc(double value) {
		//TODO:
		return 0;
	}
	
	/**
	 * Calcula la función de SIGMOID
	 * @param value Valor de entrada.
	 * @return Valor de salida de la función SIGMOID
	 */
	private double sigmoidFunc(double value) {
		//TODO:
		return 0;
	}
	
	/**
	 * Calcula la función de HYPERTAN
	 * @param value Valor de entrada.
	 * @return Valor de salida de la función HYPERTAN
	 */
	private double hypertanFunc(double value) {
		//TODO:
		return 0;
	}
	
	/**
	 * Calcula la derivada de la función de LINEAR
	 * @param value Valor de entrada.
	 * @return Valor de salida de la función LINEAR
	 */
	private double derivativeLinearFunc(double value) {
		//TODO:
		return 0;
	}
	
	/**
	 * Calcula la derivada de la función de SIGMOID
	 * @param value Valor de entrada.
	 * @return Valor de salida de la función SIGMOID
	 */
	private double derivativeSigmoidFunc(double value) {
		//TODO:
		return 0;
	}
	
	/**
	 * Calcula la derivadad de la función de HYPERTAN
	 * @param value Valor de entrada.
	 * @return Valor de salida de la función HYPERTAN
	 */
	private double derivativeHypertanFunc(double value) {
		//TODO:
		return 0;
	}
	
	/**
	 * Muestra por pantalla la red neuronal entrenada y sus resultados
	 * @param trainedNet Red neuronal entrenada.
	 */
	public void trainedNetResult(NeuralNet trainedNet) {
		//TODO:
	}

	public int getEpochs() {
		return epochs;
	}

	public void setEpochs(int epochs) {
		this.epochs = epochs;
	}

	public double getError() {
		return error;
	}

	public void setError(double error) {
		this.error = error;
	}

	public double getMse() {
		return mse;
	}

	public void setMse(double mse) {
		this.mse = mse;
	}
	
}

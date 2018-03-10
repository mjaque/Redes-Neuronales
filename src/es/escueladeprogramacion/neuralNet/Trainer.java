package es.escueladeprogramacion.neuralNet;

import java.util.ArrayList;

/**
 * Entrena una red neuronal
 * @author mjaque
 *
 */
public class Trainer {
	//Atributos
	private NeuralNet neuralNet;	//Red neuronal a entrenar
	private int epochs; 			//ciclo de entrenamiento.
	private double error;			//error entre la salida real y la esperada.
	private double mse;				//error cuadrático medio.
	private double [][] trainset;							//matriz de valores de entrada de entrenamiento
	private double [] realOutputset;						//matriz de valores de salida de entrenamiento
	
	private int maxEpochs;									//Máximo número de epochs de entrenamiento
	private double learningRate;							//Tasa de aprendizaje
	private double targetError;								//Error del resultado
	private double trainError;								//Error de entrenamiento
	private Trainer.TrainingType trainType;					//Tipo de entrenamiento
	private Trainer.ActivationFunc activationFunc;			//Tipo de función de activación para el entrenamiento
	private ArrayList<Double> listMSE = new ArrayList<>();	//Errores cuadráticos medios de cada epoch de entrenamiento

	
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
//		ArrayList<Double> inputWeightIn = new ArrayList<Double>();
//
//		for (int epoch = 0; epoch < this.maxEpochs; epoch++) {
//			double estimatedOutput = 0.0;
//			double realOutput = 0.0;
//			for (int i = 0; i < this.trainset.length; i++) {
//					double netValue = 0.0;
//					for (int j = 0; j < this.trainset[i].length; j++) {
//							inputWeightIn = n.getInputLayer().geNeurons().get(j).getListOfWeightIn();
//							double inputWeight = inputWeightIn.get(0);
//							netValue = netValue + inputWeight * this.getTrainset()[i][j];
//					}
//					estimatedOutput = this.activationFunc(n.getActivationFunc(),	netValue);
//					
//					//TODO: Corregir este error
//					realOutput = this.getRealOutputset()[i]; 
//					
//					this.setError(realOutput - estimatedOutput);
//					if (Math.abs(this.getError()) > this.getTargetError()) {
//						// fix weights
//						InputLayer inputLayer = null;
//						//TODO: faltan parámetros para el constructor
//						inputLayer = new InputLayer();
//						inputLayer.setListOfNeurons(this.teachNeuronsOfLayer(cols, i, n, netValue));
//						n.setInputLayer(inputLayer);
//					}
//			}
//			this.setMse(Math.pow(realOutput - estimatedOutput, 2.0));
//			n.getListMSE().add(this.getMse());
//			this.setEpochs(this.getEpochs() + 1);
//		}
//		n.setTrainError(this.getError());
		
//		return n;
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

	

	//Getters y Setters
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

	public double[][] getTrainset() {
		return trainset;
	}

	public void setTrainset(double[][] trainset) {
		this.trainset = trainset;
	}

	public double[] getRealOutputset() {
		return realOutputset;
	}

	public void setRealOutputset(double[] realOutputset) {
		this.realOutputset = realOutputset;
	}

	public int getMaxEpochs() {
		return maxEpochs;
	}

	public void setMaxEpochs(int maxEpochs) {
		this.maxEpochs = maxEpochs;
	}

	public double getLearningRate() {
		return learningRate;
	}

	public void setLearningRate(double learningRate) {
		this.learningRate = learningRate;
	}

	public double getTargetError() {
		return targetError;
	}

	public void setTargetError(double targetError) {
		this.targetError = targetError;
	}

	public double getTrainError() {
		return trainError;
	}

	public void setTrainError(double trainError) {
		this.trainError = trainError;
	}

	public Trainer.TrainingType getTrainType() {
		return trainType;
	}

	public void setTrainType(Trainer.TrainingType trainType) {
		this.trainType = trainType;
	}

	public Trainer.ActivationFunc getActivationFunc() {
		return activationFunc;
	}

	public void setActivationFunc(Trainer.ActivationFunc activationFunc) {
		this.activationFunc = activationFunc;
	}

	public ArrayList<Double> getListMSE() {
		return listMSE;
	}

	public void setListMSE(ArrayList<Double> listMSE) {
		this.listMSE = listMSE;
	}
	
	
}

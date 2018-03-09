package es.escueladeprogramacion.red_neuronal;

import java.util.HashSet;
import java.util.Set;


public class Neuron implements Connectable{
	private Double value;
	private Set<Connection> inputs = new HashSet<>();
	private ActivationFunction activationFunction;
	private Bias bias = new Bias(0.0);
	
	/**
	 * Crea una neurona con los parámetros dados.
	 * @param inputs Conexiones de entrada a la neurona.
	 * @param activationFunction Función de activación de la neurona. (Puede ser expresión lambda)
	 * @param bias Bias (sesgo) de la neurona.
	 */
	public Neuron(Set<Connection> inputs, ActivationFunction activationFunction, Bias bias) {
		super();
		this.inputs = inputs;
		this.activationFunction = activationFunction;
		this.bias = bias;
	}
	
	/**
	 * Calcula el valor de la neurona en función de sus entradas, pesos y bias
	 * @return Valor de la neurona. Este valor también se obtiene en getValue().
	 */
	public Double compute() {
		//Calculamos la suma de entradas ponderadas con sus pesos
		Double sum = 0.0;
		for(Connection connection : inputs) {
			sum += connection.getWeight() * connection.getInput().getValue();
		}
		
		//Sumamos la bias
		if (bias !=null)
			sum += this.bias.getWeight() * this.bias.getValue();
		
		//Aplicamos la función de activación
		this.value = this.activationFunction.compute(sum);
		
		return this.value;
	}
	
	/**
	 * Conecta una neurona de entrada.
	 * @return
	 */
	public void connect(Neuron inputNeuron) {
		this.inputs.add(new Connection(inputNeuron));
	}
	
	//Getters y Setters
	@Override
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public Set<Connection> getInputs() {
		return inputs;
	}
	public void setInputs(Set<Connection> inputs) {
		this.inputs = inputs;
	}
	public ActivationFunction getActivationFunction() {
		return activationFunction;
	}
	public void setActivationFunction(ActivationFunction activationFunction) {
		this.activationFunction = activationFunction;
	}
	public Bias getBias() {
		return bias;
	}
	public void setBias(Bias bias) {
		this.bias = bias;
	}
	
	@Override
	public String toString() {
		//return "Neuron [value=" + value + ", inputs=" + inputs + ", activateFunction=" + activationFunction + ", bias="
		//		+ bias + "]";
		return "Neuron: [value=" + value + "]";
	}
	
}

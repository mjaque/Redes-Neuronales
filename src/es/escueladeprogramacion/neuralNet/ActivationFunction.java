package es.escueladeprogramacion.neuralNet;

import java.util.function.DoubleUnaryOperator;

@FunctionalInterface
public interface ActivationFunction {
	
	public Double compute(Double inputValue);
	
	//Métodos estáticos predefinidos
	/**
	 * STEP devuelve 0 si el valor de entrada en negativo y 1 en caso contrario
	 * @return Expresión lambda con la función STEP.
	 */
	static public ActivationFunction step() {
		return (inputValue) -> {
			if (inputValue < 0)
				return 0.0;
			else
				return 1.0;
		};
	}

}

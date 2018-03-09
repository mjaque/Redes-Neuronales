package es.escueladeprogramacion;

import java.util.ArrayList;
import java.util.List;

import es.escueladeprogramacion.red_neuronal.Input;
import es.escueladeprogramacion.red_neuronal.NeuralNet;

public class Programa1 {

	public static void main(String[] args) {
		NeuralNet n = new NeuralNet(2, new int[]{3,3}, 1);
		//Vemos los pesos iniciales (aleatorios) de la red
		System.out.println(n);
		
		//Asignamos valores de entrada
		n.setInputValues(new Double[] {1.0, 2.0});
		
		//Hacemos que la red calcule la salida
		n.compute();
		
		//Vemos los valores de Salida
		System.out.println(n.getOutputValues());
		
	}

}

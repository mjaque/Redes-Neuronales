package es.escueladeprogramacion;

public class Programa {

	public static void main(String[] args) {
		/*Creamos una red neuronal con:
		 * Capa de entrada con 2 neuronas.
		 * Dos capas ocultas con 3 neuronas cada una.
		 * Capa de salida con 1 neurona.
		 */
		NeuralNet n = new NeuralNet(2, new int[]{3,3}, 1);
		System.out.println(n);
	}

}

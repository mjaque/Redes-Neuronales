package es.escueladeprogramacion;

public class Programa {

	public static void main(String[] args) {
		NeuralNet n = new NeuralNet(2, new int[]{3,3}, 1);
		System.out.println(n);
	}

}

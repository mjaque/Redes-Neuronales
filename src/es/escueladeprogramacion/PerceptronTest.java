package es.escueladeprogramacion;

import es.escueladeprogramacion.red_neuronal.NeuralNet;
import es.escueladeprogramacion.red_neuronal.Trainer;
import es.escueladeprogramacion.red_neuronal.Trainer.ActivationFunc;
import es.escueladeprogramacion.red_neuronal.Trainer.TrainingType;

public class PerceptronTest {

	//TODO: Corregir errores
	public static void main(String[] args) {
			NeuralNet neuralNet = new NeuralNet(2,new int[0],1);
			System.out.println("---------PERCEPTRON INIT NET---------");
			System.out.println(neuralNet);
			
			Trainer trainer = new Trainer();
			// Datos de entrenamiento: BIAS y valores para cada neurona de entrada
			trainer.setTrainset(new double[][] { { 1.0, 0.0, 0.0 },
			{ 1.0, 0.0, 1.0 }, { 1.0, 1.0, 0.0 }, { 1.0, 1.0, 1.0 } });
			trainer.setRealOutputset(new double[] { 0.0, 0.0, 0.0, 1.0 });
			trainer.setMaxEpochs(10);
			trainer.setTargetError(0.002);
			trainer.setLearningRate(1.0);
			trainer.setTrainType(TrainingType.PERCEPTRON);
			trainer.setActivationFunc(ActivationFunc.STEP);
			trainer.train(neuralNet);
			System.out.println();
			System.out.println("---------PERCEPTRON TRAINED NET---------");
			System.out.println(neuralNet);
			System.out.println();
			System.out.println("---------PERCEPTRON PRINT RESULT---------");
			//neuralNet.printTrainedNetResults();
	}

}

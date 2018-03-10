import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import es.escueladeprogramacion.neuralNet.NeuralNet;
import es.escueladeprogramacion.neuralNet.exceptions.InvalidInputDimensionException;

class NeuralNetTest {
	 
	@Test
	void testInvalidInputDimension() {
		NeuralNet n = new NeuralNet(1, new int[] {1}, 0);
		try {
			n.setInputValues(new Double[] {1.0,2.0});
			fail("Debe lanzarse InvalidInpuptException");
		}
		catch(InvalidInputDimensionException ex) {}
	}

}

package es.escueladeprogramacion.red_neuronal;

public class Bias {
	private Double weight;
	private Double value;
	
	public Bias(Double weight) {
		this.weight = weight;
	}
	
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Bias [weight=" + weight + ", value=" + value + "]";
	}

}

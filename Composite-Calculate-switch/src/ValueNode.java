
public class ValueNode extends Node {
	private double value;
	public ValueNode(double value) {
		this.value = value;
	}
	public double evaluate() {
		return value;
	}
}

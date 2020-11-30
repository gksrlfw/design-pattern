
public class OperatorNode extends Node {
	private Operator operator;
	private Node left;
	private Node right;
	public OperatorNode(Operator o, Node left, Node right) {
		operator = o;
		this.left = left;
		this.right = right;
	}
	@Override
	public double evaluate() {
		return operator.evaluate(left, right);
	}
}


public class OperateNodeSub extends OperatorNode {
	public OperateNodeSub(Node left, Node right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}
	public double evaluate() {
		return left.evaluate()-right.evaluate();
	}

}

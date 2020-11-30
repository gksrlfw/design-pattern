
public class OperateNodeAdd extends OperatorNode {
	public OperateNodeAdd(Node left, Node right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}
	public double evaluate() {
		return left.evaluate()+right.evaluate();
	}

}


public abstract class OperatorNode extends Node {
	public Node left;
	public Node right;
	public OperatorNode(Node left, Node right) {
		this.left = left;
		this.right = right;
	}
}

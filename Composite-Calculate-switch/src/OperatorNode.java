
// �� ���⿡�� �ٽ��� ������ ���� ���� ���� ���� ��带 ���� evaluate�� ���� �����Ѵٴ� ���̴� (���� ���� ���� �ܸ�, ������ �����ϴ� ���� �߰�)
// refactoring 1: OperatorNode�� ��ӹ޴� 4���� ���� Ŭ�������� ������
// refactoring 2: enum�� �̿��ؼ� Ŭ������ ������
public class OperatorNode extends Node {
	private Operator operator;
	private Node left;
	private Node right;
	public OperatorNode(Operator o, Node left, Node right) {
		operator = o;
		this.left = left;
		this.right = right;
	}
	public double evaluate() {
		switch(operator) {
		case ADD: return left.evaluate()+right.evaluate(); 
		case MULTIPLY: return left.evaluate()*right.evaluate();
		case SUBTRACT: return left.evaluate()-right.evaluate();
		case DIVIDE: return left.evaluate()/right.evaluate();
		}
		throw new RuntimeException("");
	}
}

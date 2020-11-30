
// 이 계산기에서 핵심은 연산을 가진 노드와 값을 가진 노드를 같은 evaluate를 통해 구현한다는 점이다 (값을 가진 노드는 단말, 연산을 수행하는 노드는 중간)
// refactoring 1: OperatorNode를 상속받는 4개의 연산 클래스들을 만들자
// refactoring 2: enum을 이용해서 클래스를 줄이자
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

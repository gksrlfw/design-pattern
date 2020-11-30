
public enum Operator {
	ADD {
		@Override
		public double evaluate(Node  left, Node  right) {
			return left.evaluate()+right.evaluate();
		}
		
	}, 
	MULTIPLY {
		@Override
		public double evaluate(Node  left, Node  right) {
			return left.evaluate()*right.evaluate();
		}
	}, 
	SUBTRACT {
		@Override
		public double evaluate(Node  left, Node  right) {
			return left.evaluate()-right.evaluate();
		}
	}
	, 
	DIVIDE {
		@Override
		public double evaluate(Node  left, Node  right) {
			return left.evaluate()/right.evaluate();
		}
	};
	public abstract double evaluate(Node left, Node right);
}

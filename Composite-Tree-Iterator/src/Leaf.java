import java.util.Iterator;

public class Leaf<T> extends Node<T> {

	public Leaf(T label) { 
		super(label);
	}
	@Override
	public void add(Node<T> node) {
		throw new UnsupportedOperationException("�ܸ����");
	}
	@Override
	public void remove(Node<T> node) {
		throw new UnsupportedOperationException("�ܸ����");
	}
	@Override
	public Node<T> getChild(int index) {
		throw new UnsupportedOperationException("�ܸ����");
	}
	@Override
	public Iterator<Node<T>> iterator() {
		return new NullIterator<T>();
	}
	@Override
	public String list() {
		return getLabel()+"\n";
	}

}

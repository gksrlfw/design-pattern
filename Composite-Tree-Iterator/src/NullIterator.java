import java.util.Iterator;

// 단말 노드는 반복자가 안들리는데, 그냥 지나치지말고 null 반복자를 넣어준다
public class NullIterator<T> implements Iterator<Node<T>> {
	public boolean hasNext() {
		return false;
	}
	public Node<T> next() {
		throw new UnsupportedOperationException("이것 호출되면 곤란");
	}
}

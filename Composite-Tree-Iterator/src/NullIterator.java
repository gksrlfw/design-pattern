import java.util.Iterator;

// �ܸ� ���� �ݺ��ڰ� �ȵ鸮�µ�, �׳� ����ġ������ null �ݺ��ڸ� �־��ش�
public class NullIterator<T> implements Iterator<Node<T>> {
	public boolean hasNext() {
		return false;
	}
	public Node<T> next() {
		throw new UnsupportedOperationException("�̰� ȣ��Ǹ� ���");
	}
}

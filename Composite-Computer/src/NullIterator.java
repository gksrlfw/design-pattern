import java.util.Iterator;

public class NullIterator<T> implements Iterator<ComputerDevice<T>> {

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ComputerDevice<T> next() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("�̰� ȣ��Ǹ� ���");
	}

}

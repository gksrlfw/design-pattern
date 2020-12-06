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
		throw new UnsupportedOperationException("이것 호출되면 곤란");
	}

}

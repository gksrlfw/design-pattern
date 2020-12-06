import java.util.Iterator;

public class UnsortedLinkedList<T> implements Iterable<T>{

	private class UnsortedLinkedListIterator implements Iterator<T> {

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new UnsortedLinkedListIterator();
	}

}

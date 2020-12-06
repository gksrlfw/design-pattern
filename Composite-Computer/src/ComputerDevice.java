import java.util.Iterator;

public abstract class ComputerDevice<T> implements Iterable<ComputerDevice<T>>{
	
	public abstract int getPrice();
	public abstract int getPower();
	public abstract Iterator<ComputerDevice<T>> iterator();
	protected abstract int numberOfChilds();
	protected abstract ComputerDevice<T> getChild(int i);
}

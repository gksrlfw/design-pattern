import java.util.Iterator;

public class Keyboard<T> extends ComputerDevice<T> {

	private int price;
	private int power;

	  public Keyboard(int power, int price) {
	    this.power = power;
	    this.price = price;
	  }
	  public Iterator<ComputerDevice<T>> iterator() {
		  return new NullIterator<T>();
		}
	  public int getPrice() { return price; }
	  public int getPower() { return power; }
	@Override
	protected int numberOfChilds() {
		throw new UnsupportedOperationException("단말노드");

	}
	@Override
	protected ComputerDevice<T> getChild(int i) {
		throw new UnsupportedOperationException("단말노드");

	}
}

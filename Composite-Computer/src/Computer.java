import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Computer<T> extends ComputerDevice<T> {
	  private List<ComputerDevice> components = new ArrayList<ComputerDevice>();

	  public void addComponent(ComputerDevice component) { components.add(component); }
	  public void removeComponent(ComputerDevice component) { components.remove(component); }

	  public int numberOfChilds() {
		  return components.size();
	  }
	  public ComputerDevice<T> getChild(int index) {
		  if(index>=0&&index<components.size())
			  return components.get(index);
		  else throw new IndexOutOfBoundsException("해당 색인에 해당되는 노드가 없음");
	  } 
	  public int getPrice() {
	    int price = 0;
	    for(ComputerDevice component : components) {
	      price += component.getPrice();
	    }
	    return price;
	  }
	  public int getPower() {
	    int power = 0;
	    for(ComputerDevice component : components) {
	      power += component.getPower();
	    }
	    return power;
	  }
	  public Iterator<ComputerDevice<T>> iterator() {
		  return new BFSIterator<T>(this);
   	  }
}

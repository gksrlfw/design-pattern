 import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class BFSIterator<T> implements Iterator<ComputerDevice<T>> {
	Queue<ComputerDevice<T>> queue = new ArrayDeque<>();
	public BFSIterator(ComputerDevice<T> node){
		queue.add(node);
	}
	// hasNext의 역할은 반복할 것이 있는지 여부만 알려주는 것임
	// 하지만 이 메소드는 이 메소드는 다음 반복을 작업까지 하고 있음
	@Override
	public boolean hasNext() {
		if(queue.isEmpty()) return false;
		else{
			ComputerDevice<T> node = queue.peek();
	 		if(node instanceof Computer) {
	 			for(int i=0; i<node.numberOfChilds(); i++)
	 				queue.add(node.getChild(i));
	 		}
	 		return true;
 		} 
	}
	@Override
	public ComputerDevice<T> next() {
		return queue.poll();
	}
}

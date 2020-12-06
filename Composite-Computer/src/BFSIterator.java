 import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class BFSIterator<T> implements Iterator<ComputerDevice<T>> {
	Queue<ComputerDevice<T>> queue = new ArrayDeque<>();
	public BFSIterator(ComputerDevice<T> node){
		queue.add(node);
	}
	// hasNext�� ������ �ݺ��� ���� �ִ��� ���θ� �˷��ִ� ����
	// ������ �� �޼ҵ�� �� �޼ҵ�� ���� �ݺ��� �۾����� �ϰ� ����
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

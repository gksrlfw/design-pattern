 import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

/*
 * �ݺ��ڿ� ��带 �־� ��ȸ�ϴ� ���
 */
public class BFSIterator<T> implements Iterator<Node<T>> {
	Queue<Node<T>> queue = new ArrayDeque<>();
	public BFSIterator(Node<T> node){
		queue.add(node);
	}
	// hasNext�� ������ �ݺ��� ���� �ִ��� ���θ� �˷��ִ� ����
	// ������ �� �޼ҵ�� �� �޼ҵ�� ���� �ݺ��� �۾����� �ϰ� ����
	@Override
	public boolean hasNext() {
		if(queue.isEmpty()) return false;
		else{
			Node<T> node = queue.peek();
	 		if(node instanceof NonLeaf) {
	 			for(int i=0; i<node.numberOfChilds(); i++)
	 				queue.add(node.getChild(i));
	 		}
	 		return true;
 		} 
	}
	@Override
	public Node<T> next() {
		return queue.poll();
	}
}

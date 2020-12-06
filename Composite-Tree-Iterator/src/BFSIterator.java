 import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

/*
 * 반복자에 노드를 넣어 순회하는 방법
 */
public class BFSIterator<T> implements Iterator<Node<T>> {
	Queue<Node<T>> queue = new ArrayDeque<>();
	public BFSIterator(Node<T> node){
		queue.add(node);
	}
	// hasNext의 역할은 반복할 것이 있는지 여부만 알려주는 것임
	// 하지만 이 메소드는 이 메소드는 다음 반복을 작업까지 하고 있음
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

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
/*
 * 반복자에 반복자를 유지하여 순회하는 방법
 * 중간 노드들은 자식을 ArrayList로 유지하므로, 반복자를 가지고 있다
 * 이를 이용하여, 노드를 들릴 때, 노드를 Queue에 넣는것이 아닌, 그 반복자를 넣어 순회를 할 수도 있다
 * 이떄, 자식이 없는 단말 노드들은 null iterator를 넣어준다
 */

public class TreeIteratorBFS<T> implements Iterator<Node<T>> {
	Queue<Iterator<Node<T>>> queue = new ArrayDeque<>();
	public TreeIteratorBFS(Iterator<Node<T>> iterator){
		queue.add(iterator);
	}
	@Override
	public boolean hasNext() {
		if(queue.isEmpty()) return false;
		else{
			Iterator<Node<T>> iterator = queue.peek();
	 		if(iterator.hasNext()) return true;
			else{ 
				queue.poll(); 
				return hasNext(); 
			}
 		} 
	}
	// A노드에서 시작하게 되면 A는 제외하고 자식부터 시작한다. 따라서 절대로 root는 나올수없다
	@Override
	public Node<T> next() {
		Node<T> node = queue.peek().next();
		// 해당 노드의 자식을 처리하기 위해 해당 노드의 iterator를 queue에 넣는다 
		queue.add(node.iterator());	// 단말의 경우에는 NullIterator가 add됨
		return node;
		/*
		if(node instanceof NonLeaf) {
			while(!queue.peek().hasNext()) queue.poll();
		}
		return node instanceof NonLeaf? next(): node;
		*/
	}
}

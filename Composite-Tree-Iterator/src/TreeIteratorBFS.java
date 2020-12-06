import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
/*
 * �ݺ��ڿ� �ݺ��ڸ� �����Ͽ� ��ȸ�ϴ� ���
 * �߰� ������ �ڽ��� ArrayList�� �����ϹǷ�, �ݺ��ڸ� ������ �ִ�
 * �̸� �̿��Ͽ�, ��带 �鸱 ��, ��带 Queue�� �ִ°��� �ƴ�, �� �ݺ��ڸ� �־� ��ȸ�� �� ���� �ִ�
 * �̋�, �ڽ��� ���� �ܸ� ������ null iterator�� �־��ش�
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
	// A��忡�� �����ϰ� �Ǹ� A�� �����ϰ� �ڽĺ��� �����Ѵ�. ���� ����� root�� ���ü�����
	@Override
	public Node<T> next() {
		Node<T> node = queue.peek().next();
		// �ش� ����� �ڽ��� ó���ϱ� ���� �ش� ����� iterator�� queue�� �ִ´� 
		queue.add(node.iterator());	// �ܸ��� ��쿡�� NullIterator�� add��
		return node;
		/*
		if(node instanceof NonLeaf) {
			while(!queue.peek().hasNext()) queue.poll();
		}
		return node instanceof NonLeaf? next(): node;
		*/
	}
}

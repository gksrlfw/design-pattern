import java.util.Iterator;

/*
 * 반복할 수 있는 방법은 두가지있다
 * 1. 노드 자체를 반복자에 넣는 경우
 * 2. 반복자를 넣는 경우
 * 
 * leaf에는 nullIterator를 넣어 일관성있게 반복할 수 있도록 한다
 */

public abstract class Node<T> implements Iterable<Node<T>> {
	public static String indent = "";	// list()를 위한 문자열
	private T label;
	private boolean hasChanged = false;
	public Node(T label){
		this.label = label;
	}
	
	public T getLabel(){
		return label;
	}
	public boolean hasChanged(){
		return hasChanged;
	}
	public void setChanged(boolean flag){
		hasChanged = flag;
	}
	//
	public abstract String list();
	
	@Override 
	public boolean equals(Object other) {
		if(other==null||getClass()!=other.getClass()) return false;
		if(this==other) return true;
		Node<?> node = (Node<?>)other;
		return label.equals(node.label)&&hasChanged==node.hasChanged;
	}
	public int numberOfChilds(){
		return 0;
	}
	// composite 패턴에 필요한 요소들. 단말노드에는 필요없지만 Node 타입을 쓰기 위해서 abstract로 작성해주어야 한다
	public abstract void add(Node<T> node);
	public abstract void remove(Node<T> node);
	public abstract Node<T> getChild(int index);
	public abstract Iterator<Node<T>> iterator();
}

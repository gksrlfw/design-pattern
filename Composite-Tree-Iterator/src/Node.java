import java.util.Iterator;

/*
 * �ݺ��� �� �ִ� ����� �ΰ����ִ�
 * 1. ��� ��ü�� �ݺ��ڿ� �ִ� ���
 * 2. �ݺ��ڸ� �ִ� ���
 * 
 * leaf���� nullIterator�� �־� �ϰ����ְ� �ݺ��� �� �ֵ��� �Ѵ�
 */

public abstract class Node<T> implements Iterable<Node<T>> {
	public static String indent = "";	// list()�� ���� ���ڿ�
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
	// composite ���Ͽ� �ʿ��� ��ҵ�. �ܸ���忡�� �ʿ������ Node Ÿ���� ���� ���ؼ� abstract�� �ۼ����־�� �Ѵ�
	public abstract void add(Node<T> node);
	public abstract void remove(Node<T> node);
	public abstract Node<T> getChild(int index);
	public abstract Iterator<Node<T>> iterator();
}

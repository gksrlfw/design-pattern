import java.util.ArrayList;
import java.util.Iterator;

public class NonLeaf<T> extends Node<T> {

	private ArrayList<Node<T>> childs = new ArrayList<>(); 	// �ڽĵ� ����
	public NonLeaf(T label){
		super(label); 
	}
	public int numberOfChilds(){
		return childs.size();
	}
	@Override public boolean equals(Object other) {
		if(!super.equals(other)) return false;
		NonLeaf<?> node = (NonLeaf<?>)other;
		return childs.equals(node.childs);
	}
	@Override
	public void add(Node<T> node) {
		childs.add(node);
	}
	@Override
	public void remove(Node<T> node) {
		childs.remove(node);
	}
	@Override
	public Node<T> getChild(int index) {
		if(index>=0&&index<childs.size())
			return childs.get(index);
		else throw new IndexOutOfBoundsException("�ش� ���ο� �ش�Ǵ� ��尡 ����");
	}
	@Override
	public Iterator<Node<T>> iterator() {
		//return new TreeIteratorDFS<T>(childs.iterator());
		//return new TreeIteratorBFS<T>(childs.iterator());
		return new BFSIterator<T>(this);
		//return new DFSIterator<T>(this);
	}
	// root�� ���ؼ� list�� �θ��� Ʈ���� �ִ� ��� ������ �ҷ��´�
	@Override
	public String list() {
		String output = getLabel()+"\n";
		indent += " ".repeat(5);
		for(var node: childs){
			output += indent + node.list();
		}
		indent = indent.substring(0,indent.length()-5);
		return output;
	}


}

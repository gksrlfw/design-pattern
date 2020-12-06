import java.util.ArrayList;
import java.util.Iterator;

public class NonLeaf<T> extends Node<T> {

	private ArrayList<Node<T>> childs = new ArrayList<>(); 	// 자식들 유지
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
		else throw new IndexOutOfBoundsException("해당 색인에 해당되는 노드가 없음");
	}
	@Override
	public Iterator<Node<T>> iterator() {
		//return new TreeIteratorDFS<T>(childs.iterator());
		//return new TreeIteratorBFS<T>(childs.iterator());
		return new BFSIterator<T>(this);
		//return new DFSIterator<T>(this);
	}
	// root에 대해서 list를 부르면 트리에 있는 모든 노드들을 불러온다
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

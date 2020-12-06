import java.util.ArrayList;
import java.util.Iterator;

public class BST<T> implements Iterable<T>{
	public enum TraversalType {PREORDER, INORDER, POSTORDER, BFS};
	public static class TreeNode<T>{
		T key;
		TreeNode<T> left = null;
		TreeNode<T> right = null;
		public TreeNode(T key) {
			this.key = key;
		}
		@Override public String toString() {
			return key.toString();
		}
	}
	private TreeNode<T> root = null;
	private int size = 0;
	private TraversalType currentType = TraversalType.INORDER;
	private void inorder(TreeNode<T> currNode, ArrayList<T> list) {
		if(currNode.left!=null) inorder(currNode.left, list);
		list.add(currNode.key);
		if(currNode.right!=null) inorder(currNode.right, list);
	}
	private void preorder(TreeNode<T> currNode, ArrayList<T> list) {
		list.add(currNode.key);
		if(currNode.left!=null) preorder(currNode.left, list);
		if(currNode.right!=null) preorder(currNode.right, list);
	}
	private void postorder(TreeNode<T> currNode, ArrayList<T> list) {
		if(currNode.left!=null) postorder(currNode.left, list);
		if(currNode.right!=null) postorder(currNode.right, list);
		list.add(currNode.key);
	}
	/*
	 * 선형자료구조가 아님 -> 스냅샷을 이용하여 순회할 수 있다
	 * next를 할때마다 요소를 반환하는 것이 아닌, 모든 요소를 먼저 반환한 이후 리스트에 넣어서 이를 반환한다
	 * 추가적인 공간이 필요하다
	 * 
	 * BFSIterator의 경우, 선형자료구조처럼 next를 호출할 때마다 요소를 반환해주는 형태이다
	 */
	@Override
	public Iterator<T> iterator() {
		if(currentType!=TraversalType.BFS) {
			ArrayList<T> list = new ArrayList<>();
			switch(currentType) {
			case PREORDER: preorder(root, list); break;
			case POSTORDER: postorder(root, list); break;
//			default: return new BST_Inorder_Iterator<T>(root);
			default: inorder(root, list); break;
			}
			return list.iterator();
		}
		else return new BST_BFS_Iterator<T>(root);
	}

}

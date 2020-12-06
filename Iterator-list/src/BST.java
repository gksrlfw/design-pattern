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
	 * �����ڷᱸ���� �ƴ� -> �������� �̿��Ͽ� ��ȸ�� �� �ִ�
	 * next�� �Ҷ����� ��Ҹ� ��ȯ�ϴ� ���� �ƴ�, ��� ��Ҹ� ���� ��ȯ�� ���� ����Ʈ�� �־ �̸� ��ȯ�Ѵ�
	 * �߰����� ������ �ʿ��ϴ�
	 * 
	 * BFSIterator�� ���, �����ڷᱸ��ó�� next�� ȣ���� ������ ��Ҹ� ��ȯ���ִ� �����̴�
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

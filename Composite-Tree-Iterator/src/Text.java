
public class Text {

	public static void main(String[] args) {
		Node<String> root = new NonLeaf<>("Root");
		Node<String> sub1 = new NonLeaf<>("Sub1");
		Node<String> sub2 = new NonLeaf<>("Sub2");
		Node<String> file1 = new Leaf<>("a1"); 
		Node<String> file2 = new Leaf<>("c1");
		file1.setChanged(true);
		file2.setChanged(true);
		root.add(file1);
		root.add(sub1);
		root.add(new Leaf<String>("a2"));
		root.add(sub2);
		sub1.add(new Leaf<String>("b1"));
		sub1.add(new Leaf<String>("b2"));
		sub2.add(file2);
		sub2.add(new Leaf<String>("c2"));
		sub2.add(new Leaf<String>("c3"));
		
		sub2.remove(new Leaf<String>("c2"));
		
		System.out.println(root.list());
		System.out.println("*************");
		
		System.out.println(sub1.list());
		System.out.println("*************");
		
		for(var node: root){
			System.out.println(node.getLabel());
		}
		
		System.out.println("*************");
		for(var node: root){
			if(node.hasChanged()) System.out.println(node.getLabel());
		}
		
	}

}

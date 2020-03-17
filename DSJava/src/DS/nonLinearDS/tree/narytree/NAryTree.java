package DS.nonLinearDS.tree.narytree;

public class NAryTree {
	static Node root;
	
	public NAryTree(int data) {
		root=new Node(data);
	}
	public static void main(String[] args) {
		NAryTree tree = new NAryTree(10);
		Node node = new Node(20);
		insert(root, 10, node);
		
	}

	/*
	 * method to insert a node 
	 */
	public static void insert(Node node, int parent, Node child) {
		if(node==null) {
			node = child;
			return;
		}
		
		else if(node.data==parent) {
			node.children.add(child);
			node.totalChildren++;
		}
		else {
			for(Node temp: node.children) {
				if(temp.data==parent) 
					insert(temp, parent, child);
				//else
				//	insert(temp,parent, child);
			}
		}
	}
}

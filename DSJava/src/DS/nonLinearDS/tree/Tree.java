package DS.nonLinearDS.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
	Node root;
	
	
	public static void main(String args[]) {
		Tree tree = new Tree();
		System.out.println(tree.root);
		tree.create();
		tree.insertLeft(tree.root, new Node(12));
		System.out.println("Preorder: ");
		tree.preorder(tree.root);
	
		tree.insertRight(tree.root, new Node(15));
		System.out.println("Preorder: ");
		tree.preorder(tree.root);
		
		System.out.println("\nPostorder: ");
		tree.postorder(tree.root);
		
		System.out.println("\nInorder: ");
		tree.inorder(tree.root);
		
		System.out.println("\nBFS: ");
		tree.bfs(tree.root);
	}
	
	/*
	 * method to create a new tree with root node
	 */
	public void create() {
		if(root==null) {
			root=new Node(10);
		}
	}
	
	/*
	 * method to insert a node to the left side of a given parent node
	 */
	public void insertLeft(Node parent, Node node) {
		if(parent.left!=null)
		{
			Node temp = parent.left;
			node.left=temp;
			parent.left=node;
		}
		else
			parent.left = node;
	}
	
	/*
	 * method to insert a node to the right side of a given parent node
	 */
	public void insertRight(Node parent, Node node) {
		if(parent.right!=null)
		{
			Node temp = parent.right;
			temp.right = node;
			parent.right = node;
		}
		else
			parent.right = node;
	}
	
	/*
	 * method to DFS traverse in preorder
	 */
	public void preorder(Node node) {
		System.out.print(node.data+" ");
		
		if(node.left!=null)
			preorder(node.left);
		
		if(node.right!=null)
			preorder(node.right);
	}
	
	/*
	 * method to DFS traverse in postorder
	 */
	public void postorder(Node node) {
		if(node.left!=null)
			postorder(node.left);
		
		if(node.right!=null)
			postorder(node.right);
		
		System.out.print(node.data+" ");
	}
	
	/*
	 * method to DFS traverse in inorder
	 */
	public void inorder(Node node) {
		if(node.left!=null)
			inorder(node.left);
		
		System.out.print(node.data+" ");
		
		if(node.right!=null)
			inorder(node.right);
	}
	
	/*
	 * method to BFS traverse
	 */
	public void bfs(Node node) {
		Queue<Node> queue=new LinkedList<>();
		queue.add(node);
		
		while(queue.isEmpty()!=true) {
			Node currentNode = queue.remove();
			System.out.print(currentNode.data+" ");
			
			if(currentNode.left!=null)
				queue.add(currentNode.left);
			
			if(currentNode.right!=null)
				queue.add(currentNode.right);
		}
	}
}


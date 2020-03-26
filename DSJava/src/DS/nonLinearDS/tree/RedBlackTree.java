package DS.nonLinearDS.tree;

public class RedBlackTree {
	RBNode root;
	
	public static void main(String args[]) {
		RedBlackTree tree = new RedBlackTree();
		RBNode node = new RBNode(10);
		tree.BSTInsert(tree.root, node);
	}
	
	// A recursive function to do level order traversal 
	void inorderHelper(RBNode node) 
	{ 
	    if (node == null) 
	        return; 
	  
	    inorderHelper(node.left); 
	    System.out.println(node.data + "  ");
	    inorderHelper(node.right); 
	} 
	
	/* A utility function to insert a new node with given key 
	   in BST */
	public RBNode BSTInsert(RBNode node, RBNode pt) 
	{ 
	    /* If the tree is empty, return a new node */
	    if (node == null) 
	       return pt; 
	  
	    /* Otherwise, recur down the tree */
	    if (pt.data < root.data) 
	    { 
	        node.left  = BSTInsert(node.left, pt); 
	        node.left.parent = node; 
	    } 
	    else if (pt.data > node.data) 
	    { 
	        node.right = BSTInsert(node.right, pt); 
	        node.right.parent = node; 
	    } 
	  
	    /* return the (unchanged) node pointer */
	    return node; 
	} 
}

/*
 * this is the Node class for RB Tree thats why I have named it RBNode.
 */
class RBNode{
	int data;
	RBNode left;
	RBNode right;
	RBNode parent;
	
	RBNode(int data){
		this.data=data;
		
	}
}
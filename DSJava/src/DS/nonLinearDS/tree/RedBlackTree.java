package DS.nonLinearDS.tree;

import java.util.LinkedList;
import java.util.Queue;
/*
 * Source: https://www.geeksforgeeks.org/c-program-red-black-tree-insertion/
 */
public class RedBlackTree {
	RBNode root;
	
	public RedBlackTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	public static void main(String args[]) {
		//RedBlackTree tree = new RedBlackTree();
		//RBNode node = new RBNode(10);
		
		//tree.BSTInsert(tree.root, node);
		
		RedBlackTree tree = new RedBlackTree(); 
	    
	    tree.insert(7); 
	    tree.insert(6); 
	    tree.insert(5); 
	    tree.insert(4); 
	    tree.insert(3); 
	    tree.insert(2); 
	    tree.insert(1); 
	  
	    //cout << "Inoder Traversal of Created Tree\n"; 
	    System.out.println("Inoder Traversal of Created Tree\n");
	    tree.inorder(); 
	  
	    //cout << "\n\nLevel Order Traversal of Created Tree\n"; 
	    System.out.println("\n\nLevel Order Traversal of Created Tree\n");
	    tree.levelOrder();
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

/*
 * level order traversal
 */
void levelOrderHelper(RBNode root) 
{ 
    if (root == null) 
        return; 
  
    Queue<RBNode> q=new LinkedList<>(); 
    q.add(root); 
  
    while (!q.isEmpty()) 
    { 
        RBNode temp = q.peek(); 
        System.out.println(temp.data+" ");
        q.remove();
        if (temp.left != null) 
            q.add(temp.left); 
  
        if (temp.right != null) 
            q.add(temp.right); 
    } 
} 



void rotateLeft(RBNode root, RBNode pt) 
{ 
    RBNode pt_right = pt.right; 
  
    pt.right = pt_right.left; 
  
    if (pt.right != null) 
        pt.right.parent = pt; 
  
    pt_right.parent = pt.parent; 
  
    if (pt.parent == null) 
        root = pt_right; 
  
    else if (pt == pt.parent.left) 
        pt.parent.left = pt_right; 
  
    else
        pt.parent.right = pt_right; 
  
    pt_right.left = pt; 
    pt.parent = pt_right; 
} 
  
void rotateRight(RBNode root, RBNode pt) 
{ 
    RBNode pt_left = pt.left; 
  
    pt.left = pt_left.right; 
  
    if (pt.left != null) 
        pt.left.parent = pt; 
  
    pt_left.parent = pt.parent; 
  
    if (pt.parent == null) 
        root = pt_left; 
  
    else if (pt == pt.parent.left) 
        pt.parent.left = pt_left; 
  
    else
        pt.parent.right = pt_left; 
  
    pt_left.right = pt; 
    pt.parent = pt_left; 
} 




//This function fixes violations caused by BST insertion 
void fixViolation(RBNode root, RBNode pt) 
{ 
 RBNode parent_pt = null; 
 RBNode grand_parent_pt = null; 

 while ((pt != root) && (pt.color != Color.BLACK) && (pt.parent.color == Color.RED)) 
 { 

     parent_pt = pt.parent; 
     grand_parent_pt = pt.parent.parent; 

     /*  Case : A 
         Parent of pt is left child of Grand-parent of pt */
     if (parent_pt == grand_parent_pt.left) 
     { 

         RBNode uncle_pt = grand_parent_pt.right; 

         /* Case : 1 
            The uncle of pt is also red 
            Only Recoloring required */
         if (uncle_pt != null && uncle_pt.color == Color.RED) 
         { 
             grand_parent_pt.color = Color.RED; 
             parent_pt.color = Color.BLACK; 
             uncle_pt.color = Color.BLACK; 
             pt = grand_parent_pt; 
         } 

         else
         { 
             /* Case : 2 
                pt is right child of its parent 
                Left-rotation required */
             if (pt == parent_pt.right) 
             { 
                 rotateLeft(root, parent_pt); 
                 pt = parent_pt; 
                 parent_pt = pt.parent; 
             } 

             /* Case : 3 
                pt is left child of its parent 
                Right-rotation required */
             rotateRight(root, grand_parent_pt); 
             swap(parent_pt.color, grand_parent_pt.color); 
             pt = parent_pt; 
         } 
     } 

     /* Case : B 
        Parent of pt is right child of Grand-parent of pt */
     else
     { 
         RBNode uncle_pt = grand_parent_pt.left; 

         /*  Case : 1 
             The uncle of pt is also red 
             Only Recoloring required */
         if ((uncle_pt != null) && (uncle_pt.color == Color.RED)) 
         { 
             grand_parent_pt.color = Color.RED; 
             parent_pt.color = Color.BLACK; 
             uncle_pt.color = Color.BLACK; 
             pt = grand_parent_pt; 
         } 
         else
         { 
             /* Case : 2 
                pt is left child of its parent 
                Right-rotation required */
             if (pt == parent_pt.left) 
             { 
                 rotateRight(root, parent_pt); 
                 pt = parent_pt; 
                 parent_pt = pt.parent; 
             } 

             /* Case : 3 
                pt is right child of its parent 
                Left-rotation required */
             rotateLeft(root, grand_parent_pt); 
             swap(parent_pt.color, grand_parent_pt.color); 
             pt = parent_pt; 
         } 
     } 
 } 

 root.color = Color.BLACK; 
} 

//Function to insert a new node with given data 
void insert(int data) 
{ 
 RBNode pt = new RBNode(data); 

 // Do a normal BST insert 
 root = BSTInsert(root, pt); 

 // fix Red Black Tree violations 
 fixViolation(root, pt); 
} 


//Function to do inorder and level order traversals 
void inorder()     {  inorderHelper(root);} 
void levelOrder()  {  levelOrderHelper(root); } 

void swap(Color c1, Color c2) {
	Color temp = c1;
	c1 = c2; 
	c2 = temp;
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
	Color color; 
	
	RBNode(int data){
		this.data=data;
		this.left=null;
		this.right=null;
		this.color=Color.RED;
		
	}
}

 enum Color {
	RED, BLACK 
	} 
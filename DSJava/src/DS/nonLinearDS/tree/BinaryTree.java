package DS.nonLinearDS.tree;

import java.util.Stack;

public class BinaryTree {
	static Node root;
	
	public BinaryTree() {
		root=null;
	}
	public static void main(String[] args) {
		//create instance of BinaryTree
		BinaryTree tree = new BinaryTree();
		
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
  
        System.out.println("Preorder traversal of binary tree is "); 
        tree.preorder(root); 
  
        System.out.println("\nInorder traversal of binary tree is "); 
        tree.inorder(root); 
  
        System.out.println("\nPostorder traversal of binary tree is "); 
        tree.postorder(root); 
        
	}
	
   /* 
    * Given a binary tree, print its nodes according to the 
    * "bottom-up" postorder traversal. 
    */
  public void postorder(Node node) 
  { 
      if (node == null) 
          return; 

      // first recur on left subtree 
      postorder(node.left); 

      // then recur on right subtree 
      postorder(node.right); 

      // now deal with the node 
      System.out.print(node.data + " "); 
  } 

  /* 
   * Given a binary tree, print its nodes in inorder
   */
 public void inorder(Node node) 
  { 
      if (node == null) 
          return; 

      /* first recur on left child */
      inorder(node.left); 

      /* then print the data of node */
      System.out.print(node.data + " "); 

      /* now recur on right child */
      inorder(node.right); 
  } 

  /* 
   * Given a binary tree, print its nodes in preorder
   */
  public void preorder(Node node) 
  { 
      if (node == null) 
          return; 

      /* first print data of node */
      System.out.print(node.data + " "); 

      /* then recur on left sutree */
      preorder(node.left); 

      /* now recur on right subtree */
      preorder(node.right); 
  } 
  
  void inorderNonRecursive() 
  { 
      if (root == null) 
          return; 


      Stack<Node> s = new Stack<Node>(); 
      Node curr = root; 

      // traverse the tree 
      while (curr != null || s.size() > 0) 
      { 

          /* Reach the left most Node of the 
          curr Node */
          while (curr !=  null) 
          { 
              /* place pointer to a tree node on 
                 the stack before traversing 
                the node's left subtree */
              s.push(curr); 
              curr = curr.left; 
          } 

          /* Current must be NULL at this point */
          curr = s.pop(); 

          System.out.print(curr.data + " "); 

          /* we have visited the node and its 
             left subtree.  Now, it's right 
             subtree's turn */
          curr = curr.right; 
      } 
  }

  
  
}

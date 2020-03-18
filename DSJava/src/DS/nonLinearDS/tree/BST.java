package DS.nonLinearDS.tree;

public class BST {

	Node root;
	
	/*
	 * constructor which creates the root with given data value
	 */
	BST(int data){
		root = new Node(data);
	}
	
	
	public static void main(String[] args) {
		BST tree = new BST(10);
		
		tree.insert(tree.root, 6);
		tree.insert(tree.root, 12);
		
		System.out.println("\nPreorder: ");
		tree.preorder(tree.root);
		
		System.out.println("\nPostorder: ");
		tree.postorder(tree.root);
		
		System.out.println("\nInorder: ");
		tree.inorder(tree.root);
		
		System.out.println("\nSearch 10: "+tree.search(tree.root, 10));
		System.out.println("\nSearch 100: "+tree.search(tree.root, 100));
		
		System.out.println(tree.minValueNode(tree.root));
		
		System.out.println(tree.maxValueNode(tree.root));
		
		tree.insert(tree.root, 100);
		System.out.println("\nInorder after inserting 100: ");
		tree.inorder(tree.root);
		tree.delete(100);
		System.out.println("\nInorder after deleting 100: ");
		tree.inorder(tree.root);
	}
	
	/*
	 * method to insert a node in BST
	 */
	public void insert(Node node, int data) {
		if(data <= node.data && node.left!=null)
			insert(node.left, data);
		else if(data <= node.data)
			node.left = new Node(data);
		else if(data > node.data && node.right!=null)
			insert(node.right, data);
		else 
			node.right = new Node(data);
	}
	
	  /* 
	    * Given a binary tree, print its nodes according to the 
	    * "bottom-up" postorder traversal. 
	    */
	  public void postorder(Node node) 
	  { 
	      if (node == null) 
	          return; 

	      postorder(node.left); 

	      postorder(node.right); 

	      System.out.print(node.data + " "); 
	  } 

	  /* 
	   * Given a binary tree, print its nodes in inorder
	   */
	 public void inorder(Node node) 
	  { 
	      if (node == null) 
	          return; 

	      inorder(node.left); 

	      System.out.print(node.data + " "); 

	      inorder(node.right); 
	  } 

	  /* 
	   * Given a binary tree, print its nodes in preorder
	   */
	  public void preorder(Node node) 
	  { 
	      if (node == null) 
	          return; 

	      System.out.print(node.data + " "); 

	      preorder(node.left); 

	      preorder(node.right); 
	  } 
	  
	  /*
	   * method to search a node
	   */
	  public boolean search(Node node, int data) {
		  if(data == node.data)
			  return true;
		  if(data < node.data && node.left!=null)
			  return search(node.left, data);
		  if(data > node.data && node.right!=null)
			  return search(node.right, data);
		  else return false;
	  }
	  
	  /*
	   * minValueNode 
	   * 
	   */
	  /*
	   def find_minimum_value(self):
    if self.left_child:
        return self.left_child.find_minimum_value()
    else:
        return self.value
	   */
	  public int minValueNode(Node node) {
		  if(node.left!=null)
			  return minValueNode(node.left);
		  return node.data;
	  }
	  
	  /*
	   * maxValueNode
	   */
	  public int maxValueNode(Node node) {
		  if(node.right!=null)
			  return maxValueNode(node.right);
		  return node.data;
	  }
	  
	 /*
	  * method to remove a node from BST 
	  */
	  // This method mainly calls deleteRec() 
	    public void delete(int data) 
	    { 
	        root = deleteRec(root, data); 
	    } 
	  
	    /* A recursive function to insert a new key in BST */
	    Node deleteRec(Node node, int data) 
	    { 
	        /* Base Case: If the tree is empty */
	        if (node == null)  return node; 
	  
	        /* Otherwise, recur down the tree */
	        if (data < node.data) 
	            node.left = deleteRec(node.left, data); 
	        else if (data > node.data) 
	            node.right = deleteRec(node.right, data); 
	  
	        // if key is same as root's key, then This is the node 
	        // to be deleted 
	        else
	        { 
	            // node with only one child or no child 
	            if (node.left == null) 
	                return node.right; 
	            else if (node.right == null) 
	                return node.left; 
	  
	            // node with two children: Get the inorder successor (smallest 
	            // in the right subtree) 
	            node.data = minValueNode(node.right); 
	  
	            // Delete the inorder successor 
	            node.right = deleteRec(node.right, node.data); 
	        } 
	  
	        return node; 
	    } 
	/*  def remove_node(self, value, parent):
		    if value < self.value and self.left_child:
		        return self.left_child.remove_node(value, self)
		    elif value < self.value:
		        return False
		    elif value > self.value and self.right_child:
		        return self.right_child.remove_node(value, self)
		    elif value > self.value:
		        return False
		    else:
		        if self.left_child is None and self.right_child is None and self == parent.left_child:
		            parent.left_child = None
		            self.clear_node()
		        elif self.left_child is None and self.right_child is None and self == parent.right_child:
		            parent.right_child = None
		            self.clear_node()
		        elif self.left_child and self.right_child is None and self == parent.left_child:
		            parent.left_child = self.left_child
		            self.clear_node()
		        elif self.left_child and self.right_child is None and self == parent.right_child:
		            parent.right_child = self.left_child
		            self.clear_node()
		        elif self.right_child and self.left_child is None and self == parent.left_child:
		            parent.left_child = self.right_child
		            self.clear_node()
		        elif self.right_child and self.left_child is None and self == parent.right_child:
		            parent.right_child = self.right_child
		            self.clear_node()
		        else:
		            self.value = self.right_child.find_minimum_value()
		            self.right_child.remove_node(self.value, self)

		        return True
		        		*/
		        		
}

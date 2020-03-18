package DS.nonLinearDS.tree;

public class AVLTree {
	//Root node of AVLTree class
	AVLNode root; 
	
	public static void main(String[] args) { 
		AVLTree tree = new AVLTree(); 

		/* Constructing tree given in the above figure */
		tree.root = tree.insert(tree.root, 10); 
		tree.root = tree.insert(tree.root, 20); 
		tree.root = tree.insert(tree.root, 30); 
		tree.root = tree.insert(tree.root, 40); 
		tree.root = tree.insert(tree.root, 50); 
		tree.root = tree.insert(tree.root, 25); 

		/* The constructed AVL Tree would be 
			30 
			/ \ 
		20 40 
		/ \	 \ 
		10 25 50 
		*/
		System.out.println("Preorder traversal" + 
						" of constructed tree is : "); 
		tree.preOrder(tree.root); 
		
        tree.root = tree.deleteNode(tree.root, 10);  
        
        /* The AVL Tree after deletion of 10  
        1  
        / \  
        0 9  
        /     / \  
        -1 5 11  
        / \  
        2 6  
        */
        System.out.println("");  
        System.out.println("Preorder traversal after deletion of 10 :");  
        tree.preOrder(tree.root); 
	}
	
	
		/*
		 *  A method to get the height of the node 
		 */
		int height(AVLNode N) { 
			if (N == null) 
				return 0; 

			return N.height; 
		} 

		/*
		 *  A method to get maximum of two integers 
		 */
		int max(int a, int b) { 
			return (a > b) ? a : b; 
		} 

		// A method to right rotate subtree rooted with y 
		AVLNode rightRotate(AVLNode y) { 
			AVLNode x = y.left; 
			AVLNode T2 = x.right; 

			// Perform rotation 
			x.right = y; 
			y.left = T2; 

			// Update heights 
			y.height = max(height(y.left), height(y.right)) + 1; 
			x.height = max(height(x.left), height(x.right)) + 1; 

			// Return new root 
			return x; 
		} 

		// A method to left rotate subtree rooted with x 
		AVLNode leftRotate(AVLNode x) { 
			AVLNode y = x.right; 
			AVLNode T2 = y.left; 

			// Perform rotation 
			y.left = x; 
			x.right = T2; 

			// Update heights 
			x.height = max(height(x.left), height(x.right)) + 1; 
			y.height = max(height(y.left), height(y.right)) + 1; 

			// Return new root 
			return y; 
		} 

		/*
		 * method to get Balance factor of node N 
		 */
		int getBalance(AVLNode N) { 
			if (N == null) 
				return 0; 

			return height(N.left) - height(N.right); 
		} 

		/*
		 * method to insert a node with value data
		 */
		AVLNode insert(AVLNode node, int data) { 

			/* 1. Perform the normal BST insertion */
			if (node == null) 
				return (new AVLNode(data)); 

			if (data < node.data) 
				node.left = insert(node.left, data); 
			else if (data > node.data) 
				node.right = insert(node.right, data); 
			else // Duplicate keys not allowed 
				return node; 

			/* 2. Update height of this ancestor node */
			node.height = 1 + max(height(node.left), 
								height(node.right)); 

			/* 3. Get the balance factor of this ancestor 
				node to check whether this node became 
				unbalanced */
			int balance = getBalance(node); 

			// If this node becomes unbalanced, then there 
			// are 4 cases Left Left Case 
			if (balance > 1 && data < node.left.data) 
				return rightRotate(node); 

			// Right Right Case 
			if (balance < -1 && data > node.right.data) 
				return leftRotate(node); 

			// Left Right Case 
			if (balance > 1 && data > node.left.data) { 
				node.left = leftRotate(node.left); 
				return rightRotate(node); 
			} 

			// Right Left Case 
			if (balance < -1 && data < node.right.data) { 
				node.right = rightRotate(node.right); 
				return leftRotate(node); 
			} 

			/* return the (unchanged) node pointer */
			return node; 
		} 

		/*
		 * preorder traversal 
		 */
		void preOrder(AVLNode node) { 
			if (node != null) { 
				System.out.print(node.data + " "); 
				preOrder(node.left); 
				preOrder(node.right); 
			} 
		}  
		
		/*
		 * method to delete a node
		 */
		AVLNode deleteNode(AVLNode root, int data)  
	    {  
	        // STEP 1: PERFORM STANDARD BST DELETE  
	        if (root == null)  
	            return root;  
	  
	        // If the key to be deleted is smaller than  
	        // the root's key, then it lies in left subtree  
	        if (data < root.data)  
	            root.left = deleteNode(root.left, data);  
	  
	        // If the key to be deleted is greater than the  
	        // root's key, then it lies in right subtree  
	        else if (data > root.data)  
	            root.right = deleteNode(root.right, data);  
	  
	        // if key is same as root's key, then this is the node  
	        // to be deleted  
	        else
	        {  
	  
	            // node with only one child or no child  
	            if ((root.left == null) || (root.right == null))  
	            {  
	                AVLNode temp = null;  
	                if (temp == root.left)  
	                    temp = root.right;  
	                else
	                    temp = root.left;  
	  
	                // No child case  
	                if (temp == null)  
	                {  
	                    temp = root;  
	                    root = null;  
	                }  
	                else // One child case  
	                    root = temp; // Copy the contents of  
	                                // the non-empty child  
	            }  
	            else
	            {  
	  
	                // node with two children: Get the inorder  
	                // successor (smallest in the right subtree)  
	                AVLNode temp = minValueNode(root.right);  
	  
	                // Copy the inorder successor's data to this node  
	                root.data = temp.data;  
	  
	                // Delete the inorder successor  
	                root.right = deleteNode(root.right, temp.data);  
	            }  
	        }  
	  
	        // If the tree had only one node then return  
	        if (root == null)  
	            return root;  
	  
	        // STEP 2: UPDATE HEIGHT OF THE CURRENT NODE  
	        root.height = max(height(root.left), height(root.right)) + 1;  
	  
	        // STEP 3: GET THE BALANCE FACTOR OF THIS NODE (to check whether  
	        // this node became unbalanced)  
	        int balance = getBalance(root);  
	  
	        // If this node becomes unbalanced, then there are 4 cases  
	        // Left Left Case  
	        if (balance > 1 && getBalance(root.left) >= 0)  
	            return rightRotate(root);  
	  
	        // Left Right Case  
	        if (balance > 1 && getBalance(root.left) < 0)  
	        {  
	            root.left = leftRotate(root.left);  
	            return rightRotate(root);  
	        }  
	  
	        // Right Right Case  
	        if (balance < -1 && getBalance(root.right) <= 0)  
	            return leftRotate(root);  
	  
	        // Right Left Case  
	        if (balance < -1 && getBalance(root.right) > 0)  
	        {  
	            root.right = rightRotate(root.right);  
	            return leftRotate(root);  
	        }  
	  
	        return root;  
	    }  
		
		/*
		 * get minimum value node
		 */
		  AVLNode minValueNode(AVLNode node)  
		    {  
		        AVLNode current = node;  
		  
		        /* loop down to find the leftmost leaf */
		        while (current.left != null)  
		        current = current.left;  
		  
		        return current;  
		    }
	} 

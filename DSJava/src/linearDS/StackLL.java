package linearDS;

public class StackLL {
	//TOP is used to keep the reference of top node
		 Node TOP;
		 
		 /*
		  * method to insert a given node at the beginning
		  */
		public void push(Node node) {
			//check of empty case
			if(this.isEmpty()==true) {
				TOP=node;
				return;
			}
			
				node.next=TOP;
				TOP=node;
		}
		
		/*
		 *method to delete a node from the beginning 
		 */
		public Node pop() {
			if(this.isEmpty()==true) {
				System.out.println("List is Empty...Deletion is not Possible!!!");
				return null;
			}
			Node temp=TOP;
			TOP=TOP.next;
			temp.next=null;
			return temp;
		}
		
		/*
		 * method to see top node
		 */
		public Node peek() {
			if(isEmpty()==true) {
				System.out.println("Stack Underflow!!!");
				return null;
			}
			return TOP;
		}
		
		/*
		 * method to traverse all the nodes in the list
		 */
		public void display() {
			if(isEmpty()==true) {
				System.out.println("Stack Underflow!!!");
				return;
			}
			else {
				Node temp=this.TOP;
				System.out.print("Stack: ");
				while(temp!=null) {
					System.out.print(temp.data+" ");
					temp=temp.next;
				}
				System.out.println();
			}
		}
		
		/*
		 * method to check Underflow case
		 */
		public boolean isEmpty() {
			if(this.TOP==null)
				return true;
			return false;
		}
}

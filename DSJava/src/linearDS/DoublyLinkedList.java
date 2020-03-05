package linearDS;

import linkedlist.DNode;
import linkedlist.DoublyLL;

public class DoublyLinkedList {
	//reference to hold list first node address location
		DNode head;
		
		public static void main(String[] args) {

			DoublyLL list=new DoublyLL();
			
			//Create a node and insert at the beginning
			DNode node=new DNode();
			node.data=10;
			list.traverse();
			//Output: List is Empty!!!
			
			list.insertAtBegin(node);
			list.traverse();
			//Output: null<->10<->null
			
			//Create another node with data=20
			node=new DNode();
			node.data=20;
			list.insertAtBegin(node);
			list.traverse();
			//Output: null<->20<->10<->null

		}
		
		/***************************************
		 * Insertion in the Doubly Linked List *
		 ***************************************/
		
		/*
		 * 1. method to insert a node at the beginning
		 */
		public void insertAtBegin(DNode node) {
			
			//check for empty case, if yes assign node to the head and return
			if(this.isEmpty()==true) {
				head=node;
				return;
			}

			//otherwise change the references of node and head
			node.next=head;
			head.prev=node;
			head=node;
		}
		
		/*
		 * Traversal of nodes in the list
		 */
		public void traverse() {
			
			//Check for Empty case, if yes print Empty message return back
			if(this.isEmpty()==true) {
				System.out.println("List is Empty!!!");
				return;
			}
			
			//Otherwise, Initialize temp node to head node
			DNode temp=head;
			System.out.println();
			System.out.print("null<->");
			
			//Repeat till last node
			while(temp!=null) {
				
				//For each repetition print temp.data and point temp to next node
				System.out.print(temp.data+"<->");
				temp=temp.next;
			}
			System.out.print("null");
		}
		
		/*
		 * count the nodes in the list
		 */
		public int countNodes() {
			//Check for Empty case, if yes print Empty message and return -1
			if(this.isEmpty()==true) {
				System.out.println("List is Empty!!!");
				return -1;
			}
			
			//Initialize temp node to head node
			DNode temp=head;
			
			//Initialize count to zero for node's current position
			int count=0;
			
			//Repeat till the last node
			while(temp!=null) {
				
				//For each node increase count with 1, and point temp to next node
				count++;
				temp = temp.next;
			}
			
			//return the count value
			return count;
		}
		
		/*
		 * method to check empty case
		 */
		public boolean isEmpty() {
			if(head==null)
				return true;
			else
				return false;
		}

}
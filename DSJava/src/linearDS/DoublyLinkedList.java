package linearDS;

import linkedlist.DNode;
import linkedlist.DoublyLL;

public class DoublyLinkedList {
	//reference to hold list first node address location
			DNode head;
			
			public static void main(String[] args) {
				System.out.println("Doubly Linked List");
				
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
				
				//Create a node with data=100 and insert at the end of the list
				node = new DNode();
				node.data=100;
				list.insertAtEnd(node);
				list.traverse();
				//Output: null<->20<->10<->100<->null
				
				//Create a node with data=500 and insert at position=2
				node = new DNode();
				node.data=500;
				int position=2;
				list.insertByPosition(node, position);
				list.traverse();
				//Output: null<->20<->500<->10<->100<->null
				
				//Create a node with data=700 and insert after the key=500
				node = new DNode();
				node.data=700;
				int data = 500;
				list.insertByData(node, data);
				list.traverse();
				//Output: null<->20<->500<->700<->10<->100<->null
				
				//reverseTraversal
				list.reverseTraversal();
				//Output: null<->100<->10<->700<->500<->20<->null
				
				//countNode()
				System.out.println("\nTotal Node: "+list.countNodes());
				//Output: Total Node: 5
				
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
			 * 2. method to insert a node at the end
			 */
			public void insertAtEnd(DNode node) {
				
				//check for empty case, if yes assign node to the head and return
				if(this.isEmpty()==true) {
					head=node;
					return;
				}
				DNode temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				node.prev=temp;
				temp.next=node;
			}
			/*
			 * 3. method to insert a node by position
			 */
			public void insertByPosition(DNode node, int position) {
				
				//Check for empty case, if yes assign node to the head and return
				if(this.isEmpty()==true) {
					head=node;
					return;
				}
				
				//Otherwise, Initialize temp node to head node
				DNode temp=head;
				
				//Initialize count to zero for node position
				int count=0;
				
				//Repeat till temp.next is not null
				while(temp.next!=null) {
					//For each repetition increase count with 1
					count++;
					
					//Break the repetition if count reached just before position
					if(count==position-1)
						break;
					
					//For each repetition temp points to next node 
					temp=temp.next;
				}
				
				//change the references
				node.prev=temp;
				node.next=temp.next;
				temp.next.prev=node;
				temp.next=node;
			}
			
			/*
			 * 4. method to insert a node by data key value
			 */
			public void insertByData(DNode node, int data) {
				
				//check for empty case, if yes assign node to the head and return
				if(this.isEmpty()==true) {
					head=node;
					return;
				}
				
				//Otherwise, Initialize temp node to head node
				DNode temp=head;
				
				//Repeat till temp.next is not null
				while(temp.next!=null) {
					//Break the repetition if temp.data is matched with data
					if(temp.data==data)
						break;
					temp=temp.next;
				}
				
				//change the references
				node.prev=temp;
				node.next=temp.next;
				temp.next.prev=node;
				temp.next=node;
			}
			
			/**************************************
			 * Deletion in the Doubly Linked List *
			 **************************************/
			
			/*
			 * 1. Delete a node from beginning
			 */
			public DNode deleteFromBegin() {
				//check for empty case, if yes print Empty message and return null
				
				
				//Initialize temp node to head node
				
				//Change the reference for temp and head
				
				//Return the reference of the deleted node
				return null;
			}
			
			/*
			 * 2. Delete a node from end
			 */
			public DNode deleteFromEnd() {
				//Check for Empty case, if yes print Empty message and return null
				
				
				//Initialize temp node to head node
				
				//Repeat till last nose
				
				
				//change the reference 
				
				//Return the reference of deleted node
				return null;
			}
			
			/*
			 * 3. Delete a node by position
			 */
			public DNode deleteByPosition(int position) {
				//Check for Empty case, if yes print Empty message return null
				
				
				//Otherwise, Initialize count=0 and temp node to head node
				
				//Repeat till last node
				
					//For each repetition increase count with 1
					
					//stop repetition if count is equal to position
					
					//For each repetition point temp node to the next node
					
				
				//Change the reference to delete the node
				
				//Return the reference of the deleted node
				return null;
			}
			
			/*
			 * 4. Delete a node by data key value
			 */
			public DNode deleteByData(int data) {
				
				//Check for Empty case, if yes print the Empty message and return 
				
				
				//Otherwise, Initialize temp node to head node
				
				//Repeat till last node
					
					//For each repetition chech temp.data matched with data
					
					//For each repetition point temp to the next node
					
				
				//Change references to delete node
				
				//Return the deleted node
				return null;
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
			 * Reverse Traversal of nodes in the list
			 */
			public void reverseTraversal() {
				//Check for Empty case, if yes print Empty message and return back
				if(this.isEmpty()==true) {
					System.out.println("List is Empty!!!");
					return;
				}
				
				//Otherwise, Initialize temp node to head node
				DNode temp = head;
				
				//Repeat till the last node
				while(temp.next!=null)
					temp = temp.next;
				System.out.println();
				System.out.print("null<->");
				
				//Repeat till temp is not null
				while(temp!=null) {
					
					//For each repetition print temp.data and go to previous node
					System.out.print(temp.data+"<->");
					temp=temp.prev;
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
			
			/**************************************
			 * Updation in the Doubly Linked List *
			 **************************************/
			
			/*
			 * 1. update the data of first node
			 */
			public boolean updateBegin(int data) {
				
				//Check for Empty case, if yes print Empty message and return false
				
				
				//Otherwise, update the data part of first not to given data value
				
				return true;
			}
			/*
			 * 2. update the data of last node
			 */
			public boolean updateEnd(int data) {
				//Check for Empty case, if yes print Empty message and return false
				
				
				//Initialize temp node to head node
				
				//Repeat till the last node
				
				//Change the data part of the last node to given data value
				
				return true;
			}
			
			/*
			 * 3. update the data by position
			 */
			public boolean updateByPosition(int data, int position) {
				//Check for Empty case, if yes print Empty message and retrurn false
				
				
				//Otherwise, Initialize temp node to head node
				
				//Initialize count with zero to point current position of node
				
				//Keep flag to identify whether node if found or not
				
				//Repeat till the last node
					//For each repetition increase count with 1
					
					//For each repetition check count is equal to given position
					
				return false;
			}
			/*
			 * 4. update the data by key value
			 */
			public boolean updateByData(int oldData, int newData) {
				
				return false;
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
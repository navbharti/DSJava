package linearDS;

import linkedlist.DNode;
import linkedlist.DoublyLL;

public class DoublyLinkedList2 {
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
			
			//Delete the first node
			node = list.deleteFromBegin();
			System.out.println("\nDeleted: "+node.data);
			list.traverse();
			//Output: Deleted: 20

			//null<->500<->700<->10<->100<->null
			
			//Delete the node with position=3
			position=3;
			node=list.deleteByPosition(position);
			System.out.println("\nDeleted: "+node.data);
			list.traverse();
			//Output: Deleted: 10

			//null<->500<->700<->100<->null
			
			//Delete the last node
			node = list.deleteFromEnd();
			System.out.println("\nDeleted: "+node.data);
			list.traverse();
			//Output: Deleted: 100

			//null<->500<->700<->null
			
			node = new DNode();
			node.data=15;
			list.insertAtBegin(node);
			
			node = new DNode();
			node.data=155;
			list.insertAtEnd(node);
			list.traverse();
			//Output: null<->15<->500<->700<->155<->null
			
			//Delete the node with data=700
			data=700;
			node = list.deleteByData(data);
			System.out.println("\nDeleted: "+node.data);
			list.traverse();
			//Output: Deleted: 700

			//null<->15<->500<->155<->null
			
			//update begin node data=15
			list.updateBegin(1555);
			list.traverse();
			//Output: null<->1555<->500<->155<->null
			
			//update end node data=23
			list.updateEnd(23);
			list.traverse();
			//Output: null<->1555<->500<->23<->null
			
			//updateByPosition position=2
			list.updateByPosition(17, 2);
			list.traverse();
			//Output: null<->1555<->17<->23<->null
			
			//updateByData oldData=17 and newData=170
			list.updateByData(17, 170);
			list.traverse();
			//Output: null<->1555<->170<->23<->null
			
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
			if(this.isEmpty()==true) {
				System.out.println("List is Empty!!!");
				return null;
			}
			
			//Initialize temp node to head node
			DNode temp=head;
			
			//Change the reference for temp and head
			head.next.prev=null;
			head=head.next;
			temp.next=null;
			
			//Return the reference of the deleted node
			return temp;
		}
		
		/*
		 * 2. Delete a node from end
		 */
		public DNode deleteFromEnd() {
			//Check for Empty case, if yes print Empty message and return null
			if(this.isEmpty()==true) {
				System.out.println("List is Empty!!!");
				return null;
			}
			
			//Initialize temp node to head node
			DNode temp=head;
			
			//Repeat till last nose
			while(temp.next!=null) {
				temp = temp.next;
			}
			
			//change the reference 
			temp.prev.next=null;
			temp.prev=null;
			
			//Return the reference of deleted node
			return temp;
		}
		
		/*
		 * 3. Delete a node by position
		 */
		public DNode deleteByPosition(int position) {
			//Check for Empty case, if yes print Empty message return null
			if(this.isEmpty()==true) {
				System.out.println("List is Empty!!!");
				return null;
			}
			
			//Otherwise, Initialize count=0 and temp node to head node
			int count=0;
			DNode temp=head;
			
			//Repeat till last node
			while(temp.next!=null) {
				
				//For each repetition increase count with 1
				count++;
				
				//stop repetition if count is equal to position
				if(count==position)
					break;
				
				//For each repetition point temp node to the next node
				temp = temp.next;
			}
			
			//Change the reference to delete the node
			temp.next.prev=temp.prev;
			temp.prev.next=temp.next;
			temp.prev=null;
			temp.next=null;
			
			//Return the reference of the deleted node
			return temp;
		}
		
		/*
		 * 4. Delete a node by data key value
		 */
		public DNode deleteByData(int data) {
			
			//Check for Empty case, if yes print the Empty message and return 
			if(this.isEmpty()==true) {
				System.out.println("List is Empty!!!");
				return null;
			}
			
			//Otherwise, Initialize temp node to head node
			DNode temp=head;
			
			//Repeat till last node
			while(temp.next!=null) {
				
				//For each repetition chech temp.data matched with data
				if(temp.data==data)
					break;
				
				//For each repetition point temp to the next node
				temp = temp.next;
			}
			
			//Change references to delete node
			temp.next.prev=temp.prev;
			temp.prev.next=temp.next;
			temp.prev=null;
			temp.next=null;
			
			//Return the deleted node
			return temp;
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
			if(this.isEmpty()==true) {
				System.out.println("List is Empty!!!");
				return false;
			}
			
			//Otherwise, update the data part of first not to given data value
			head.data=data;
			return true;
		}
		/*
		 * 2. update the data of last node
		 */
		public boolean updateEnd(int data) {
			//Check for Empty case, if yes print Empty message and return false
			if(this.isEmpty()==true) {
				System.out.println("List is Empty!!!");
				return false;
			}
			
			//Initialize temp node to head node
			DNode temp=head;
			
			//Repeat till the last node
			while(temp.next!=null)
				temp = temp.next;
			
			//Change the data part of the last node to given data value
			temp.data=data;
			return true;
		}
		
		/*
		 * 3. update the data by position
		 */
		public boolean updateByPosition(int data, int position) {
			//Check for Empty case, if yes print Empty message and retrurn false
			if(this.isEmpty()==true) {
				System.out.println("List is Empty!!!");
				return false;
			}
			
			//Otherwise, Initialize temp node to head node
			DNode temp = head;
			
			//Initialize count with zero to point current position of node
			int count = 0;
			
			//Keep flag to identify whether node if found or not
			boolean flag=false;
			
			//Repeat till the last node
			while(temp.next!=null) {
				
				//For each repetition increase count with 1
				count++;
				
				//For each repetition check count is equal to given position
				if(count==position) {
					flag = true;
					break;
				}
				temp = temp.next;
			}
			
			if(flag==true) {
				temp.data=data;
				return true;
			}
			
			return false;
		}
		/*
		 * 4. update the data by key value
		 */
		public boolean updateByData(int oldData, int newData) {
			if(this.isEmpty()==true) {
				System.out.println("List is Empty!!!");
				return false;
			}
			
			DNode temp = head;
			boolean flag=false;
			while(temp.next!=null) {
				if(temp.data==oldData) {
					flag = true;
					break;
				}
				temp = temp.next;
			}
			
			if(flag==true) {
				temp.data = newData;
				return true;
			}
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


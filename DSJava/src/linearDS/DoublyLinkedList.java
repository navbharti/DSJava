package linearDS;


import linkedlist.DoublyLL;

public class DoublyLinkedList {
	//reference to hold list first node address location
			DNode head;
			
			public static void main(String[] args) {
				System.out.println("Doubly Linked List");
				
				DoublyLinkedList list=new DoublyLinkedList();
				
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
				if(this.isEmpty()==true) {
					head=node;
					return;
				}

				node.next=head;
				head.prev=node;
				head=node;
			}
			
			/*
			 * 2. method to insert a node at the end
			 */
			public void insertAtEnd(DNode node) {
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
				DNode temp=head;
				int count=0;
				while(temp.next!=null) {
					count++;
					if(count==position-1)
						break;
					temp=temp.next;
				}
				
				node.prev=temp;
				node.next=temp.next;
				temp.next.prev=node;
				temp.next=node;
			}
			
			/*
			 * 4. method to insert a node by data key value
			 */
			public void insertByData(DNode node, int data) {
				DNode temp=head;
				while(temp.next!=null) {
					if(temp.data==data)
						break;
					temp=temp.next;
				}
				
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
				if(this.isEmpty()==true) {
					System.out.println("List is Empty!!!");
					return null;
				}
				DNode temp=head;
				head.next.prev=null;
				head=head.next;
				temp.next=null;
				
				return temp;
			}
			
			/*
			 * 2. Delete a node from end
			 */
			public DNode deleteFromEnd() {
				if(this.isEmpty()==true) {
					System.out.println("List is Empty!!!");
					return null;
				}
				
				DNode temp=head;
				while(temp.next!=null) {
					temp = temp.next;
				}
				
				temp.prev.next=null;
				temp.prev=null;
				
				return temp;
			}
			
			/*
			 * 3. Delete a node by position
			 */
			public DNode deleteByPosition(int position) {
				if(this.isEmpty()==true) {
					System.out.println("List is Empty!!!");
					return null;
				}
				int count=0;
				DNode temp=head;
				while(temp.next!=null) {
					count++;
					if(count==position)
						break;
					temp = temp.next;
				}
				
				temp.next.prev=temp.prev;
				temp.prev.next=temp.next;
				temp.prev=null;
				temp.next=null;
				
				return temp;
			}
			/*
			 * 4. Delete a node by data key value
			 */
			public DNode deleteByData(int data) {
				if(this.isEmpty()==true) {
					System.out.println("List is Empty!!!");
					return null;
				}
				DNode temp=head;
				while(temp.next!=null) {
					if(temp.data==data)
						break;
					temp = temp.next;
				}
				
				temp.next.prev=temp.prev;
				temp.prev.next=temp.next;
				temp.prev=null;
				temp.next=null;
				
				return temp;
			}
			
			/*
			 * Traversal of nodes in the list
			 */
			public void traverse() {
				if(this.isEmpty()==true) {
					System.out.println("List is Empty!!!");
					return;
				}
				DNode temp=head;
				System.out.println();
				System.out.print("null<->");
				while(temp!=null) {
					System.out.print(temp.data+"<->");
					temp=temp.next;
				}
				System.out.print("null");
			}
			/*
			 * Reverse Traversal of nodes in the list
			 */
			public void reverseTraversal() {
				DNode temp = head;
				while(temp.next!=null)
					temp = temp.next;
				System.out.println();
				System.out.print("null<->");
				while(temp!=null) {
					System.out.print(temp.data+"<->");
					temp=temp.prev;
				}
				System.out.print("null");
			}
			
			/*
			 * count the nodes in the list
			 */
			public int countNodes() {
				DNode temp=head;
				int count=0;
				while(temp!=null) {
					count++;
					temp = temp.next;
				}
				return count;
			}
			
			/**************************************
			 * Updation in the Doubly Linked List *
			 **************************************/
			
			/*
			 * 1. update the data of first node
			 */
			public boolean updateBegin(int data) {
				if(this.isEmpty()==true) {
					System.out.println("List is Empty!!!");
					return false;
				}
				
				head.data=data;
				return true;
			}
			/*
			 * 2. update the data of last node
			 */
			public boolean updateEnd(int data) {
				if(this.isEmpty()==true) {
					System.out.println("List is Empty!!!");
					return false;
				}
				
				DNode temp=head;
				while(temp.next!=null)
					temp = temp.next;
				temp.data=data;
				return true;
			}
			
			/*
			 * 3. update the data by position
			 */
			public boolean updateByPosition(int data, int position) {
				if(this.isEmpty()==true) {
					System.out.println("List is Empty!!!");
					return false;
				}
				DNode temp = head;
				int count = 0;
				boolean flag=false;
				
				while(temp.next!=null) {
					count++;
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
			
			/*
			 * method to search a given key value
			 */
			public boolean search(int key) {
				if(isEmpty()==true) {
					System.out.println("List is Empty!!!");
					return false;
				}
				
				DNode temp = head;
				while(temp!=null) {
					if(temp.data==key)
						return true;
					temp = temp.next;
				}
				return false;
			}

}
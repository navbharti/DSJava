package DS.linearDS.dll;

import java.util.Scanner;

public class DoublyMenuDriven {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		DoublyLinkedList list = new DoublyLinkedList();
		boolean repeat=true;
		int position;
		DNode node;
		while(repeat) {
			displayMenu();
			int choice = input.nextInt();
			
			switch(choice){
				case 1: //System.out.println("choice 1");
					 node = new DNode();
					System.out.println("Enter Data: ");
					node.data = input.nextInt();
					list.insertAtEnd(node);
					break;
					
				case 2: //System.out.println("choice 2");
					list.traverse();
					break;
				
				case 3: //System.out.println("choice 3");
					 node=new DNode();
					 System.out.println("Enter Data: ");
					 node.data=input.nextInt();
					 list.insertAtBegin(node);
					break;
				 
				case 4: //System.out.println("choice 4");
					System.out.println("Enter Data: ");
					node = new DNode();
					node.data=input.nextInt();
					System.out.println("Enter Position to insert: ");
					position = input.nextInt();
					list.insertByPosition(node, position);
					break;
				
				case 5: //System.out.println("choice 5");
					System.out.println("Which position to delete: ");
					position = input.nextInt();
					node = list.deleteByPosition(position);
					if(node==null)
						System.out.println("Node is not deleted!!!");
					else
						System.out.println("Deleted Node: "+node.data);
					break;
				
				case 6: //System.out.println("choice 6");
					System.out.println("Enter Search Key: ");
					int key = input.nextInt();
					if(list.search(key)==true) {
						System.out.println("key is found!!!");
					}
					else {
						System.out.println("Key is not found!!!");
					}
					break;
				 
				case 7: repeat=false;	break;
				
				default:
			}
		}

	}


	public static void displayMenu() {
		System.out.println("\n********* Mune ********");
		System.out.println("1. Create");
		System.out.println("2. Display List");
		System.out.println("3. Insert At Beginning");
		System.out.println("4. Insert At any Position");
		System.out.println("5. Delete by any Position");
		System.out.println("6. Search a node by key");
		System.out.println("7. Exit!!!");
		System.out.println("Your Choice....");
	}
}

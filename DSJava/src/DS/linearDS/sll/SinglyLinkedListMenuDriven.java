package DS.linearDS.sll;

import java.util.Scanner;

public class SinglyLinkedListMenuDriven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SinglyLinkedList list = new SinglyLinkedList();
		Node node=null;
		int data=0;
		int position=0;
		boolean repeat=true;
		while(repeat) {
			displayMenu();
			
			int choice=input.nextInt();
			switch(choice) {
			case 1: System.out.println("Number of Nodes: ");
				int n = input.nextInt();
				list.createList(n);break;
			case 2: System.out.println("Enter Data: ");
				node = new Node();
				node.data = input.nextInt();
				list.insertAtBegin(node);break;
			case 3: System.out.println("Enter Data: ");
				node=new Node();
				node.data= input.nextInt();
				list.insertAtEnd(node); break;
			case 4: System.out.println("Enter Data: ");
				node = new Node();
				node.data=input.nextInt();
				System.out.println("Enter position: ");
				position = input.nextInt();
				list.insertByPositioin(node, position); break;
			case 5: node = list.deleteFromBegin();
				System.out.println(node.data + " is deleted!!!");
				node = null; break;
			case 6: node = list.deleteFromEnd();
				System.out.println(node.data +" is deleted!!!");
				node = null; break;
			case 7: System.out.println("Enter position: ");
				position = input.nextInt();
				node = list.deleteByPosition(position);
				System.out.println(node.data + " is deleted!!!");
				node = null;
				break;
			case 8: list.traverseList();break;
			case 9: System.out.println("Enter search key: ");
				data = input.nextInt();
				node = list.search(data);
				System.out.println("Searched Node: "+node);
				break;
			case 10: repeat = false; break;
			default: System.out.println("Wrong Choice!!!");
				
			}
		}

		input.close();
	}
	
	public static void displayMenu() {
		System.out.println("\n********Main Menu***********");
		System.out.println("1. Create List ");
		System.out.println("2. Insert At Beginning");
		System.out.println("3. Insert At End");
		System.out.println("4. Insert At any Position");
		System.out.println("5. Delete From Beginning");
		System.out.println("6. Delete From End");
		System.out.println("7. Delete From any Position");
		System.out.println("8. Display list");
		System.out.println("9. Search");
		System.out.println("10. Exit");
		System.out.println("Your Choice...");
	}

}

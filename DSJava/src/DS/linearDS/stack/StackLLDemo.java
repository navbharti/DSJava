package DS.linearDS.stack;

import java.util.Scanner;

import linearDS.Node;

public class StackLLDemo {

	static Scanner input = new Scanner(System.in);
	 public static  void main(String args[]) {
		 StackLL stack = new StackLL();
		 //create a new node 
		 Node node = new Node();
		 node.data = 10;
		 stack.push(node);
		 stack.display();
		 
		 //create another node and push
		 node = new Node();
		 node.data = 20;
		 stack.push(node);
		 stack.display();
		 
		 //create node with data 30 and push
		 node = new Node();
		 node.data=30;
		 stack.push(node);
		 stack.display();
		 
		 //pop operation
		 node = stack.pop();
		 System.out.println(node.data+" is popped up");
		 stack.display();
		 
		 //peek operation
		 System.out.println(stack.peek().data+" is top node");
		 
	 }

}

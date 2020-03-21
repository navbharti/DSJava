package DS.linearDS.stack;

public class StackDemo {

	public static void main(String[] args) {
		//Create a stack object
		Stack stack = new Stack(5);
		stack.display();
		
		stack.push(10);
		stack.display();
		
		stack.push(20);
		stack.display();
		
		System.out.println("Top Element: "+stack.peek());
		stack.display();
		
		stack.push(30);
		stack.display();
		
		System.out.println("Removed: "+stack.pop());
		stack.display();
		
	}
}

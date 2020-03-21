package DS.linearDS.stack;

public class Stack {

	int arr[];
	final int SIZE;
	int TOP;
	
	public Stack(int size) {
		this.SIZE = size;
		TOP=-1;
		arr=new int[size];
	}
	
	/*
	 * method to print elements of the stack
	 */
	public void display() {
		if(isEmpty()==true) {
			System.out.println("Stack Underflow!!!");
			return;
		}
		System.out.print("STACK: ");
		for(int i=0; i<=TOP; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	/*
	 * method to add element on top of Stack
	 */
	public void push(int data) {
		if(isFull()==true) {
			System.out.println("Stack Overflow!!!");
			return;
		}
		TOP++;
		arr[TOP]=data;
		System.out.println(data +" is pushed");
	}

	/*
	 * method to delete an element from top of Stack
	 */
	public int pop() {
		if(isEmpty()==true) {
			System.out.println("Stack Undeflow!!!");
			return -1;
		}
		int data = arr[TOP];
		TOP--;
		return data;
	}
	
	/*
	 * method to see the top element on the Stack
	 */
	public int peek() {
		if(isEmpty()==true) {
			System.out.println("Stack Underflow!!!");
			return -1;
		}
		
		return arr[TOP];
	}
	
	/*
	 * method to check whether Stack is Empty
	 */
	public boolean isEmpty() {
		if(TOP==-1)
			return true;
		
		return false;
	}
	
	/*
	 * method to check whether Stack is Full
	 */
	public boolean isFull() {
		if(TOP==SIZE-1)
			return true;
		return false;
	}
}

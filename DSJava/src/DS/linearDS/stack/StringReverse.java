package DS.linearDS.stack;

public class StringReverse {

	public static void main(String[] args) {
		String str = "I am Student of KL University";
		
		System.out.println(reverse(str));
	}

	public static String reverse(String str) {
		//Create an Empty stack of char type
		StackChar stack = new StackChar(str.length());
		
		//Convert the given String str to char array
		char arr[] = str.toCharArray();
		
		//push elements of arr[] into the stack
		for(int i=0; i<arr.length; i++)
			stack.push(arr[i]);
		
		//pop each element and assign the popped elements to the same array starting from index zero
		for(int i=0; i<arr.length; i++)
			arr[i]=stack.pop();
		
		//Convert the arr back to string representation
		String str1 = String.copyValueOf(arr);
		
		//return the str1
		return str1;
	}
}

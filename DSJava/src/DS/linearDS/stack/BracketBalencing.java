package DS.linearDS.stack;

public class BracketBalencing {

	public static void main(String[] args) {
		//Create a stack object
		String exp = "{(1+5)*5}";
		StackChar stack = new StackChar(exp.length());
		char arr[]=exp.toCharArray();
		
		boolean  balence=true;
		for(int i=0; i<arr.length; i++) {
			if(isOpenningBracket(arr[i])==true) {
				stack.push(arr[i]);
			}
				
			
			if(isClosingBracket(arr[i])==true) {
				char a = stack.pop();
				if(!isBalence(a, arr[i])) {
					balence=false;
					break;
				}
					
			}
													
				
		}
		
		if(stack.count()>0)
			System.out.println("Not Balence!!!");
		else if(!balence)
			System.out.println("Not Balence!!!");
		else
			System.out.println("Balence!!!");
		
	}
	
	public static boolean isOpenningBracket(char ch) {
		if(ch=='(' || ch=='{' || ch=='[')
			return true;
		return false;
	}
	
	public static boolean isClosingBracket(char ch) {
		if(ch==')' || ch=='}' || ch==']')
			return true;
		return false;
	}
	
	public static boolean isBalence(char openning, char closing) {
		if(openning=='(' && closing==')')
			return true;
		if(openning=='{' && closing=='}')
			return true;
		if(openning=='[' && closing==']')
			return true;
		return false;
	}
}

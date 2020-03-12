package linearDS;

public class PolishNotation {
	String exp;
	
	public static void main(String args[]) {
		PolishNotation expression1 = new PolishNotation("X^Y/(5*Z)+2");
		PolishNotation expression2 = new PolishNotation("A*B+C/D");
		PolishNotation expression3 = new PolishNotation("(A-B/C)*(A/K-L)");
		
		System.out.println(expression1.infixToPostfix());
		System.out.println(expression2.infixToPostfix());
		System.out.println(expression3.infixToPostfix());
	}
	
	//Constructor
	public PolishNotation(String str){
		this.exp = str;
	}
	
	/*
	 * method to return postfix expression of a given infix expression
	 */
	public String infixToPostfix() {
		//Create Stack object of type char
		StackChar stack = new StackChar(exp.length());
		
		//Create postfix array with length of str
		char postfix[] = new char[exp.length()];
		
		//Convert the exp to toCharArray
		char infix[] =  exp.toCharArray();
		int postIndex=-1;
		for(int i=0; i<infix.length; i++) {
			
			//Check whether infix element is Alphanumeric
			if(isAlphanumeric(infix[i])==true)
				postfix[++postIndex]=infix[i];
			
			//Check whether infix element is '(' Opening Bracket
			else if(isOpenningBracket(infix[i])==true)
				stack.push(infix[i]);
			
			//Check whether infix element is ')' Closing Bracket
			else if(isClosingBracket(infix[i])==true) 
				{
					//pop all operator from stack and add to the postfix till '(' 
					while(!stack.isEmpty() && stack.peek()!='(')
						postfix[++postIndex]=stack.pop();
					
					//pop '(' opening bracket also and ignore it
					stack.pop();
				}
			
			else {
					//Check precedence of infix element if greater than stack operator then push to top
					if(getPrecedence(infix[i])> getPrecedence(stack.peek()))
						stack.push(infix[i]);
					else {
						//Otherwise, Check the precedence of infix element with stack operator element, if lesser or equal pop and add to postfix
						while(!stack.isEmpty() && getPrecedence(infix[i])<=getPrecedence(stack.peek()))
							postfix[++postIndex]=stack.pop();
						
						//if not any of the above cases then push the element to stack
						stack.push(infix[i]);
					}

				}
			
		}
		
		//pop all the remaining elements from stack one-by-one and add to postfix
		while(!stack.isEmpty()==true)
			postfix[++postIndex]=stack.pop();
		
		//Convert the char array postfix to string and return
		return String.copyValueOf(postfix);
	}

	/*
	 * method to find prefix expression of a given infix expression
	 */
	public String infixToPrefix() {
		
		return null;
	}
	
	/*
	 * method to check whether a character is operator
	 */
	public static boolean isOperator(char ch) {
		if(ch=='-' || ch=='+' || ch=='*' || ch=='/' || ch=='^')
			return true;
		return false;
	}
	
	/*
	 * method to check whether a character is alphanumeric
	 */
	public static boolean isAlphanumeric(char ch) {
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9'))
			return true;
		return false;
	}
	
	/*
	 * method to get the precedence of the operator
	 */
	public static int getPrecedence(char operator) {
		if(operator=='-' || operator=='+')
			return 1;
		else if(operator=='*' || operator=='/')
			return 2;
		else if(operator=='^')
			return 3;
		return 0;
	}
	
	/*
	 * method to check whether a character ch is Opening bracket
	 */
	public static boolean isOpenningBracket(char ch) {
		if(ch=='(')
			return true;
		return false;
	}
	
	/*
	 * method to check whether a character ch is closing braket
	 */
	public static boolean isClosingBracket(char ch) {
		if(ch==')')
			return true;
		return false;
	}
}

package linearDS;

public class PolishNotation {
	String exp;
	
	public static void main(String args[]) {
		PolishNotation expression1 = new PolishNotation("X^Y/(5*Z)+2");
		PolishNotation expression2 = new PolishNotation("A*B+C/D");
		PolishNotation expression3 = new PolishNotation("(A-B/C)*(A/K-L)");
		
		//print postfix
		System.out.println("Postfix: "+expression1.infixToPostfix());
		System.out.println("Postfix: "+expression2.infixToPostfix());
		System.out.println("Postfix: "+expression3.infixToPostfix());
		
		//print print prefix 
		System.out.println("Prefix: "+expression1.infixToPrefix());
		System.out.println("Prefix: "+expression2.infixToPrefix());
		System.out.println("Prefix: "+expression3.infixToPrefix());
		
		//create infix object
		PolishNotation infix = new PolishNotation("1*(2+3)");
		
		//find postfix
		System.out.println(infix.infixToPostfix());
		
		//find postfix and evaluate together of infix
		System.out.println(evaluate(infix.infixToPostfix()));
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
		PolishNotation revExp = new PolishNotation(reverse());
		revExp.exp = revExp.infixToPostfix();
		return revExp.reverse();
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
	 * method to check whether a character is numeric
	 */
	public static boolean isNumeric(char ch) {
		if(ch>='0' && ch<='9')
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
	
	public String reverse() {
		//Create an Empty stack of char type
		StackChar stack = new StackChar(exp.length());
		
		//Convert the String exp to char array
		char arr[] = exp.toCharArray();
		
		//push elements of arr[] into the stack
		for(int i=0; i<arr.length; i++)
			stack.push(arr[i]);
		
		//pop each element and assign the popped elements to the same array starting from index zero
		for(int i=0; i<arr.length; i++) {
			if(stack.peek()=='(') {
				arr[i]=')';
				stack.pop();
			}
				
			else if(stack.peek()==')') {
				arr[i]='(';
				stack.pop();
			}
			else
				arr[i]=stack.pop();
		}
			
		
		//Convert the arr back to string representation
		String str1 = String.copyValueOf(arr);
		
		//return the str1
		return str1;
	}
	
	/*
	 * method for postfix expression evaluation
	 */
	public static int evaluate(String str) {
		Stack stack = new Stack(str.length());
		char postfix[]=str.toCharArray();
		for(int i=0; i<postfix.length; i++) {
			if(isNumeric(postfix[i])==true)
				stack.push(postfix[i]-'0');
			else if (isOperator(postfix[i])){
				int num2 = stack.pop();
				int num1 = stack.pop();
				
				switch(postfix[i]) {
				case '+': stack.push(num1+num2); break;
				case '-': stack.push(num1-num2); break;
				case '*': stack.push(num1*num2); break;
				case '/': stack.push(num1/num2); break;
				case '^': stack.push(num1^num2); break;
				}
				
			}
		}
			
		return stack.peek();
	}
}

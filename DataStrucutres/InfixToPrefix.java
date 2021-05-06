package DataStrucutres;

// Java program to convert 
// infix to prefix. 
import java.util.*; 
class GFG 
{ 
// Function to check if 
// given character is 
// an operator or not. 
static boolean isOperator(char c) 
{ 
    return((c=='+')&&(c=='-')&&(c=='*')&&(c=='/')&&(c=='^'));
	// return (!(c >= 'a' && c <= 'z') && 
	// 		!(c >= '0' && c <= '9') && 
	// 		!(c >= 'A' && c <= 'Z')); 
} 

// Function to find priority 
// of given operator. 
static int getPriority(char C) 
{ 
	// if (C == '-' || C == '+') 
	// 	return 1; 
	// else if (C == '*' || C == '/') 
	// 	return 2; 
	// else if (C == '^') 
	// 	return 3; 
    // return 0; 
    switch (C){
        case '+':
        case '-':
            return 1;
        case '*':
        case '/':
            return 2;
        case '^':
            return 3;
    }
    return 0;
} 

// Function that converts infix 
// expression to prefix expression. 
static String infixToPrefix(String infix) 
{ 
	// stack for operators. 
	Stack<Character> operators = new Stack<Character>(); 

	// stack for operands. 
	Stack<String> operands = new Stack<String>(); 

	for (int i = 0; i < infix.length(); i++) 
	{ 

		if (infix.charAt(i) == '(') 
		{ 
			operators.push(infix.charAt(i)); 
		} 

		else if (infix.charAt(i) == ')') 
		{ 
			while (!operators.empty() && 
				operators.peek() != '(') 
				{ 

			
				String op1 = operands.peek(); 
				operands.pop();			
				String op2 = operands.peek(); 
				operands.pop(); 
				char op = operators.peek(); 
				operators.pop();  
				String tmp = op + op2 + op1; 
				operands.push(tmp); 
			}  
			operators.pop(); 
		} 

		else if (isOperator(infix.charAt(i))) 
		{ 
			operands.push(infix.charAt(i) + ""); 
		}  
		else
		{ 
			while (!operators.empty() && 
				getPriority(infix.charAt(i)) <= 
					getPriority(operators.peek())) 
				{ 

				String op1 = operands.peek(); 
				operands.pop(); 

				String op2 = operands.peek(); 
				operands.pop(); 

				char op = operators.peek(); 
				operators.pop(); 

				String tmp = op + op2 + op1; 
				operands.push(tmp); 
			} 

			operators.push(infix.charAt(i)); 
		} 
	} 

	while (!operators.empty()) 
	{ 
		String op1 = operands.peek(); 
		operands.pop(); 

		String op2 = operands.peek(); 
		operands.pop(); 

		char op = operators.peek(); 
		operators.pop(); 

		String tmp = op + op2 + op1; 
		operands.push(tmp); 
	} 

	return operands.peek(); 
} 

// Driver code 
public static void main(String args[]) 
{ 
	//String s = "8+(7-9)*2"; 
	String s="(1)+8";
  System.out.println( infixToPrefix(s)); 
} 
} 


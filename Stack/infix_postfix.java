/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Stack;
/**
 *
 * @author SCION
 * to convert infix to postfix expression
 */
public class infix_postfix {
//  static int Prec(char ch) 
//	{ 
//		switch (ch) 
//		{ 
//		case '+': 
//		case '-': 
//			return 1; 
//	
//		case '*': 
//		case '/': 
//			return 2; 
//	
//		case '^': 
//			return 3; 
//		} 
//		return -1; 
//	} 
//	
//	// The main method that converts given infix expression 
//	// to postfix expression. 
//	static String InfToPostfix(String exp) 
//	{ 
//		// initializing empty String for result 
//		String result =""; 
//		
//		// initializing empty stack 
//		Stack<Character> stack = new Stack<>(); 
//		
//		for (int i = 0; i<exp.length(); ++i) 
//		{ 
//			char c = exp.charAt(i); 
//			
//			// If the scanned character is an operand, add it to output. 
//			if (Character.isLetterOrDigit(c)) 
//				result += c; 
//			
//			// If the scanned character is an '(', push it to the stack. 
//			else if (c == '(') 
//				stack.push(c); 
//			
//			// If the scanned character is an ')', pop and output from the stack 
//			// until an '(' is encountered. 
//			else if (c == ')') 
//			{ 
//				while (!stack.isEmpty() && stack.peek() != '(') {
//					result += stack.pop(); }
//				
//				if (!stack.isEmpty() && stack.peek() != '(') {
//					return "Invalid Expression"; }// invalid expression				 
//                                        else{
//					stack.pop(); }
//			} 
//			else // an operator is encountered 
//			{ 
//				while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){ 
//					if(stack.peek() == '(') 
//						return "Invalid Expression"; 
//                                        else
//					result += stack.pop(); 
//			} 
//				stack.push(c); 
//			} 
//	
//		} 
//	
//		// pop all the operators from the stack 
//		while (!stack.isEmpty()){ 
//			if(stack.peek() == '(') 
//				return "Invalid Expression"; 
//                        else
//			result += stack.pop(); 
//		} 
//		return result; 
//	} 
    
    
    
    static int prec(char c){
        switch(c){
            case '+':
            case '-':return 1;
            
            case '*':
            case '/':return 2;
            
            case '^':return 3;   
        }
        return -1;
    }
    
    static String InfToPostfix(String str){
        String res="";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isLetterOrDigit(c)){
                res=res+c;
            }
            if(c=='('){
                stack.push(c);
                
            }
            else if(c==')'){
                while(!stack.isEmpty()&&stack.peek()!='('){
                    res=res+stack.pop();
                }
                if(!stack.isEmpty()&&stack.peek()!='('){
                    return "invalid express.";
                }
                else{
                    stack.pop();
                }
            }
            else{
                while(!stack.isEmpty()&&prec(c)<=prec(stack.peek())){
                    if(stack.peek()=='(')
                        return "invalid";
                    else
                        
                    res=res+stack.pop();
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
if(stack.peek() == '(') 
				return "Invalid Expression"; 
                        else
			res += stack.pop(); 
		}                   
        return res;
    }
     
    public static void main(String[] args) {
      String s="a+b-m+n";
     String res=   InfToPostfix(s);
        System.out.println(res);
    }
   
}

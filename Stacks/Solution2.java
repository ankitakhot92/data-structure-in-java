import java.util.Stack;
public class Solution {

	public static boolean checkBalanced(String exp) {
		// Write your code here
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<exp.length(); i++){
            if(exp.charAt(i) == '{' || exp.charAt(i) == '[' || exp.charAt(i) == '('){
                
                stack.push(exp.charAt(i));
            }
        	if(exp.charAt(i) == '}' || exp.charAt(i) == ']' || exp.charAt(i) == ')'){
                if(stack.isEmpty() == true){
                    return false;
                }
                
                if(isMatchingPair(stack.pop(), exp.charAt(i)) == false){
                    return false;
                }
            }

	}
        return stack.isEmpty();
}
    public static boolean isMatchingPair(char char1, char char2){
        if(char1 == '{' && char2 == '}'){
            return true;
        }else if(char1 == '[' && char2 == ']'){
            return true;
        }else if(char1 == '(' && char2 == ')'){
            return true;
        }else{
            return false;
        }
    }
}
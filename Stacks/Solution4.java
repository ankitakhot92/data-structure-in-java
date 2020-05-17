import java.util.Stack;

public class Solution {

	
	// Function returns -1 if brackets can't be balanced
	public static int countBracketReversals(String input){
		
		// Write your code here
        
        if(input.length() % 2 != 0){
            return -1;
        }
        
        Stack<Character> s = new Stack<>();
        
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == '{'){
                s.push(input.charAt(i));
            }else if(input.charAt(i) == '}' && s.size() != 0 && s.peek() == '{'){
                s.pop();
            }else if(input.charAt(i) == '}' && s.size() == 0){
                s.push(input.charAt(i));
            }else if(input.charAt(i) == '}' && s.size() != 0 && s.peek() == '}'){
                s.push(input.charAt(i));
            }
        }
        int count = 0;
        while(s.size() != 0){
            char c1 = s.pop();
            char c2 = s.pop();
            
            if(c1 == c2){
                count++;
            }else{
                count = count + 2;
            }
        }
	return count;
	}
	
	

}

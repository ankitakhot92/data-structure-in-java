import java.util.Stack;

public class solution {
	
	public static boolean checkRedundantBrackets(String input) {
		// Write your code here
        Stack<Character> s = new Stack<>();
        int count;
        for(int i=0; i<input.length(); ){
            count = 0;
            int j = i;
            while (input.charAt(i) != ')'){
                s.push(input.charAt(i));
                i++;
            }
            while(s.peek() != '('){
                    count++;
                    s.pop();
                }
                if(count == 0){
                    return true;
                }else{
                    s.pop();
                }
            i = i + count + 2;
            }
            return false;
        }
        

	}

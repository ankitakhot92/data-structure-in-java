import java.util.Stack;

public class Solution {

	public static int[] stockSpan(int[] price) {
		// Write your code here
        
        Stack<Integer> s = new Stack<>();
        int[] span = new int[price.length];
        
        for(int i=0; i<price.length; i++){
            
            if(i == 0){
                span[i] = 1;
                s.push(i);
            }else{
                // int j = i;
                if(s.size() != 0){
                   while(price[i] > price[s.peek()]){
                    s.pop();
                    if(s.size() == 0){
                        break;
                    }
                } 
                }
                
                if(s.size() == 0){
                    span[i] = i+1;
                    s.push(i);
                }else{
                    span[i] = i - s.peek();
                    s.push(i);
                }
            }
            
        }
        return span;
    }
        
        
        

	
}
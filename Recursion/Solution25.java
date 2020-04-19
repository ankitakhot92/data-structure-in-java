public class solution {

	// Return a string array that contains all the possible strings
	public static String[] keypad(int n){
		// Write your code here
     
        if(n%10 == 0 || n%10 == 1){
            String ans[] = {""};
            return ans;
        }
        
        String smallAns[] = keypad(n/10);
        
        String append[] = helper(n%10);
    
        String ans[] = new String[append.length*smallAns.length];
        
                
        int k = 0;
        
        for(int i=0; i<append.length; i++){
            for(int j=0; j<smallAns.length; j++){
                ans[k] = smallAns[j] + append[i];
                k++;
            }
        }
        return ans;
	}
    private static String[] helper(int n){

        if(n == 2){
            String arr[] = {"a","b","c"};
            return arr;
        }else if(n == 3){
            String arr[] = {"d","e","f"};
            return arr;
        }else if(n == 4){
            String arr[] = {"g","h","i"};
            return arr;
        }else if(n == 5){
            String arr[] = {"j","k","l"};
            return arr;
        }else if(n == 6){
            String arr[] = {"m","n","o"};
            return arr;
        }else if(n == 7){
            String arr[] = {"p","q","r","s"};
            return arr;
        }else if(n == 8){
            String arr[] = {"t","u","v"};
            return arr;
        }else{
            String arr[] = {"w","x","y","z"};
            return arr;
        }           
        
        
    }
	
}

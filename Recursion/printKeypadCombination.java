public class solution {

	public static void printKeypad(int input){
		// Write your code here
        printKeypad(input, "");
		
	}
    public static void printKeypad(int input, String outputSoFar){
        if(input == 0){
            System.out.println(outputSoFar);
            return;
        }
        // String append[] = {""};
        // append = helper(input%10);
        String append[] = helper(input%10);
        
        
        for(int i=0; i<append.length; i++){
            printKeypad(input/10, append[i] + outputSoFar);
        }
        // printKeypad(input/10, outputSoFar + "a");
        // printKeypad(input/10, outputSoFar + "b");
        // printKeypad(input/10, outputSoFar + "c");
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

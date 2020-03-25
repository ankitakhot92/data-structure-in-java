public class solution {

	// Return the changed string
	public static String removeX(String input){
		// Write your code here
        
        return removeX(input, 0);

	}
    private static String removeX(String input, int startIndex){
        if(startIndex == input.length()){
            return "";
        }
        if(input.charAt(startIndex) == 'x'){
            return removeX(input, startIndex+1);
        }else{
            return input.charAt(startIndex) + removeX(input, startIndex+1);
        }
    }
}
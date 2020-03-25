public class solution {

	// Return the changed string
	public static String replace(String input){
		// Write your code here
        
        return replace(input, 0, 1);

	}
    //String smallAns;
    private static String replace(String input, int startIndex, int endIndex){
        if(startIndex == input.length()-1){
            return input.substring(startIndex, endIndex);
        }else if(startIndex > input.length()-1){
            return "";
        }
        if(input.charAt(startIndex) == 'p' && input.charAt(endIndex) == 'i'){
            //String smallAns = "3.14";
            return "3.14" + replace(input, startIndex+2, endIndex+2);
        }else{
           // String smallAns = (String)(input.charAt(startIndex)) + (String)(input.charAt(endIndex));
            //String smallAns = input.substring(startIndex, endIndex+1);
            return input.substring(startIndex, endIndex) + replace(input, startIndex+1, endIndex+1);
        }
        
       // return smallAns + replace(input, startIndex+1, endIndex+1);
    }
}
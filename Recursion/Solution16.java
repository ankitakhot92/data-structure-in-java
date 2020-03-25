
public class solution {

	// Return the updated string
	public static String addStars(String s) {
		// Write your code here
        
        return addStars(s, 0, 1);

	}
    private static String addStars(String s, int startIndex, int endIndex){
        if(startIndex == s.length()-1){
            return s.substring(startIndex, endIndex);
        }else if(startIndex > s.length()-1){
            return "";
        }
        if(s.charAt(startIndex) == s.charAt(endIndex)){
            return s.substring(startIndex,startIndex+1) + "*" + addStars(s, startIndex+1, endIndex+1);
        }else{
            return s.substring(startIndex, startIndex+1) + addStars(s, startIndex+1, endIndex+1);
        }
    }
}
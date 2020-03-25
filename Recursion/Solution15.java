import java.lang.Math;
public class solution {

	public static int convertStringToInt(String input){
		// Write your code here
        
        return convertStringToInt(input, 0);
        

	}
    private static int convertStringToInt(String input, int startIndex){
        if(startIndex == input.length()-1){
            return (int)(input.charAt(startIndex)) - 48;
        }
        int multiply = (int)Math.pow(10,input.length() - 1 - startIndex);
        //System.out.println((int)(input.charAt(0)));
        return ((int)(input.charAt(startIndex)) - 48 )* multiply + convertStringToInt(input, startIndex+1);
        
    }
}
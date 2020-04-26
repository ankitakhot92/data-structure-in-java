public class Solution {
	public static boolean checkSequence(String a, String b) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        return checkSequence(a, b, 0, 0, "");

	}
    public static boolean checkSequence(String a, String b, int sI1, int sI2, String outputSoFar){
        if(sI1 >= a.length() || sI2 >= b.length()){
            return outputSoFar.equals(b);
        }
        if(a.charAt(sI1) == b.charAt(sI2)){
            outputSoFar += b.substring(sI2,sI2+1);
            sI1++;
        	sI2++;
        }else{
            sI1++;
        }
        
        return checkSequence(a, b, sI1, sI2, outputSoFar);
    }
}
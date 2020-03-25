public class Solution {

	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        return lastIndex(input, input.length-1, x);
    }
            
        private static int lastIndex(int input[], int endIndex, int x){
            if(input[endIndex] == x){
                return endIndex;
            }
            if(endIndex == 0){
                return -1;
            }
            return lastIndex(input, endIndex-1, x);
        }
		
	
	
}
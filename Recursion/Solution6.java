public class Solution {

	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        return firstIndex(input, 0, x);
    }
            
        private static int firstIndex(int input[], int startIndex, int x){
            if(input[startIndex] == x){
                return startIndex;
            }
            if(startIndex == input.length-1){
                    return -1;
            }
            return firstIndex(input, startIndex+1, x);
        }
		
	
	
}
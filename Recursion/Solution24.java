
public class Solution {

	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        return allIndexes(input, 0, input.length-1, x);
		
	}
    private static int[] allIndexes(int input[], int startIndex,int endIndex, int x){
        if(startIndex > endIndex){
            int arr[] = {};
            return arr;
        }
        int smallAns[] = allIndexes(input, startIndex, endIndex-1, x);
        
        if(input[endIndex] == x){
            int ans[] = new int[smallAns.length + 1];
            for(int i=0; i<smallAns.length; i++){
                ans[i] = smallAns[i];
            }
            ans[smallAns.length] = endIndex;
            return ans;
        }else{
            return smallAns;
        }
    }
	
}
public class Solution {
	
		
     public static int staircase(int n){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */
        if(n == 0){
            return 1;
        }else if(n < 0){
            return 0;
        }

         int ans = 0;
         ans = ans + staircase(n-1);
         ans = ans + staircase(n-2);
         ans = ans + staircase(n-3);
         
         return ans;
	}
	
}
public class DuplicateInArray{	

	public static int duplicate(int[] arr){  
		/* Your class should be named DuplicateInArray
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        int n = arr.length;
        int sum1 = ((n-2) * (n-1))/2;
        
        int ans = sum - sum1;
        return ans;

	}
}
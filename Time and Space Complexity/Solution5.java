
public class Solution {

    public static int arrayRotateCheck(int[] arr){
        //Your code goes here
        int ans = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] > arr[i]){
                ans = i;
                break;
            }
        }
		return ans;
    }

}
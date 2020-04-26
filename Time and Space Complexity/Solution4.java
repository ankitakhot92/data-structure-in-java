public class Solution {  

    public static void rotate(int[] arr, int d) {
        //Your code goes here
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, arr.length-1-d);
        reverse(arr, arr.length-d, arr.length-1);
                
    }
    public static void reverse(int[] arr, int sI, int eI){
        if(sI > eI){
            return;
        }
        int temp = arr[sI];
        arr[sI] = arr[eI];
        arr[eI] = temp;
        reverse(arr, sI+1, eI-1);
    }
}
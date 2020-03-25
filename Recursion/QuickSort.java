
public class Solution {
	
	public static void quickSort(int[] input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
        quickSort(input, 0, input.length-1);
		
	}
    private static void quickSort(int[] input, int sI, int eI){
        if(sI >= eI){
            return;
        }
        int pivotPos = partition(input, sI, eI);
        quickSort(input, sI, pivotPos - 1);
        quickSort(input, pivotPos + 1, eI);
    }
    private static int partition(int[] input, int sI, int eI){
        int pivot = input[sI];
        int count = 0;
        for(int i=sI+1; i<=eI; i++){
            if(pivot >= input[i]){
                count++;
            }
        }
        int pivotPos = sI + count;
        int temp = input[sI];
        input[sI] = input[sI + count];
        input[sI + count] = temp;
        
        int i = sI;
        int j = eI;
        while(i < pivotPos && j > pivotPos){
            if(input[i] > pivot){
                if(input[j] <= pivot){
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }else{
                    j--;
                }
            }else{
                i++;
            }
        }
        
       return pivotPos; 
        
        
        
    }
	
}
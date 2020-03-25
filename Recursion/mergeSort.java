public class solution {

	public static void mergeSort(int[] input){
		// Write your code here
        mergeSort(input, 0, input.length-1);
		
	}
    private static void mergeSort(int[] input, int sI, int eI){
        if(sI >= eI){
            return;
        }
        int mid = (sI + eI)/2;
        mergeSort(input, sI, mid);
        mergeSort(input, mid+1, eI);
        merge(input, sI, eI);
    }
    private static void merge(int input[], int sI, int eI){
        int mid = (sI + eI)/2;
        int ans[] = new int[eI - sI +1];
        int i = sI;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= eI){
            if(input[i] < input[j]){
                ans[k] = input[i];
                i++;
                k++;
            }else{
                ans[k] = input[j];
                j++;
                k++;
            }
        }
        while(i <= mid){
            ans[k] = input[i];
            i++;
            k++;
        }
        while(j <= eI){
            ans[k] = input[j];
            j++;
            k++;
        }
        //copy elements from ans to input
        for(int index=0; index<ans.length; index++){
            input[sI + index] = ans[index];
        }
    }
    
}

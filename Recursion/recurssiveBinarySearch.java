public class solution {

	// element - number to be searched
	public static int binarySearch(int input[], int element) {
		// Write your code here
        return binarySearch(input, 0 , input.length-1, element);

	}
    private static int binarySearch(int input[], int sI, int eI, int element){

        if(sI > eI){
            return -1;
        }else{
            int mid = (sI + eI)/2;
            if(input[mid] == element){
                return mid;
            }else if(element > input[mid]){
                return binarySearch(input, mid+1, eI, element);
            }else{
                return binarySearch(input, sI, mid-1, element);
            }
        }
        
    }
}
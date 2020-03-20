package recursion;

public class CheckSortedBetter {
	
	public static boolean checkSortedBetter(int input[], int startIndex) {
		if(startIndex == input.length-1) {
			return true;
		}
		
		if(input[startIndex] > input[startIndex+1]) {
			return false;
		}
		
		boolean smallAns = checkSortedBetter(input, startIndex+1);
		return smallAns;
	}
	
	public static void main(String[]args) {
		int arr[] = {2,2,3,4};
		System.out.println(checkSortedBetter(arr, 0));
	}
	

}
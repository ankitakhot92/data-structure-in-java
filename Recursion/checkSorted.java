package recursion;

public class CheckSorted {
	
	public static boolean checkSorted(int input[]) {
		if(input.length <= 1) {
			return true;
		}
		if(input[0] > input[1]) {
			return false;
		}
		int smallInput[] = new int[input.length-1];
		for(int i=1; i<input.length; i++) {
			smallInput[i-1] = input[i];
		}
		boolean smallAns = checkSorted(smallInput);
		return smallAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,2,3,4,5};
		System.out.println(checkSorted(arr));

	}

}
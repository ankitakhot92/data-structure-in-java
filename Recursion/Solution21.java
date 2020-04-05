public class solution {
	public static void printSubsets(int input[]) {
		// Write your code here
        printSubsets(input, 0, input.length-1, "");

	}
    public static void printSubsets(int input[], int sI, int eI, String outputSoFar){
        if(sI > eI){
            System.out.println(outputSoFar);
            return;
        }
        printSubsets(input, sI+1, eI, outputSoFar);
        
        printSubsets(input, sI+1, eI, outputSoFar + input[sI] + ' ');
    }
}
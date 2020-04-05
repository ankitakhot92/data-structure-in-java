public class solution {

	public static void permutations(String input){
		// Write your code here
        permutations(input, "");

	}
    private static void permutations(String input, String ans){
        if(input.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);                
            String ros = input.substring(0,i) + input.substring(i+1);
            permutations(ros, ans+ch);
        }
    }
}
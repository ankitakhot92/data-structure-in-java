public class solution {
	
	public static String[] permutationOfString(String input){
				
		if(input.length() <= 1) {
			String ans[] = new String[1];
			ans[0] = input.substring(0);
			return ans;
		}
		String smallAns[] = permutationOfString(input.substring(1));

		String ans[] = new String[(smallAns[0].length() + 1) * smallAns.length];
        int count = 0;
		
		for(int j=0; j<smallAns.length; j++) {
			for(int i=0; i<(smallAns[0].length() + 1); i++) {
				String ini = smallAns[j].substring(0,i);
	            String ch = input.substring(0,1);
	            String fin = smallAns[j].substring(i);
	            ans[count] = ini + ch + fin;
                count++;
			}
		}
		return ans;
	}
	
}
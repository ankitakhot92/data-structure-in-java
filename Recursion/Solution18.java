public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
        if(s.length() == 0 || s.length() == 1){
            return s;
        }
        String ans = "";
        String smallAns = "";
        int count = 0;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(0) == s.charAt(i)){
                count++;
            }else{
                break;
            }
        }
        if(s.charAt(0) == s.charAt(1)){
            ans = ans + s.charAt(0);
            smallAns = smallAns + removeConsecutiveDuplicates(s.substring(count+1));
            
        }else{
            ans = ans + s.substring(0,1);
            smallAns = smallAns + removeConsecutiveDuplicates(s.substring(1));
        }
        return ans + smallAns;

	}

}
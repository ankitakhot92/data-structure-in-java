import java.util.Arrays;
public class solution {

	public static int maximumProfit(int budget[]) {
		// Write your code here
        int ans = 0;
        Arrays.sort(budget);
        for(int i=0; i<budget.length; i++){
            int ans1 = budget[i] * (budget.length-i);
            if(ans1 > ans){
                ans = ans1;
            }
        }
        return ans;

	}

}
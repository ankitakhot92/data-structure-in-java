
public class solution {

	public static int countZerosRec(int input){
		// Write your code here
        int smallAns;
        if(input == 0){
            return 0;
        }
        
        if(input%10 == 0){
            smallAns = 1;
        }else{
            smallAns = 0;
        }
        
        return smallAns + countZerosRec(input/10);
	}
}
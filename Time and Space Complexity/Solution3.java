import java.util.Arrays;
public class Intersection{
	
	public static void intersection(int[] arr1, int[] arr2){
		/* Your class should be named Intersection
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
	 	 * Taking input is handled automatically.
  		 */
        // int[] arr1Sorted = mergeSort(arr1);
        // int[] arr2Sorted = mergeSort(arr2);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.println(arr1[i]);
                i++;
                j++;
            }else{
                if(arr1[i] < arr2[j]){
                    i++;
                }else{
                    j++;
                }
            }
        }

	}
    

}
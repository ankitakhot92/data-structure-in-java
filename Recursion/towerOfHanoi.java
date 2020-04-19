public class solution {

	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		// Write your code here
        char a = source;
        char b = auxiliary;
        char c = destination;
        
        // if(disks == 2){
        //     System.out.println(source + " " + auxiliary);
        //     System.out.println(source + " " + destination);
        //     System.out.println(auxiliary + " " + destination);
        // }
        if(disks <= 0){
            return;
        }
        if(disks == 1){
            System.out.println(source + " " + destination);
            return;
        }
        towerOfHanoi(disks-1, a, c, b);
        System.out.println(source + " " + destination);
        towerOfHanoi(disks-1, b, a, c);

	}
}
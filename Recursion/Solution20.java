public class solution {

	public static void printAllPossibleCodes(String input) {
		// Write your code here
        printAllPossibleCodes(input, "");
		
	}
    public static void printAllPossibleCodes(String input, String outputSoFar){
        if(input.length() == 0){
            System.out.println(outputSoFar);
            return;
        }
        if(helper(input.substring(0,1)) != ""){
            printAllPossibleCodes(input.substring(1), outputSoFar + helper(input.substring(0,1)));
         }
        
        
        if(input.length() >=2 && helper(input.substring(0,2)) != "") {
        	printAllPossibleCodes(input.substring(2), outputSoFar + helper(input.substring(0,2)));
        }
    }
    private static String helper(String n){

        if(n.contentEquals("1")){
            return "a";
        }else if(n.equals("2")){
            return "b";
        }else if(n.contentEquals("3")){
            return "c";
        }else if(n.equals("4")){
            return "d";
        }else if(n.equals("5")){
            return "e";
        }else if(n.equals("6")){
            return "f";
        }else if(n.equals("7")){
            return "g";
        }else if(n.equals("8")){
            return "h";
        }else if(n.equals("9")){
            return "i";
        }else if(n.equals("10")){
            return "j";
        }else if(n.equals("11")){
            return "k";
        }else if(n.equals("12")){
            return "l";
        }else if(n.equals("13")){
            return "m";
        }else if(n.equals("14")){
            return "n";
        }else if(n.equals("15")){
            return "o";
        }else if(n.equals("16")){
            return "p";
        }else if(n.equals("17")){
            return "q";
        }else if(n.equals("18")){
            return "r";
        }else if(n.equals("19")){
            return "s";
        }else if(n.equals("20")){
            return "t";
        }else if(n.equals("21")){
            return "u";
        }else if(n.equals("22")){
            return "v";
        }else if(n.equals("23")){
            return "w";
        }else if(n.equals("24")){
            return "x";
        }else if(n.equals("25")){
            return "y";
        }else if(n.equals("26")){
            return "z";
        }else{
            return "";
        }
    }
}
    
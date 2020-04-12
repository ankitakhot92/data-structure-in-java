
/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/

// Main used internally is shown here just for your reference.
/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
  */


public class Polynomial {
    
    private int degree;
    private int coeff;
    private int arr[];
    private int nextIndex;
    
    public Polynomial(){
        arr = new int[1];
        nextIndex = 0;
    }

	
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
	public void setCoefficient(int degree, int coeff){
        this.degree = degree;
		this.coeff = coeff;
        if(degree >= nextIndex){
        	restructure();
        }
        arr[degree] = coeff;
        nextIndex = arr.length;		
	}
    
    public void setCoefficient1(int degree, int coeff){
        this.degree = degree;
		this.coeff = coeff;
        if(degree >= nextIndex){
        	restructure();
        }
        arr[degree] = arr[degree] + coeff;
        nextIndex = arr.length;		
	}
    
    private void restructure() {
		int[] temp = arr;
		arr = new int[degree+1];
		for(int i=0; i<temp.length; i++) {
			arr[i] = temp[i];
		}
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
	
        for(int i=0; i<this.arr.length; i++){
            if(arr[i] != 0){
                System.out.print(this.arr[i] + "x" + i + " ");
            }
        }
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
        
        Polynomial q = new Polynomial();
	
        if(this.arr.length >= p.arr.length){
            for(int i=0; i<p.arr.length; i++){
                int coeff = this.arr[i] + p.arr[i];
                int degree = i;
                q.setCoefficient(degree, coeff);
            }
            for(int i=p.arr.length; i<this.arr.length; i++) {
            	int coeff = this.arr[i];
            	int degree = i;
            	q.setCoefficient(degree, coeff);
            }
        }else{
            for(int i=0; i<this.arr.length; i++){
                int coeff = this.arr[i] + p.arr[i];
                int degree = i;
                q.setCoefficient(degree, coeff);
            }
            for(int i=this.arr.length; i<p.arr.length; i++) {
            	int coeff = p.arr[i];
            	int degree = i;
            	q.setCoefficient(degree, coeff);
            }
                
        }
        //System.out.println(p.arr[2]);
            return q;
    }
		
	
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
        
         Polynomial r = new Polynomial();
        
        if(this.arr.length >= p.arr.length){
            for(int i=0; i<p.arr.length; i++){
                int coeff = this.arr[i] - p.arr[i];
                int degree = i;
                r.setCoefficient(degree, coeff);
            }
            for(int i=p.arr.length; i<this.arr.length; i++) {
            	int coeff = this.arr[i];
            	int degree = i;
            	r.setCoefficient(degree, coeff);
            }
        }else{
            for(int i=0; i<this.arr.length; i++){
                int coeff = this.arr[i] - p.arr[i];
                int degree = i;
                r.setCoefficient(degree, coeff);
        	}
            for(int i=this.arr.length; i<p.arr.length; i++) {
            	int coeff = p.arr[i] * -1;
            	int degree = i;
            	r.setCoefficient(degree, coeff);
            }
                
        }
        return r;
	}
	
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
        
        Polynomial s = new Polynomial();
        
		for(int i=0; i<this.arr.length; i++){
            for(int j=0; j<p.arr.length; j++){
                degree = i + j;
                coeff = this.arr[i] * p.arr[j];
                s.setCoefficient1(degree, coeff);
            }
        }
        return s;
	}
    	

}


public class Pattern_2 {
	
	public void pattern(int n) {
		 // outer loop to handle number of rows 
        //  n in this case 
        for (int i=0; i<n; i++) 
        { 
  
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            for (int j=n-i; j>1; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
   
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for (int k=0; k<=i; k++ ) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
   
            // ending line after each row 
            System.out.println(); 
        } 
	}
	
	public static void main(String[] args) {
		Pattern_2 a = new Pattern_2();
		int n = 5;
		a.pattern(n);

	}

}

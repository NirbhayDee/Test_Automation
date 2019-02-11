
/*
	    * 
	   * * 
	  * * * 
	 * * * * 
	* * * * * 
	
*/

public class Pattern_3 {
	
	public void Triange(int n) {
		
		//To row
		for (int i=0; i<n; i++)
		{
			// To space
			for (int j=n-i; j>1; j--)
			{
				System.out.print(" ");
			}	
			
			for(int k=0; k<=i; k++)
			{
					System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
	
	

	public static void main(String[] args) {
		Pattern_3 p = new Pattern_3();
		int n = 5;
		p.Triange(n);
				
		
	}

}

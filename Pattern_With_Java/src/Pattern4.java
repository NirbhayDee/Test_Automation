 
/*
		*
      * * 
    * * * 
  * * * * 
* * * * *
*/
public class Pattern4 {
	
	public void Samkon_Triangle(int n) {
	
		//To Rows
		for (int  i=0; i<n;  i++)
		{
			//To Space
			for (int j=n-i; j>1; j--)
			{
				System.out.print(" ");
			}
			// Columns	
			for(int k=0; k<=i; k++)
			{
						System.out.print("*");		
			}
			System.out.println();	
		}
		
	}

	
	

	public static void main(String[] args) {
		Pattern4 S_T = new Pattern4();
		int n = 5;
		S_T.Samkon_Triangle(5);
		
	}

}

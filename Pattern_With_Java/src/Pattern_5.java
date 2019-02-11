/*
        
		*
      * * * 
    * * * * *
  * * * * * * *
* * * * * * * * *


*/

public class Pattern_5 {
	
	public void Pramid(int n) {
		
		//To Rows
		for (int i=1;i<=n;i++)
		{
			//To space
			for (int j=n; j>i; j--)
			{
				System.out.print(" ");
			}
			//Colums
			for (int k=1; k<(i*2); k++)
			{
				System.out.print("*");
			}System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Pattern_5 p = new Pattern_5();
		p.Pramid(5);
		

	}

}

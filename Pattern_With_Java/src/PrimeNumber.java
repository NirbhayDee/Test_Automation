import java.util.Scanner;

public class PrimeNumber {
	

	public static void main(String[] args) {
		
		System.out.println("Enter Number");
		
		Scanner Read =  new Scanner (System.in);
		
		 int number = Read.nextInt();
		 
		 for (int i = 2; i < number; i++) {
	
			if  (number%i==0)
				
				System.out.print("");
				
			else {
				
				 System.out.print(" "+i);
			}
	
		}
			 
	}
}


	



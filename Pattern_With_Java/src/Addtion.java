import java.util.Scanner;

public class Addtion {

	public static void main(String[] args) {
		
		int Total;
		
		System.out.println("Enter two number ");
		
		Scanner Read = new Scanner (System.in); 
		
		 int First = Read.nextInt();
		 
		 int Second = Read.nextInt();

		 Total = First + Second;
		 
		 System.out.println("Total="+Total);
		
	}

}

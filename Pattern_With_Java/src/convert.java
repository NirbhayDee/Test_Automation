import java.util.Scanner;

public class convert {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Tow number");
		
		String First_Number = scan.nextLine();
		String Second_Number = scan.nextLine();
		
		//int Add;
		
		try {
			
		int F_N = Integer.valueOf(First_Number);
		
		int S_C = Integer.valueOf(Second_Number);
		
		int Add = (F_N+S_C);
		
			System.out.println(Add);
		}
		
		catch (Exception e) {
			
			System.out.println(e+ "Something wrong");
		
		}
	}

}
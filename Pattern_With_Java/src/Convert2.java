import java.util.Scanner;

public class Convert2 {
	
	public void Input() {
		
		Scanner scan  = new Scanner (System.in);
		
		System.out.println("Enter First Number");
		
		String F_S = scan.nextLine();
		
		System.out.println("Enter Second Number");
		
		String S_S=scan.nextLine();		
		
		int F_N = Integer.valueOf(F_S);
		
		int S_N = Integer.valueOf(S_S);
		
		int Mul = F_N*S_N;
		 
		//System.out.println("Multiply="+Mul);
		
		String S_M = String.valueOf(Mul);
		
		System.out.println(S_M);
	
	}
	
	

	public static void main(String[] args) {
		
		Convert2 obj =  new Convert2();
		obj.Input();
		
	}

}

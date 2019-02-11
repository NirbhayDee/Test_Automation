import java.util.Scanner;

public class Casting {
	
	public void StringToInt() {
		
		System.out.println("Enter the String");
		
		Scanner sca = new Scanner(System.in);
		
		String str = sca.nextLine();
		
		int Change = Integer.valueOf(str);
		
		System.out.println(Change);
			
	}

	public  void StringToFloat() {
		
		System.out.println("Enter the String");
		
		Scanner sca = new Scanner (System.in);
		
		 String str =  sca.nextLine();
		 
		float Change  = Float.valueOf(str);
		
		System.out.println(Change);
	}
	

	public static void main(String[] args) {
		
		Casting Cas = new Casting();
		
		Cas.StringToInt();
		
		Cas.StringToFloat();
		

	}

}

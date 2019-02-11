
public class Reverse_String {

	public static void main(String[] args) {
		
		String input = "Nirbhay";
	
		StringBuilder input1  = new StringBuilder();
		
		input1.append(input);
		
		System.out.println(input1.reverse());
		
		 char [] try1 =  input.toCharArray();
		 for (int i = try1.length-1; i>=0;  i--) {
			 System.out.print(try1[i]); 
		 }
	}

	   
	
}

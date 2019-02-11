package core.comcept;

public class Methods {

	public static void add (int a, int b) {

		int c =a+b;	
		
	System.out.println(c);

	}
	
	public static int Mul (int a, int b) {
	
		int z  = (a*b);
		
		return z;
	}

	public static int Div (int x , int y) {
		
		return x/y;
	
	}
	
		public static void main(String[] args) {
		
		Methods.add(3, 5);//Static Methods call directly , (class name. methods name)
		
		int z = Mul(3, 10);
		
		System.out.println(z);
	
		int A; 
		A = Div(4,2);
		System.out.println(A);
		}
	
}

//Reverse a number 

public class Reverse_number {

	public static void main(String[] args) {
		
		Reverse_number result = new Reverse_number();
		result.Reverse(1289);
		
		int n = 1352;
		int Rev_num =  0;
		
		while (n>0) {
			
			Rev_num = Rev_num * 10;
			
			Rev_num =  Rev_num + n%10;
			
			n =  n/ 10;
			
		}
		
		System.out.println(Rev_num);
			
	}

	public int Reverse(int num) {
		
		int Rev_Num = 0;
		
		while (num>0) {
			
			Rev_Num = Rev_Num * 10;
			Rev_Num =  Rev_Num +  num%10;
			num = num/10;
			
		}
		
		System.out.println(Rev_Num);
		return Rev_Num;
		
	}
}

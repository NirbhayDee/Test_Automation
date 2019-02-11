package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		List<String> A_l = new ArrayList<>();

		A_l.add("Ramu Bhaiya");
		A_l.add("Syamu Bhaiya");
		System.out.println(A_l);
		
		Iterator<String> itr= A_l.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
		
		
		}  
}
		  

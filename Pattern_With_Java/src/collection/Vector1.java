package collection;

import java.util.List;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
	
		List <String> Str = new Vector <>();
		Str.add("Nir");
		Str.add("Deep");
		Str.add("Trigunayat");
		Str.add("Ayush");
		
		for (String s:Str) {
			System.out.println(s);
		}	
	}

}

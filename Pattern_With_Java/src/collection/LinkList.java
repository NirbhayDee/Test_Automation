package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkList {

	public static void main(String[] args) {
		
		List <String> L_l = new LinkedList<>();
		L_l.add("Nirbhay Deep");
		L_l.add("Nirbhay Deep");
		L_l.add("Nishu");
		L_l.add("Abnish");
		L_l.remove("Nishu");
//		Iterator <String> Itr = L_l.iterator();
		for (String s:L_l)
		System.out.println(s);
		
		
		
		
		
	}

}

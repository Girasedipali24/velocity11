package Collection_List;

import java.util.HashSet;

public class HashSet2 {
	public static void main(String [] args ) {
		HashSet HS = new HashSet();
		
		HS.add(2);
		HS.add(22);
		HS.add(23);
		HS.add(24);
		HS.add(25);
		HS.add(26);
		HS.add(27);
		HS.add(28);
		HS.add(99);
		HS.add(99);
		
		
		HashSet HS3 = new HashSet();
		HS3.add(39);
		HS3.add(59);
		HS3.add(69);
		HS3.add(89);
		HS3.add(99);
		HS3.add(79);
		HS3.add(89);
		HS3.add(29);
		
		
		System.out.println(HS);
	  System.out.println(HS3);
		
		 HS.addAll(HS3);//only display unique element
		System.out.println(HS);
		
		//Retainall// ONLY COMMON WILL DIPLAYED
		HS.retainAll(HS3);
		System.out.println(HS);
		
		System.out.println(HS.containsAll(HS3));
		
		HS.removeAll(HS3);
		System.out.println(HS);
		
		
		
		
	}

}

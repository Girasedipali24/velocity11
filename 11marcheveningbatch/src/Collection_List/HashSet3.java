package Collection_List;

import java.util.HashSet;

public class HashSet3 {
	
	public static void main(String [] args) {
		
		HashSet<String>HS2 = new HashSet<String>();
		

		HS2.add("Rohit");
		HS2.add("rahul");
		HS2.add("demo");
		HS2.add("mohit");
		
		System.out.println(HS2);
		
		HashSet<String>HS3 = new HashSet <String>();
		
		HS3.addAll(HS2);
		System.out.println(HS3);
		
		
		HS3.removeAll(HS2);
		System.out.println(HS3);
		
		
		
		
		
		
	}

}

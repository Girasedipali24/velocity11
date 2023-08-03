package Collection_List;

import java.util.LinkedHashSet;

public class Linkedhashset1 {
	
	public static void main(String [] args) {
		LinkedHashSet LHS = new LinkedHashSet();
		LinkedHashSet<Integer> LHS1 =new LinkedHashSet<Integer>();
		//same method are present which is present i hashset  class
		//Default capacity and LF = 16 &0.75
		//duplicate element are not allowed 
		//insertion order is preseved.
		
		LHS.add(200);
		LHS.add(299);
		LHS.add('D');
		LHS.add("WELCOME");
		LHS.add(null);
		LHS.add(null);
		
		System.out.println(LHS);
		
		System.out.println(LHS.add(200));
		System.out.println(LHS.add(400));
		System.out.println(LHS);
	}

}

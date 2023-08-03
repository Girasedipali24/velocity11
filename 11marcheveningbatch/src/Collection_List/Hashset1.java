package Collection_List;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {
	
	public static void main(String [] args) {
		
		HashSet HS = new HashSet();
		
		HashSet HS1 = new HashSet(200,(float)0.50);
		
		HashSet<String>HS2 = new HashSet<String>(); //homo 
		
		HS.add(22);
		HS.add("Test");
		HS.add(12.6);
		HS.add('D');
		HS.add(true);
		HS.add(null);
		HS.add(null);
		
		System.out.println(HS);
		
		System.out.println(HS.add('h'));
		System.out.println(HS.add('D'));
		
		System.out.println(HS.size());
	// if u try to add duplicate then it will return false 
	// if the element is not present in hashset that time it will show return true
		
	//Remove 
		HS.remove('D');
		System.out.println(HS);
		
	//set and get not present in hashset 
		System.out.println(HS.isEmpty());
		System.out.println(HS1.isEmpty());
		
		//contains 
		System.out.println("******");
		System.out.println(HS.contains('j'));
		
		System.out.println();
		for(Object obj : HS) {
			System.out.println(obj);
	
		}
		
		System.out.println();
			Iterator it = HS.iterator();
			while(it.hasNext()) {
				System.out.println(it.hasNext());
				
			}
		
		
		
		
		
	}

}

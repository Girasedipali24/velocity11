package Collection_List;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {
	
	public static void main(String [] args) {
		
		Vector vc = new Vector();  // hetero
		
		//insert the element 
		vc.add("Test");
		vc.add(3);
		vc.add(4);
		vc.add('F');
		vc.add(true);
		vc.add(44);
		
		System.out.println(vc);
		
		System.out.println(vc.size());
		
		//Remove 
		vc.remove(4);
		System.out.println(vc);
		
		//update
		vc.set(1, 22);
		System.out.println(vc);
		
		vc.add(3,"we");
		System.out.println(vc);
		
		System.out.println("Reading the element using for loop");
		
		for (int i = 0; i<vc.size();i++) {
			System.out.println(vc.get(i));
		}
		System.out.println("Reading the element using each loop");
		
		for (Object obj : vc) {
			System.out.println(obj);
		}
		 System.out.println("Reading the element using iterator");
		 
		 Iterator it = vc.iterator() ;
		 
		 while (it.hasNext()) {
			 System.out.println(it.next());
			 
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

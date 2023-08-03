
package Collection_List;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {
	
	public static void main (String [] args) {
		LinkedList LL =new LinkedList();
		
		LinkedList<String>LL1 = new LinkedList<String>();
		
		LL1.add("dipali");
		LL1.add("soap");
		LL1.add(2, "dipali");
		LL1.addAll(LL1);
		
		LL.add(234);
		LL.add(true);
		LL.add('q');
		LL.addFirst("welcome");
		
		LL.add(null);
		LL.add(null);
		LL.add(true);


		
		System.out.println(LL);
		System.out.println();
		System.out.println(LL1);
		System.out.println(LL.size());
		System.out.println(LL1.size());
		
		System.out.println(LL.remove("dipali"));
		System.out.println(LL);
		
		LL.add(400);
		LL.add(3,"JAVA");
		System.out.println(LL);
		
		//get --Return the element at the specified position 
		System.out.println(LL.get(3));
		System.out.println(LL1.get(4));
		System.out.println(LL.getFirst());
		System.out.println(LL.getLast());
		System.out.println(LL.getClass());
		
	//	System.out.println(LL.get(20));//indexoutboundsException;
		
		System.out.println(LL.isEmpty());
		System.out.println(LL1.isEmpty());
		
		//contains
		//return if this list is true or contaions the specified element .More formlly,
		System.out.println(LL.contains("java"));
		System.out.println(LL.contains("java1"));
		
		System.out.println();
		System.out.println("Reading element using for loop");
		for(int i=0;i<LL.size();i++) {
			System.out.println(LL.get(i));
		}
		System.out.println();
		System.out.println("Reading element using each loop");
		
		for(Object obj :LL) {
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("Reading element usind iterator");
		
		Iterator it = LL.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}



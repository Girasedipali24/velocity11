package Collection_List;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {
	
	public static void main(String [] args){
		
		LinkedList <String> LL = new LinkedList<String>();
		
		LL.add("aa");
		LL.add("mmm");
		LL.add("A");
		LL.add("D");
		LL.add("W");
		
		System.out.println(LL);
		
		LinkedList<String> LL1 = new LinkedList<String>();
		
		LL1.addAll(LL);
		System.out.println(LL1);
	
		//RemoveAll
		LL1.removeAll(LL1);
		System.out.println(LL1);
		
		//collections
		
		
		System.out.println("Before sort ");
		Collections.sort(LL);
		System.out.println(LL);
		
		Collections.sort(LL,Collections.reverseOrder());
		System.out.println(LL);
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	}

}

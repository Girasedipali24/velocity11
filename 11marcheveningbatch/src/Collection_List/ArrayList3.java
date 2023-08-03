package Collection_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList3 {

	public static void main(String [] args) {
		
		String arr[]  = {"Dog","elephant","cat"};
		
		System.out.println(arr);
		
		for (String name:arr) {
			System.out.println(name);
		}
		
		//convert array into arraylist
		
		ArrayList AL = new ArrayList(Arrays.asList(arr));
		System.out.println(AL);
		
		AL.add("cat");
		System.out.println(AL);
		
		Collections.sort(AL);
		System.out.println(AL);
		
		Collections.sort(AL,Collections.reverseOrder());
		System.out.println(AL);
		
	   Collections.shuffle(AL);
	   System.out.println(AL);
	   
	    AL.removeAll(AL);
	    System.out.println(AL);
	    
	    AL.remove("cat");
	    System.out.println(AL);
	    
	    
		
		
		
		
	}

}

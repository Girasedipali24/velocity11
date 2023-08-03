package Collection_List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;


public class ArrayList2 {
	
	public static void main(String [] args) {
		ArrayList AL = new ArrayList ();
		

		AL.add("A");
		AL.add("B");
		AL.add("D");
		AL.add("E");
		AL.add("F");
		AL.add("g");
		AL.add("h");
		AL.add("A");
		
		
		System.out.println(AL); 
		
		//1 ADDall
		ArrayList Duplicate = new ArrayList();
		Duplicate.addAll(AL);
		System.out.println(Duplicate);
		//remove all
		Duplicate.removeAll(AL);
		System.out.println(Duplicate);
		
		//3 collections
	   System.out.println(AL);
	   Collections.sort(AL);
		System.out.println(AL);
	
	 
		Collections.sort(AL,Collections.reverseOrder());
		System.out.println(AL);
		
		Collections.shuffle(AL);
		System.out.println(AL);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

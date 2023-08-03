package Collection_List;
import java.util.ArrayList;

import java.util.Iterator;
public class ArrayList1 {//ArrayLIst are nothing but the one of the class of List interface which id extended by collection

	public static void main (String [] args ) {
		
		int arr []=new int[5];
		ArrayList AL =new ArrayList();
		
		ArrayList <String> AL1 =new ArrayList <String>();
		
		AL1.add("String");
		AL.add(true);
		
		AL.add("welcome");
		AL.add(200);
		AL.add(true);
		AL.add('A');
		AL.add(null);
		AL.add(30.7);//double
		System.out.println(AL);
		
		//2.Size-return the number of element in this list
		System.out.println("number of element in given arraylist --->"+AL.size());
		AL.add(300);
		AL.add(4000);
		AL.add("Test");
		
		System.out.println(AL.size());
		
		//3.Remove
		//syntax -RV.Remove(element);
		
		System.out.println(AL);
		AL.remove(30.7);
		AL.remove(true);
		AL.remove(true);
		AL.remove(null);
		AL.remove("welcome");
	
		
		System.out.println(AL);
		
		//4.insert new element
		AL.add(20);
		System.out.println(AL);
		AL.add(2, 20);
		System.out.println(AL);
		AL.add(3, 90);
		System.out.println(AL);
		AL.add(4,true );
		System.out.println(AL);
		
		// 5.Retrieve specifics element
		//get-Return the element at the specified position in this list
		
		System.out.println(AL.get(3));
		System.out.println(AL.get(4));
		System.out.println(AL.get(5));
		
		
		//6.Replace/change method 
		//set
		AL.set(3, true);
		System.out.println(AL);
		
		AL.set(4, 50000);
		System.out.println(AL);
		
		AL.set(6, 40000);
		System.out.println(AL);
		
		//7.isempty
		System.out.println(AL.isEmpty());
		System.out.println(AL1.isEmpty());
		
		System.out.println();
		
		//8 .
		//Read/print the data
		System.out.println("Reading element using for each loop");
		for (Object obj :AL) {
			System.out.println(obj);
			//0<10-true
			//0<10-true
			//10<10 -false
	   System.out.println();
	   
	   for (int i =0;i<AL.size(); i++) {
		   System.out.println(AL.get(i));
	   }
	   //for each loop 
	   
	   System.out.println();
	   System.out.println("Reading element using for each loop");
	   
	   for (Object obj1 : AL) {
		   System.out.println(obj1);
	   }
	   System.out.println("Reading element using iterator");
	   // iterator
	   
	   Iterator AL2 =AL.iterator();
	   
	   while (AL2.hasNext()) {
		   System.out.println(AL2.next());
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		}   
		
		}
		}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		

		
		 

		
		
	
	



package AccessmodifierA;

import accessmodifier.protected1; // after importing we access the protected modifier in outside the package 
// by using the child class 


public class childclass extends protected1 {
	protected void demo2() {
		System.out.println("demo2");
	
	  childclass c2 = new childclass();
	  c2.demo();
	  c2.demo2();
	  c2.demo();
	  
	  System.out.println();
	public1 p2=new public1();
	p2.name();
	System.out.println(p2.No);
	System.out.println(p2.NO2);
	
	 }
	
	
	
	
	}



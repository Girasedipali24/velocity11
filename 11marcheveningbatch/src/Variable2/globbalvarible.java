package Variable2;

public class globbalvarible {// global variable used to declare program outside of body of main method
	// so in global static method we have used a keyword before variable/or data type name for executing  without  main method body or outside of the body
	
	  int Number=200;
	     String name="nisha";// THIS VARIABLE ONLY PRINTED WHEN IN METHOD HAS NOT ANY STATEMENT TO RUN 
	     int Number1=300;
	public static void main(String [] args) {
		globbalvarible obj=new globbalvarible();
		obj.M1();
		obj.m2();
		
	}
	public void M1() {
		System.out.println(Number);
		System.out.println(Number1);
		int Number =400;
		System.out.println(Number);
		System.out.println(Number);
		System.out.println(Number);
	// we cannot not declared static variable inside the main method
		//body or any kind of method of the class
	}
	public void m2() {
		System.out.println(Number);// if we are printing same variable name so only recent variable name will priting
		// but when we new non static method that time old one is printed first
		System.out.println(Number);
		int Number=34;
		System.out.println(Number);
		System.out.println(Number);
		
	}

}

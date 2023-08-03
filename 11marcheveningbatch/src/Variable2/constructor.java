package Variable2;

public class constructor {
	 public constructor () {
		 
		 
	 }
	 String name; // default constructor (null)
	 int RollNo;// 0 constructor
	// boolean=false
	 
	 public static void main(String [] args) {
	constructor s1=new constructor();
	s1.M1();
	s1.M2();
	 }
	 
	 public void M1() {
		 System.out.println(name+"  "+RollNo);
	 }
	 public void M2() {
		 System.out.println(name+"  "+RollNo);
	 }
}// constructor is nothing but block of code which is used 

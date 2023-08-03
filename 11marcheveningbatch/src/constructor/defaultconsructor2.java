package constructor;

public class defaultconsructor2 {
	// default constructor 
	// public defaultconsructor2(){

	public static void main (String [] args )  {
		defaultconsructor2 b2 =new defaultconsructor2();
		defaultconsructor2 b3 =new defaultconsructor2();
		b2.M1();
		b3.addition();
	     
	     
	      
	}
	public void M1() {
		System.out.println("hello");
		System.out.println("hi my name is dipali");
	}
	public void addition() {
		int a =10;
		int b =20;
		int add=a +b;
		System.out.println(add);
	}

}

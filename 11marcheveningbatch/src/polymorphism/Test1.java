package polymorphism;

public class Test1 {// it is one of the oops principle where one object showing different 
	//behavior at different stage is known as polymorphism
	public static void main(String [] args, String dipali, String Nisha) {
		
	
		Test1.method();
		Test1.method(0, 0);
		Test1.method(0, 0);
		Test1.method(22);
		Test1.method(dipali, 22, 22);
        Test1 t1 =new Test1();
        t1.demo(10);
        t1.demo(11, 12.1f);
        t1.demo(10, 11, Nisha);
// example is method overloading 		
	}
	
  public void demo() {
	  System.out.println("zero parameter method ");
  }
  public void demo(int j) {
	  System.out.println("one input parameter method ");
  }
  public void demo(int j,float c) {
	  System.out.println("two input parameter method ");
  }
  public void demo(int j , float d,String name) {
	  System.out.println("three input parametere");
  }
	
	
	
		
	
	
	public static void method() {
		
	System.out.println("no input method");
		
	}
	public static void method(int j) {
	System.out.println("one input parameter");
	}
	public static void method(int j,int k) {
		System.out.println("two input parameter");
		
	}
	public static void method (float a,double b) {
		System.out.println("diff datatype parameter ");
	}
	public static void method(String name,int a,long b) {
		System.out.println("three input datatype or parameter");
	}
}

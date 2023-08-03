package staticmethod;

public class static_method_call_from_different_class {
	public static void main(String [] args ) {
		System.out.println("main method is started");
		
		m1();
		
		System.out.println("main method is ended");

	}
	public static void m1() {
		System.out.println("hello world");
		System.out.println("hello world 2");
	}
	public static void d1() {
		System.out.println("hi my name is dipali");
		System.out.println("hi i have nothing to say");
	}

}

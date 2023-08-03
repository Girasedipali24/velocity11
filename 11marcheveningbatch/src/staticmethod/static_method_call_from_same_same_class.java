package staticmethod;

public class static_method_call_from_same_same_class {
	public static void main(String [] args) {
		System.out.println("main method started");
		m1();
		m2();
		m3();
		static_method_call_from_different_class.m1();
		static_method_call_from_different_class.d1();
		sample1.v1();
		nonstaticmethod obj=new nonstaticmethod();
		obj.m1();
		obj.m2();
		obj.m3();
		System.out.println("main method end");
	}
	public static void m1() {
		System.out.println("running static regular method");
		System.out.println("running static regual method1");
	}
	public static void m2() {
		System.out.println("public static void main method");
	}
	public static void m3() {
		System.out.println("public static void main method with parameter");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

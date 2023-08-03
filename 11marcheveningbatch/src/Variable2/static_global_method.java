package Variable2;

public class static_global_method {
	static int a=23;
	static String name="hemlata";
	
	public static void main(String [] args) {
	static_global_method.m2();
	}
	

	
	
	public static void m2() {
		System.out.println(static_global_method.a);
		System.out.println(static_global_method.name);
		// static int number =23; inside the static method we don't need a static keyword
		int number=23;
		System.out.println(number);
	}

}



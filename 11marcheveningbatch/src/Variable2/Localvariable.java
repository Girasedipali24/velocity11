package Variable2;

public class Localvariable {// local method same as static method 
	public static void main(String [] args) {
		// we need to put some value which store by value
		
	Localvariable.m2();
     Localvariable.m3();
	}
	public static void m2() {
		int a=123;
		String Name="pavan";
		System.out.println(a);
		System.out.println(Name);
		// note we cannot declared static variable inside the main method body 
		//or any kind of method the class 
	}
	public static void m3() {
		int abc=39;
		String Name="my name is dipali";
		System.out.println(abc);
		System.out.println(Name);
	}

}

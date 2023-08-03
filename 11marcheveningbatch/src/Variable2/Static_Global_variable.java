package Variable2;

public class Static_Global_variable {
	 int Number=300;
	static String name="dipali"; 
	 static int number8=344;
	public static void main (String [] args) {
		Static_Global_variable.M1();
		
	}
	public static void M1 () {
		System.out.println(Static_Global_variable.name);// static variable only used in this syntax(system.out.println (classname.method name); 
		
	     System.out.println(Static_Global_variable.number8);
		
	}

}
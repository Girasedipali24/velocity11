package Variable2;

public class nonstaticvariable2 {// non static local variable with static main method
	public static void main(String [] args) {
	nonstaticvariable2.Demo();	
	nonstaticvariable2.Demo2(); //in this there is no need to create object
	
	
	
	differentclass dvs =new differentclass();
	System.out.println(dvs.age);
	System.out.println(dvs.name);
	System.out.println(dvs.name1);
	}
	public static void Demo() {
		int abc =398;
		String name="dipali";
		System.out.println(name);// non static local variable calling by  main method 
		System.out.println(abc);
	}
	public static void Demo2() {
		int wer=432;
		String name="hemlata";
		System.out.println(wer);
		System.out.println(name);
	}
    public static void Demo3() {
    	int wer=432;
    	String name="my name is dipali";
    }
}


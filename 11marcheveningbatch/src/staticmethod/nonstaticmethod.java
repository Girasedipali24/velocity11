package staticmethod;

public class nonstaticmethod {// in main method we are just printing the statement by calling when printing statement into non static method
	public static void main(String [] args) {
		System.out.println("main method non static method ");
		
		
		nonstaticmethod obj=new nonstaticmethod();
		nonstaticmethod11 v2 =new nonstaticmethod11();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		v2.m1();
	}
	public void m1() {
		System.out.println("hello world 33");
		System.out.println("hello world 44");
	}
	public void m2() {
		System.out.println("hello world 22");
		System.out.println("hello world 11");
	
	}
	public void m3() {
		System.out.println("hello world 10");
		System.out.println("hello world 90");
	}
	public void m4() {
		System.out.println("dipali");
	}

}

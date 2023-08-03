package Variable2;

public class nonstaticlocalvariable {//with non static method ;
	public static void main (String [] args ) {

		nonstaticlocalvariable obj=new nonstaticlocalvariable();
		obj.Test();
		obj.Test2();
		obj.Test4();
		obj.Test3();
	}
	public  void Test() {
		int Number =200; // Non static local variable
		System.out.println(Number);
	}
	public  void Test2() {
		int Number=256;
		System.out.println(Number);
	}
	public  void Test3() {
		String a="Pavan";
		System.out.println(a);
	}
	public void Test4() {
		int i=20;
		int j=30;
		int Addition=i+j;
		System.out.println(Addition);
	}

}

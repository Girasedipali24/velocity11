package Thisandsuper;

public class Test1   extends Test2{
	
	int Number=100;
	int Num=200;
	String Name="Automation";
	
	public void Test() {
		
		int Number= 500;
		int Num=600;
		// this keyword used to access the global variable from same class
		System.out.println(Number);
		System.out.println(Num);
		System.out.println ( this.Name);
		System.out.println(this.Number);
		System.out.println(this.Num);
		System.out.println(super.Name);
		System.out.println(super.RollNo);
		System.out.println();
	}
	public static void main(String [] args) {
	    Test1 t1 =new Test1();
	    t1.Test();
	}

}

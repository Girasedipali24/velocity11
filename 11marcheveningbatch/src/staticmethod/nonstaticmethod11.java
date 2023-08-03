package staticmethod;

public class nonstaticmethod11 {
	public static  void main (String [] args) {
		System.out.println("non static mmethod ");
		
		nonstaticmethod11 v2=new nonstaticmethod11();
		v2.m1();
		v2.m2();
	}
	public void m1() {
		int a =20;
		int b=30;
		int add=a+b;
		System.out.println(add);
	}
	public void m2() {
		int a=55;
		int b=54;
		System.out.println(a);
		System.out.println(b);
	}

}

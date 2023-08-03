package accessmodifier;

public class default1 {
	
	// access level of default method is within the only package
	int a =12;
	int  a1=33;
	void demo3() {
		System.out.println("demo3");
	}
	void m1() {
		System.out.println("m1");
	}
	
	public static void main (String [] args) {
	
	default1 d2 =new default1();
	d2.demo3();
    d2.m1();
    System.out.println(d2.a);
    System.out.println(d2.a1);
    
    public1 p2 =new public1();
    p2.m3();
    System.out.println(p2.no);
    System.out.println(p2.no3);
	}

}


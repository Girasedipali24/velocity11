package inheritance_hie;

public class Test {
	public static void main(String [] args) {
		
	father f1 = new father();	
		f1.home();
		f1.car();
		f1.property();
	
		System.out.println();
		
		Son1 s1 =new Son1();
		s1.laptop();
		s1.home();
		s1.car();
		s1.property();
		
		System.out.println();
		
		Son2 s2 = new Son2();
		s2.Bike();
		s2.home();
		s2.car();
		s2.property();
		
		System.out.println();
		
		Son3 s3 = new Son3();
		s3.house();
		s3.home();
		s3.property();
		s3.home();
	}

}

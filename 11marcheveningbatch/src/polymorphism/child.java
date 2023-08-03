package polymorphism;

public class child extends father {
	public void Bike() {
		System.out.println("bike----b1");
		
	}
		public void car (int i) {
			System.out.println("car-----swift");
			
			
		}
		public static void main(String [] args ) {
		     father f1 =new father();
		     f1.car();
		     f1.Home();
		     f1.Money();
		     f1.Test();
		     
		     System.out.println();
		     
		     child c1 =new child ();
		     c1.Bike();
		     
		     father f2 =new child();
		     f2.Home();
		     f2.car();
		}
		
	

}

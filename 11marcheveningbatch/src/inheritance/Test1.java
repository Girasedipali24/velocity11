package inheritance;

public class Test1 {
	public static void main(String [] args) {
		Son S1 =new Son();
		S1.Bike();
		S1.cycle();
		S1.Home();
		S1.Money();
		S1.car();
		
		System.out.println();
	 father f1 =new father();
	      f1.car();
	      f1.Home();
	      f1.Money();
	      
	      multilevel1 m1 =new multilevel1();
	      m1.demo1();
	      m1.demo2();
	      m1.demo1();
	      m1.demo3(); //child class inherit the class of parent class
	      
	      multilevel m2 =new multilevel();
	      m2.demo1();
	      m2.demo2();// parent class doen't inherit the class of child class 
	   //   
	      
	      System.out.println();
	      
		
		
		
		
		
	}

}

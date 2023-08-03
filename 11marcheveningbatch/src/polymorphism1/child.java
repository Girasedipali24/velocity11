package polymorphism1;

public class child  extends father {
	
	public void car(int i) { // method declaration
		System.out.println("car---swift");// method defination1
	}
	public void home() {
	
		System.out.println("home");
	}
	
	public static void main(String [] args) { //static polymorphism1
		father f1=new father();// car maruti1
		f1.car(10);
		f1.home();
		
		child c1 =new child();//car swift
		c1.car(12);
		c1.home();
		
		father f2=new child();  // dynamic binding
		f2.car(10);// car swift
		f2.home();
	
	}

}

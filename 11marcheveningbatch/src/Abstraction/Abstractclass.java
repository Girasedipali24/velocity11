package Abstraction;

public class Abstractclass extends Abstractclassconstructor {
	// due to constructor rule class name same as method name
	public Abstractclass() {
		
		super();
		System.out.println("concrete class");

	}
	public static void main(String [] args) {
		
		Abstractclass AS= new Abstractclass();
	}

}

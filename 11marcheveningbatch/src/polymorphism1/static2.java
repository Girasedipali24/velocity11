package polymorphism1;

public class static2  extends static1{
	
	public static void main(String [] args) {
		static1 s2 =new static1();
		s2.Demo();
		s2.Demo1();
      
		static2 s3 =new static2();
		s3.Demo2();
		s3.Demo2();
		s3.Demo1();
		
	}
	public void Demo2() {
		System.out.println("child method");
	}
	public static void Demo1 (){
		System.out.println("parent class static method :DEMO");
		
	}

}

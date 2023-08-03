package constructor;

public class defaultconstructor {
	// what is default constructor 
	// a constructor which does not have any parameter is called default constructor 
   //
	String Name;
	int RollNo;
	
	public defaultconstructor() {
		System.out.println("default constructor ");
	}
	public static void main(String [] args ) {
		defaultconstructor v1=new defaultconstructor();
		defaultconstructor v2= new defaultconstructor();
		defaultconstructor v3 = new defaultconstructor();
		defaultconstructor v4 = new defaultconstructor();
		defaultconstructor v5 =  new defaultconstructor();
		defaultconstructor v6 = new defaultconstructor();
		v6.demo1();
	
	} 
	public void demo1() {
		int a=12;
		int b=30;
		int add=a+b;
        int RollNo=23;
		String name="dipali";
		System.out.println(RollNo);
		System.out.println(name);
		System.out.println(add);
		
	}
 
		
	
		
		
	

		
	

}

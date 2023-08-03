package constructor;

public class Consstructor {
	public static void main(String [] args) {
		//Can not create constructor inside the method/block/function
		Consstructor R3 = new Consstructor();
		Consstructor R4 =new Consstructor(4);
		Consstructor R5 =new Consstructor(1,2);
		Consstructor R6 = new Consstructor(1,3,4);
		Consstructor B1= new Consstructor(1,2,3,4);
		// any number of constructor can declare in java class but constructor 
		// name should be same as class name but argument /parameter should be different.
		// applicable modifier/specifier public ,private,protected 
		// not applicable mod/spec static,final,abstract,native,synchronized( rule 4);
	}
	public Consstructor () {
		System.out.println("hello");
	}// constructor name is similar to class name // constructor name must be same as class name 
	public Consstructor(int i ) {
		System.out.println("one input augument constructor");
		// constructor name is similar to class name but 
	}
	public Consstructor (int i,int j) {
		System.out.println("two input argument constructor");
	}	
	public  Consstructor (int a,int b,int c)	{
		System.out.println("three input argument constructor");
	}
	public Consstructor (int a,int c, int d,int e) {
		System.out.println("four input argument constroctor");
	}
		
	

}

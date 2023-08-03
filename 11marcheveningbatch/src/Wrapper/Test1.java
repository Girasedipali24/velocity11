package Wrapper;

public class Test1 {
	
	public static void main(String [] args) {
		
		//we are predefined class by java which can contain primitive data type 
		//and wrapper class in java provide the mechanism to conver primitive into object and object into primitive datatype
		//boolean= boolean
		//byte = byte 
		//char = character 
		//int = integer
		//float = float
		//long = long
		//short = short
		//double= double 
		
		String S1 = "200";
		String S2 ="400";
		
		System.out.println(S1+S2);
		
		int a = 300;
		System.out.println("primitive :" +a);
		Integer b = 30;
		System.out.println("wrapper:"+b);
	}

}

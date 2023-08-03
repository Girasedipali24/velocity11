package String;

public class String2 {
	
	public static void main(String [] args) {
		// difference between ==operator and .equals method 
		
		String S1 = new String ("java");
		String S2 = new String ("java");
		
		System.out.println(S1==S2);
		
		String S3="java";
		String S4="java";
		
		System.out.println(S3==S4);
		System.out.println(S1==S4);
		System.out.println(S1.equals(S4));
		System.out.println(S2.equals(S1));
		
		// ==Always compare reference comparison/address comparison
		//reference comparison means if both reference point into the same obj then it will give true
		
		//.equals method ;
		//content comparison means compare the two given string based on the content 
		//of the String .if any character is not matched it returns false .
		//if all character are matched it return true
		
	}

}

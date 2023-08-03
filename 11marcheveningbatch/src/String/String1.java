package String;

public class String1 {
	
	public static void main (String [] args) {
		// by using String literal
		
		//syntax -String  SRVN= "VALUES";
		String Str ="Automatin ";   //SCP
		String str1 = "Automation ";
		String str2 ="Automation";
				
	  // by using new keyword 
		// String Str =new String ("VALUE");
		
		String S3 =new String ("java");
		String S4 =new  String("java");
		String S5=new String ("Automation"); //heap
		
		System.out.println(Str==str1);
		System.out.println(Str!=str1);
		System.out.println(Str=str1);
		System.out.println(S3==S4);
		
	}

}



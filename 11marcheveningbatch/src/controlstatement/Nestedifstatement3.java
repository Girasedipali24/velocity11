package controlstatement;

public class Nestedifstatement3 {
	public static void main(String []  args) {
		String UN =("abc");
		String PWD=("xyzl");
		
		if (UN=="abc") {
			System.out.println("correct UN");
			
			if(PWD=="xyzl")
			{
				System.out.println("correct PWD");
				System.out.println("login successful");
			}
			else
			{
				System.out.println("wrong pWD");
				System.out.println("login failed");
			}
		}
		else
		{
			System.out.println("wrong UN");
			System.out.println("login failed");
		}
			
				
			
		
		
	}

}

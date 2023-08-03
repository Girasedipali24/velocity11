package controlstatement;

public class Nestedifstatement2 {
	
	public static void main(String [] args ) {
		int num =10;
		
		if (num>0) {
			System.out.println("num is positive");
		}
		if (num%3==0) {
			System.out.println("num is even");
		}
		else if (num<4) {
			System.out.println("num is odd");
		}
		else {
			System.out.println("num is nothing");
			
		}
				
	}

}

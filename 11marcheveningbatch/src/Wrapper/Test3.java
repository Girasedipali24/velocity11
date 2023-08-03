package Wrapper;

public class Test3 {
	
	public static void main (String [] args) {
		String S1 = "200.00";
		String S2 = "400.50";
		
		System.out.println(S1+S2);
		
		double value1 = Double.parseDouble(S2);
		double value2 = Double.parseDouble(S1);
		
		double addition =value1+value2;
		
		System.out.println(addition);
		
		if(addition==600.5) {
			System.out.println("correct addition");
		}
		else {
			System.out.println("incorrect addition");
		}
	}

}

package ifelseladderstatement;

public class ifelseladder1 {
	public static void main(String [] args) {
		//if else ladder syntax
		int marks=80;
		if (marks>=65) {
			System.out.println("Distiction");
		}
		else if(marks>=60) {
			System.out.println("first class");
		}
		else if(marks>=55) {
			System.out.println("Higer second class");
		}
		else if(marks>=50) {
			System.out.println("second class");
		}
		else if(marks>=35) {
			System.out.println("pass");
		}
		else {
			System.out.println("failed");
		}
	}

}

package ifelseladderstatement;

public class ladderstatement {
	
	public static void main(String [] args) {
		int marks =35;
		
		if (marks>90) {
			System.out.println("dictinction");
		}
		else if (marks>80) {
			System.out.println("ranker");
		}
		else if (marks>70) {
			System.out.println("average");
		}
		else if(marks>60) {
			System.out.println("below average");
		}
		else if (marks>50) {
			System.out.println("pass");
		}
		else {
			System.out.println("failed");
		}
	}
	

	


}

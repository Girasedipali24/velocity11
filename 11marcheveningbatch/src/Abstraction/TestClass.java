package Abstraction;

public  class TestClass {
	
	public static void main(String [] args) {
		
		HDFCBank HB =new HDFCBank();
		
		HB.Creditcard();
		HB.Debitcard();
		HB.funds();
		
	//	RBIBank RB =new RBIBank();
		
		System.out.println();
		
		RBIbank RB = new HDFCBank();
		
		RB.Creditcard();
		RB.Debitcard();
		RB.Loan();
		
		
	}
	

}

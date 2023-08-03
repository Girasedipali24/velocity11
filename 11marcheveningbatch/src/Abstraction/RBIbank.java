package Abstraction;

public abstract class RBIbank {
	
	public void Loan() {//Non abstract method
		System.out.println("RBI---Loan");
	}
	public abstract void Creditcard();//Abstract method
	
	public abstract void Debitcard();//Abstract method

}

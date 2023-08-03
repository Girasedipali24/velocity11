package accessmodifier;

public class private1 {
	
	private void m1() {
		System.out.println("dipali");
	}
	private void m2() {
		System.out.println("nishant");
	}
	
	public static void main(String [] args) {
		
		private1 p2 =new private1();
		p2.m1();
		p2.m2();
	
	}

}

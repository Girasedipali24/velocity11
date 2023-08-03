package Thisandsuper;

public class Test3 extends Test2 {
	
	int RollNo=30;
	String Name="python";
	
	public void Demo() {
	  
		int RollNo=11;
		String Name ="selenium";
		
		System.out.println(RollNo);
		
		System.out.println(Name);
		
		System.out.println(super.Name);
		System.out.println(super.RollNo);
	}
		
		public static void main(String [] args) {
			Test3 t2 =new Test3();
			t2.Demo();
		}
		
		
		
		
	}



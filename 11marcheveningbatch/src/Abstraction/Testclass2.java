package Abstraction;

public class Testclass2 {
	
	public static void main(String [] args) {
		
		whatapp2 w1 =new whatapp2() ;
		
		w1.audio();
		w1.video();
		w1.feature();
		w1.audio();

		
		System.out.println();
		
		whatapp w2=new whatapp2();
		w2.audio();
		w2.feature();
		w2.video();
		w2.video();
	
			
		
	}

}

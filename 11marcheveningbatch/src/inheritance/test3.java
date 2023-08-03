package inheritance;

public class test3 {
	
	public static void main(String [] args) {
		
		whatapp w1 =new whatapp();
		w1.audio();
		w1.video();
	
	System.out.println();
		
		whatapp2 w2 =new whatapp2();
		w2.audio();
		w2.copy();
		w2.video();
		w2.msg();
	}

}

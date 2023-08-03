package Array;

public class Array2 {
	
	public static void main (String [] args) {
		char C1[]=new char[5];
		C1[0]='A';
		C1[1]='B';
		C1[2]='C';
		C1[3]='D';
		C1[4]='E';
		int D1[]=new int[10];
		D1[1]=10;
		D1[2]=20;
		D1[3]=30;
		D1[4]=40;
		D1[5]=50;
		D1[6]=60;
		D1[7]=70;
		D1[8]=80;
		D1[9]=90;
	//	D1[10]=100;
		
		System.out.println(C1.length);
		
		for(char i=0;i<C1.length;i++) {
			System.out.print("  "+C1[i]);
		}
	for (char i=0 ;i<C1.length;i++) {
		System.out.print("   "+C1[i]);
			
		} 
		for (char i=0;i<C1.length;i++) {
			System.out.print("  "+C1[i]);
	}
		for (int i=1;i<D1.length;i++) {
			System.out.print(" "+ D1[i]);
		}
		for (int i=1;i<D1.length;i++) {
			System.out.println(" "+D1[i]);
		}
	
	}
}

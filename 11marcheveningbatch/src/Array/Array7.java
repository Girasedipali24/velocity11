package Array;

public class Array7 {
	
	public static void main(String [] args) {
		
		String S1[]=new String [3];
		                         //R C
		String S2[] []=new String [4][5];
		
		//Initialization
		
		//first row
		  // R C
		S2[0][0]="A1";
		S2[0][1]="A2";
		S2[0][2]="A3";
		S2[0][3]="A4";
		S2[0][4]="A5";
	
		//second row
		// R  C
		S2[1][1]="B1";
		S2[1][2]="B2";
		S2[1][3]="B3";
		S2[1][4]="B4";	
		S2[0][1]="B5";
		// THIRD ROW
		// R  C
		S2[2][0]="C1";
		S2[2][1]="C2";
	    S2[2][2]="C3";
		S2[2][3]="C4";		
		S2[2][4]="C5";
		//FORTH ROW
		  //r c
		S2[3][0]="D1";
		S2[3][1]="D2";
		S2[3][2]="D3";
		S2[3][3]="D4";
		S2[3][4]="D5";
		
		System.out.println(S2[2][2]);
		System.out.println(S2[3][4]);
		System.out.println(S2[3][3]);
		
	for(int Row=0;Row< S2.length;Row++)	{
	for(int col=0;col<S2.length;col++) {
	    System.out.print(S2[Row][col]+" ");
		System.out.println();
	}

	}
		
		
		
	}

}

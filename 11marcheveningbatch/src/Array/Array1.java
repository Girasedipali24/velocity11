package Array;

public class Array1 {
	
	public static void main(String [] args) {
		
		char C1 []=new char [10];
		C1[0]='A';
		C1[1]='a';
	    C1[2]='c';
		C1[3]='d';
		C1[4]='s';
		C1[6]='o';
		C1[5]='2';
		C1[4]='5';
		System.out.println(C1.length);
		
		System.out.println("index 3="+C1[1]);
    	System.out.println(C1[3]);
	    System.out.println(C1[4]);
		
		for(char i=0;i<C1.length;i++) {
		System.out.println(C1[i]);
	}
	}

}

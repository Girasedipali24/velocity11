package Array;

public class Array10 {
	
	public static void main(String [] args) {
		int arr[] = {2,3,4};
		                  //0,1,2  //0,1,2 //0,
		int number [][] = {{2,3,7},{4,5,5},{4,7,5},{7,8,5},{3,4,6}};
		
		System.out.println(number.length);//row
		System.out.println(number[0].length);//column
		
		System.out.println(number [2][1]);
		System.out.println(number[3][2]);
		System.out.println(number[4][1]);
		System.out.println(number[4][0]);
		
        for (int i=0;i<number.length;i++) {//for(intilisation,condition;inc/dec)
        	//System.out.println([i])
        	for (int j=0;j<number[0].length;j++) {
        		System.out.println(number[i][j]+"'");
        	}
        	System.out.println();
        }
		
	}

}

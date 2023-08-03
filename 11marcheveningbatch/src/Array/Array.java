package Array;

import java.util.Arrays;

public class Array {
	
	public static void main(String [] args) {
		
		String str[] =new String [4];
		
		str[0]="rohit";
		str[1]="@##$";
		str[2]="Test";
		
		System.out.println(str[2]);
		
		for (int j=0;j<str.length;j++) {
			System.out.println(str[j]);
		}
		
	}

	public static void sort(int[] arr) {
	    System.out.println();
	    Arrays.sort(arr);
		
	}

}

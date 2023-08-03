package Array;

public class LargestNumber {
	
	public static void main(String [] args) {
		int arr[]= {3,52,4,56,67,67,999,22,74};
		
	System.out.println(arr.length);
	int maximum=arr[0];
	
	// System.out.println(maximum);
	//0<7
	//1<7
	//2<7
	//3<7
	//4<7
	//5<7-false
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]>maximum) {
			//3>4-false
			//5>4-true
			//999>4 true
			//67>57 true
			//67>22 true
			//67>999 -true 
			maximum=arr[i];
			System.out.println("largest number in given array is ---->"+maximum);
			
			
		}


	}
	
	}	
		
	}




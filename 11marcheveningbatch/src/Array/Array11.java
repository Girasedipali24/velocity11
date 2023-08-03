package Array;

public class Array11 {
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8,9,10,2,2,2,3,3,3,3};
		System.out.println("duplicate element in given array");
		
		for(int i=0;i<arr.length;i++) {
			for (int j =i+1;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					System.out.print(arr[j]+"'");
					
				}
			}
		}
	}

}

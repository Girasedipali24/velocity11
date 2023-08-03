package Array;

public class Demo {
	
  public static void main(String [] args) {	
	int arr [] =new int[10];
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	arr[4]=50;
	arr[5]=60;
	arr[6]=70;
	arr[7]=80;
	arr[8]=90;
	arr[9]=100;
    
    System.out.println();
    System.out.println(arr.length);
    System.out.println(arr.length);
    
    System.out.println("index 5="+arr[5]);
    System.out.println("index 2="+arr[2]);
    System.out.println("index 3="+arr[3]);
    
    for (int i=0;i<arr.length;i++) {
    	System.out.println(arr[i]);
    	
    	for (int k=0;k<arr.length;k++) {
    		System.out.println(arr[k]);
    	}
    }

  }	

}

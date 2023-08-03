package polymorphism1;

public class methodoverloading2 {
	
	public static void main(String [] args) {
	   methodoverloading mo =new methodoverloading();
	   mo.m2();
	   mo.m2(10);
	   mo.m2(10, 20);
	   mo.m2(40, 50);
	   
	   methodoverloading2 MO =new methodoverloading2();
	   MO.addition(23, 44);
	      
	   methodoverloading.m2(10, 10, 10);
		
		
	}
	public void addition(int i ,int k) { //non static method
		int sum=i+k;
		System.out.println(sum);
	}
	public static void addition(int i, int k,int c) {
	     int sum1=i+k+c;
	  System.out.println(sum1);
          
	}
}
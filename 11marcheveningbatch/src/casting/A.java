package casting;

public class A {
	
	public static void main (String [] args) {
		 // casting is converting one datatype into another datatype 
		 // their are two type of casting 
		// 1 implicit 2 explicit 
		// 1 implicit casting = it is automatically performed by the compliler 
		//lower size datatype(int) can convert into higher datatype (double)
		
		int a = 10;// 4byte 
		double b=a;// 8 byte 
		
		System.out.println(b);
		
		// explicit type casting = by default compiler does not allow explicit type casting 
		// high datatype size is coverting into lower datatype 
		//syntax= int y =(int)x;
		double  x=10.5; // 8byte
		int y =(int)x;// 4 byte
		
		System.out.println(y);
		
		
	}

}

package AccessmodifierA;

public class Default {
	int no =100;
	int no2=200;
	public static void main (String [] args) {
		
	Default d1 =new Default();
	d1.demo1();
	d1.demo2();	
	System.out.println(d1.no);
	System.out.println(d1.no2);	
		
	}
	
	
	
	


   void demo1() {
	System.out.println("default method") ;  
   }
   void demo2() {
	   System.out.println("default method");
   }

   
   
   
   
   
   
}
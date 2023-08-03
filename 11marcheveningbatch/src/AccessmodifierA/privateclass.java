package AccessmodifierA;

public class privateclass {
	
   private int number =20000;
   private String name ="rohit";
   private float percentage=33.44f;
   public static void main(String [] args) {
	   
	   privateclass p2 = new privateclass();
	   p2.method();
	   p2.method1();
	   
	   System.out.println(p2.number);
	   System.out.println(p2.name);
	   System.out.println(p2.percentage);
   }


     private void method() {
    	 System.out.println("private method :p1");
     }
     private void method1 () {
    	 System.out.println("private method :p2");
    	 
     }
     
     
     
     
     
     
     
     
     
}
package Thisandsuper;

public class sample1 {
	// this keyword used for same class 
	// super keyword used for different class
   int Number =100;
   int num =200;
   String Name ="Automation";
   
   // what is use of this keyword 
   // this keyword is used to access global variable from same class
   
   public void Test () {
	   int  Number =500;
	   int Num =600;
	   String Name="selenium";
	   System.out.println(Number);
	   System.out.println(num);
	   System.out.println(Name);
	   System.out.println();
	   System.out.println();
	   System.out.println(this.Number);
	   System.out.println(this.num);
	   System.out.println(this.Name);
   }
   public static void main(String [] args) {
	   sample1 s1 =new sample1();
	   s1.Test();
   }
   
   
}


public class userdefinedconstructor {
	int price;
	String name;
	String model;


public userdefinedconstructor (String name1,String model1,int price1) {
	   this.    price= price1;
	    this.   model =model1;
	    this.   name=name1;
}       
	       
	 public static void main(String [] args ) {
	userdefinedconstructor v3 = new userdefinedconstructor("kia","audi",112222222); 
	userdefinedconstructor v4 =new userdefinedconstructor("nisha","dipali",200000000);
	userdefinedconstructor v5 = new userdefinedconstructor("dipali1","nisha",2000000);	
	userdefinedconstructor v6 = new userdefinedconstructor("nikita","darshana",20000000);
	System.out.println(v3.name+"  "+v3.model+"  "+v3.price); 
	System.out.println(v4.name+"  "+v4.model+"  "+v4.price);
	System.out.println(v5.name+"   "+v5.model+"  "+v5.price);
	System.out.println(v6.name+"   "+v6.model+"  "+v6.price);
		 
		 
		 
		 
		 
	 }

	














}
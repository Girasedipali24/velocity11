package constructor;

public class Userdefinedconst {
	// variable declaration 
	String Name ;
	String Model;
	String Engin;
	int price;
	
	public Userdefinedconst (String Name1,String Model1,String Engin1,int price1) {
		
	  //	Name=Name1;
    	//	Model=Model1;
	    //   Engin=Engin1;
	   //   price=price1;
	    
	      this. Name=Name1;
	      this.Model=Model1;
	      this.Engin=Engin1;
	      this.price=price1;
	    
	}
	    
	    public static void main(String [] args ) {
	    	
	  Userdefinedconst UD1 =new Userdefinedconst("kia","seltos","manual",2000000);
	  Userdefinedconst UD2 = new Userdefinedconst("Honda","city", "Automatic",1900000);
	  Userdefinedconst UD3= new Userdefinedconst("tata","nexon","Manual",30000000);
	  
	  
	  System.out.println(UD1.Name+" "+UD1.Model+" "+UD1.Engin+" "+UD1.price);
	  System.out.println(UD2.Name+" "+UD2.Model+"  "+UD2.Engin+" "+UD2.price);
	  System.out.println(UD3.Name+" "+UD3.Model+"  "+UD3.Engin+" "+UD3.price);  
	    	
	    	
	    
		
	}
		
	}



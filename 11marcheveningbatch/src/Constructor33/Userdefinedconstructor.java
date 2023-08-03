package Constructor33;

public class Userdefinedconstructor {
	
	String name;
	String model;
	int price;
	String Engin;
	
	
	public Userdefinedconstructor(String name1,String model1,String Engin1,int price1) {
		name=name1;
		model=model1;
		price=price1;
		Engin=Engin1;
	}
	public static void main(String [] args) {
		Userdefinedconstructor UD=new Userdefinedconstructor("kia","seltos","manual",20000000);
		
		System.out.println(UD.name+" "+UD.model+"  "+UD.Engin+" "+UD.price);
	}

}

package AccessmodifierA;

public class public1 {
	public int No=100;
	public int NO2=300;
	public static void main(String [] args ) {
		
		public1 p1 =new public1();
		p1.name();
		p1.name2();
		System.out.println(p1.No);
		System.out.println(p1.No);
		System.out.println(p1.NO2);
		
		
		Default d2 =new Default();
		d2.demo1();
		d2.demo2();
		System.out.println(d2.no);
		System.out.println(d2.no2);
	}
	
	public void name() {
		System.out.println("public method");
	}
	public void name2() {
		System.out.println("public method");
	}

}

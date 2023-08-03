package polymorphism1;

public class methodoverloading {
	
    public void  m2() {
    	System.out.println("m2");
    	
    }
    public void m2(int i) {// non static method
    	
    	System.out.println("one input parameter");
    	
    }
    public void m2(int i,int j) {
    	System.out.println("two input parameter");
    }
    
    public static void m2(int i,int j,int t) {// static method
    	System.out.println("three input parameter");
    }

}

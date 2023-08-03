package polymorphism1;

public class mainmethodoverloading {
	int aaa=112;
	public static void main(String [] args) {
		mainmethodoverloading MO =new mainmethodoverloading();
		MO.demo();
		MO.Demo1();
		int arr[]= {13};
		mainmethodoverloading.main('a');
		mainmethodoverloading.main('a');
		mainmethodoverloading.main(arr);
		
	
		System.out.println(MO.aaa);
	}
		
	
	
	public static void main(char args) {
		mainmethodoverloading MO =new mainmethodoverloading();
		MO.demo();
		MO.Demo1();
	}



	public static void main( int[] args) {
		mainmethodoverloading MO =new mainmethodoverloading();
		MO.demo();
		MO.Demo1();
	}
	
	public static void main(char [] args) {
		mainmethodoverloading MO =new mainmethodoverloading();
		MO.demo();
		MO.Demo1();
			
		
	}
	public void Demo1() {
		System.out.println("Demo2");
		
	}
	public void demo() {
		System.out.println("demo method");
	}

}

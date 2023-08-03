
package MainMethod1;

public class Switchstatement {
	
	public static void main(String [] args) {
		
		int number = 200;
		switch (number) {
		//case Statement 
		case 10:
			
			System.out.println("number matched -10");
			break;
			
	     	case 20:
			System.out.println("number matched - 20 ");
			break;
		    case 30:
			System.out.println("numbrt matched - 30 ");
			break;
		    case 200:
			System.out.println("number matched 200");
			break;
			default :
			System.out.println("number is not matched");
		}
	}

}

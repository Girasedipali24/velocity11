package dowhilestatement;
import java .util.Scanner;
public class dowhile1 {
	public static void main(String [] args ) {
		Scanner Scanner=new Scanner (System.in);
		double num;
		
		do {
			System.out.println("please enter a valid number: ");
			while(!Scanner.hasNextDouble()) {
				System.out.println("that's not valid numbrt !");
				Scanner.next();
			}
			num=Scanner.nextDouble();
		}while (num<=0);
		System.out.println("you entered the valid number:"+num);
		Scanner.close();
		
	}

}

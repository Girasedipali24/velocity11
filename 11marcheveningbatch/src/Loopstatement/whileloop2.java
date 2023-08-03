package Loopstatement;

public class whileloop2 {
	public static void main(String [] args) {
		// assignment write a program to calculate the sum of the first 15 by using while loop
		int total=0;//1+2+3+4+5+6+7+8+9+10+11+12+13+14+15=120
		int i=1;
		while(i<=15) {
			total+=i;
			i++;
		}
		System.out.println("The sum of the first 15 number is :"+total);
	}

}

package Loopstatement;

public class leapyear {
	public static void main(String [] args) {
		// condition for leap year
		// year should be divisible by 400 and but not by 100
		int year=2024;
		if( (year%4==0)&& (year%100!=0)||(year%400==0)) {
			System.out.println("specified year is leap year");
		}
		else {
			System.out.println("specified year is not a leap yaer");
		}
	if (year%400==0) {
		System.out.println("The year is leap year:"+year);
		
		
	}
	else if (year%100==0) {
		System.out.println("the year is not leap year"+year);
	}
	else if(year%4==0) {
		System.out.println("The year is not leap year"+year);
	}
	else {
		
	}
	}

} 

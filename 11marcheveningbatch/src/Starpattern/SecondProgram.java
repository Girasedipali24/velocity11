package Starpattern;

public class SecondProgram {
	
	public static void main(String [] args) {
		 for(int i=1;i<=5;i++) {
			 
			 for(int j =1;j<=9;j++) {
				 
				 if(j>=6-i&&j<=4+i) {
					 //1>=5--false
					 //1>=4---false
					 //1>=3--false
					 //1>=2---false
					 //1>=1---true
					 
					 System.out.print("*");
				 }
				 else {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
	}

}

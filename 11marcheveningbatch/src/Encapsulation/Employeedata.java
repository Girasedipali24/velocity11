package Encapsulation;

public class Employeedata {
	
	private int IDnumber;
	private static String EmpName;
	private int EmpAge;
	
	public static void main (String [] args) {
		Employeedata ED = new Employeedata();
		
		ED.setIDnumber(2224455);
		ED.setEmpName("Rahul");
		ED.setEmpAge(30);
		
		System.out.println("Employee name is: "+ED+getEmpName());
		System.out.println("Emp age is :"+ED.getEmpAge());
		System.out.println("emplyoo ID :"+ED.getIDnumber());
	}

	 public  static String getIDnumber() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getEmpAge() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getEmpName() {
	      return EmpName;
	}

	public void setEmpAge(int EmpAge) {
		this.EmpAge=EmpAge;
		
	}

	public void setEmpName(String EmpName) {
		this.EmpName=EmpName;
		
	}

	public void setIDnumber(int IDnumber) {
	   this.IDnumber=IDnumber;
		
	}

}

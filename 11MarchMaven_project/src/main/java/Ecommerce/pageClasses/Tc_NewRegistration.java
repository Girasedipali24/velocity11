package Ecommerce.pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc_NewRegistration {
	
	public Tc_NewRegistration(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy( xpath="(//button[@type=\"button\"])[1]")
	public WebElement Login;
	
	@FindBy(id="gender-male")
	public WebElement Male;
	
	@FindBy(id="gender-female")
	public WebElement Female;
	
	@FindBy(id="FirstName")
	public WebElement firstname;
	
	@FindBy(id="LastName")
	public WebElement lastname;
	
	@FindBy(xpath="//select[@name=\"DateOfBirthDay\"]")
	public WebElement date;
	
	@FindBy(xpath="//select[@name=\"DateOfBirthMonth\"]")
	public WebElement Month;
	
	@FindBy(xpath="//select[@name=\"DateOfBirthYear\"]")
	public WebElement Year;
	
	@FindBy(id="Email")
	public WebElement Email;
	
	@FindBy(id="Company")
	public WebElement Company;
	
	@FindBy(id="Password")
	public WebElement password;
	
	@FindBy(id="ConfirmPassword")
	public WebElement Confirmpassword;
	
	@FindBy(xpath="//button[@id=\"register-button\"]")
	public WebElement Register;
	
	@FindBy(id="register-button")
	public WebElement Registrationsuccessfully;
	
	@FindBy(xpath="//div[contains(text(),'Your registration completed')]")
	public WebElement registrationcompleted;
     
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	public WebElement continue1;

   public void NewRegistration () {
	   Login.click();
   }
   public void Selectgender() {
	   Male.click();
   }
   public void Selectgender2() {
	   Female.click();
   }
   public void first(String Firstname) {
	   firstname.sendKeys(Firstname);
   }
   public void last(String Lastname) {
	   lastname.sendKeys(Lastname);
   }
   public void day(String Day) {
	   date.sendKeys(Day);
   }
   public void month(String month) {
	   Month.sendKeys(month);
   }
   public void year(String year) {
	  Year.sendKeys(year);
   }
   public void email(String email) {
	   Email.sendKeys(email);
   }
   public void companyname(String companyname) {
	   Company.sendKeys(companyname);
   }
   public void password( String pass) {
	   password.sendKeys(pass);
   }
   public void confirmpassword(String conpass) {
	   Confirmpassword.sendKeys(conpass);
   }
   public void Register() {
	   Register.click();
   }
   public void reg() {
	   continue1.click();
	   
   }
  
  
	
}

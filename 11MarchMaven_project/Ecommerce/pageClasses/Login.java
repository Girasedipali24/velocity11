package Ecommerce.pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.ECommerce.BaseClass.SimpleBaseClass;

public class Login extends SimpleBaseClass{
  
	public Login (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy (id="Email")
	public WebElement Email;
	
	@FindBy(id="Password")
	public WebElement password;
	
	@FindBy (xpath="//button[contains(text(),'Log in')]")
	public WebElement login;
	
	public void email(String mail) {
		Email.sendKeys(mail);
	}
	public void Password(String pass) {
		password.sendKeys(pass);
	}
	public void Login() {
	      login.click();
	}
	
	
}

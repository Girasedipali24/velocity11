package Ecommerce.pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Com.ECommerce.BaseClass.SimpleBaseClass;
import Ecommerce.Utilities.GenericUtils;
  @Test
public class AddTocard extends SimpleBaseClass {

	public AddTocard (WebDriver driver ) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (id="Email")
	public WebElement Email;
	
	@FindBy(id="Password")
	public WebElement password;
	
	@FindBy (xpath="//button[contains(text(),'Log in')]")
	public WebElement login;
	
	@FindBy(xpath="//a[contains(text(),'Computers')]")
	public WebElement com;
	
	@FindBy(xpath="//a[contains(text(),' Notebooks ')]")
	public WebElement note;
	
	@FindBy(xpath="(//a[contains(text(),'Apple MacBook Pro 13-inch')])[1]")
	public WebElement apple;
	
	@FindBy(id="add-to-cart-button-4")
	public WebElement addtocart;
	
	@FindBy(xpath="//p[contains(text(),'The product has been added to your')] ")
	public WebElement Message;
	
	@FindBy(xpath="//span[@class=\"close\"]")
	public WebElement closetab;
	
	public void email(String mail) {
		Email.sendKeys(mail);
	}
	public void Password(String pass) {
		password.sendKeys(pass);
	}
	public void Login() {
	      login.click();
	}

   public void Add() {
	     addtocart.click();
   }
   public void Computer() {
	   com.click();
   }
   public void Notebook() {
	   note.click();
   }
   public void apple() {
	   apple.click();
   }
   public void addtoCart() {
	   addtocart.click();
   }
   public void Message() {
	   Message.isDisplayed();
   }
  public void close() {
	  closetab.click();
  }
  public void product() {
	  By input =By.xpath("(//img[@alt=\"Picture of Apple MacBook Pro 13-inch\"])[1]");
	  boolean result =GenericUtils.Waitforelement(driver, input, 20).isDisplayed();
	  if(result==true) {
		  logger.info("add to cart test case pass");
		  AssertJUnit.assertTrue(true);
	  }else {
		  logger.info("add to cart test case failed");
		  AssertJUnit.assertTrue(false);
	  }
  }
  
  
  
  
  }
  
  
  
  

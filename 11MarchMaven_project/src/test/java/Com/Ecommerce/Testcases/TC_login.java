package Com.Ecommerce.Testcases;

import org.testng.annotations.Test;

import Com.ECommerce.BaseClass.SimpleBaseClass;
import Ecommerce.pageClasses.Login;
import Ecommerce.pageClasses.Tc_NewRegistration;
import net.bytebuddy.utility.RandomString;

public class TC_login extends SimpleBaseClass{
	@Test
	public void Register() {
		
		  Tc_NewRegistration	 TC = new Tc_NewRegistration(driver);
		logger.info("NewRegistration");
		TC.NewRegistration();
		logger.info("login");
		TC.first("Dipali");
		logger.info("Firstname");
		TC.last("Girase");
		logger.info("lastname");
		TC.Selectgender();
       logger.info("male");
       TC.Selectgender2();
       logger.info("Female");
       String Name = RandomString.make(5);
       TC.email(Name+"girasedipali123@gmail.com");
       logger.info("email");
       TC.password("dipali123#$");
       logger.info("password");
       TC.confirmpassword("dipali123#$");
       logger.info("confirmpassword");
       TC.companyname("Velocity");
       logger.info("companyname");
       TC.Register();
       logger.info("register");
       logger.info("login successfully");
       TC.reg();
       logger.info("Continue");
      
       Login LG = new Login(driver);
      
		
	

}
}



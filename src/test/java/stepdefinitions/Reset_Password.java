package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import AppService_Utilities.PropertyLoader;
import Config.BrowserDriver;
import appElements.ResetPassword_Elements;
import io.cucumber.java.en.*;

public class Reset_Password {	
	static WebDriver driver;
	  	   public PropertyLoader reader = new PropertyLoader();
	   ResetPassword_Elements ResetPassword;
	 
		@Given("user starts ResetPassword page")
		public void user_start_ResetPassword_page() 
		{
			BrowserDriver.getCurrentDriver("chrome").get("https://dev.ezhireme.com/user/reset-password/6aa0011e-f40f-44b5-8833-d17a38133439");	
		}
		
		
		@When("^user inserts reset credentials \\\"(.*)\\\" and \\\"(.*)\\\"$")
		public void user_inserts_reset_credentials(String newPassword,String confirmPassword) throws InterruptedException
		{ 
			
			ResetPassword = PageFactory.initElements(BrowserDriver.getCurrentDriver(), ResetPassword_Elements.class);
			ResetPassword.insert_password(newPassword);
			ResetPassword.insert_confirmPassword(confirmPassword);
		}
		
		
		@Then("user click Save button")
		public void user_click_Save_button() throws InterruptedException 
		{
			Thread.sleep(2000);
			ResetPassword.user_click_save_button();
			 
		}			
}
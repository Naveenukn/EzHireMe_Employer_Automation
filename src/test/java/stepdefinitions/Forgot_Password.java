package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import AppService_Utilities.PropertyLoader;
import Config.BrowserDriver;
import appElements.ForgotPassword_Elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Forgot_Password {

	  
	   public PropertyLoader reader = new PropertyLoader();
	   ForgotPassword_Elements Forgot_Password;
	   
		    
				@Given("user starts ForgotPassword page")
				public void user_starts_ForgotPassword_page() 
				{
					BrowserDriver.getCurrentDriver("chrome").get("https://empr.ezhireme.com/auth/forgetpassword");	
				}
				
				@When("^user enter \"(.*)\"$") 
				public void user_enter(String username)
				{
					Forgot_Password = PageFactory.initElements(BrowserDriver.getCurrentDriver(), ForgotPassword_Elements.class);
					 
					Forgot_Password.user_enter(username); 
				}
				 
				@Then("user click Reset button")
				public void user_click_Reset_button() throws InterruptedException 
				{
					Forgot_Password.user_click_Reset_button();
					
				}	
				
				@Then("user click on the Login button for Forgot password page")
				public void user_click_on_the_Login_button_for_Forgot_password_page() throws InterruptedException 
				{
							
					BrowserDriver.getCurrentDriver("chrome").findElement(By.id("backtologin-emailNotSent")).click();
					
				}	
				
				
				@Then("user checks the Login page redirection from Forgot password page")
				public void user_checks_the_Login_page_redirection_from_Forgot_password_page() throws InterruptedException 
				{
					Thread.sleep(2000);	
					WebElement Login = BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("/html/body/app-root/div/app-login/main/div/div/div/div/div[2]/h6"));
					if (Login.isDisplayed())
					System.out.println("Yes! Login page is Redirected");
					else
					{
						System.out.println("No! Login page is not Redirected.");
					}
				}
				
				
				
					 
}

package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import AppService_Utilities.PropertyLoader;
import Config.BrowserDriver;
import appElements.Login_Elements;
import io.cucumber.java.en.*;

public class Login {
	 static WebDriver driver;
	  
	 String verify;
	  
	   public PropertyLoader reader = new PropertyLoader();
	   Login_Elements login;
	 
	   
			@Given("user start login page")
			public void user_start_login_page()  throws Throwable
			{ 
				Thread.sleep(2500);
			    BrowserDriver.getCurrentDriver("chrome").get("https://empr.ezhireme.com/auth/login");	
			    BrowserDriver.getCurrentDriver("chrome").manage().window().maximize();
			}
			
			
			
			@Given("user click on the login button for login page")
			public void user_click_on_the_login_button_for_login_page()  throws Throwable
			{ 
				Thread.sleep(2000);
				BrowserDriver.getCurrentDriver("chrome").findElement(By.id("logIn")).click(); 
				
			}
			
			 @Then("user check the Login page redirection")
			 public void  user_check_the_Login_page_redirection()  throws Throwable
			 {
				 Thread.sleep(2000);
				 WebElement Login= BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("/html/body/app-root/div/app-login/main/div/div/div/div/div[2]/h6"));
				 if (Login.isDisplayed()) 
				 {
					 System.out.println("Yes! Login page is Redirected");
				 }
				 else
				 {
					 System.out.println("No! Login page is not Redirected");
				 }
			 } 
			 
			 
			 
			 
			 @Given("user click on the ForgotPassword button from login page")
				public void user_click_on_the_ForgotPassword_button_from_login_page()  throws Throwable
				{ 
					Thread.sleep(2000);
					BrowserDriver.getCurrentDriver("chrome").findElement(By.id("forgotPassword")).click();
				}
			 
			 
			 
			 @Given("user click on the login button from Forgot Password page")
				public void user_click_on_the_login_button_from_Forgot_Password_page()  throws Throwable
				{ 
					Thread.sleep(3000);
					BrowserDriver.getCurrentDriver("chrome").findElement(By.id("backtologin-emailNotSent")).click();
				}
			 
			 
			 @Then("user check the ForgotPassword page redirection")
			 public void  user_check_the_ForgotPassword_page_redirection()  throws Throwable
			 {
				 Thread.sleep(2000);
				 WebElement Login= BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("/html/body/app-root/div/app-forget-password/main/div/div/div/div/div[2]/h6"));
				 if (Login.isDisplayed()) 
				 {
					 System.out.println("Yes! Forgot Password page is Redirected");
				 }
				 else
				 {
					 System.out.println("No! Forgot Password page is not Redirected");
				 }	
			 } 
			 

			
			 @Given("user enters credentials {string} and {string}")
			 public void user_enters_credentials(String un,String pw) throws Throwable
			 { 
				 login = PageFactory.initElements(BrowserDriver.getCurrentDriver(),Login_Elements.class);
				 login.inserts_username(un);
				 login.inserts_password(pw);
			 }
			
			 
 
			 @Then("user click on Log in button") 
				public void  user_click_on_Log_in_button() throws Throwable 
				{ 
				 login.click_login();
				}
			 
			 
			 
			 @Then("user checking the Login page") 
				public void user_checking_the_Login_page() throws Throwable 
					{
						Thread.sleep(2500);
						WebElement login=BrowserDriver.getCurrentDriver("chrome").findElement(By.id("login"));
						
						if (login.isDisplayed())         
						{
							System.out.println("No! Login is unsuccessfull."); 
						}
						else 
						{
							System.out.println("Yes! Login is successfull.");
						} 
					}
			 

			 
			 @Then("user checking the Login page for Positive scenario") 
				public void user_checking_the_Login_page_for_Positive_scenario() throws Throwable 
					{
						Thread.sleep(5000);
						WebElement dashboard=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div/app-dashboard/div[1]/div/h1"));
						
						if (dashboard.isDisplayed())         
						{
							System.out.println("Yes! Login is successfull."); 
						}
						else 
						{
							System.out.println("No! Login is unsuccessfull.");
						} 
					}
			 
			 
			 
			 @Then("user click on the Signup button for login page")
			 public void  user_click_on_the_Signup_button_for_login_page()  throws Throwable
			 {
				 Thread.sleep(2000);
				 BrowserDriver.getCurrentDriver("chrome").findElement(By.id("signUp")).click();
				
			 }
			 
			 
			 
			 @Then("user check the Signup page redirection")
			 public void  user_check_the_Signup_page_redirection()  throws Throwable
			 {
				 Thread.sleep(2000);
				 WebElement Signup= BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("/html/body/app-root/div/app-register/main/div/div/div/div/div[2]/h6"));
				 if (Signup.isDisplayed())
				 {
					 System.out.println("Yes! Sigup page is Redirected");
				 }
				 else
				 {
					 System.out.println("No! Signup page is not Redirected");
				 }	
			 }
			 
			
}


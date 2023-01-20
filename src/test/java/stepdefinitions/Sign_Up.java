package stepdefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import AppService_Utilities.PropertyLoader;
import Config.BrowserDriver;
import appElements.SignUp_Elements;
import io.cucumber.java.en.*;

public class Sign_Up {
	 static WebDriver driver;
	  
	 String verify;
	  
	   public PropertyLoader reader = new PropertyLoader();
	   SignUp_Elements signup;
	 
	   
@Given("^user start register page$")
			public void user_start_register_page()  throws Throwable
						{ 
							Thread.sleep(2000);
						    BrowserDriver.getCurrentDriver("chrome").get("https://empr.ezhireme.com/auth/register");	
						    BrowserDriver.getCurrentDriver("chrome").manage().window().maximize();
						}


 @Given("user enters credentials {string}{string}{string}{string}{string}{string}{string} and {string}")
			 public void user_enters_credentials(String cn,String cw, String lfn, String lln,String cnum,String e,String pw,String cpw) throws Throwable
						 { 
							 Thread.sleep(3000);
							 signup = PageFactory.initElements(BrowserDriver.getCurrentDriver(),SignUp_Elements.class);
							 signup.insert_companyName(cn);
							 signup.insert_companyWebsite(cw);
							 signup.click_industryType();
							 signup.insert_industryTypeOption();
							 signup.insert_legalFirstName(lfn);
							 signup.insert_legalLastName(lln);
							 signup.click_countrycode();
							 signup.insert_countryCodeOption();
							 signup.insert_contactNumber(cnum); 
							 signup.insert_email(e);
							 signup.insert_password(pw);
							 signup.insert_confirmPassword(cpw);
						  }
			 	 
 
@Then("user click on the Signup button") 
				public void user_click_on_the_Signup_button() throws Throwable 
							{
								 Thread.sleep(2000);
								 signup.click_signup();
						 	}
			 
			 
@Then("user checking the verify email page") 
				public void user_checking_the_verify_email_page() throws Throwable 
					{
						Thread.sleep(2500);
						WebElement signup=BrowserDriver.getCurrentDriver("chrome").findElement(By.id("signup"));
						if (signup.isDisplayed())         
						{
							System.out.println("No! Sign-Up is unsuccessfull."); 
						}
						else 
						{
							System.out.println("Yes! Sign-Up is successfull.");
						} 
					}

@Then("user checking the verify email page for positive scenario") 
					public void user_checking_the_verify_email_page_for_positive_scenario() throws Throwable 
						{
							Thread.sleep(2500);
							WebElement verifyemail=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("/html/body/app-root/div/app-not-verified/main/div/div/div/div/div[2]/div[1]/h3"));
							if (verifyemail.isDisplayed())         
							{
								System.out.println("Yes! Sign-Up is successfull"); 
							}
							else 
							{
								System.out.println("No! Sign-Up is unsuccessfull.");
							} 
						}


			 
			
}


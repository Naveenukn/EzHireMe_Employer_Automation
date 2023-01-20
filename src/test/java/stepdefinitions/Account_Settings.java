package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import AppService_Utilities.PropertyLoader;
import Config.BrowserDriver;
import appElements.Account_Settings_Elements;
import appElements.Login_Elements;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Account_Settings 
{
	
	static WebDriver driver;
	
	
	public PropertyLoader reader = new PropertyLoader();
	Account_Settings_Elements Account_Settings = PageFactory.initElements(BrowserDriver.getCurrentDriver(), Account_Settings_Elements.class);



@Given("user starts with the login page for Account settings page")
					    public void user_starts_with_the_login_page_for_account_settings_page()  throws Throwable  
					    {  
						 BrowserDriver.getCurrentDriver("chrome").get("https://empr.ezhireme.com/auth/login");	  
						 }

			
@When("^user enters email as \"([^\"]*)\" and password as \"([^\"]*)\"for Account settings page$")
							public void user_enters_email_as_something_and_password_as_something_for_account_settings_page() throws Throwable
						    { 
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("username")).sendKeys("naveensam444@gmail.com"); 
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("password")).sendKeys("Naveen@001"); 
								
								Thread.sleep(2000);
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("login")).click(); 
							 } 

@When("^user directs Account settings page$")
							public void user_directs_Account_settings_page() throws Throwable
							{
									Thread.sleep(2500);
									BrowserDriver.getCurrentDriver("chrome").get("https://empr.ezhireme.com/settings/account");
							}

@Then("users enter the account settings password with correct current password {string}")
							public void users_enter_the_account_settings_password_with_correct_current_password(String string)throws InterruptedException 
							{
								Thread.sleep(5000); 
								Account_Settings.inserts_currentpassword(string); 
							}

@When("user click on next button")
							public void user_click_on_next_button() throws Throwable
							{
								Thread.sleep(3000);
								Account_Settings.click_next();
							}

@Then("user enters valid newPassword and confirmPassword")
							public void user_enters_valid_newPassword_and_confirmPassword() throws InterruptedException 
							{
								Thread.sleep(5000); 
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("newPassword")).sendKeys("Jagan@1097"); 
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("confirmPassword")).sendKeys("Jagan@1097"); 								
							 }


@When("user click on save button") 
							public void user_click_on_save_button() throws Throwable
							{
								Thread.sleep(3000); 
								Account_Settings.click_save(); 
								Thread.sleep(2000);
							}  

@When("user entering login credentials") 
							public void user_entering_login_credentials() throws Throwable
							{
								Thread.sleep(10000); 
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("username")).sendKeys("Jagan192@fulltanker.com");
								Thread.sleep(1500);
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("password")).sendKeys("Jagan@1097"); 
								Thread.sleep(1500);
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("login")).click();
								
							}  

@Then("user logout") 
							public void user_logout() throws Throwable
							{
								Thread.sleep(8000); 
								BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/app-top-layout/nav/div[2]/div/div[2]/button")).click();
								BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/app-top-layout/nav/div[2]/div/div[2]/div/a[6]")).click();																
							}  
								
@Then("click on the next button")
							public void click_on_the_next_button() throws InterruptedException 
							{
								Thread.sleep(2000); 
								Account_Settings.click_next();
							}
								
@Then("check the account settings page redirection")
							public void check_the_account_settings_page_redirection() throws InterruptedException 
							{
								Thread.sleep(5000); 
								WebElement accountsettings=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-account-settings/div[1]/div/div[1]/h1"));
								if (accountsettings.isDisplayed())                                                                                                              
								{
									System.out.println("Account settings page is redirected");
								}
								else
								{
									System.out.println("Account settings page is not redirected");
									
								}
					 }			

@Then("click on the next button and goback button")
								public void click_on_the_next_button_and_goback_button() throws InterruptedException 
								{
									Thread.sleep(2000); 
									Account_Settings.click_next();
									Thread.sleep(4000);
									Account_Settings.click_goback(); 
								}
@Then("check the current password settings page redirection")
								public void check_the_current_password_settings_page_redirection() throws InterruptedException 
								{
									Thread.sleep(5000); 
									WebElement accountsettings=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-account-settings/div[2]/div/div/div/form/div/div[1]/label"));
									if (accountsettings.isDisplayed())                                                                                                              
									{
										System.out.println("Current password settings page is redirected");
									}
									else
									{
										System.out.println("Current password settings page is not redirected");
										
									}
								}	
               
@Then("user enters the valid newPassword and confirmPassword")
								public void user_enters_the_valid_newPassword_and_confirmPassword() throws InterruptedException 
								{
									Thread.sleep(5000); 
									BrowserDriver.getCurrentDriver("chrome").findElement(By.id("newPassword")).sendKeys("Jagan@1097"); 
									BrowserDriver.getCurrentDriver("chrome").findElement(By.id("confirmPassword")).sendKeys("Jagan@1097"); 								
								 }

@Then("check the Save button enable")
							public void check_the_Save_button_enable() throws InterruptedException 
							{
								Thread.sleep(5000);  
								WebElement accountsettings=BrowserDriver.getCurrentDriver("chrome").findElement(By.id("save"));
								if (accountsettings.isEnabled())                                                                                                              
								{
									System.out.println("Save button is enabled");
								}
								else
								{
									System.out.println("Save button is disabled");
									
								}
							}			


@Then("user enters the invalid newPassword and confirmPassword")
							public void user_enters_the_invalid_newPassword_and_confirmPassword() throws InterruptedException 
							{
								Thread.sleep(5000); 
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("newPassword")).sendKeys("4785"); 
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("confirmPassword")).sendKeys("7854"); 								
							 }

@Then("user enters only newPassword")
								public void user_enters_only_newpassword() throws InterruptedException 
								{
									Thread.sleep(5000); 
									BrowserDriver.getCurrentDriver("chrome").findElement(By.id("newPassword")).sendKeys("Jagan@1097"); 
								 }

@Then("user enters only confirmPassword")
								public void user_enetrs_only_confirmpassword() throws InterruptedException 
								{
									Thread.sleep(5000); 
									BrowserDriver.getCurrentDriver("chrome").findElement(By.id("confirmPassword")).sendKeys("Jagan@1097"); 								
								 }

@Then("user enters valid newPassword and invalid confirmPassword")
								public void user_enters_valid_newPassword_and_invalid_confirmPassword() throws InterruptedException 
								{
									Thread.sleep(5000); 	
									BrowserDriver.getCurrentDriver("chrome").findElement(By.id("newPassword")).sendKeys("Jagan@1097"); 
									BrowserDriver.getCurrentDriver("chrome").findElement(By.id("confirmPassword")).sendKeys("7895"); 								
								 }

@Then("user enters invalid newPassword and valid confirmPassword")
								public void user_enters_invalid_newPassword_and_valid_confirmPassword() throws InterruptedException 
								{
									Thread.sleep(5000); 	
									BrowserDriver.getCurrentDriver("chrome").findElement(By.id("newPassword")).sendKeys("1097"); 
									BrowserDriver.getCurrentDriver("chrome").findElement(By.id("confirmPassword")).sendKeys("Jagan@1097"); 								
								 }

@Then("user enters the valid newPassword and valid confirmPassword")
								public void user_enters_the_valid_new_password_and_valid_confirm_password() throws InterruptedException 
								{
									Thread.sleep(5000); 
									BrowserDriver.getCurrentDriver("chrome").findElement(By.id("newPassword")).sendKeys("Jagan@1097"); 
									BrowserDriver.getCurrentDriver("chrome").findElement(By.id("confirmPassword")).sendKeys("Jagan@1097"); 								
	 							}

@Then("check the reset button working")
							public void check_the_reset_button_working() throws InterruptedException 
							{
								Thread.sleep(5000);  
								Account_Settings.click_reset();
								WebElement accountsettings=BrowserDriver.getCurrentDriver("chrome").findElement(By.id("reset"));
								if (accountsettings.isSelected())                                                                                                              
								{
									System.out.println("Reset button is working");
								}
								else
								{
									System.out.println("Reset button is working");
									
								}
							}	



}

package appElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPassword_Elements {

	
	static WebDriver driver;
	@FindBy(id="email")								private WebElement username;
	@FindBy(id="reset")								private WebElement ResetButton;
	@FindBy(id="backtologin-emailNotSent")         	private WebElement Login;
	
	
	
	public ForgotPassword_Elements user_enter(String un)  
	{
		username.sendKeys(un);
		return this; 
	}
	
	
	public  ForgotPassword_Elements user_click_Reset_button() throws InterruptedException
	{
	    ResetButton.click();  
	    Thread.sleep(5000);
		return this;
	}
	
	public  ForgotPassword_Elements user_click_Login_button() throws InterruptedException
	{
		Login.click(); 
	  	return this;
     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
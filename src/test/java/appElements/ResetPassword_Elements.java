package appElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ResetPassword_Elements 
{

	
	static WebDriver driver;
	
	@FindBy(id="password")					private WebElement password;
	@FindBy(id="confirmPassword")       private WebElement confirmPassword;
	@FindBy(id="save")							private WebElement SaveButton;
	
				public ResetPassword_Elements insert_password(String pw)  throws InterruptedException
				{
					password.sendKeys(pw); 
					return this; 
				}
				public ResetPassword_Elements insert_confirmPassword(String cpw)  throws InterruptedException
				{
					confirmPassword.sendKeys(cpw);
					return this;  
				}
				
				
				public  ResetPassword_Elements user_click_save_button() throws InterruptedException
				{ 
				    SaveButton.click();
				    

					return this;
				}
				
}
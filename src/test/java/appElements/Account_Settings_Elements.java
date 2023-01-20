package appElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Account_Settings_Elements {

static WebDriver driver;

	@FindBy(id="currentPassword")					private WebElement currentPassword;
	@FindBy(id="next")										private WebElement next;
	@FindBy(id="newPassword")				 		private WebElement newPassword;
	@FindBy(id="confirmPassword")				private WebElement confirmPassword;
	@FindBy(id = "reset")   								private WebElement reset;
	@FindBy(id = "save")  									private WebElement save;
	@FindBy(id = "goBack")   								private WebElement goback;

	
	public Account_Settings_Elements inserts_currentpassword(String cp) throws InterruptedException 
	{
		Thread.sleep(1500); 
		currentPassword.sendKeys(cp);
		return this;	  
	} 
	
	public Account_Settings_Elements click_next() throws InterruptedException 
	{ 
		Thread.sleep(1500);
		next.click();
		return this;	 
	} 
	public Account_Settings_Elements inserts_newpassword(String np) throws InterruptedException 
	{
		Thread.sleep(3000);
		newPassword.sendKeys(np); 
		return this;	 
	} 
	public Account_Settings_Elements inserts_confirmpassword(String cpw) throws InterruptedException 
	{
		Thread.sleep(1500); 
		confirmPassword.sendKeys(cpw);
		return this;	 
	} 
	public Account_Settings_Elements click_reset() throws InterruptedException 
	{
		Thread.sleep(1500);
		reset.click();
		return this;	 
	} 
	public Account_Settings_Elements click_save() throws InterruptedException 
	{
		Thread.sleep(1500);
		save.click();
		return this;	 
	} 
	
	public Account_Settings_Elements click_goback() throws InterruptedException 
	{
		Thread.sleep(1500);
		goback.click();
		return this;	 
	}
	
}

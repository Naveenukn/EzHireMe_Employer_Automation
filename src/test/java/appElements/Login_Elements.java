package appElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Elements <Driver_Utility>
{

static WebDriver driver;

	@FindBy(id="username")					private WebElement username;
	@FindBy(id="password")					private WebElement password;
	@FindBy(id="login")				 		private WebElement login;
	@FindBy(id="signUp")					private WebElement signUp; 
	@FindBy(id="forgotPassword")  			private WebElement forgotPassword;
	@FindBy(id="logIn")   					private WebElement loginbuttonfromSignupPage;
	@FindBy(id="backtologin-emailNotSent")   private WebElement loginbuttonfromForgotPassword;
	
	
	public Login_Elements inserts_username(String un) throws InterruptedException 
	{
		Thread.sleep(1500);
		username.sendKeys(un); 
		return this;	 
	} 
	
	
	public Login_Elements  inserts_password(String pw) throws InterruptedException 
	{
		password.sendKeys(pw); 
		
		return this;
	}
	
	public Login_Elements  click_login() throws InterruptedException 
	{
		login.click();
		Thread.sleep(5000);
		return this;	
	}
	
	public Login_Elements  click_forgotPassword() 
	{
		
		forgotPassword.click();
			return this;
	}
	
	
	public Login_Elements  click_signUp() throws InterruptedException 
	{
		Thread.sleep(2000);
		signUp.click();
		return this;	
	}
	
	public Login_Elements  click_loginbuttonfromSignupPage() throws InterruptedException 
	{
		Thread.sleep(2000);
		loginbuttonfromSignupPage.click();
		return this;	
	}
	
	public Login_Elements  click_loginbuttonfromForgotPassword() throws InterruptedException 
	{
		Thread.sleep(2000);
		loginbuttonfromForgotPassword.click();
		return this;	
	}
	
 
	
	
	
}

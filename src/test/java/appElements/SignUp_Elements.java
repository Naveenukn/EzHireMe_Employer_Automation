package appElements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp_Elements 
{

static WebDriver driver;

	@FindBy(id="companyName")						private WebElement companyName;
	@FindBy(id="companyWebsite")					private WebElement companyWebsite;
	@FindBy(id="industryType")							private WebElement industryType;
	@FindBy(id="industryType")							private WebElement industryTypeOption;
	@FindBy(id="legalFirstName")						private WebElement legalFirstName;
	@FindBy(id="legalLastName")						private WebElement legalLastName;
	@FindBy(id="countrycode")							private WebElement countrycode; 
	@FindBy(id="countrycode")							private WebElement countryCodeOption;
	@FindBy(id="contactNumber")						private WebElement contactNumber;
	@FindBy(id="email")										private WebElement email;
	@FindBy(id="password")								private WebElement password;
	@FindBy(id="confirmPassword")					private WebElement confirmPassword;
	@FindBy(id="signup")									private WebElement signup; 
	@FindBy(linkText="Log in ")							private WebElement login;
	
	public SignUp_Elements insert_companyName(String cn) throws InterruptedException 
	{
		Thread.sleep(1500);
		companyName.sendKeys(cn );
		return this;	
	} 
	
	
	public SignUp_Elements  insert_companyWebsite(String cw) throws InterruptedException 
	{
		companyWebsite.sendKeys(cw);
		Thread.sleep(1000);
		return this;
	}
	
	public SignUp_Elements  click_industryType() throws InterruptedException 
	{
		industryType.click();
		return this;	
	}
	
	public  SignUp_Elements insert_industryTypeOption()throws InterruptedException  
	{	
		industryTypeOption.sendKeys(Keys.DOWN, Keys.ENTER);
		return this;
	}
	
	public SignUp_Elements  insert_legalFirstName(String lfn) 
	{
		legalFirstName.sendKeys(lfn);
		return this;	
	}
	
	public SignUp_Elements  insert_legalLastName(String lln) 
	{
		legalLastName.sendKeys(lln);
		return this;	  
	} 
	
	public SignUp_Elements  click_countrycode() throws InterruptedException 
	{
		countrycode.click();
		return this;	  
	} 
		
	public SignUp_Elements  insert_countryCodeOption() throws InterruptedException 
	{
		countryCodeOption.sendKeys(Keys.DOWN, Keys.ENTER);
		return this;	  
	} 
	
	public SignUp_Elements  insert_contactNumber(String cnum) throws InterruptedException 
	{
		contactNumber.sendKeys(cnum);
		return this;	  
	} 

	public SignUp_Elements  insert_email(String e) 
	{
		email.sendKeys(e);
		return this;	  
	} 
	
	public SignUp_Elements  insert_password(String pw) 
	{
		password.sendKeys(pw);
		return this;	  
	} 
	
	public SignUp_Elements  insert_confirmPassword(String cpw) 
	{
		confirmPassword.sendKeys(cpw);
		return this;
	}
	
	public SignUp_Elements  click_signup()throws InterruptedException 
	{
		signup.click();
		Thread.sleep(5000);
		return this;
	
	}
	
	public SignUp_Elements  click_login()throws InterruptedException 
	{
		
		login.click();
		return this;
	
	} 
	
	
	
}

package appElements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageUsers_Elements {


	static WebDriver driver;
	@FindBy(id="addUser")																																				private WebElement addUser;
	@FindBy(id="sortButton")																																			private WebElement sortButton;	
	@FindBy(xpath="//*[@id=\"pageCountDatatable\"]/span[2]/div/li/a[2]")																private WebElement sortButton80;	
	@FindBy(xpath="//*[@id=\"pageCountDatatable\"]/span[2]/div/li/a[8]")																private WebElement sortButton320;	
	@FindBy(xpath="//*[@id=\"goBack\"]/span[2]")																										private WebElement goBack;
	@FindBy(id="emailAddress")																																		private WebElement email;	
	@FindBy(id="password")																																				private WebElement password;
	@FindBy(id="confirmPassword")																																private WebElement confirmpassword;
	@FindBy(id="fullName")																																				private WebElement fullName;	
	@FindBy(id="countryCode")																																		private WebElement countryCodeOption;
	@FindBy(id="phoneNumber")																																		private WebElement phoneNumber;	
	@FindBy(id="status")																	 																				private WebElement statusOption;
	@FindBy(id="status")																																					private WebElement statusOption2;
	@FindBy(id="status")																																					private WebElement statusOption3;
	@FindBy(id="reset")																																						private WebElement reset;	
	@FindBy(id="submit")																																					private WebElement submit;
	@FindBy(id="orderby-button")																																	private WebElement orderbybutton;	
	@FindBy(xpath="//*[@id=\"dropdown-basic\"]/li[1]/a")																							private WebElement orderbybuttonOptionName;	
	@FindBy(xpath="//*[@id=\"dropdown-basic\"]/li[2]/a")																							private WebElement orderbybuttonOptionStatus;	
	@FindBy(id="search")																																					private WebElement search;
	@FindBy(xpath="/html/body/app-root/div/app-top-side-layout/div/main/div[1]/app-users-list/div[2]/div/div/div/table/tbody/tr[1]/td[5]/button[1]")							private WebElement edit;	
	@FindBy(id="delete")																																					private WebElement delete;
	@FindBy(id="x-close")																																					private WebElement xclose;	
	@FindBy(id="cancel")										 																											private WebElement cancel;
	@FindBy(id="yesDelete")												 																								private WebElement yesDelete;	
	@FindBy(xpath="//*[@id=\"app-container\"]/main/div[1]/app-users-list/div[3]/pagination-controls/pagination-template/nav/ul/li[4]/a/span[2]")										private WebElement pagination2;	
	@FindBy(className="pagination-next")																													private WebElement nextbutton;	
	@FindBy(className="pagination-previous")																												private WebElement previousbutton;	



	
	
	
	public ManageUsers_Elements click_adduser()
	{
		addUser.click();
		return this; 
	}
	
	public ManageUsers_Elements click_sortbutton()
	{
		sortButton.click();
		return this; 
	}
	
	public ManageUsers_Elements click_sortbutton80()
	{
		sortButton80.click();
		return this; 
	}
	
	public ManageUsers_Elements click_sortbutton320()
	{
		sortButton320.click();
		return this; 
	}
	
	public ManageUsers_Elements click_goback()
	{
		goBack.click();
		return this; 
	}
	
	public ManageUsers_Elements insert_email(String em)
	{
		email.clear();
		email.sendKeys(em); 
		return this; 
	}
	
	public ManageUsers_Elements insert_password(String pw)
	{
		password.clear();
		password.sendKeys(pw);
		return this; 
	} 
	
	public ManageUsers_Elements insert_fullName(String fn)
	{
		fullName.clear();
		fullName.sendKeys(fn);
		return this; 
	}
		
	public ManageUsers_Elements click_countrycodeOption() throws InterruptedException 
	{
		countryCodeOption.click();
		Thread.sleep(1000);
		countryCodeOption.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER);
		Thread.sleep(1000);
		return this; 
	}
	
	public ManageUsers_Elements insert_phoneNumber(String ph)
	{
		phoneNumber.clear();
		phoneNumber.sendKeys(ph);
		return this;  
	} 
	
	public ManageUsers_Elements click_statusOption()throws InterruptedException 
	{
		statusOption.click(); 
		Thread.sleep(1000);
		statusOption.sendKeys(Keys.DOWN,Keys.ENTER);
		Thread.sleep(1000);
		return this; 
	}
	public ManageUsers_Elements click_statusOption2()throws InterruptedException 
	{
		statusOption.click(); 
		Thread.sleep(1000);
		statusOption.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER);
		Thread.sleep(1000);
		return this; 
	}
	public ManageUsers_Elements click_statusOption3()throws InterruptedException 
	{
		statusOption.click(); 
		Thread.sleep(1000);
		statusOption.sendKeys(Keys.UP,Keys.UP,Keys.ENTER);
		Thread.sleep(1000);
		return this;  
	}
	
	public ManageUsers_Elements click_reset()
	{
		reset.click();
		return this; 
	}
	
	public ManageUsers_Elements click_submit()
	{
		submit.click();
		return this; 
	}
	
	public ManageUsers_Elements click_orderbybutton()
	{
		orderbybutton.click();
		return this; 
	}
	
	public ManageUsers_Elements click_orderbybuttonOptionName()
	{
		orderbybuttonOptionName.click();
		return this;  
	}

	public ManageUsers_Elements click_orderbybuttonOptionStatus()
	{
		orderbybuttonOptionStatus.click();
		return this;  
	}
	
	public ManageUsers_Elements insert_search(String srch)
	{
		search.sendKeys(srch);
		return this; 
	}
	
	public ManageUsers_Elements click_edit()
	{
		edit.click();
		return this; 
	}
	
	public ManageUsers_Elements click_delete()
	{
		delete.click();
		return this; 
	}
	
	public ManageUsers_Elements click_xclose()
	{
		xclose.click();
		return this; 
	}
	
	public ManageUsers_Elements click_cancel()
	{
		cancel.click();
		return this; 
	}
	
	public ManageUsers_Elements click_yesDelete()
	{
		yesDelete.click();
		return this; 
	}
	
	public ManageUsers_Elements click_pagination2()
	{
		pagination2.click();
		return this; 
	}
	public ManageUsers_Elements click_nextbutton()
	{
		nextbutton.click();
		return this; 
	}
	public ManageUsers_Elements click_previousbutton()
	{
		previousbutton.click();
		return this; 
	}
	
	
	
}

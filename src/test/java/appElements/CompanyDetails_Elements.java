package appElements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyDetails_Elements 

{
	
	static WebDriver driver;
	@FindBy(id="remove")												private WebElement removeImageclick;
	@FindBy(id="upload")												private WebElement uploadImage;
	@FindBy(id="companyName")  											private WebElement companyName;
	@FindBy(id="industryType")											private WebElement industryTypeOption;
	@FindBy(id="countryCode")											private WebElement countryCodeOption;
	@FindBy(id="phoneNumber")											private WebElement phoneNumber;
	@FindBy(id="website")												private WebElement website;
	@FindBy(className="custom-control-label")             		        private WebElement allowbutton;
	@FindBy(id="description")										private WebElement description;
	@FindBy(id="save1")						private WebElement save1;
	@FindBy(id="reset1")												private WebElement reset1;
	@FindBy(id="location")												private WebElement location;	
	@FindBy(id="location")												private WebElement locationsendkeys; 
	@FindBy(id="completeAddress")								private WebElement completeAddress;
	@FindBy(xpath="//*[@id=\"save2\"]")						private WebElement save2;
	@FindBy(id="reset2")												private WebElement reset2;
	@FindBy(id="facebook")											private WebElement facebook;
	@FindBy(id="twitter")												private WebElement twitter;
	@FindBy(id="linkedIn")												private WebElement linkedIn;
	@FindBy(id="Instagram")											private WebElement Instagram;
	@FindBy(xpath="//*[@id=\"save3\"]")						private WebElement save3;
	@FindBy(id="reset3")												private WebElement reset3; 
	
	
	//tag1 
	@FindBy(id="companyName")									private WebElement INcompanyName; 
	@FindBy(id="phoneNumber")									private WebElement INphoneNumber;
	@FindBy(id="email")													private WebElement INemailAddress;
	@FindBy(id="website")												private WebElement INwebsite;
	@FindBy(id="description")										private WebElement IncompanyInfo; 
	
	
	  
	public  CompanyDetails_Elements removeImageclick()
	{
		removeImageclick.click();
		return null;
	} 
	
	public   CompanyDetails_Elements  user_uploadImage(String string)  
	{
		//F:\\Pic\\Naveen (2).jpg
		uploadImage.sendKeys(string); 
		return this; 
	}

	public   CompanyDetails_Elements enter_companyname(String cn)  
	{
		companyName.clear();
		companyName.sendKeys(cn);
		return this; 
	}


	public   CompanyDetails_Elements  insert_industryTypeOption()  throws InterruptedException  
	{
		industryTypeOption.click();
		industryTypeOption.sendKeys(Keys.DOWN, Keys.ENTER);
		return this;  
	}
	
	
	public   CompanyDetails_Elements  insert_countryCodeOption()  
	{
		countryCodeOption.click();
		countryCodeOption.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
		
		return this; 
	}

	public   CompanyDetails_Elements  enter_phoneNumber(String ph)  
	{
		phoneNumber.clear();
		phoneNumber.sendKeys(ph); 
		return this; 
	}

	
	public   CompanyDetails_Elements  enter_website(String web)  
	{
		website.clear();
		website.sendKeys(web);
		return this; 
	}
	
	
	public   CompanyDetails_Elements  click_allowbutton()  throws InterruptedException  
	{
		allowbutton.click();
		return this; 
	}
	
	public   CompanyDetails_Elements  enter_description(String des)  
	{
		description.clear();
		description.sendKeys(des);
		return this; 
	}

	public   CompanyDetails_Elements  click_save1()  throws InterruptedException  
	{
		save1.click();
		return this; 
	} 

	public   CompanyDetails_Elements  click_reset1()  throws InterruptedException  
	{
		reset1.click();
		return this; 
	}

	public   CompanyDetails_Elements  enter_location(String loc)  
	{
		location.sendKeys(loc);
		return this; 
	}
	
	public   CompanyDetails_Elements  enter_locationSendkeys()throws InterruptedException  
	{
		locationsendkeys.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		return this; 
	}
 
	public   CompanyDetails_Elements  enter_completeAddress(String ca)  
	{
		completeAddress.clear();
		completeAddress.sendKeys(ca);
		return this; 
	}

	public   CompanyDetails_Elements  click_save2()  throws InterruptedException  
	{
		save2.click();
		return this; 
	}

	public   CompanyDetails_Elements  click_reset2()  throws InterruptedException  
	{
		reset2.click();
		return this; 
	}

	public   CompanyDetails_Elements  enter_facebook(String fb)  
	{
		facebook.clear();
		facebook.sendKeys(fb);
		return this; 
	}

	public   CompanyDetails_Elements  enter_twitter(String tw)  
	{
		twitter.clear();
		twitter.sendKeys(tw);
		return this; 
	}

	public   CompanyDetails_Elements  enter_linkedIn(String li)  
	{
		linkedIn.clear();
		linkedIn.sendKeys(li);
		return this; 
	}

	public   CompanyDetails_Elements  enter_instagram(String ins)  
	{
		Instagram.click();
		Instagram.sendKeys(ins);
		return this; 
	}

	public   CompanyDetails_Elements  click_save3()  throws InterruptedException  
	{
		save3.click();
		return this; 
	}
	
	public   CompanyDetails_Elements  click_reset3()  throws InterruptedException  
	{
		reset3.click();
		return this; 
	}
	
	
	
	
	//tag1

	public  CompanyDetails_Elements insert_INcompanyName(String icn)
	{
		INcompanyName.clear();
		INcompanyName.sendKeys(icn);
		return null;  
	}
	public  CompanyDetails_Elements insert_INphoneNumber(String iph)
	{
		INphoneNumber.clear();
		INphoneNumber.sendKeys(iph);
		return null; 
	} 
	public  CompanyDetails_Elements insert_INemailAddress(String iea)
	{
		INemailAddress.clear();
		INemailAddress.sendKeys(iea);
		return null; 
	} 
	public  CompanyDetails_Elements insert_INwebsite(String iw)
	{
		INwebsite.clear();
		INwebsite.sendKeys(iw);
		return null;  
	} 
	public  CompanyDetails_Elements insert_IncompanyInfo(String ici)
	{
		IncompanyInfo.clear();
		IncompanyInfo.sendKeys(ici);
		return null; 
	} 
	

	

	
	
	
	
	
	

}

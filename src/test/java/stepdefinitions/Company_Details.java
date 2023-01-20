package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import AppService_Utilities.PropertyLoader;
import Config.BrowserDriver;
import appElements.CompanyDetails_Elements;
import appElements.Login_Elements;
import io.cucumber.java.en.*;

public class Company_Details {
	
	static WebDriver driver;
	
	
			public PropertyLoader reader = new PropertyLoader();
			CompanyDetails_Elements Company_Details = PageFactory.initElements(BrowserDriver.getCurrentDriver(), CompanyDetails_Elements.class);
	

	  
	  
  @Given("user starts with the login page")
				    public void user_starts_with_the_login_page()  throws Throwable  
				    {  
					 BrowserDriver.getCurrentDriver("chrome").get("https://empr.ezhireme.com/auth/login");	
					 }
	  					
  
 
	  @When("user enters email as {string} and password as {string}")
   					public void user_enters_email_as_something_and_password_as_something(String un, String pw) throws Throwable
				    { 
						   BrowserDriver.getCurrentDriver("chrome").findElement(By.id("username")).sendKeys("naveensam444@gmail.com"); 
							BrowserDriver.getCurrentDriver("chrome").findElement(By.id("password")).sendKeys("Naveen@001"); 
							
							Thread.sleep(2000);
							BrowserDriver.getCurrentDriver("chrome").findElement(By.id("login")).click(); 
		    		 } 
					 
   @When("^user directs Company details page$")
			    	    public void user_directs_company_details_page() throws Throwable
			           {
	   						Thread.sleep(7000);
	   						BrowserDriver.getCurrentDriver("chrome").get("https://empr.ezhireme.com/companyprofile/edit");	
			           }
			    	
   @When("user inserts Company details {string}{string}{string}{string}{string}{string}")
			    		public void user_inserts_company_details(String string, String string2, String string3, String string4, String string5, String string6) throws InterruptedException 
			    	{
		   					{
		   						driver = BrowserDriver.getCurrentDriver("chrome");
					    	Thread.sleep(1000); 
					    	JavascriptExecutor js = (JavascriptExecutor) driver;
					    	js.executeScript("window.scrollBy(0,500)", "");
					    	Thread.sleep(1000);
					    	BrowserDriver.getCurrentDriver("chrome").findElement(By.id("description")).sendKeys(" ");
						  	Company_Details.click_reset1(); 
						  	Thread.sleep(1000);
						  	BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div/app-edit-profile/div[2]/div/div/div[3]/button[2]")).click();							
					    	js.executeScript("window.scrollBy(0,-400)", "");
					    	}
		   					
					      	 Thread.sleep(3500); 
					         Company_Details.enter_companyname(string2);
					     	 Company_Details.insert_industryTypeOption();
					     	 Company_Details.insert_countryCodeOption();
					    	 Company_Details.enter_phoneNumber(string3);
					    	 Thread.sleep(800);   
					      	 Company_Details.user_uploadImage(string);	
					      	Thread.sleep(2500);  
					       	 Company_Details.enter_website(string5); 
					    	 Thread.sleep(1500);
					    	 Company_Details.enter_description(string6);    	
				    	 }
			
	@Then("^user click the Company details Save button$")
						    public void user_click_the_Company_details_Save_button() throws Throwable
						    {
						    	driver = BrowserDriver.getCurrentDriver("chrome");
						    	Thread.sleep(1000);
						    	JavascriptExecutor js = (JavascriptExecutor) driver;
						    	js.executeScript("window.scrollBy(0,500)", "");
						    	
						    	 Boolean nn =BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"save1\"]")).isEnabled();
						         if(nn) {
						               System.out.println("Yes! Company details Save button is Enabled");
						         }
						         else {
						               System.out.println("No! Company details Save button is Disabled");
						         }
						           Thread.sleep(2000);
						           Company_Details.click_save1();						                         
				            }
	
	 @When("user inserts Contact information {string}{string}")
							    public void user_inserts_contact_information(String string, String string2) throws InterruptedException
							   {
		 							{
								    	Thread.sleep(5000);
									  	Company_Details.click_reset2();
								    	
								   	}  
										
									    Thread.sleep(1000);
								        Company_Details.enter_location(string);
								        Thread.sleep(2000);
								        Company_Details.enter_locationSendkeys();
								        Thread.sleep(1500);
								        Company_Details.enter_completeAddress(string2);
									 } 

	 
@Then("^user click the Contact information Save button$")
							 public void user_click_the_Contact_information_Save_button() throws Throwable
									  
									{
										 driver = BrowserDriver.getCurrentDriver("chrome");
										Thread.sleep(1000);
										JavascriptExecutor js = (JavascriptExecutor) driver;
										js.executeScript("window.scrollBy(0,350)", "");
									    	
									    	 Boolean nn =BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"save2\"]")).isEnabled();
									         if(nn) {
									               System.out.println("Yes! Contact information Save button is Enabled");
									         }
									         else {
									               System.out.println("No! Contact information Save button is Disabled");
									         }
									          
									         Thread.sleep(2000);
									           Company_Details.click_save2();
									    }
      

@When("user inserts Social network information {string}{string}{string}{string}")
								 public void user_inserts_Social_network_information(String string, String string2, String string3, String string4) throws InterruptedException
										{
													{	driver = BrowserDriver.getCurrentDriver("chrome");
														Thread.sleep(1000);
														JavascriptExecutor js = (JavascriptExecutor) driver;
														js.executeScript("window.scrollBy(0,500)", "");
														Thread.sleep(3000);
													  	Company_Details.click_reset3(); 
														
													}
													
												Thread.sleep(2000);
										   Company_Details.enter_facebook(string);
										   Thread.sleep(500);
											Company_Details.enter_twitter(string2);
											Thread.sleep(500);
										    Company_Details.enter_linkedIn(string3); 
										    Thread.sleep(500);
										   	Company_Details.enter_instagram(string4); 	
										 }
 
@Then("^user click the Social network Save button$") 
									public void user_click_the_Social_network_Save_button() throws Throwable
										{
											    driver = BrowserDriver.getCurrentDriver("chrome");
										    	Thread.sleep(1000);
										    	JavascriptExecutor js = (JavascriptExecutor) driver;
										    	js.executeScript("window.scrollBy(0,350)", "");
										    	
										    	
										    	 Boolean nn =BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"save3\"]")).isEnabled();
										         if(nn) {
										               System.out.println("Yes! Social netwok Save button is Enabled");
										         }
										         else {
										               System.out.println("No! Social netwok Save button is Disabled");
										         }
										         
										         
										           Thread.sleep(3000);
										           Company_Details.click_save3();
										             
										           Thread.sleep(8000);
											        BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/app-top-layout/nav/div[2]/div/div[2]/button")).click();
											        Thread.sleep(1000);
											        BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/app-top-layout/nav/div[2]/div/div[2]/div/a[6]")).click();
											        	
				    }



//@tag1

	@Given("user starts the login page")
								public void user_starts_the_login_page()  throws Throwable  
								{  
								Thread.sleep(2000);
								 BrowserDriver.getCurrentDriver("chrome").get("https://empr.ezhireme.com/auth/login");	
								 }
										
	@When("^user enters the email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
								    public void user_enters_the_email_as_something_and_password_as_something(String un, String pw) throws Throwable
								    { 
											BrowserDriver.getCurrentDriver("chrome").findElement(By.id("username")).sendKeys("Jagan192@fulltanker.com"); 
											BrowserDriver.getCurrentDriver("chrome").findElement(By.id("password")).sendKeys("Jagan@1010"); 
											
											Thread.sleep(2000);
											BrowserDriver.getCurrentDriver("chrome").findElement(By.id("login")).click(); 
								    } 
							 
	@When("^user directs to the Company details page$")
						    	   public void user_directs_to_the_company_details_page() throws Throwable
						           {
				        	 		Thread.sleep(2500); 
									 BrowserDriver.getCurrentDriver("chrome").get("https://devemployer.ezhireme.com/companyprofile/edit");	
								   } 
	



    @When("user inserts the {string}")
    					public void user_inserts_the(String profileimage) throws Throwable
							    {
									    	{
													driver = BrowserDriver.getCurrentDriver("chrome");
									    	Thread.sleep(1000); 
									    	JavascriptExecutor js = (JavascriptExecutor) driver;
									    	js.executeScript("window.scrollBy(0,300)", "");
									    	Thread.sleep(1000);
										  	Company_Details.click_reset1();
											
									    	js.executeScript("window.scrollBy(0,-300)", "");
									    	}
										      	 Thread.sleep(1500); 
										      	Company_Details.user_uploadImage(profileimage);
							    }
    
    
    @Then("^user inserts the companyname  as \"([^\"]*)\"$")
    public void user_inserts_the_companyname_as_something(String icn) throws Throwable 
							    {
							        Thread.sleep(3500);
							        Company_Details.insert_INcompanyName(icn);
							    } 
    
  
    @When("user selects industry type")
    	public void user_selects_industry_type()  throws Throwable 
						    	{
						    	   Thread.sleep(1500);
						    	   Company_Details.insert_industryTypeOption();
						    	}

     	@When("user selects country code")
    	public void user_selects_country_code()  throws Throwable 
						    	{
						    	   Thread.sleep(1500);
						    	   Company_Details.insert_countryCodeOption();
						    	}

    @When("^user inserts the phonenumber as \"([^\"]*)\"$")
							    public void user_inserts_the_phonenumber_as_something(String iph) throws Throwable 
							    {
    								Thread.sleep(500);
    							   
							        Company_Details.insert_INphoneNumber(iph); 
							    }

    @When("^user inserts the emailaddress as \"([^\"]*)\"$")
							    public void user_inserts_the_emailaddress_as_something(String iea) throws Throwable
							    {
    								
    								Company_Details.insert_INemailAddress(iea);
							    } 

    @When("^user inserts the website as \"([^\"]*)\"$")
							    public void user_inserts_the_website_as_something(String iw) throws Throwable
							    {
    								Company_Details.insert_INwebsite(iw);
							    }

    @When("^user inserts the companyinfo as \"([^\"]*)\"$")
							    public void user_inserts_the_companyinfo_as_something(String ici) throws Throwable
							    {
    								Company_Details.insert_IncompanyInfo(ici);
							    }
    @When("^user inserts the invalidemail as \"([^\"]*)\"$")
    public void user_inserts_the_invalidemail_as_something(String iea) throws Throwable
							    {
									Company_Details.insert_INemailAddress(iea);
							    }

     
    @Then("^check the Company details Save button is Enabled or Disabled$")
							    public void check_the_Company_details_Save_button_is_enabled_or_disabled() throws Throwable
							    {
    									Thread.sleep(1500);
								    	driver = BrowserDriver.getCurrentDriver("chrome");
								    	Thread.sleep(1000);
								    	JavascriptExecutor js = (JavascriptExecutor) driver; 
								    	js.executeScript("window.scrollBy(0,350)", "");
								    	Thread.sleep(2500);
								    	 Boolean nn =BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"save1\"]")).isEnabled();
								         if(nn) {
								               System.out.println("Yes! Company details Save button is Enabled");
								         }
								         else {
								               System.out.println("No! Company details Save button is Disabled");
								         }
								         Thread.sleep(1000);
								         js.executeScript("window.scrollBy(0,-350)", "");
								         
							    }
    
    @When("user logout the page")
    public void user_logout_the_page() throws Throwable
							    {
							    	Thread.sleep(3000);
							        BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/app-top-layout/nav/div[2]/div/div[2]/button")).click();
							        Thread.sleep(1000);
							        BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/app-top-layout/nav/div[2]/div/div[2]/div/a[6]")).click();
							        	
							    }
    
    @When("user changes the Profile image {string}")
								public void user_changes_the_Profile_image(String profileimage) throws Throwable
									    {
											   Thread.sleep(2500); 
									           Company_Details.removeImageclick();
									           Thread.sleep(1500);
									           Company_Details.user_uploadImage(profileimage);
									     }
							 
    @When("user changes the Company Name {string}")
								public void user_changes_the_Company_Name(String cn) throws Throwable
									    {
									           Thread.sleep(2500);
									           Company_Details.enter_companyname(cn);
									    }
    
    @When("user changes the Industry type")
								public void user_changes_the_Industry_type() throws Throwable
									    {
									           Thread.sleep(2500);
									           Company_Details.insert_industryTypeOption();
									    }
    
    @When("user changes the Country code")
								public void user_changes_the_Country_code() throws Throwable
									    { 
									           Thread.sleep(2500);
									           Company_Details.insert_countryCodeOption(); 
									    }
    
    
    @When("user changes the Phone number {string}")
								public void user_changes_the_Phone_number(String ph) throws Throwable
									    { 
									           Thread.sleep(2500);
									           Company_Details.enter_phoneNumber(ph); 
									    }
    
    
    
    @When("user changes the Website {string}")
								public void user_changes_the_Website(String web) throws Throwable
									    { 
									           Thread.sleep(2500);
									           Company_Details.enter_website(web); 
									    } 
    
    
    @When("user changes the Company info {string}")
								public void user_changes_the_Company_info(String des) throws Throwable
									    { 
									           Thread.sleep(2500);
									           Company_Details.enter_description(des);
									    } 
    
    @When("user changes the Location {string}")
								public void user_changes_the_Location(String loc) throws Throwable
									    { 
    	
										    	Thread.sleep(1500);
										    	driver = BrowserDriver.getCurrentDriver("chrome");
										    	Thread.sleep(1000);
										    	JavascriptExecutor js = (JavascriptExecutor) driver; 
										    	js.executeScript("window.scrollBy(0,750)", "");
										    	
									           Thread.sleep(2500);
									           Company_Details.enter_location(loc);
									           Thread.sleep(2000);
									           Company_Details.enter_locationSendkeys();
									    } 

    @Then("^check the Contact information Save button is Enabled or Disabled$")
								    public void check_the_Contact_information_Save_button_is_enabled_or_disabled() throws Throwable
								    {
											Thread.sleep(1500);
									    	driver = BrowserDriver.getCurrentDriver("chrome");
									    	Thread.sleep(1000);
									    	JavascriptExecutor js = (JavascriptExecutor) driver; 
									    	js.executeScript("window.scrollBy(0,350)", "");
									    	Thread.sleep(2500);
									    	 Boolean nn =BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"save2\"]")).isEnabled();
									         if(nn) {
									               System.out.println("Yes! Contact information Save button is Enabled");
									         }
									         else {
									               System.out.println("No! Contact information Save button is Disabled");
									         }
									         Thread.sleep(1000);
									         js.executeScript("window.scrollBy(0,-350)", "");
									         
								    }
	 	
   
    @When("user adds the Facebook info {string}")
									    public void user_adds_the_facebook_info(String fb) throws InterruptedException 
    								{
											    	{
														driver = BrowserDriver.getCurrentDriver("chrome");
												Thread.sleep(1000); 
												JavascriptExecutor js = (JavascriptExecutor) driver;
												js.executeScript("window.scrollBy(0,1000)", "");
												Thread.sleep(1000);
											  	Company_Details.click_reset3();
												
													}
											    	Thread.sleep(2500);
											    	Company_Details.enter_facebook(fb);
												    	
									}
    
   
    	@When("user adds the Twitter info {string}")
									    	public void user_adds_the_twitter_info(String tw) throws InterruptedException 
									    	{
											    		{
															driver = BrowserDriver.getCurrentDriver("chrome");
													Thread.sleep(1000); 
													JavascriptExecutor js = (JavascriptExecutor) driver;
													js.executeScript("window.scrollBy(0,1000)", "");
													Thread.sleep(1000);
												  	Company_Details.click_reset3();
													
														}
												    	Thread.sleep(2500);
												    	Company_Details.enter_twitter(tw);
									    	}
    	
    	@When("user adds the LinkedIn info {string}")
									    	public void user_adds_the_linkedin_info(String li) throws InterruptedException 
									    	{
											    		{
															driver = BrowserDriver.getCurrentDriver("chrome");
													Thread.sleep(1000); 
													JavascriptExecutor js = (JavascriptExecutor) driver;
													js.executeScript("window.scrollBy(0,1000)", "");
													Thread.sleep(1000);
												  	Company_Details.click_reset3();
													
														}
												    	Thread.sleep(2500);
												    	Company_Details.enter_linkedIn(li);
									    	}
    	
    	@When("user adds the Instagram info {string}")
									    	public void user_adds_the_instagram_info(String ins) throws InterruptedException 
									    	{
											    		{
															driver = BrowserDriver.getCurrentDriver("chrome");
													Thread.sleep(1000); 
													JavascriptExecutor js = (JavascriptExecutor) driver;
													js.executeScript("window.scrollBy(0,1000)", "");
													Thread.sleep(1000);
												  	Company_Details.click_reset3();
													
														}
												    	Thread.sleep(2500);
												    	Company_Details.enter_instagram(ins);
									    	}


    	
  	@When("user resets and adds the Facebook info {string}")
								    		public void user_resets_and_adds_the_facebook_info(String fb) throws InterruptedException 
										{
											  	{
														driver = BrowserDriver.getCurrentDriver("chrome");
												Thread.sleep(1000); 
												JavascriptExecutor js = (JavascriptExecutor) driver;
												js.executeScript("window.scrollBy(0,1000)", "");
												Thread.sleep(1000);
											  	Company_Details.click_reset3();
												Thread.sleep(1000);
											  	Company_Details.enter_facebook(fb);
											}
								    	}
 	
  	@When("user resets and adds the Twitter info {string}")
								    		public void user_resets_and_adds_the_twitter_info(String tw) throws InterruptedException 
										{
											  {
														driver = BrowserDriver.getCurrentDriver("chrome");
												Thread.sleep(1000); 
												JavascriptExecutor js = (JavascriptExecutor) driver;
												js.executeScript("window.scrollBy(0,1000)", "");
												Thread.sleep(1000);
											  	Company_Details.click_reset3();
												Thread.sleep(1000);
											  	Company_Details.enter_twitter(tw);
												}
								    	}

 	
  	@When("user resets and adds the LinkedIn info {string}")
								    		public void user_resets_and_adds_the_linkedin_info(String li) throws InterruptedException 
										{
											  	{
																driver = BrowserDriver.getCurrentDriver("chrome");
														Thread.sleep(1000); 
														JavascriptExecutor js = (JavascriptExecutor) driver;
														js.executeScript("window.scrollBy(0,1000)", "");
														Thread.sleep(1000);
													  	Company_Details.click_reset3();
														Thread.sleep(1000);
													  	Company_Details.enter_linkedIn(li);
													}
								    	}
  	
  	@When("user resets and adds the Instagram info {string}")
											public void user_resets_and_adds_the_instagram_info(String ins) throws InterruptedException 
										{
											  {
														driver = BrowserDriver.getCurrentDriver("chrome");
														Thread.sleep(1000); 
														JavascriptExecutor js = (JavascriptExecutor) driver;
														js.executeScript("window.scrollBy(0,1000)", "");
														Thread.sleep(1000);
													  	Company_Details.click_reset3();
														Thread.sleep(1000);
													  	Company_Details.enter_instagram(ins);
													}
										}

    
    	@Then("check the Social network Save button is Enabled or Disabled")
								    	public void check_the_social_network_save_button_is_enabled_or_disabled() throws InterruptedException 
    								{
								    		Thread.sleep(1500);
									    	
									    	 Boolean nn =BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"save3\"]")).isEnabled();
									         if(nn) {
									               System.out.println("Yes! Social network Save button is Enabled");
									         }
									         else {
									               System.out.println("No! Social network Save button is Disabled");
									         }
									         
									        
								    }






}

				         
				        


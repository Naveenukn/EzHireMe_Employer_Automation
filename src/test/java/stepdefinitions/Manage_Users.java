package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import AppService_Utilities.PropertyLoader;
import Config.BrowserDriver;
import appElements.Login_Elements;
import appElements.ManageUsers_Elements;
import io.cucumber.java.en.*;

public class Manage_Users {
	
	static WebDriver driver;
	
	public PropertyLoader reader = new PropertyLoader();
	ManageUsers_Elements ManageUsers = PageFactory.initElements(BrowserDriver.getCurrentDriver(), ManageUsers_Elements.class);

	Login_Elements loginpage = new Login_Elements();
	 
	
	  
@Given("user starts with the login page for Manage users page")
					    public void user_starts_with_the_login_page_for_manage_users_page()  throws Throwable  
					    {  
						 		BrowserDriver.getCurrentDriver("chrome").get("https://empr.ezhireme.com/auth/login");	
						 }
		  					 
@When("^user enters email as \"([^\"]*)\" and password as \"([^\"]*)\"for Manage users page$")
		   					public void user_enters_email_as_something_and_password_as_something_for_manage_users_page(String un, String pw) throws Throwable
						    { 
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("username")).sendKeys("Jagan192@fulltanker.com"); 
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("password")).sendKeys("Jagan@1010"); 
								
								Thread.sleep(2000);
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("login")).click(); 
				    		 } 
							 
@When("^user directs Manage users page$")
				    	    public void user_directs_Manage_users_page() throws Throwable
				           {
		   						Thread.sleep(10000);
		   						BrowserDriver.getCurrentDriver("chrome").get("https://empr.ezhireme.com/manageusers/addedituser");	
				           }
				    
@When("user inserts User details {string}{string}{string}{string}")
							public void user_inserts_user_details(String em, String pw, String fn, String ph) throws InterruptedException 
							{
				   					Thread.sleep(2000)	;
				   					ManageUsers.insert_email(em);
				   					Thread.sleep(1000);
				   					ManageUsers.insert_password(pw);
				   					Thread.sleep(1000);
				   					ManageUsers.insert_fullName(fn);
				   					Thread.sleep(1000);
				   					ManageUsers.click_countrycodeOption();
				   					Thread.sleep(2000);
				   					ManageUsers.insert_phoneNumber(ph);
				   					Thread.sleep(1000);
				   					ManageUsers.click_statusOption();
							}
	
@When("^user click on the Create button$")
	   						public void user_click_on_the_create_button() throws Throwable
			   						{
				   							driver = BrowserDriver.getCurrentDriver("chrome");
									    	Thread.sleep(2000);
									    	JavascriptExecutor js = (JavascriptExecutor) driver;
									    	js.executeScript("window.scrollBy(0,500)", "");
									    	
									    	 Boolean nn =BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"submit\"]")).isEnabled();
									         if(nn)
									         {
									               System.out.println("Yes! Add user Create button is Enabled");
									         }
									         else
									         {
									               System.out.println("No! Add user Create button is Disabled");
									         }
						   					Thread.sleep(3000);
						   					ManageUsers.click_submit(); 
						   					Thread.sleep(12500);
						   					BrowserDriver.getCurrentDriver("chrome").get("https://empr.ezhireme.com/manageusers/userslist");	
						   					
						   				}
			   
 @When("user inserts email address {string}")
									   public void user_inserts_email_address(String em) throws InterruptedException 
									   {
										   Thread.sleep(3000)	;
											ManageUsers.insert_email(em);
									   }
 
@When("user inserts password {string}")
								   public void user_inserts_password(String pw) throws InterruptedException 
								   {
									   Thread.sleep(2000)	;
										ManageUsers.insert_password(pw);
								   }

@When("user inserts fullname {string}")
								   public void user_inserts_fullname(String fn) throws InterruptedException 
								   {
									   Thread.sleep(2000)	;
									   ManageUsers.insert_fullName(fn);						
								   }

@When("user inserts country code and phoneNumber {string}")
								   public void user_inserts_country_code_and_phonenumber(String ph) throws InterruptedException 
								   {
									   Thread.sleep(2000);
									   ManageUsers.click_countrycodeOption();
									   ManageUsers.insert_phoneNumber(ph);					
								   }

@When("user select status {string}")
								   public void user_select_status(String ph) throws InterruptedException 
								   {
									   Thread.sleep(2000);
									   ManageUsers.click_statusOption();									
								   }

@When("^check the Create button is Enabled or Disabled$")
									public void check_the_create_button_is_enabled_or_disabled() throws Throwable
									{
										   driver = BrowserDriver.getCurrentDriver("chrome");
									    	Thread.sleep(1000);
									    	JavascriptExecutor js = (JavascriptExecutor) driver;
									    	js.executeScript("window.scrollBy(0,500)", "");
									    	
									    	 Boolean nn =BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"submit\"]")).isEnabled();
									         if(nn)
									         {
									               System.out.println("Yes! Add user Create button is Enabled");
									         }
									         else 
									         {
									               System.out.println("No! Add user Create button is Disabled");
									         } 
									}
 

@When("user directs to the Manage users page")
											public void user_directs_to_the_Manage_users_page() throws Throwable
											{
													Thread.sleep(10000);
													BrowserDriver.getCurrentDriver("chrome").get("https://empr.ezhireme.com/manageusers/userslist");	
											}

@When("click on the go back button")
									public void click_on_the_go_back_button() throws Throwable 
									{ 
										Thread.sleep(10000);
										ManageUsers.click_adduser();
										 Thread.sleep(7000);																													
	               						ManageUsers.click_goback();
	               					}

@Then("check the page is redirected to Manage users or not")
									public void check_the_page_is_redirected_to_manage_users_or_not() throws Throwable 
									{
										Thread.sleep(5000); 
										WebElement testDemo=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-users-list/div[1]/div/div[1]/h1"));
										if (testDemo.isDisplayed())                                                                                                             
										{
											System.out.println("Manage users page is redirected");
										}
										else
										{
											System.out.println("Manage users page is not redirected");
										}
									}

@When("click on the add user button")
									public void click_on_the_add_user_button() throws Throwable 
									{ 
										Thread.sleep(3000);
										ManageUsers.click_adduser();
									}

@Then("check the page is redirected to Add user or not")
											public void check_the_page_is_redirected_to_Add_user_or_not() throws Throwable 
											{
												Thread.sleep(5000); 
												WebElement testDemo=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-add-edit-user/div[1]/div/div[1]/h1"));
												if (testDemo.isDisplayed())                                                                                                             
												{
													System.out.println("Add user page is redirected");
												}
												else
												{
													System.out.println("Add user page is not redirected");
												}
										    }


@Then("click on the order by name")
									public void click_on_the_order_by_name() throws Throwable 
									{ 
										Thread.sleep(5000); 
										ManageUsers.click_orderbybutton();
										Thread.sleep(2500);
										ManageUsers.click_orderbybuttonOptionName();
									}

@Then("click on the order by status")
									public void click_on_the_order_by_status() throws Throwable 
									{ 
										Thread.sleep(5000); 
										ManageUsers.click_orderbybutton();
										Thread.sleep(2500);
										ManageUsers.click_orderbybuttonOptionStatus(); 
									}

@Then("check the search tab by entering {string}")
									public void check_the_search_tab_by_entering(String srch) throws Throwable  
									{ 
										Thread.sleep(5000); 
										ManageUsers.insert_search(srch);
										Thread.sleep(3000); 
										System.out.println("The searched and displayed text is: " + BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-users-list/div[2]/div/div/div/table/tbody/tr/td[1]\r\n")).getText());
									}	 

@Then("check the search tab by entering invalid data {string}")
									public void check_the_search_tab_by_entering_invalid_data(String srch) throws Throwable  
									{ 
										Thread.sleep(7000);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.id("search")).clear();
										Thread.sleep(5000);  
										ManageUsers.insert_search(srch);
										Thread.sleep(3000); 
										System.out.println(BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-users-list/div[2]/div/div/div/div/h3")).getText());
										Thread.sleep(3000);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.id("search")).clear();
										Thread.sleep(2000);
										BrowserDriver.getCurrentDriver("chrome").navigate().refresh();
									}	 

@Then("check the sorting tab with limit of {int}")
									public void  check_the_sorting_tab_with_limit_of(Integer int1) throws Throwable  
									{ 
													Thread.sleep(7000);  
													ManageUsers.click_sortbutton();
													Thread.sleep(2500);
													ManageUsers.click_sortbutton80();
													Thread.sleep(5000);
												{
														driver = BrowserDriver.getCurrentDriver("chrome");
														Thread.sleep(1000); 
														JavascriptExecutor js = (JavascriptExecutor) driver;
														js.executeScript("window.scrollBy(0,20000)", "");
												}
												Thread.sleep(2000);
												WebElement table = BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-users-list/div[2]/div/div/div/table/tbody"));
												List<WebElement> listOfRows = table.findElements(By.tagName("tr")); 
												System.out.println("The number of rows are: "+listOfRows.size());
										}	 

@Then("check the sorting tab of limit {int}")
									public void  check_the_sorting_tab_of_limit(Integer int1) throws Throwable  
									{ 
										Thread.sleep(7000);   
										ManageUsers.click_sortbutton();
										Thread.sleep(2500);
										ManageUsers.click_sortbutton320();
										
										Thread.sleep(5000);
										{
												driver = BrowserDriver.getCurrentDriver("chrome");
												Thread.sleep(1000); 
												JavascriptExecutor js = (JavascriptExecutor) driver;
												js.executeScript("window.scrollBy(0,20000)", "");
										}
										Thread.sleep(2000);
										WebElement table = BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-users-list/div[2]/div/div/div/table/tbody"));
										List<WebElement> listOfRows = table.findElements(By.tagName("tr")); 
										System.out.println("The number of rows are: "+listOfRows.size());
									}	 

@Then("check the edit button")
										public void  check_the_edit_button() throws Throwable  
										{ 
											Thread.sleep(5000);   
											ManageUsers.click_edit();
											Thread.sleep(3000); 
											System.out.println("Page is redirected to " + BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-add-edit-user/div[1]/div/div[1]/h1")).getText());
										}	 

@Then("click on the edit button")
										public void  click_on_the_edit_button() throws Throwable  
										{ 
											Thread.sleep(5000);   
											ManageUsers.click_edit();
									 	} 

@Then("check the disabled tabs")
											public void  check_the_disabled_tabs() throws Throwable  
											{ 
												Thread.sleep(3000); 
												
												 Boolean em =BrowserDriver.getCurrentDriver("chrome").findElement(By.id("email")).isEnabled();
											    if(em) {
											          System.out.println("Email address is enabled");
											    }
											    else {
											          System.out.println("Email address is disabled");
											    }
											    Boolean pw =BrowserDriver.getCurrentDriver("chrome").findElement(By.id("password")).isEnabled();
											    if(pw) {
											          System.out.println("Password is enabled");
											    }
											    else {
											          System.out.println("Password is disabled");
											    }
											    Boolean fn =BrowserDriver.getCurrentDriver("chrome").findElement(By.id("fullName")).isEnabled();
											    if(fn) {
											          System.out.println("FullName is enabled");
											    }
											    else {
											          System.out.println("FullName is disabled");
											    }
											    Boolean phc =BrowserDriver.getCurrentDriver("chrome").findElement(By.id("countryCode")).isEnabled();
											    if(phc) {
											          System.out.println("CountryCode is enabled");
											    }
											    else {
											          System.out.println("CountryCode is disabled");
											    }
											    Boolean ph =BrowserDriver.getCurrentDriver("chrome").findElement(By.id("phoneNumber")).isEnabled();
											    if(ph) {
											          System.out.println("PhoneNumber is enabled");
											    }
											    else {
											          System.out.println("PhoneNumber is disabled");
											    }
											    Boolean st =BrowserDriver.getCurrentDriver("chrome").findElement(By.id("status")).isEnabled();
											    if(st) {
											          System.out.println("Status is enabled");
											    }
											    else {
											          System.out.println("Status is disabled");
											    }		
											}	 
@Then("change the status")
												public void  change_the_status() throws Throwable  
												{ 
													Thread.sleep(5000);   
													ManageUsers.click_statusOption2();
											 	} 
@Then("check the update button")
												public void  check_the_update_button() throws Throwable  
												{ 
													Boolean up =BrowserDriver.getCurrentDriver("chrome").findElement(By.id("submit")).isEnabled();
												    if(up) {
												          System.out.println("Update button is enabled");
												    }
												    else {
												          System.out.println("Update button is disabled");
												    }	
												} 
@Then("change the status and update")
												public void  change_the_status_and_update() throws Throwable  
												{ 
													Thread.sleep(5000);   
													ManageUsers.click_statusOption3();
													Thread.sleep(1000);
													ManageUsers.click_submit();													
												} 

@Then("check the goback button redirection")
												public void  check_the_goback_button_redirection() throws Throwable  
												{ 
													Thread.sleep(5000);   
													ManageUsers.click_goback(); 
													Thread.sleep(5000); 
													WebElement testDemo=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-users-list/div[1]/div/div[1]/h1"));
													if (testDemo.isDisplayed())                                                                                                             
													{
														System.out.println("Manage users page is redirected");
													}
													else
													{
														System.out.println("Manage users page is not redirected");
														
													}
												} 
@Then("click on the delete button and click cancel")
											public void  click_on_the_delete_button_and_click_cancel() throws Throwable  
												{ 
													Thread.sleep(5000);   
													ManageUsers.click_delete();
													Thread.sleep(1000);
													ManageUsers.click_cancel();		
												} 
@Then("click on the delete button and click yes delete")
											public void  click_on_the_delete_button_and_click_yes_delete() throws Throwable  
												{ 
													Thread.sleep(5000);   
													ManageUsers.click_delete();
													Thread.sleep(1000);
													ManageUsers.click_yesDelete();													
												} 

@Then("check the pagination")
											public void  check_the_pagination() throws Throwable  
												{ 
														{
															Thread.sleep(2500);
															driver = BrowserDriver.getCurrentDriver("chrome");
													    	Thread.sleep(1000);
													    	JavascriptExecutor js = (JavascriptExecutor) driver;
													    	js.executeScript("window.scrollBy(0,2000)", "");
													    	Thread.sleep(3000);
													    	ManageUsers.click_pagination2();
														}
												} 

@Then("check the next button")
											public void  check_the_next_button() throws Throwable  
												{ 
													{
														driver = BrowserDriver.getCurrentDriver("chrome");
												    	Thread.sleep(1000);
												    	JavascriptExecutor js = (JavascriptExecutor) driver;
												    	js.executeScript("window.scrollBy(0,2500)", "");
												    	Thread.sleep(3000);   
														ManageUsers.click_nextbutton();
														Thread.sleep(1000);
													}
													WebElement previousButton=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-users-list/div[3]/pagination-controls/pagination-template/nav/ul/li[1]/a"));
													if (previousButton.isEnabled())                                                                                                             
													{ 
														System.out.println("Next page is Redirected");
													}
													else
													{
														System.out.println("Next page is not working");
														
													}
											} 

@Then("check the previous button")
												public void  check_the_previous_button() throws Throwable  
													{  
															{
																driver = BrowserDriver.getCurrentDriver("chrome");
														    	Thread.sleep(4000);
														    	JavascriptExecutor js = (JavascriptExecutor) driver;
														    	js.executeScript("window.scrollBy(0,4000)", "");
														    	Thread.sleep(3000);   
																ManageUsers.click_nextbutton();
																Thread.sleep(1000);
															}
															{
															driver = BrowserDriver.getCurrentDriver("chrome");
													    	Thread.sleep(3000);
													    	JavascriptExecutor js = (JavascriptExecutor) driver;
													    	js.executeScript("window.scrollBy(0,4000)", "");
													    	Thread.sleep(3000);   
															ManageUsers.click_previousbutton();
															Thread.sleep(1000);
														}
														WebElement previousButton=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-users-list/div[3]/pagination-controls/pagination-template/nav/ul/li[5]/a"));
														if (previousButton.isEnabled())                                                                                                             
														{ 
															System.out.println("Previous page is Redirected");
														}
														else
														{
															System.out.println("Previous page is not working");
															
														}
												} 

@Then("check the orderby name button in ascending")
										public void  check_the_orderby_name_button_in_ascending() throws Throwable  
											{ 
													{
														Thread.sleep(5000);
														ManageUsers.click_orderbybutton();
														Thread.sleep(2500);
												    	ManageUsers.click_orderbybuttonOptionName(); 
													}
											} 

@Then("check the orderby name button in descending")
										public void  check_the_orderby_name_button_in_descending() throws Throwable  
											{ 
													{
														Thread.sleep(5000);
														ManageUsers.click_orderbybutton();
														Thread.sleep(2500);
												    	ManageUsers.click_orderbybuttonOptionName(); 
												    	Thread.sleep(5000);
												    	ManageUsers.click_orderbybutton();
														Thread.sleep(2500);
												    	ManageUsers.click_orderbybuttonOptionName(); 
													}
											} 

@Then("check the orderby status button in ascending")
										public void  check_the_orderby_status_button_in_ascending() throws Throwable  
											{ 
													{
														Thread.sleep(5000);
														ManageUsers.click_orderbybutton();
														Thread.sleep(2500);
												    	ManageUsers.click_orderbybuttonOptionStatus(); 
												    	
													}
											} 

@Then("check the orderby status button in descending")
										public void  check_the_orderby_status_button_in_descending() throws Throwable  
											{ 
													{
														Thread.sleep(5000);
														ManageUsers.click_orderbybutton();
														Thread.sleep(2500);
												    	ManageUsers.click_orderbybuttonOptionStatus(); 
												    	Thread.sleep(5000);
												    	ManageUsers.click_orderbybutton();
														Thread.sleep(2500);
												    	ManageUsers.click_orderbybuttonOptionStatus(); 
													}
											} 



		} 

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
import appElements.All_Applicants_Elements;
import appElements.Login_Elements;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class All_Applicants 
{
	
	static WebDriver driver;
	
	
	public PropertyLoader reader = new PropertyLoader();
	All_Applicants_Elements All_Applicants = PageFactory.initElements(BrowserDriver.getCurrentDriver(), All_Applicants_Elements.class);


@Given("user starts with the login page for All applicants page")
					    public void user_starts_with_the_login_page_for_all_applicants_page()  throws Throwable  
					    {  
						 BrowserDriver.getCurrentDriver("chrome").get("https://empr.ezhireme.com/auth/login");	  
						 }

			
@When("^user enters email as \"([^\"]*)\" and password as \"([^\"]*)\"for All applicants page$")
							public void user_enters_email_as_something_and_password_as_something_for_all_applicants_page(String un, String pw) throws Throwable
						    { 
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("username")).sendKeys("Jagan192@fulltanker.com"); 
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("password")).sendKeys("Jagan@1010"); 
								
								Thread.sleep(2000);
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("login")).click(); 
							 } 

@When("user directs All applicants page")
							public void user_directs_All_applicants_page() throws Throwable
							{
									Thread.sleep(15000);
									BrowserDriver.getCurrentDriver("chrome").get("https://empr.ezhireme.com/resources/applicants");
							}

@Then("user check the all applicants page")
							public void user_check_the_all_applicants_page()throws InterruptedException 
							{
								Thread.sleep(9000); 
								WebElement to = BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-view-applicants/div[1]/div/div[1]/h1"));	 
								String textTo = to.getText();    
								
								if(textTo.equals("All applicants")) 
								{
									System.out.println("Yes! All applicants page is Redirected"); 
								}
								else  
								{
									System.out.println("No! All applicants is Not Redirected");
								}
							}

@Then("user refreshes the page")
							public void user_refreshes_the_page()throws InterruptedException 
								{
									Thread.sleep(2500);
									BrowserDriver.getCurrentDriver("chrome").navigate().refresh();
								}


@Then("user check the default table view")
								public void user_check_the_default_table_view()throws InterruptedException 
								{
									Thread.sleep(5000);
									WebElement updateButton=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-view-applicants/div[2]/div/table/thead/tr/th[2]"));
									if (updateButton.isDisplayed())         
									{
										System.out.println("Yes! The page is in Table view"); 
									}
									else  
									{
										System.out.println("No! The page is not in Table view");
									}
								}



@Then("user click on the card view")
								public void user_click_on_the_card_view()throws InterruptedException 
								{
									Thread.sleep(2000);
									All_Applicants.click_cardView();
								}

@Then("user check the card view")
								public void user_check_the_card_view()throws InterruptedException 
								{
									Thread.sleep(5000);
									WebElement updateButton=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-view-applicants/div[2]/div[1]/div"));
									if (updateButton.isDisplayed())         
									{
										System.out.println("Yes! The page is in Card view"); 
									}
									else  
									{
										System.out.println("No! The page is not in Card view");
									}
								}


@Then("user click on the table view")
								public void user_click_on_the_table_view()throws InterruptedException 
								{
									Thread.sleep(2000);
									All_Applicants.click_tableView();
								}


@Then("user click on the actions button")
								public void user_click_on_the_actions_button()throws InterruptedException 
								{
									Thread.sleep(3500);
									BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-view-applicants/div[2]/div/table/tbody/tr[3]/td[6]/div/button")).click();
								}

@Then("user click on the view employee")
								public void user_click_on_the_view_employee()throws InterruptedException 
								{
									Thread.sleep(3500);
									All_Applicants.click_viewEmployee();
								}

@Then("user check the redirection of view employee")
								public void user_check_the_redirection_of_view_employee()throws InterruptedException 
								{
									Thread.sleep(5000);
									WebElement updateButton=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-view-employee/div[1]/div/div/div[1]/h1"));
									if (updateButton.isDisplayed())         
									{
										System.out.println("Yes! View Employee page is Redirected"); 
									}
									else  
									{
										System.out.println("No! View Employee page is Not Redirected");
									}
								}


@Then("user check the go back button")
								public void user_check_the_go_back_button()throws InterruptedException 
								{
	
									
									WebElement to = BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-view-applicants/div[1]/div/div[1]/h1"));	 
									String textTo = to.getText();    
									
									if(textTo.equals("All applicants")) 
									{
										System.out.println("Yes! Go Back button is working"); 
									}
									else  
									{
										System.out.println("No! Go Back button is not working");
									}
								}



@Then("user click on the go back button")
								public void user_click_on_the_go_back_button()throws InterruptedException 
								{
										{
											driver = BrowserDriver.getCurrentDriver("chrome");
											Thread.sleep(1000); 
											JavascriptExecutor js = (JavascriptExecutor) driver;
											js.executeScript("window.scrollBy(0,-800)", "");
										}
									
									Thread.sleep(3500);
									All_Applicants.click_goBack();
								}

@Then("user click on the schedule interview")
								public void user_click_on_the_schedule_interview()throws InterruptedException 
								{
									Thread.sleep(3500);
									All_Applicants.click_scheduleInterview();
								}

@Then("user check the redirection of schedule interview")
								public void user_check_the_redirection_of_schedule_interview()throws InterruptedException 
								{
									Thread.sleep(5000);
									WebElement updateButton=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-schedule-interview/div[1]/div/div[1]/h1"));
									if (updateButton.isDisplayed())         
									{
										System.out.println("Yes! Schedule Interview page is Redirected"); 
									}
									else  
									{
										System.out.println("No! Schedule Interview page is Not Redirected");
									}
								}


@Then("user click on the update status")
									public void user_click_on_the_update_status()throws InterruptedException 
									{
										Thread.sleep(3500);
										All_Applicants.click_updateStatus();
									}


@Then("user check the update status popup")
									public void user_check_the_update_status_popup()throws InterruptedException 
									{
										WebElement to = BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-view-applicants/div[5]/div/div/div[2]/div[1]/label"));	 
										String textTo = to.getText();    
										
										if(textTo.equals("Application status")) 
										{
											System.out.println("Yes! Update status pop up is opened"); 
										}
										else  
										{
											System.out.println("No! Update status pop up is opened");
										}
									}

@Then("user click on the cancel button")
									public void user_click_on_the_cancel_button()throws InterruptedException 
									{
										Thread.sleep(3500);
										All_Applicants.click_cancel();
									}


@Then("user enter the title")
									public void user_enter_the_title()throws InterruptedException 
									{
										Thread.sleep(3500);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.id("title")).sendKeys("Interview meeting");
									}


@Then("user selects the date")
									public void user_selects_the_date()throws InterruptedException 
									{
										Thread.sleep(3500);
										All_Applicants.click_datepicker();
										Thread.sleep(1000);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-schedule-interview/div[2]/div/div/div/div[2]/div[2]/form/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr[5]/td[7]/span")).click();
									}


@Then("user selects start time")
									public void user_selects_start_time()throws InterruptedException 
									{
										Thread.sleep(3500);
										All_Applicants.click_startTime();
										Thread.sleep(1000);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/ngx-mat-timepicker-dialog/div[1]/ngx-mat-timepicker-content/div/div/div/div/ngx-mat-timepicker-12-hours-face/ngx-mat-timepicker-face/div/div/div[3]/button")).click();
										Thread.sleep(1000);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/ngx-mat-timepicker-dialog/div[2]/div[2]/button")).click();
									}



@Then("user selects end time")
									public void user_selects_end_time()throws InterruptedException 
									{
										Thread.sleep(3500);
										All_Applicants.click_endTime();
										Thread.sleep(1000);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/ngx-mat-timepicker-dialog/div[1]/ngx-mat-timepicker-content/div/div/div/div/ngx-mat-timepicker-12-hours-face/ngx-mat-timepicker-face/div/div/div[5]/button")).click();
										Thread.sleep(1000);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/ngx-mat-timepicker-dialog/div[2]/div[2]/button")).click();
									}


@Then("user click on add attendees") 
									public void user_click_on_add_attendees()throws InterruptedException 
									{
										Thread.sleep(3500);
										All_Applicants.click_addAttendees();
									}


@Then("user enter attendee email")
									public void user_enter_attendee_email()throws InterruptedException 
									{
										Thread.sleep(3500);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.id("email")).sendKeys("naveen005@quanbytech.onmicrosoft.com");
									}


@Then("user click the add button")
									public void user_click_the_add_button()throws InterruptedException 
									{
										Thread.sleep(3500);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.id("add")).click();
										
									}

@Then("user enters description")
									public void user_enters_description()throws InterruptedException 
									{
										Thread.sleep(3500);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.id("description")).sendKeys("This is an meeting regarding Interview");
									}


@Then("user click on the schedule appointment")
									public void user_click_on_the_schedule_appointment()throws InterruptedException 
									{
	
										{
												driver = BrowserDriver.getCurrentDriver("chrome");
										Thread.sleep(1000); 
										JavascriptExecutor js = (JavascriptExecutor) driver;
										js.executeScript("window.scrollBy(0,400)", "");
										}
										
										
										Thread.sleep(5000);
										WebElement updateButton=BrowserDriver.getCurrentDriver("chrome").findElement(By.id("scheduleAppointment"));
										if (updateButton.isEnabled())         
										{
											System.out.println("Yes! The Schedule Appointment button is Enabled"); 
										}
										else  
										{
											System.out.println("No! The Schedule Appointment button is Not Enabled");
										}
										Thread.sleep(3500);
										All_Applicants.click_scheduleAppointment();
									}


@Then("user click on the application status")
										public void user_click_on_the_application_status()throws InterruptedException 
										{
											Thread.sleep(3500);
											All_Applicants.click_selectStatus();
											Thread.sleep(1000);
											BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"dropdown-basic\"]/li[6]/a")).click();
										}

@Then("user click on the update button on update status")
										public void user_click_on_the_update_button_on_update_status()throws InterruptedException 
										{
											Thread.sleep(3500);
											All_Applicants.click_update();
										}


@Then("user checks the schedule appointment button")
										public void user_checks_the_schedule_appointment_button()throws InterruptedException 
										{ 											
													{
															driver = BrowserDriver.getCurrentDriver("chrome");
													Thread.sleep(1000); 
													JavascriptExecutor js = (JavascriptExecutor) driver;
													js.executeScript("window.scrollBy(0,300)", "");
													}
													
													
													Thread.sleep(5000);
													WebElement updateButton=BrowserDriver.getCurrentDriver("chrome").findElement(By.id("scheduleAppointment"));
													if (updateButton.isEnabled())         
													{
														System.out.println("Yes! The Schedule Appointment button is Enabled"); 
													}
													else  
													{
														System.out.println("No! The Schedule Appointment button is Not Enabled");
													}
										}

@Then("user click on the actions button for approve application")
									public void user_click_on_the_actions_button_for_approve_application()throws InterruptedException 
									{
										Thread.sleep(3500);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-view-applicants/div[2]/div/table/tbody/tr[5]/td[6]/div/button")).click();
									} 

@Then("user click on the approve button")
										public void user_click_on_the_approve_button()throws InterruptedException 
										{
											Thread.sleep(3500);
											All_Applicants.click_approveApplication();
										} 


@Then("user checks the apporve tab pop up")
										public void user_checks_the_apporve_tab_pop_up()throws InterruptedException 
										{
													Thread.sleep(3000);
													WebElement approvepopup=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"approveApplicationPopup\"]/div/div/div[1]/h4"));
													if (approvepopup.isDisplayed())         
													{
														System.out.println("Yes! Approve Employee pop up is opened"); 
													}
													else  
													{
														System.out.println("No! Approve Employee pop up is not opened");
													}
										}



@Then("user check the cancel button working")
										public void user_check_the_cancel_button_working()throws InterruptedException 
										{
													Thread.sleep(3000);
													WebElement cancelbutton=BrowserDriver.getCurrentDriver("chrome").findElement(By.id("cancel"));
													if (cancelbutton.isEnabled())         
													{
														System.out.println("Yes! Cancel button is working"); 
													}
													else  
													{
														System.out.println("No! Cancel button is working");
													}
													Thread.sleep(3000);
													All_Applicants.click_cancel();
										}


@Then("user check the cancel button working on the click on cross button")
										public void user_check_the_cancel_button_working_on_the_click_on_cross_button()throws InterruptedException 
										{
													Thread.sleep(3000);
													WebElement xcross=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"approveApplicationPopup\"]/div/div/div[1]/button/span"));
													if (xcross.isEnabled())         
													{
														System.out.println("Yes! X-cross  button is working"); 
													} 
													else  
													{
														System.out.println("No! X-cross  button is working");
													}
													Thread.sleep(3000);
													BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"approveApplicationPopup\"]/div/div/div[1]/button/span")).click();
										}


@Then("user enters the comments")
										public void user_enters_the_comments()throws InterruptedException 
										{
											Thread.sleep(3500);
											BrowserDriver.getCurrentDriver("chrome").findElement(By.id("approvedComments")).sendKeys("Approved");
										}


@Then("user check the entered comments")
										public void user_check_the_entered_comments()throws InterruptedException 
										{
											Thread.sleep(2000);
											WebElement to = BrowserDriver.getCurrentDriver("chrome").findElement(By.id("approvedComments"));	 
											String textTo = to.getText();    
											
											if(textTo.equals("Approved")) 
											{
												System.out.println("Yes! Comments are added"); 
											}
											else  
											{
												System.out.println("No! Comments are not added");
											}
											
										} 










































												
												
												
												
												
												
												
												
												
												
												
												
												
												







}


















































































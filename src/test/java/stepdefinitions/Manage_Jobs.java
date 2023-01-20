package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import AppService_Utilities.PropertyLoader;
import Config.BrowserDriver;
import appElements.Login_Elements;
import appElements.Manage_Jobs_Elements;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Manage_Jobs 
{
	
	static WebDriver driver;
	
	
	public PropertyLoader reader = new PropertyLoader();
	Manage_Jobs_Elements Manage_Jobs = PageFactory.initElements(BrowserDriver.getCurrentDriver(), Manage_Jobs_Elements.class);

	Login_Elements loginpage = new Login_Elements();


@Given("user starts with the login page for Manage Jobs page")
					    public void user_starts_with_the_login_page_for_manage_jobs_page()  throws Throwable  
					    {  
						
						 BrowserDriver.getCurrentDriver("chrome").get("https://empr.ezhireme.com/auth/login");	  
						 }
			
@When("^user enters email as \"([^\"]*)\" and password as \"([^\"]*)\"for Manage jobs page$")
							public void user_enters_email_as_something_and_password_as_something_for_manage_jobs_page(String un, String pw) throws Throwable
						    { 
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("username")).sendKeys("Jagan192@fulltanker.com"); 
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("password")).sendKeys("Jagan@1010"); 
								
								Thread.sleep(2000);
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("login")).click(); 
							 
							 } 

@When("user directs Manage Jobs page")
							public void user_directs_manage_jobs_page() throws Throwable
							{
									Thread.sleep(10000);
									BrowserDriver.getCurrentDriver("chrome").get("https://empr.ezhireme.com/jobs");
							} 

@Then("user click on Post a new job page")
							public void user_click_on_post_a_new_job_page() throws Throwable
							{
									Thread.sleep(10000);
									Manage_Jobs.click_postJobButton();
							}  

@Then("user enter job title")
							public void user_enter_job_title_as_something() throws Throwable
							{
									Thread.sleep(1000);
									BrowserDriver.getCurrentDriver("chrome").findElement(By.id("jobtitle")).sendKeys("Selenium Tester");
							}

@Then("user click on Specialisms and Job type")
							public void user_click_on_specialisms_and_job_type()  throws Throwable
							{
								Thread.sleep(1000);
								Manage_Jobs.click_specialism();	
								Manage_Jobs.click_specialism2();
								Thread.sleep(1000);
								Manage_Jobs.click_jobtype();
								Manage_Jobs.click_jobtypeDropdownButton1();
							}


@Then("user enters Search location")
							public void user_enters_search_location() throws Throwable
							{
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("search")).sendKeys("Texas");
								Thread.sleep(2000);
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("search")).sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER);
							}

 

@Then("user enters complete address and job description")
							public void user_enters_complete_address_test_address_data_and_job_description_test_description_data() throws Throwable
							{
							    Thread.sleep(1000); 
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("addresss")).sendKeys("2nd St, Texas");
								Thread.sleep(1000); 
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("description")).sendKeys("5-9 years of relevant Service Desk experience supporting workstation computers running on windows and Mac platforms Demonstrated progressive experience in the supervision of a technical support team Supporting an environment of at least 500+ employees Experience working in a team-oriented, collaborative environment");
							}

@Then("user enters key responsibility")
							public void user_enters_key_responsibility_design_figma() throws Throwable
							{
								Thread.sleep(1000);
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("key-responsibility")).sendKeys("Testing, Selenium");
								
							}

@Then("user select skills and tags and salary type and carreer level")
						public void user_select_skills_and_tags_and_salary_type_and_carreer_level() throws Throwable
						{
								{
										driver = BrowserDriver.getCurrentDriver("chrome");
								Thread.sleep(1000); 
								JavascriptExecutor js = (JavascriptExecutor) driver;
								js.executeScript("window.scrollBy(0,400)", "");
								 
								}
						    Thread.sleep(1000);
						    Manage_Jobs.click_selectSkills();
						    Thread.sleep(1000);
						    Manage_Jobs.click_selectSkills1();
						    Thread.sleep(1000);
						    Manage_Jobs.click_selectTags();
						    Thread.sleep(1000);
						    Manage_Jobs.click_selectTags1();
						    Thread.sleep(1000);						    
						    BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"select-tags\"]/div/div[1]/span/span[2]/span")).click();
						    Thread.sleep(1000);
						    Manage_Jobs.click_salaryType();
						    Thread.sleep(1000); 
						    Manage_Jobs.click_salaryType1();
						    Thread.sleep(1000); 
						    Manage_Jobs.click_careerlevel();
						    Thread.sleep(2000); 
						    Manage_Jobs.click_careerlevelOptionButton();
						}

@Then("user fixes offered salary and experience")
							public void user_fixes_offered_salary_and_experience() throws Throwable
							{
								{
									driver = BrowserDriver.getCurrentDriver("chrome");
									Thread.sleep(1000); 
									JavascriptExecutor js = (JavascriptExecutor) driver;
									js.executeScript("window.scrollBy(0,400)", "");
								}
								
								Thread.sleep(1000);
								WebElement button = BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-post-job/div[2]/div/div/div/form/div/div[13]/ngx-slider/span[6]"));
								Actions action = new Actions(driver);
								action.dragAndDropBy(button, 125, 0).build().perform();
								Thread.sleep(1000);
								WebElement button1 = BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-post-job/div[2]/div/div/div/form/div/div[17]/ngx-slider/span[6]"));
								Actions action1 = new Actions(driver);
								action1.dragAndDropBy(button1, 125, 0).build().perform();
								
							}

@Then("user enters no of positions")
							public void user_enters_no_of_positions() throws Throwable
							{
								{
									driver = BrowserDriver.getCurrentDriver("chrome");
									Thread.sleep(1000); 
									JavascriptExecutor js = (JavascriptExecutor) driver;
									js.executeScript("window.scrollBy(0,400)", "");
								}
								Thread.sleep(1000);
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("no-of-positions")).sendKeys("15");
							}

@Then("user select qualification")
							public void user_select_qualification() throws Throwable
							{
									{
										driver = BrowserDriver.getCurrentDriver("chrome");
										Thread.sleep(1000); 
										JavascriptExecutor js = (JavascriptExecutor) driver;
										js.executeScript("window.scrollBy(0,400)", "");
									}
								Thread.sleep(1000);
								Manage_Jobs.click_qualificationType();
								Thread.sleep(2000);
								Manage_Jobs.click_qualificationTypButton();
							}


@Then("user enters application deadline date")
							public void user_enters_application_deadline_date() throws Throwable
							{
								{
										driver = BrowserDriver.getCurrentDriver("chrome");
										Thread.sleep(3000); 
										JavascriptExecutor js = (JavascriptExecutor) driver;
										js.executeScript("window.scrollBy(0,1000)", "");
								}
								
								Thread.sleep(3000);
								Manage_Jobs.click_datepicker();
								Thread.sleep(2000); 
								Manage_Jobs.click_datepickerButton(); 
							}  

@Then("user select the job post button")
							public void user_select_the_job_post_button() throws Throwable
							{
								Thread.sleep(1000);
								Manage_Jobs.click_post();
								Thread.sleep(15000);
								WebElement ManageJobs=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-view/div[1]/div/div[1]/h1"));
								if (ManageJobs.isDisplayed())                                                                                                             
								{ 
									System.out.println("Yes! Job posted Successfully");
								}
								else
								{
									System.out.println("No! Job posting was Unsuccessful");
							} 
								
							}

@Then("user checks the job post button") 
public void user_checks_the_job_post_button() throws Throwable
							{
								{
										driver = BrowserDriver.getCurrentDriver("chrome");
										Thread.sleep(1000); 
										JavascriptExecutor js = (JavascriptExecutor) driver;
										js.executeScript("window.scrollBy(0,600)", "");
								}
								
								Thread.sleep(2000);
								WebElement postButton=BrowserDriver.getCurrentDriver("chrome").findElement(By.id("post"));
								if (postButton.isEnabled())                                                                                                             
								{ 
									System.out.println("Yes! Post button is Enabled");
								}
								else
								{
									System.out.println("No! Post button is Disabled");
							} 
								{
									driver = BrowserDriver.getCurrentDriver("chrome");
									Thread.sleep(1000); 
									JavascriptExecutor js = (JavascriptExecutor) driver;
									js.executeScript("window.scrollBy(0,-450)", "");
							}
								
							}


@Then("user enters invalid Search location")
							public void user_enters_invalid_search_location() throws Throwable
							{
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("search")).sendKeys("218438651246825");
								Thread.sleep(2000);
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("search")).sendKeys(Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.ENTER);
							}


@Then("user select the latest job")
							public void user_select_the_latest_job() throws Throwable
							{
								Thread.sleep(15000);
								BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-view/div[2]/div[1]/div[1]/div/table/tbody/tr[1]/td[5]/div/button")).click();
								Thread.sleep(2000);
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("view-job")).click();
							}


@Then("user click on the edit job option")
							public void user_click_on_the_edit_job_option() throws Throwable
							{
									Thread.sleep(10000);
								Manage_Jobs.click_editthisjob(); 
							}

@Then("user click on the update button")
							public void user_click_on_the_update_button() throws Throwable
							{	 Thread.sleep(5000);
									{
										driver = BrowserDriver.getCurrentDriver("chrome");
										Thread.sleep(1000); 
										JavascriptExecutor js = (JavascriptExecutor) driver;
										js.executeScript("window.scrollBy(0,500)", "");
									}
									
								Thread.sleep(4000); 
								Manage_Jobs.click_update();
							}


@Then("user enters additional key responsibility")
							public void user_enters_additional_key_responsibility() throws Throwable
							{
									Thread.sleep(5000);
									{
											driver = BrowserDriver.getCurrentDriver("chrome");
											Thread.sleep(1000); 
											JavascriptExecutor js = (JavascriptExecutor) driver;
											js.executeScript("window.scrollBy(0,500)", "");
									}
										
								Thread.sleep(1000);
								Manage_Jobs.click_addResponsibility();
								Thread.sleep(1000);
								BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-edit-job-post/div[2]/div/div/div/div/div[10]/form/div[2]/div/input")).sendKeys("Content writing");
								WebElement additionalKey=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-edit-job-post/div[2]/div/div/div/div/div[10]/form/div[2]/div/input"));
								if (additionalKey.isEnabled())                                                                                                             
								{ 
									System.out.println("Yes! Additional Key responsibility is added");
								}
								else
								{
									System.out.println("No! Additional Key responsibility is NOT added"); 
							} 
								
							}

@Then("user logout from Manage jobs")
							public void user_logout_from_manage_jobs() throws Throwable
							{
								{
										driver = BrowserDriver.getCurrentDriver("chrome");
										Thread.sleep(1000); 
										JavascriptExecutor js = (JavascriptExecutor) driver;
										js.executeScript("window.scrollBy(0,-500)", "");
								}
								Thread.sleep(2000);
								Manage_Jobs.click_toggleButton();
								Thread.sleep(1000);
								Manage_Jobs.click_logout();
							}


@Then("user enters third additional key responsibility and check the close button")
							public void user_enters_third_additional_key_responsibility_and_check_the_close_button() throws Throwable
							{
									Thread.sleep(5000);
									{
											driver = BrowserDriver.getCurrentDriver("chrome");
											Thread.sleep(1000); 
											JavascriptExecutor js = (JavascriptExecutor) driver;
											js.executeScript("window.scrollBy(0,500)", "");
									}
										
											Thread.sleep(2000);
											Manage_Jobs.click_addResponsibility();
											Thread.sleep(2000);
											Manage_Jobs.click_addResponsibility();
											Thread.sleep(1000);
											BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-edit-job-post/div[2]/div/div/div/div/div[10]/form/div[3]/div/input")).sendKeys("English knowledge");
											Thread.sleep(1000);
											BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-edit-job-post/div[2]/div/div/div/div/div[10]/form/div[3]/button/span")).click(); 
											
									}


@Then("user edits the jobtitle")
									public void user_edits_the_jobtitle() throws Throwable
									{
											Thread.sleep(10000);
											BrowserDriver.getCurrentDriver("chrome").findElement(By.id("jobtitle")).clear();
											Thread.sleep(1000);
											BrowserDriver.getCurrentDriver("chrome").findElement(By.id("jobtitle")).sendKeys("UI Ux Developer");
									}

@Then("user check the update button")
									public void user_check_the_update_button() throws Throwable
									{
											Thread.sleep(5000);
											{
													driver = BrowserDriver.getCurrentDriver("chrome");
													Thread.sleep(1000); 
													JavascriptExecutor js = (JavascriptExecutor) driver;
													js.executeScript("window.scrollBy(0,500)", "");
											}
										Thread.sleep(1000);
										WebElement updateButton=BrowserDriver.getCurrentDriver("chrome").findElement(By.id("update"));
										if (updateButton.isEnabled())                                                                                                             
										{ 
											System.out.println("Yes! Update button is Enabled");
										}
										else
										{
											System.out.println("No! Update button is Disabled");
									} 
										Thread.sleep(5000);
										{
												driver = BrowserDriver.getCurrentDriver("chrome");
												Thread.sleep(1000); 
												JavascriptExecutor js = (JavascriptExecutor) driver;
												js.executeScript("window.scrollBy(0,-500)", "");
										}
								}

@Then("user refresh the page")
								public void user_refresh_the_page() throws Throwable
								{
										Thread.sleep(5000);
										BrowserDriver.getCurrentDriver("chrome").navigate().refresh();
								}

@Then("user edits the Specialisms and Job type")
								public void user_edits_the_Specialisms_and_Job_type()  throws Throwable
								{
									Thread.sleep(5000);
									Manage_Jobs.click_specialism();	
									Manage_Jobs.click_specialism2();
									Thread.sleep(1000);
									Manage_Jobs.click_jobtype();
									Manage_Jobs.click_jobtypeDropdownButton1();
								}

@Then("user edits Search location")
								public void user_edits_search_location() throws Throwable
								{
									Thread.sleep(5000);
									BrowserDriver.getCurrentDriver("chrome").findElement(By.id("search")).clear();
										BrowserDriver.getCurrentDriver("chrome").findElement(By.id("search")).sendKeys("Hyderabad");
									Thread.sleep(2000);
									BrowserDriver.getCurrentDriver("chrome").findElement(By.id("search")).sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER);
								}
 

@Then("user edits complete address")
								public void user_edits_complete_address() throws Throwable
								{
								    Thread.sleep(5000); 
									BrowserDriver.getCurrentDriver("chrome").findElement(By.id("addresss")).clear();
									Thread.sleep(1000); 
									BrowserDriver.getCurrentDriver("chrome").findElement(By.id("addresss")).sendKeys("5th Floor");
								}


@Then("user click on update button")
								public void user_click_on_update_button() throws Throwable
								{
										Thread.sleep(5000);
										{
												driver = BrowserDriver.getCurrentDriver("chrome");
												Thread.sleep(1000); 
												JavascriptExecutor js = (JavascriptExecutor) driver;
												js.executeScript("window.scrollBy(0,500)", "");
										}
								    Thread.sleep(3000); 
									Manage_Jobs.click_update(); 
								}


@Then("user click on the goback button")
								public void user_click_on_the_goback_button() throws Throwable
								{
										Thread.sleep(5000);
										{
												driver = BrowserDriver.getCurrentDriver("chrome");
												Thread.sleep(1000); 
												JavascriptExecutor js = (JavascriptExecutor) driver;
												js.executeScript("window.scrollBy(0,-5000)", "");
										}
								    Thread.sleep(5000); 
									Manage_Jobs.click_goback(); 
								}


@Then("user edits job description")
							public void user_edits_job_description() throws Throwable
							{
							    Thread.sleep(5000); 
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("description")).clear();
								Thread.sleep(1000); 
								BrowserDriver.getCurrentDriver("chrome").findElement(By.id("description")).sendKeys("8-9 years of relevant Service Desk experience supporting workstation computers running on windows and Mac platforms Demonstrated progressive experience in the supervision of a technical support team Supporting an environment of at least 500+ employees Experience working in a team-oriented, collaborative environment");
							}


@Then("user edits additional key responsibility")
							public void user_edits_additional_key_responsibility() throws Throwable
							{
									Thread.sleep(5000);
									{
											driver = BrowserDriver.getCurrentDriver("chrome");
											Thread.sleep(1000); 
											JavascriptExecutor js = (JavascriptExecutor) driver;
											js.executeScript("window.scrollBy(0,500)", "");
									}
								Thread.sleep(5000);
								BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-edit-job-post/div[2]/div/div/div/div/div[10]/form/div[1]/div/input")).clear();
								Thread.sleep(1000);
								BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-edit-job-post/div[2]/div/div/div/div/div[10]/form/div[2]/div/input")).sendKeys("Development skills");
							}


@Then("user edits skills")
								public void user_edits_skills() throws Throwable
								{
									{
										driver = BrowserDriver.getCurrentDriver("chrome");
								Thread.sleep(1000); 
								JavascriptExecutor js = (JavascriptExecutor) driver;
								js.executeScript("window.scrollBy(0,400)", "");
								
								}
								Thread.sleep(4000);
								Manage_Jobs.click_selectSkills();
								Thread.sleep(1000);
								Manage_Jobs.click_selectAllSkills();
								}

@Then("user edits tags")
								public void user_edits_tags() throws Throwable
								{
									{
										driver = BrowserDriver.getCurrentDriver("chrome");
								Thread.sleep(1000); 
								JavascriptExecutor js = (JavascriptExecutor) driver;
								js.executeScript("window.scrollBy(0,400)", "");
								
								}
								Thread.sleep(4000);
								Manage_Jobs.click_selectTags();
								Thread.sleep(1000);
								Manage_Jobs.click_selectAllTags();
								}

@Then("user edits salary type")
								public void user_edits_salary_type() throws Throwable
								{
									{
										driver = BrowserDriver.getCurrentDriver("chrome");
								Thread.sleep(4000); 
								JavascriptExecutor js = (JavascriptExecutor) driver;
								js.executeScript("window.scrollBy(0,500)", "");
								
								}
								Thread.sleep(4000);
								Manage_Jobs.click_salaryType();
								Thread.sleep(1000);
								Manage_Jobs.click_salaryType2();
								}

@Then("user edits career level")
								public void user_edits_career_level() throws Throwable
								{
									{
										driver = BrowserDriver.getCurrentDriver("chrome");
								Thread.sleep(4000); 
								JavascriptExecutor js = (JavascriptExecutor) driver;
								js.executeScript("window.scrollBy(0,400)", "");
								
								}
								Thread.sleep(3000);
								Manage_Jobs.click_careerlevel();
								Thread.sleep(1000);
								Manage_Jobs.click_careerlevelOptionButton1();
								}
 


@Then("user edits no of positions")
public void user_edits_no_of_positions() throws Throwable
									{
										{
											driver = BrowserDriver.getCurrentDriver("chrome");
									Thread.sleep(3000); 
									JavascriptExecutor js = (JavascriptExecutor) driver;
									js.executeScript("window.scrollBy(0,400)", "");
									
									}
										Thread.sleep(4000);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.id("no-of-positions")).clear();
										Thread.sleep(1000);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.id("no-of-positions")).sendKeys("10");
									}

@Then("user edits qualification")
public void user_edits_qualification() throws Throwable
									{
										{
											driver = BrowserDriver.getCurrentDriver("chrome");
									Thread.sleep(3000); 
									JavascriptExecutor js = (JavascriptExecutor) driver;
									js.executeScript("window.scrollBy(0,400)", "");
									
									}
										Thread.sleep(7000);
										Manage_Jobs.click_qualificationType();
									}

@Then("user edits application deadline")
public void user_edits_application_deadline() throws Throwable
									{
										{
											driver = BrowserDriver.getCurrentDriver("chrome");
									Thread.sleep(4000); 
									JavascriptExecutor js = (JavascriptExecutor) driver;
									js.executeScript("window.scrollBy(0,1000)", "");
									
									}
										
										Thread.sleep(7000);
										Manage_Jobs.click_datepicker();
										Thread.sleep(1000); 
										Manage_Jobs.click_datepickerButton1();
									}



@Then("user click on the view job option")
public void user_click_on_the_view_job_option() throws Throwable
									{
										Thread.sleep(8000);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-view/div[2]/div[1]/div[1]/div/table/tbody/tr[1]/td[5]/div/button")).click();
										Thread.sleep(2000);                                                                             
										Manage_Jobs.click_view_job();
									}


@Then("user checks the view job page redirection")
public void user_checks_the_view_job_page_redirection() throws Throwable
									{
											Thread.sleep(7000);
											WebElement previousButton=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-view-job/div[2]/div[1]/div[1]/div"));
											if (previousButton.isDisplayed())                                                                                                             
											{ 
												System.out.println("Yes! View job is Redirected");
											}
											else
											{ 
												System.out.println("No! View job Redirection is Failed");
											}
									}
 

@Then("user click on the assign assessment option")
public void user_checks_the_view_assign_assessment_redirection() throws Throwable
									{
											Thread.sleep(8000);
											BrowserDriver.getCurrentDriver("chrome").findElement(By.id("search")).sendKeys("aaaaaaaaAutomation purpose");
											Thread.sleep(8000);
											BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-view/div[2]/div[1]/div[1]/div/table/tbody/tr[1]/td[5]/div/button")).click();
											Thread.sleep(2000);                                                                            
											Manage_Jobs.click_assign_assessment();
									}
									

@Then("user checks the assign assessment page redirection")
public void user_checks_the_assign_assessment_page_redirection() throws Throwable
									{
											Thread.sleep(7000);
											WebElement previousButton=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-assign-assesment/div[1]/div/div[1]/h1"));
											if (previousButton.isDisplayed())                                                                                                             
											{ 
												System.out.println("Yes! Assign assessment is Redirected");
											}
											else
											{ 
												System.out.println("No! Assign assessment Redirection is Failed");
											}
									}


@Then("user checks the Manage jobs page redirection")
public void user_checks_the_Manage_jobs_page_redirection() throws Throwable
									{
											Thread.sleep(7000);
											WebElement previousButton=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-view/div[1]/div/div[1]/h1"));
											if (previousButton.isDisplayed())                                                                                                             
											{ 
												System.out.println("Yes! Manage Jobs is Redirected");
											}
											else 
											{ 
												System.out.println("No! Manage jobs Redirection is Failed");
											}
									}

@Then("user click on the add button")
public void user_click_on_the_add_button() throws Throwable
								{
										Thread.sleep(5000);
										Manage_Jobs.click_addButton(); 
								}

@Then("user check the popup tab")
public void user_check_the_popup_tab() throws Throwable
								{
										Thread.sleep(3000);
										WebElement previousButton=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-assign-assesment/div[3]/div/div/div[1]/h4"));
										if (previousButton.isDisplayed())                                                                                                             
										{ 
											System.out.println("Yes! Add new question is Displayed");
										}
										else
										{ 
											System.out.println("No! Add new question is Displayed");
										}
								} 
 
@Then("user select the skill")
public void user_select_the_skill() throws Throwable
								{
										Thread.sleep(5000);
										Manage_Jobs.click_selectSkill(); 
										Thread.sleep(2000);
										Manage_Jobs.click_selectSkillOption1();
								}


@Then("user checks the add question button")
public void user_checks_the_add_question_button() throws Throwable
								{
										Thread.sleep(3000);
										WebElement previousButton=BrowserDriver.getCurrentDriver("chrome").findElement(By.id("addQuestion"));
										if (previousButton.isEnabled())                                                                                                             
										{ 
											System.out.println("Yes! Add question is Enabled");
										}
										else
										{ 
											System.out.println("No! Add question is Disabled"); 
										}
								} 


@Then("user enter the question")
public void user_enter_the_question() throws Throwable
								{  
										Thread.sleep(5000);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.id("question")).sendKeys("What is Prism");
								}


@Then("user select the question type")
public void user_select_the_question_type() throws Throwable
								{
										Thread.sleep(5000);
										Manage_Jobs.click_questionType(); 
										Thread.sleep(2000);
										Manage_Jobs.click_dichiotomousQuestionType();
								}


@Then("user select the experience level")
public void user_select_the_experience_level() throws Throwable
								{
										Thread.sleep(5000);
										Manage_Jobs.click_experienceLevel(); 
										Thread.sleep(2000);
										Manage_Jobs.click_experienceLevelOption1();
								}


@Then("user enter the first option")
public void user_enter_the_first_option() throws Throwable
								{
										Thread.sleep(5000);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.id("enterOption1")).sendKeys("Solid object");
								}


@Then("user enter the second option")
public void user_enter_the_second_option() throws Throwable
								{
										Thread.sleep(5000);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.id("enterOption2")).sendKeys("Liquid object");
								}

@Then("user click the correct option")
public void user_click_the_correct_option() throws Throwable
								{
										Thread.sleep(5000);
										Manage_Jobs.click_option1();
								}


@Then("user click the cancel option")
public void user_click_the_cancel_option() throws Throwable
								{
										Thread.sleep(5000);
										Manage_Jobs.click_cancel(); 
										Thread.sleep(3000);
										WebElement previousButton=BrowserDriver.getCurrentDriver("chrome").findElement(By.id("cancel"));
										if (previousButton.isDisplayed())                                                                                                             
										{ 
											System.out.println("No! Canel button is not working");
										}
										else
										{ 
											System.out.println("Yes! Cancel button is working"); 
										}
									}


@Then("user drag and drop the question")
public void user_drag_and_drop_the_question() throws Throwable
								{
										Thread.sleep(5000);
										
										Actions builder = new Actions(BrowserDriver.getCurrentDriver("chrome"));
										WebElement from = BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"cdk-drop-list-0\"]/div[2]"));
										builder.doubleClick(from).moveByOffset(350, 200);
										//builder.clickAndHold(from).moveByOffset(350, 350);
										WebElement to = BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"cdk-drop-list-1\"]"));	
										//builder.clickAndHold(from).pause(Duration.ofSeconds(4)).moveToElement(to).pause(Duration.ofSeconds(2)).release().build().perform();
										//builder.dragAndDrop(from, to).perform();
										 String textTo = to.getText();   
  
										if(textTo.equals("What is Hello")) 
										{
											System.out.println("Yes! Question dropped successfully"); 
										}
										else 
										{
											System.out.println("No! Question drop failed");
										}
								}


@Then("user search the question")
public void user_search_the_question() throws Throwable
								{
										Thread.sleep(5000);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.id("search")).sendKeys("What is Hello");
										Thread.sleep(4000);
										WebElement to = BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"cdk-drop-list-0\"]/div[1]/div[1]"));	 
										String textTo = to.getText();   
									
										if(textTo.equals("What is Hello")) 
										{
											System.out.println("Yes! Search option is Working"); 
										}
										else  
										{
											System.out.println("No! Search option is not working");
										}
									}

@Then("user click on the search employee option")
public void user_click_on_the_search_employee_option() throws Throwable
								{
										Thread.sleep(10000);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.id("sort-by-numbers")).click(); 
										BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"pageCountDatatable\"]/span[2]/div/li/a[2]")).click();
										Thread.sleep(5000);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.id("search")).sendKeys("aaaaaaaaAutomation purpose");
										Thread.sleep(8000);
										BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-view/div[2]/div[1]/div[1]/div/table/tbody/tr[1]/td[5]/div/button")).click();
										Thread.sleep(3000); 
										Manage_Jobs.click_search_employees(); 
								} 


@Then("user check the search employee page redirection")
public void user_check_the_search_employee_page_redirection() throws Throwable
									{
											Thread.sleep(7000);
											WebElement previousButton=BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-search-employee/div[1]/div/div[1]/h1"));
											if (previousButton.isDisplayed())                                                                                                             
											{ 
												System.out.println("Yes! Search Employee is Redirected"); 
											}
											else 
											{ 
												System.out.println("No! Search Employee Redirection is Failed");
											}
									} 


@Then("user search an employee")
public void user_search_an_employee() throws Throwable
									{
											Thread.sleep(8000);
											BrowserDriver.getCurrentDriver("chrome").findElement(By.id("search")).sendKeys("Full Name320100");
											Thread.sleep(8000);
											WebElement to = BrowserDriver.getCurrentDriver("chrome").findElement(By.xpath("//*[@id=\"app-container\"]/main/div[1]/app-search-employee/div[2]/div/div/div/table/tbody/tr[1]/td[1]/div/a"));	 
											String textTo = to.getText();   
											
											if(textTo.equals("Full Name 320100")) 
											{
												System.out.println("Yes! Search option is Working"); 
											}
											else  
											{
												System.out.println("No! Search option is not working");
											}
										}

@Then("user search an employee with invalid data")
public void user_search_an_employee_with_invalid_data() throws Throwable
									{
											Thread.sleep(8000);
											BrowserDriver.getCurrentDriver("chrome").findElement(By.id("search")).sendKeys("56485468546534");
											Thread.sleep(8000);
											WebElement to = BrowserDriver.getCurrentDriver("chrome").findElement(By.className("text-center text-muted"));	 
											String textTo = to.getText();   
											
											if(textTo.equals("No employees found!")) 
											{
												System.out.println("Yes! Search option is Working fine with invalid data"); 
											}
											else  
											{
												System.out.println("No! Search option is not Working fine with invalid data");
											}
										}

































































}

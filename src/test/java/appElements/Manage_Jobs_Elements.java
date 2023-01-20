package appElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Manage_Jobs_Elements {

static WebDriver driver;

	@FindBy(id="post-a-job")																																																													private WebElement postJobButton;
	@FindBy(id="goback")																																																														private WebElement goback;
	@FindBy(id="jobtitle")				 																																																										private WebElement jobtitle;
	@FindBy(id="specialism")																									                                          											              					     					private WebElement specialism;
	@FindBy(xpath="//*[@id=\"specialism\"]/option[5]")																																				                                                    private WebElement specialism2;
	@FindBy(xpath="//*[@id=\"specialism\"]/option[6]")																																				                                                    private WebElement specialism3;
	@FindBy(id = "jobtype")              												                    																																									private WebElement jobtype;
	@FindBy(xpath = "//*[@id=\"jobtype\"]/option[4]")   																				 																													private WebElement jobtypeDropdownButton1;
	@FindBy(xpath = "//*[@id=\"jobtype\"]/option[3]")   																				 																													private WebElement jobtypeDropdownButton2;
	@FindBy(id = "search")      																																																												private WebElement search;
	@FindBy(id = "addresss")   																																																												private WebElement address;
	@FindBy(id="description")																																																							         			private WebElement description;
	@FindBy(id="add-a-responsibility")																																																								private WebElement addResponsibility;
	@FindBy(xpath="//*[@id=\"app-container\"]/main/div[1]/app-edit-job-post/div[2]/div/div/div/div/div[10]/form/div[1]/div/input")														 		private WebElement keyResponsibility;
	@FindBy(xpath="//*[@ng-reflect-name=\"1\"]")																																																			private WebElement keyResponsibility1;	
	@FindBy(xpath="//*[@id=\"select-skills\"]/div/div[1]/span")																						 																				                private WebElement selectSkills;
	@FindBy(xpath="//*[@id=\"select-skills\"]/div/div[2]/ul[2]/li[1]/div")																																										private WebElement selectSkills1;
	@FindBy(xpath="//*[@id=\"select-skills\"]/div/div[2]/ul[2]/li[3]/div")																																										private WebElement selectSkills2;
	@FindBy(xpath="//*[@id=\"select-skills\"]/div/div[2]/ul[1]/li[1]/div")																																										private WebElement selectAllSkills;
	@FindBy(xpath = "//*[@id=\"select-tags\"]/div/div[1]/span/span[1]")                                                               											                             								private WebElement selectTags; 
	@FindBy(xpath="//*[@id=\"select-tags\"]/div/div[2]/ul[2]/li[1]/div")																																		 								    private WebElement selectTags1;
	@FindBy(xpath="//*[@id=\"select-tags\"]/div/div[2]/ul[2]/li[3]/div")																																		 								    private WebElement selectTags2;
	@FindBy(xpath="//*[@id=\"select-tags\"]/div/div[2]/ul[1]/li[1]")																																										        private WebElement selectAllTags;
	@FindBy(id = "salaryType")																																																			  									private WebElement salaryType;
	@FindBy(xpath = "//*[@id=\"salaryType\"]/option[3]")																																			 													private WebElement salaryType1;
	@FindBy(xpath = "//*[@id=\"salaryType\"]/option[2]")																																			 													private WebElement salaryType2;
	@FindBy(id = "careerlevel")   																											 																																private WebElement careerlevel;
	@FindBy(xpath = "//*[@id=\"careerlevel\"]/option[4]")   																																								                        	private WebElement careerlevelOptionButton ;
	@FindBy(xpath = "//*[@id=\"careerlevel\"]/option[10]")   																																								                        	private WebElement careerlevelOptionButton1 ;
	@FindBy(id="no-of-positions")																																																										private WebElement noOfPositions;
	@FindBy(id="qualificationType")					                                                                                                                                        											             					private WebElement qualificationType;
	@FindBy(xpath="//*[@id=\"qualificationType\"]/option[4]")																                                                                                                     					private WebElement qualificationTypButton;
	@FindBy(xpath="//*[@id=\"qualificationType\"]/option[6]")																                                                                                                     					private WebElement qualificationTypButton1;
	@FindBy(id="datepicker")																																																							     			 		private WebElement datepicker;
	@FindBy(xpath="//*[@id=\"app-container\"]/main/div[1]/app-post-job/div[2]/div/div/div/form/div/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr[5]/td[5]/span")					private WebElement datepickerButton;
    @FindBy(xpath="//*[@id=\"app-container\"]/main/div[1]/app-edit-job-post/div[2]/div/div/div/div/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr[4]/td[8]/span")					private WebElement datepickerButton1;
	@FindBy(id="reset")																																													     																	private WebElement reset;
	@FindBy(id = "post")   																																																														private WebElement post;
	@FindBy(xpath = "//*[@id=\"app-container\"]/main/div[1]/app-post-job/div[2]/div/div/div/form/div/div[13]/ngx-slider/span[6]")																    private WebElement offeredSalaryButton1;
	@FindBy(xpath = "//*[@id=\"app-container\"]/main/div[1]/app-post-job/div[2]/div/div/div/form/div/div[13]/ngx-slider/span[5]")  																private WebElement offeredSalaryButton2;
	@FindBy(xpath="//*[@id=\"app-container\"]/main/div[1]/app-post-job/div[2]/div/div/div/form/div/div[17]/ngx-slider/span[6]")															    	private WebElement experience1;
	@FindBy(xpath="//*[@id=\"app-container\"]/main/div[1]/app-post-job/div[2]/div/div/div/form/div/div[17]/ngx-slider/span[5]")																    private WebElement experience2;
	@FindBy(id="order-by")																																																													private WebElement order_by_button; 
	@FindBy(xpath="//*[@id=\"dropdown-basic\"]/li[1]/a")																																																private WebElement order_by_buttonTitle;	
	@FindBy(xpath="//*[@id=\"dropdown-basic\"]/li[2]/a")																																																private WebElement order_by_buttonStatus;
	@FindBy(id="search")																																																														private WebElement searchButton;
	@FindBy(id="sort-by-numbers")				 																																																						private WebElement sort_by_numbers;
	@FindBy(xpath="//*[@id=\"pageCountDatatable\"]/span[2]/div/li/a[2]")				 					 																																private WebElement sort_by_numbers1; 
	@FindBy(id="actions")																																				                                                        						        				private WebElement actions;
	@FindBy(id = "view-job")              												    											                																													private WebElement view_job;
	@FindBy(id = "edit-job")   																																																													private WebElement edit_job; 
	@FindBy(id = "assign-assessment")      																																																							private WebElement assign_assessment;
	@FindBy(id = "search-employees")   																																																								private WebElement search_employees;
	@FindBy(id="delete-job")																																 																							         				private WebElement delete_job;
	@FindBy(id="view-job-button")																																																										private WebElement view_job_button;
	@FindBy(xpath="//*[@id=\"app-container\"]/main/div[1]/app-view/div[2]/div[1]/div[1]/div/table/tbody/tr[1]/td[1]/a")																					private WebElement jobtitleRedirection;
	@FindBy(id="update")																																																														private WebElement update;
	@FindBy(xpath="//*[@id=\"app-container\"]/app-top-layout/nav/div[2]/div/div[2]/button")																																private WebElement toggleButton;
	@FindBy(xpath="//*[@id=\"app-container\"]/app-top-layout/nav/div[2]/div/div[2]/div/a[6]")																																private WebElement logout;
	@FindBy(xpath="//*[@id=\"app-container\"]/main/div[1]/app-view/div[2]/div[1]/div[1]/div/table/tbody/tr[1]/td[1]/a")																					private WebElement firstJobTitle;
	@FindBy(id="editjob")				 																																																										private WebElement editthisjob;
	@FindBy(id="add")				 																																																											private WebElement addButton;
	@FindBy(id="selectSkill")				 																																																									private WebElement selectSkill;
	@FindBy(xpath="//*[@id=\"selectSkill\"]/option[2]")				 																																													private WebElement selectSkillOption1;
	@FindBy(id="question")				 																																																									private WebElement question;
	@FindBy(id="questionType")				 																																																							private WebElement questionType;
	@FindBy(xpath="//*[@id=\"questionType\"]/option[2]")				 																																												private WebElement dichiotomousQuestionType;
	@FindBy(xpath="//*[@id=\"questionType\"]/option[3]")				 																																												private WebElement multipleChoiceQuestionType;
	@FindBy(id="experienceLevel")				 																																																						private WebElement experienceLevel;
	@FindBy(xpath="//*[@id=\"experienceLevel\"]/option[2]")				 																																											private WebElement experienceLevelOption1;
	@FindBy(id="correctOption")				 																																																							private WebElement correctOption;
	@FindBy(id="cancel")				 																																																										private WebElement cancel;
	@FindBy(id="addQuestion")				 																																																							private WebElement addQuestion;
	@FindBy(id="Option 1")				 																																																									private WebElement option1;
	@FindBy(id="Option 2")				 																																																									private WebElement option2;
	@FindBy(id="Option 3")				 																																																									private WebElement option3;
	@FindBy(id="Option 4")				 																																																									private WebElement option4;
	@FindBy(id="enterOption1")				 																																																							private WebElement enterOption1;
	@FindBy(id="enterOption2")				 																																																							private WebElement enterOption2;
	@FindBy(id="enterOption3")				 		 																																																					private WebElement enterOption3;
	@FindBy(id="enterOption4")				 																																																							private WebElement enterOption4;
	
 
	
	public Manage_Jobs_Elements click_postJobButton() throws InterruptedException 
	{ 
		Thread.sleep(1500); 
		postJobButton.click();
		return this;	   
	}  
	
	public Manage_Jobs_Elements click_goback() throws InterruptedException 
	{
		Thread.sleep(1500); 
		goback.click();
		return this;	  
	}  
	
	public Manage_Jobs_Elements insert_jobtitle(String jt) throws InterruptedException 
	{
		Thread.sleep(1500); 
		jobtitle.sendKeys(jt);
		return this;	  
	}   
	
	public Manage_Jobs_Elements click_specialism() throws InterruptedException 
	{
		Thread.sleep(1500); 
		specialism.click();
		return this;	  
	}  
	
	public Manage_Jobs_Elements click_specialism2() throws InterruptedException 
	{
		Thread.sleep(1500); 
		specialism2.click();
		return this;	  
	}  
	
	public Manage_Jobs_Elements click_specialism3() throws InterruptedException 
	{
		Thread.sleep(1500); 
		specialism3.click();
		return this;	  
	}  
	
	public Manage_Jobs_Elements click_jobtype() throws InterruptedException 
	{
		Thread.sleep(1500); 
		jobtype.click();
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_jobtypeDropdownButton1() throws InterruptedException 
	{
		Thread.sleep(1500); 
		jobtypeDropdownButton1.click();
		return this;	  
	} 
	public Manage_Jobs_Elements click_jobtypeDropdownButton2() throws InterruptedException 
	{
		Thread.sleep(1500); 
		jobtypeDropdownButton2.click();
		return this;	  
	} 
	
	public Manage_Jobs_Elements insert_search(String s) throws InterruptedException 
	{
		Thread.sleep(1500); 
		search.sendKeys(s);
		return this;	  
	} 
	
	public Manage_Jobs_Elements insert_address(String ad) throws InterruptedException 
	{
		Thread.sleep(1500); 
		address.sendKeys(ad);
		return this;	  
	} 
	 
	public Manage_Jobs_Elements insert_description(String des) throws InterruptedException 
	{
		Thread.sleep(1500);  
		description.sendKeys(des);
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_addResponsibility() throws InterruptedException 
	{
		Thread.sleep(1500);  
		addResponsibility.click();
		return this;	  
	} 
	
		
	public Manage_Jobs_Elements click_selectSkills() throws InterruptedException 
	{
		Thread.sleep(1500);  
		selectSkills.click();
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_selectSkills1() throws InterruptedException 
	{
		Thread.sleep(1500);  
		selectSkills1.click();
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_selectAllSkills() throws InterruptedException 
	{
		Thread.sleep(1500);  
		selectAllSkills.click();
		return this;	  
	} 
	public Manage_Jobs_Elements click_selectTags() throws InterruptedException 
	{
		Thread.sleep(1500);  
		selectTags.click();
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_selectTags1() throws InterruptedException 
	{
		Thread.sleep(1500);  
		selectTags1.click();
		return this;	  
	} 
	public Manage_Jobs_Elements click_selectAllTags() throws InterruptedException 
	{
		Thread.sleep(1500);  
		selectAllTags.click();
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_salaryType() throws InterruptedException 
	{
		Thread.sleep(1500);  
		salaryType.click();
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_salaryType1() throws InterruptedException 
	{
		Thread.sleep(1500);  
		salaryType1.click();
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_salaryType2() throws InterruptedException 
	{
		Thread.sleep(1500);  
		salaryType2.click();
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_careerlevel() throws InterruptedException 
	{
		Thread.sleep(1500);  
		careerlevel.click();
		return this;	  
	}
	
	public Manage_Jobs_Elements click_careerlevelOptionButton() throws InterruptedException 
	{
		Thread.sleep(1500);  
		careerlevelOptionButton.click();
		return this;	  
	}
	
	public Manage_Jobs_Elements click_careerlevelOptionButton1() throws InterruptedException 
	{
		Thread.sleep(1500);  
		careerlevelOptionButton1.click();
		return this;	  
	}

	public Manage_Jobs_Elements insert_noOfPositions(CharSequence[] int1) throws InterruptedException 
	{
		Thread.sleep(1500);  
		noOfPositions.sendKeys(int1);
		return this;	  
	}
	public Manage_Jobs_Elements click_qualificationType() throws InterruptedException 
	{
		Thread.sleep(1500);  
		qualificationType.click();
		return this;	  
	}
	public Manage_Jobs_Elements click_qualificationTypButton() throws InterruptedException 
	{
		Thread.sleep(1500);  
		qualificationTypButton.click();
		return this;	  
	}
	
	public Manage_Jobs_Elements click_qualificationTypButton1() throws InterruptedException 
	{
		Thread.sleep(1500);  
		qualificationTypButton1.click();
		return this;	  
	}
	public Manage_Jobs_Elements click_datepicker() throws InterruptedException 
	{
		Thread.sleep(1500);  
		datepicker.click();
		return this;	  
	}
	public Manage_Jobs_Elements click_datepickerButton() throws InterruptedException 
	{
		Thread.sleep(1500);  
		datepickerButton.click();
		return this;	  
	}
	public Manage_Jobs_Elements click_datepickerButton1() throws InterruptedException 
	{
		Thread.sleep(1500);  
		datepickerButton1.click();
		return this;	   
	}
	public Manage_Jobs_Elements click_reset() throws InterruptedException 
	{
		Thread.sleep(1500);  
		reset.click();
		return this;	  
	}
	public Manage_Jobs_Elements click_post() throws InterruptedException 
	{
		Thread.sleep(1500);  
		post.click();
		return this;	   
	}
	
	public Manage_Jobs_Elements click_offeredSalaryButton1() throws InterruptedException 
	{
		Thread.sleep(1500);   
		offeredSalaryButton1.click();
		return this;	   
	}
	public Manage_Jobs_Elements click_offeredSalaryButton2() throws InterruptedException 
	{
		Thread.sleep(1500);  
		offeredSalaryButton2.click();
		return this;	   
	}
	public Manage_Jobs_Elements click_experience1() throws InterruptedException 
	{
		Thread.sleep(1500);  
		experience1.click();
		return this;	   
	}
	public Manage_Jobs_Elements click_experience2() throws InterruptedException 
	{
		Thread.sleep(1500);  
		experience2.click();
		return this;	   
	} 
	public Manage_Jobs_Elements click_order_by_button() throws InterruptedException 
	{
		Thread.sleep(1500);  
		order_by_button.click();
		return this;	   
	} 
	public Manage_Jobs_Elements click_order_by_buttonTitle() throws InterruptedException 
	{
		Thread.sleep(1500);  
		order_by_buttonTitle.click();
		return this;	   
	} 
	public Manage_Jobs_Elements click_order_by_buttonStatus() throws InterruptedException 
	{
		Thread.sleep(1500);  
		order_by_buttonStatus.click();
		return this;	   
	} 
	public Manage_Jobs_Elements click_searchButton() throws InterruptedException  
	{
		Thread.sleep(1500);  
		searchButton.click(); 
		return this;	   
	} 
	public Manage_Jobs_Elements click_sort_by_numbers() throws InterruptedException 
	{
		Thread.sleep(1500);  
		sort_by_numbers.click(); 
		return this;	   
	} 
	public Manage_Jobs_Elements click_sort_by_numbers1() throws InterruptedException 
	{
		Thread.sleep(1500);   
		sort_by_numbers1.click(); 
		return this;	   
	} 
	public Manage_Jobs_Elements click_actions() throws InterruptedException 
	{
		Thread.sleep(1500);   
		actions.click();  
		return this;	   
	} 
	public Manage_Jobs_Elements click_view_job() throws InterruptedException 
	{
		Thread.sleep(1500);   
		view_job.click();  
		return this;	   
	} 
	public Manage_Jobs_Elements click_edit_job() throws InterruptedException 
	{
		Thread.sleep(1500);   
		edit_job.click();  
		return this;	   
	} 
	public Manage_Jobs_Elements click_assign_assessment() throws InterruptedException  
	{
		Thread.sleep(1500);   
		assign_assessment.click();  
		return this;	    
	} 
	public Manage_Jobs_Elements click_search_employees() throws InterruptedException 
	{
		Thread.sleep(1500);   
		search_employees.click();   
		return this;	   
	} 
	public Manage_Jobs_Elements click_delete_job() throws InterruptedException 
	{
		Thread.sleep(1500);    
		delete_job.click();  
		return this;	   
	} 
	public Manage_Jobs_Elements click_view_job_button() throws InterruptedException 
	{
		Thread.sleep(1500);   
		view_job_button.click();  
		return this;	   
	} 
	public Manage_Jobs_Elements click_jobtitleRedirection() throws InterruptedException 
	{
		Thread.sleep(1500);   
		jobtitleRedirection.click();  
		return this;	   
	} 
	public Manage_Jobs_Elements click_update() throws InterruptedException 
	{
		Thread.sleep(1500);   
		update.click();   
		return this;	   
	} 
	public Manage_Jobs_Elements click_toggleButton() throws InterruptedException 
	{
		Thread.sleep(1500);   
		toggleButton.click();   
		return this;	   
	} 
	public Manage_Jobs_Elements click_logout() throws InterruptedException 
	{
		Thread.sleep(1500);   
		logout.click();   
		return this;	   
	} 
	  
	public Manage_Jobs_Elements click_firstJobTitle() throws InterruptedException 
	{
		Thread.sleep(1500); 
		firstJobTitle.click();
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_editthisjob() throws InterruptedException 
	{
		Thread.sleep(1500); 
		editthisjob.click(); 
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_addButton() throws InterruptedException 
	{
		Thread.sleep(1500); 
		addButton.click(); 
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_selectSkill() throws InterruptedException 
	{
		Thread.sleep(1500); 
		selectSkill.click(); 
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_selectSkillOption1() throws InterruptedException 
	{
		Thread.sleep(1500); 
		selectSkillOption1.click(); 
		return this;	  
	} 
	
	public Manage_Jobs_Elements insert_question() throws InterruptedException 
	{
		Thread.sleep(1500); 
		question.click(); 
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_questionType() throws InterruptedException 
	{
		Thread.sleep(1500); 
		questionType.click();  
		return this;	  
	} 
	public Manage_Jobs_Elements click_dichiotomousQuestionType() throws InterruptedException 
	{
		Thread.sleep(1500); 
		dichiotomousQuestionType.click();  
		return this;	  
	} 
	public Manage_Jobs_Elements click_multipleChoiceQuestionType() throws InterruptedException 
	{
		Thread.sleep(1500); 
		multipleChoiceQuestionType.click();  
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_option1() throws InterruptedException 
	{
		Thread.sleep(1500); 
		option1.click(); 
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_option2() throws InterruptedException 
	{
		Thread.sleep(1500); 
		option2.click(); 
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_option3() throws InterruptedException 
	{
		Thread.sleep(1500); 
		option3.click(); 
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_option4() throws InterruptedException 
	{
		Thread.sleep(1500); 
		option4.click(); 
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_enterOption1() throws InterruptedException 
	{
		Thread.sleep(1500); 
		enterOption1.click(); 
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_enterOption2() throws InterruptedException 
	{
		Thread.sleep(1500); 
		enterOption2.click(); 
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_enterOption3() throws InterruptedException 
	{
		Thread.sleep(1500); 
		enterOption3.click(); 
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_enterOption4() throws InterruptedException 
	{
		Thread.sleep(1500); 
		enterOption4.click(); 
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_experienceLevel() throws InterruptedException 
	{
		Thread.sleep(1500); 
		experienceLevel.click(); 
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_experienceLevelOption1() throws InterruptedException 
	{
		Thread.sleep(1500); 
		experienceLevelOption1.click();  
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_correctOption() throws InterruptedException 
	{
		Thread.sleep(1500); 
		correctOption.click(); 
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_cancel() throws InterruptedException 
	{
		Thread.sleep(1500);  
		cancel.click(); 
		return this;	  
	} 
	
	public Manage_Jobs_Elements click_addQuestion() throws InterruptedException 
	{
		Thread.sleep(1500); 
		addQuestion.click(); 
		return this;	  
	} 
	
	
	
	
	
	
	
	
	
	
}

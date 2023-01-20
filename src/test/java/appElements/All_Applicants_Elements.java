package appElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class All_Applicants_Elements {

static WebDriver driver;

	@FindBy(id="tableView")																																																														private WebElement tableView;
	@FindBy(id="cardView")																																																														private WebElement cardView;
	@FindBy(id="orderBy")				 																																																										private WebElement orderBy;
	@FindBy(id="search")																									                        			                  											              					     					private WebElement search;
	@FindBy(id="sortBy")																																																		                                                    private WebElement sortBy;
	@FindBy(id="viewEmployee")																																				                                    											                private WebElement viewEmployee;
	@FindBy(id = "approveApplication")              												                    																																					private WebElement approveApplication;
	@FindBy(id = "scheduleInterview")   																				 																																					private WebElement scheduleInterview;
	@FindBy(id = "updateStatus")   																				 																																							private WebElement updateStatus;
	@FindBy(id = "rejectApplication")      																																																									private WebElement rejectApplication;
	@FindBy(id = "approvedComments")   																																																								private WebElement approvedComments;
	@FindBy(id="cancel")																																																										         			private WebElement cancel;
	@FindBy(id="approve")																																																														private WebElement approve;
	@FindBy(id="updateStatus")														 																																														private WebElement selectStatus;
	@FindBy(id="update")																																																															private WebElement update;	
	@FindBy(id="rejectFeedback")																						 																																	                private WebElement rejectFeedback;
	@FindBy(id="reject")																																																															private WebElement reject;
	@FindBy(id="goBack")																																																															private WebElement goBack;
	@FindBy(id="title")																																																																private WebElement title;
	@FindBy(id= "datepicker")                                                               																														                             								private WebElement datepicker; 
	@FindBy(id="startTime")																																		 																											    private WebElement startTime;
	@FindBy(id="endTime")																														 																							 								    private WebElement endTime;
	@FindBy(id="addAttendees")																																																										        private WebElement addAttendees;
	@FindBy(id = "description")																																																				  									private WebElement description;
	@FindBy(id = "scheduleAppointment")																																											 													private WebElement scheduleAppointment;
	
	
	public All_Applicants_Elements click_tableView() throws InterruptedException 
	{ 
		Thread.sleep(1500); 
		tableView.click();
		return this;	   
	}  
	
	public All_Applicants_Elements click_cardView() throws InterruptedException 
	{ 
		Thread.sleep(1500); 
		cardView.click();
		return this;	  
	}  
	
	public All_Applicants_Elements click_orderBy() throws InterruptedException 
	{
		Thread.sleep(1500); 
		orderBy.click();
		return this;	  
	}   
	
	public All_Applicants_Elements insert_search(String sr) throws InterruptedException 
	{
		Thread.sleep(1500); 
		search.sendKeys(sr);
		return this;	  
	}  
	
	public All_Applicants_Elements click_sortBy() throws InterruptedException 
	{
		Thread.sleep(1500); 
		sortBy.click();
		return this;	  
	}  
	
	public All_Applicants_Elements click_viewEmployee() throws InterruptedException 
	{
		Thread.sleep(1500); 
		viewEmployee.click();
		return this;	  
	}   
	
	public All_Applicants_Elements click_approveApplication() throws InterruptedException 
	{
		Thread.sleep(1500); 
		approveApplication.click();
		return this;	  
	} 
	
	public All_Applicants_Elements click_scheduleInterview() throws InterruptedException 
	{
		Thread.sleep(1500); 
		scheduleInterview.click();
		return this;	  
	} 
	public All_Applicants_Elements click_updateStatus() throws InterruptedException 
	{
		Thread.sleep(1500); 
		updateStatus.click();
		return this;	  
	} 
	
	public All_Applicants_Elements click_rejectApplication() throws InterruptedException 
	{ 
		Thread.sleep(1500); 
		rejectApplication.click();
		return this;	  
	} 
	
	public All_Applicants_Elements insert_address(String cmnts) throws InterruptedException 
	{
		Thread.sleep(1500); 
		approvedComments.sendKeys(cmnts);
		return this;	  
	} 
	 
	public All_Applicants_Elements insert_description(String des) throws InterruptedException 
	{
		Thread.sleep(1500);  
		description.sendKeys(des);
		return this;	  
	} 
	
	public All_Applicants_Elements click_cancel() throws InterruptedException 
	{
		Thread.sleep(1500);  
		cancel.click();
		return this;	  
	} 
	
		
	public All_Applicants_Elements click_approve() throws InterruptedException 
	{
		Thread.sleep(1500);  
		approve.click();
		return this;	  
	} 
	
	public All_Applicants_Elements click_selectStatus() throws InterruptedException 
	{
		Thread.sleep(1500);  
		selectStatus.click();
		return this;	  
	} 
	
	public All_Applicants_Elements click_update() throws InterruptedException 
	{
		Thread.sleep(1500);  
		update.click();
		return this;	  
	} 
	public All_Applicants_Elements insert_rejectFeedback(String fdbck) throws InterruptedException 
	{ 
		Thread.sleep(1500);  
		rejectFeedback.sendKeys(fdbck);
		return this;	  
	} 
	
	public All_Applicants_Elements click_reject() throws InterruptedException 
	{
		Thread.sleep(1500);  
		reject.click();
		return this;	  
	} 
	public All_Applicants_Elements click_goBack() throws InterruptedException 
	{
		Thread.sleep(1500);  
		goBack.click();
		return this;	  
	} 
	
	public All_Applicants_Elements insert_title(String tl) throws InterruptedException 
	{
		Thread.sleep(1500);  
		title.sendKeys(tl);
		return this;	  
	} 
	
	public All_Applicants_Elements click_datepicker() throws InterruptedException 
	{
		Thread.sleep(1500);  
		datepicker.click();
		return this;	  
	} 
	
	public All_Applicants_Elements click_startTime() throws InterruptedException 
	{
		Thread.sleep(1500);  
		startTime.click();
		return this;	  
	} 
	
	public All_Applicants_Elements click_endTime() throws InterruptedException 
	{
		Thread.sleep(1500);  
		endTime.click();
		return this;	  
	}
	
	public All_Applicants_Elements click_addAttendees() throws InterruptedException 
	{
		Thread.sleep(1500);  
		addAttendees.click();
		return this;	  
	}
	
	public All_Applicants_Elements click_scheduleAppointment() throws InterruptedException 
	{
		Thread.sleep(1500);  
		scheduleAppointment.click();
		return this;	  
	}
}

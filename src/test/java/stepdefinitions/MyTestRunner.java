package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "C:\\Users\\NAVEEN KUMAR\\eclipse-workspace\\Employer\\src\\test\\resource\\AppFeatures\\04CompanyDetails.feature", 
		//tags = "@tag3",
		glue= {"stepdefinitions","AppHooks"},
		dryRun = false,
		monochrome=true,
		
		stepNotifications = true,
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		publish = true
		)		

public class MyTestRunner 
{

	 

}
















 






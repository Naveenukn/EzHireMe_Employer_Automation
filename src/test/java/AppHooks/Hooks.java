package AppHooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import AppService_Utilities.PropertyLoader;
import Config.BrowserDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	public PropertyLoader reader = new PropertyLoader();
	
	
	@AfterStep
	public void addScreenshot(Scenario scenario){

		//validate if scenario has failed
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) BrowserDriver.getCurrentDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image"); 
		} else {
			final byte[] screenshot = ((TakesScreenshot) BrowserDriver.getCurrentDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image"); 
		}
		
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

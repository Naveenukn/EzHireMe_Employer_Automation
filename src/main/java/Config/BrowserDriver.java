package Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

public class BrowserDriver {
	
	private static WebDriver mDriver;
	
	public static WebDriver getCurrentDriver(String browserType) {
	
		if(mDriver==null) { 
			
			try {  
				
				mDriver = BrowserFactory.startBrowser(browserType);				
				
			}catch(UnreachableBrowserException e) {
				e.printStackTrace();
			}
		}
		
		return mDriver;
		 
	}
	
	
	public static WebDriver getCurrentDriver() {
		
		return getCurrentDriver("chrome");
		
	}
	
	
	
	
	
	
	
	

}

package AppService_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {
	
	public Properties prop;
	public File file = new File("src\\test\\java\\AppData\\login.properties");
	
	 public PropertyLoader() {
		
		
		try {
			
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public String get_username() {
		return prop.getProperty("uname");
	}
	
	public String get_password() {
		return prop.getProperty("pword");
	}
	
	public String getBrowserName() {
		return prop.getProperty("browsername");
	}
	
	public String getbrowserUrl() {
		return prop.getProperty("browserUrl");
	}


	


	


	
	

}

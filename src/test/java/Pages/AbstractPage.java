package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractPage {
	
	protected static WebDriver nav;
	
	protected static WebDriver getDriver() {
		
		if(nav == null) {
			nav = new ChromeDriver();
		}else {
			
			boolean hasQuit = nav.toString().contains("(null)");
			if (hasQuit) {
				nav = new ChromeDriver();
				
			}
		}
	
		return nav;
	}

}

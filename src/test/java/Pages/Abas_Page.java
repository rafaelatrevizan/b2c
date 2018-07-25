package Pages;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Suporte.Frame;
import junit.framework.Assert;

@RunWith(DataDrivenTestRunner.class)

public class Abas_Page extends Base_Page {

	public Abas_Page(WebDriver nav) {
		super(nav);
	}

	public Abas_Page clickAbaHotelResort() {
		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//span[text() = \"Hotel/Resorts\"]")).click();
		
		return this;
	}
	
}

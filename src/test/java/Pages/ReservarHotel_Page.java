package Pages;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Suporte.Frame;
import junit.framework.Assert;

@RunWith(DataDrivenTestRunner.class)

public class ReservarHotel_Page extends Base_Page {

	public ReservarHotel_Page(WebDriver nav) {
		super(nav);
	}

	public ReservarHotel_Page fillDestino(String destinoName) {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}	
		WebElement destino = nav.findElement(By.id("inputdestino"));
		
		destino.sendKeys(destinoName);
		
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}
		destino.sendKeys(Keys.ENTER);
		
		return this;
	}
	
	public ReservarHotel_Page checkReserva() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
	
		
		return this;
	}

	

}

package Pages;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Suporte.Frame;
import junit.framework.Assert;

@RunWith(DataDrivenTestRunner.class)

public class AbasServiços_Page extends Base_Page {

	public AbasServiços_Page(WebDriver nav) {
		super(nav);
	}

	public AbasServiços_Page clickDetalheViagem() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.xpath("//ul[@id = \"drop-tabs\"]/li[1]")).click();

		return this;
	}

	public AbasServiços_Page clickIngresso() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.xpath("//ul[@id = \"drop-tabs\"]/li[2]")).click();

		return this;
	}

	
	public AbasServiços_Page clickTransfer() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.xpath("//ul[@id = \"drop-tabs\"]/li[3]")).click();

		return this;
	}
	
	public AbasServiços_Page clickMaisServicos() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.xpath("//ul[@id = \"drop-tabs\"]/li[4]")).click();

		return this;
	}

}

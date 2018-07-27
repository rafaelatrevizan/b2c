package Pages;

import java.util.List;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Suporte.Frame;
import junit.framework.Assert;

@RunWith(DataDrivenTestRunner.class)

public class OutroVoo_Page extends Base_Page {
	

	public OutroVoo_Page(WebDriver nav) {
		super(nav);
	}

	public OutroVoo_Page clickVoo() {

		try {Thread.sleep(1000);} catch (InterruptedException ex) {}

		List<WebElement> voo = nav.findElements(By.xpath("//button[@id = \"btn-comprar\"]"));
		voo.get(3).click();		

		return this;
	}

	public OutroVoo_Page addMais() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}

		List<WebElement> add = nav.findElements(By.xpath("//a[text() = \"ADICIONAR\"]"));
		add.get(0).click();

		return this;
	}

	// public Ingresso_Page nomeIngresso() {
	//
	// try {
	// Thread.sleep(1000);
	// } catch (InterruptedException ex) {
	// }
	//
	// List<WebElement> nomeIngresso = nav.findElements(By.xpath("//div[@class =
	// \"details detalhesServ\"]/h4"));
	// nomeIngresso1 = nomeIngresso.get(1).getText();
	// System.out.println(nomeIngresso1);
	//
	// return this;
	// }

}

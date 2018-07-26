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

public class Transfer_Page extends Base_Page {
	

	public Transfer_Page(WebDriver nav) {
		super(nav);
	}

	public Transfer_Page checkDetalhes() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		// nav.findElement(By.xpath("//*[@id=\"servicos1\"]/div/div[1]/article/div/div[2]/div/span/span/a")).click();

		List<WebElement> detalhes = nav.findElements(By.xpath("//a[text() = \"Detalhes\"]"));
		detalhes.get(5).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		List<WebElement> popup = nav.findElements(By.xpath("//h4[@id = \"myModalLabel\"]"));
		String textDetalhe = popup.get(4).getText();
		System.out.println(textDetalhe + "do Transfer");
		Assert.assertEquals("Detalhes Serviços", textDetalhe);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		List<WebElement> btnOk = nav.findElements(By.xpath("//button[text() = \"OK\"]"));
		btnOk.get(4).click();

		return this;
	}

	public Transfer_Page addIngresso() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}

		List<WebElement> add = nav.findElements(By.xpath("//a[text() = \"ADICIONAR\"]"));
		add.get(3).click();

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

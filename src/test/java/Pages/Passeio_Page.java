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

public class Passeio_Page extends Base_Page {
	public Passeio_Page(WebDriver nav) {
		super(nav);
	}

	public Passeio_Page checkDetalhes() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		// nav.findElement(By.xpath("//*[@id=\"servicos1\"]/div/div[1]/article/div/div[2]/div/span/span/a")).click();
		
		//Clica no botão Detalhes para abrir o modal
		List<WebElement> detalhes = nav.findElements(By.xpath("//a[text() = \"Detalhes\"]"));
		detalhes.get(1).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		//Verifica se o modal foi aberto conferindo o nome dele
		List<WebElement> popup = nav.findElements(By.xpath("//h4[@id = \"myModalLabel\"]"));
		String textDetalhe = popup.get(0).getText();
		System.out.println(textDetalhe + "do Ingresso");
		Assert.assertEquals("Detalhes Serviços", textDetalhe);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		//Clica no botão OK para fechar o botão
		List<WebElement> btnOk = nav.findElements(By.xpath("//button[text() = \"OK\"]"));
		btnOk.get(0).click();

		return this;
	}

	// //a[text() = "ADICIONAR"]
	public Passeio_Page addPasseio() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		//Clicar em Adicionar, para adicionar o serviço de Ingresso
		List<WebElement> add = nav.findElements(By.xpath("//a[text() = \"ADICIONAR\"]"));
		add.get(0).click();

		return this;
	}


}

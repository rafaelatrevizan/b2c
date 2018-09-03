package Pages;

import java.util.List;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Suporte.Frame;
import junit.framework.Assert;

@RunWith(DataDrivenTestRunner.class)

public class Ingresso_Page extends Base_Page {
	public Ingresso_Page(WebDriver nav) {
		super(nav);
	}

	public Ingresso_Page checkDetalhes() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		// nav.findElement(By.xpath("//*[@id=\"servicos1\"]/div/div[1]/article/div/div[2]/div/span/span/a")).click();
		
		//Clica no botão Detalhes para abrir o modal
		List<WebElement> detalhes = nav.findElements(By.xpath("//a[text() = \"Detalhes\"]"));
		detalhes.get(3).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		//Verifica se o modal foi aberto conferindo o nome dele
		List<WebElement> popup = nav.findElements(By.xpath("//h4[@id = \"myModalLabel\"]"));
		String textDetalhe = popup.get(2).getText();
		System.out.println(textDetalhe + "do serviço");
		Assert.assertEquals("Detalhes do serviço", textDetalhe);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		//Clica no botão OK para fechar o botão
		List<WebElement> btnOk = nav.findElements(By.xpath("//button[text() = \"Ok\"]"));
		btnOk.get(2).click();

		return this;
	}
	
	public Ingresso_Page addDataIngresso() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		//Clicar no combo para adicionar uma data ao ingresso
		List<WebElement> comboData = nav.findElements(By.xpath("//label[text() = \"Data de Utilização:\"]/following-sibling::div"));
		comboData.get(2).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
	
		List<WebElement> datas = nav.findElements(By.xpath("//option[text() = \"05/09/2018\"]"));
		datas.get(2).click();
	
		return this;
	}
	

	// //a[text() = "ADICIONAR"]
	public Ingresso_Page addIngresso() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		//Clicar em Adicionar, para adicionar o serviço de Ingresso
		List<WebElement> add = nav.findElements(By.xpath("//a[text() = \"Adicionar\"]"));
		add.get(2).click();

		return this;
	}


}

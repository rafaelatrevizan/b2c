package Pages;

import java.util.List;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

@RunWith(DataDrivenTestRunner.class)

public class Pagamento_Page extends Base_Page {
	private int index;
	Faker faker = new Faker();

	public Pagamento_Page(WebDriver nav) {
		super(nav);
	}

	public Pagamento_Page fillNames() {		
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}

		List<WebElement> nomes = nav.findElements(By.xpath("//input[@name = \"passageiro-nome[]\"]"));
		int tam = nomes.size();
		do {
			String nomePessoa = faker.name().name();
			nomes.get(index).sendKeys(nomePessoa);
			index ++;
			}while (index >= 0);

		return this;
	}
	
	//MÉTODO ALTERNATIVO ATÉ EU CONSEGUIR FAZER O DE CIMA
	public Pagamento_Page fillInformation() {	
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}

		nav.findElement(By.xpath("//button[text() = \"Completar Formulário\"]")).click();
		return this;
	}
	
	// 
	public Pagamento_Page idadeCrianca() {	
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//input[@data-id=\"3\"]")).clear();
		nav.findElement(By.xpath("//input[@data-id=\"3\"]")).sendKeys("01/01/2013");
		return this;
	}
	
	
	public Pagamento_Page fillNumeroCartaoValido(String numeroCartao) {		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}

		nav.findElement(By.id("nrCartaoPC")).sendKeys(numeroCartao);
		return this;
	}
	
	public Pagamento_Page fillNumeroCartaoInvalido(String numeroCartao2) {	
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}

		nav.findElement(By.id("nrCartaoPC")).sendKeys(numeroCartao2);
		return this;
	}
	
	public Pagamento_Page fillParcelas() {		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}

//		Select select = new Select(nav.findElement(By.xpath("//select[@name = \"parcelasPC\"]")));
//		select.selectByValue("1|R$ 432.55");
		
		nav.findElement(By.xpath("//select[@name = \"parcelasPC\"]")).click();
		nav.findElement(By.xpath("//select[@name = \"parcelasPC\"]/option[2]")).click();
		return this;
	}
	
	public Pagamento_Page fillMes() {	
		Select select = new Select(nav.findElement(By.xpath("//select[@name = \"vencimentoMesCartaoPC\"]")));
		select.selectByValue("05");
		return this;
	}
	
	public Pagamento_Page fillAno() {		
		Select select = new Select(nav.findElement(By.xpath("//select[@name = \"vencimentoAnoCartaoPC\"]")));
		select.selectByValue("2022");
		return this;
	}

	public Pagamento_Page clickTermosCondicoes() {	
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}

		nav.findElement(By.xpath("//input[@name = \"termos\"]")).click();
		
		if(nav.findElement(By.xpath("//p[@class = \"alerta\"]")).isDisplayed()) {
			System.out.println("Os termos não foram selecionados");
			throw new RuntimeException();
		}
		return this;
	}
	
	//FAZER UM MÉTODO QUE RECEBA O VALOR TOTAL DA RESERVA E COMPARAR COM O VALOR DA PÁGINA ANTERIOR
	
	// 
	public Pagamento_Page clickComprar() {	
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}

		nav.findElement(By.xpath("//button[text() = \"COMPRAR\"]")).click();
		return this;
	}
	
	// //div[@class = "modal-content"]/div[text() = "Ocorreu uma falha ao gerar o pagamento"]
	public Pagamento_Page msgErroCartao() {	
		try {Thread.sleep(5000);} catch (InterruptedException ex) {}

		if(nav.findElement(By.xpath("//div[@class = \"modal-content\"]/div[text() = \"Ocorreu uma falha ao gerar o pagamento\"]")).isDisplayed()) {
			System.out.println("Ocorreu uma falha com o cartão, está correto");
		}else {
			System.out.println("A reserva foi realizada com cartão de final inválido, algo errado");
			throw new RuntimeException();
		}
		return this;
	}
}

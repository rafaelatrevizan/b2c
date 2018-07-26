package Pages;

import java.util.List;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.github.javafaker.Faker;

@RunWith(DataDrivenTestRunner.class)

public class Pagamento_Page extends Base_Page {
	private int index;
	Faker faker = new Faker();

	public Pagamento_Page(WebDriver nav) {
		super(nav);
	}

	public Pagamento_Page fillNames() {		
		List<WebElement> nomes = nav.findElements(By.xpath("//input[@name = \"passageiro-nome[]\"]"));
		int tam = nomes.size();
		do {
			String nomePessoa = faker.name().name();
			nomes.get(index).sendKeys(nomePessoa);
			index ++;
			if(index > tam) {
				return this;
			}
		}while (index >= 0);

		return this;
	}

	

}

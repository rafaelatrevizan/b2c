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

public class Comprovante_Page extends Base_Page {
	private int index;
	Faker faker = new Faker();

	public Comprovante_Page(WebDriver nav) {
		super(nav);
	}

	public Comprovante_Page checkReserva() {		
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}

		WebElement confirm = nav.findElement(By.xpath("//div[@id = \"main\"]/div/div/h2"));		
		String reserva = confirm.getText();
		System.out.println(reserva);
		System.out.println("IEI CHREGOU NA RESERVA");
		return this;
	}
	
	
	
	
}

package steps;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import Pages.AbstractPage;
//import Pages.Common_Page;
//import Suporte.geradorNumero;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;

@RunWith(DataDrivenTestRunner.class)

public class Common_StepDefinition extends AbstractPage {
	WebDriver nav = getDriver();
	Date data = new Date();
	
	static String horas() {
        DateFormat dateFormat = new SimpleDateFormat("d-MM-yy");
        Date date = new Date();
        return dateFormat.format(date);
    }

//	@Before
//	public void setUp() {
//		
//	}

	@Dado("^que esteja na página inicial$")
	public void queEstejaNaPáginaInicial() throws Throwable {
		nav = getDriver();
		System.out.println("Começando");
		nav.manage().window().maximize();
		nav.get("http://192.168.15.100/b2c/index");	
	}


	@After(order = 1)
	public void screenShot(Scenario cenario) {				    
		File file = ((TakesScreenshot) nav).getScreenshotAs(OutputType.FILE);
		try {
			try {Thread.sleep(2000);} catch (InterruptedException ex) {}
			FileUtils.copyFile(file, new File("target/ScreenShot/"+ horas() +"/"+ cenario.getStatus().toUpperCase() + " - " + cenario.getName()
			+ "-" + data.getHours() + data.getMinutes() + data.getSeconds() +".jpg"));
//			FileUtils.copyFile(file, new File("target/ScreenShot/"+ cenario.getStatus()+ " - " + cenario.getId() + "-" + data.getDate() + "-" + data.getMonth() + "-" + data.getYear() + data.getTime()+ ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

	@After(order = 0)
	public void tearDown() {
		System.out.println("Acabou");
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.quit();
	}

}

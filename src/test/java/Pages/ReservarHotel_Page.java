package Pages;

import java.util.List;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@RunWith(DataDrivenTestRunner.class)

public class ReservarHotel_Page extends Base_Page {
	private String nomeHotel;

	public ReservarHotel_Page(WebDriver nav) {
		super(nav);
	}

	public ReservarHotel_Page fillDestino(String destinoName) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		WebElement destino = nav.findElement(By.id("inputdestino"));

		destino.sendKeys(destinoName);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException ex) {
		}
		destino.sendKeys(Keys.ENTER);

		nomeHotel = destinoName;

		return this;
	}

	public ReservarHotel_Page chooseDatas() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.id("dataentrada")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.xpath("//a[text() = \"27\"]")).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.id("datasaida")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.xpath("//a[text() = \"30\"]")).click();
		return this;
	}

	public ReservarHotel_Page btnPesquisar() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.id("btnBuscar")).click();
		return this;
	}

	public ReservarHotel_Page checkNomeHotel() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException ex) {
		}
		WebElement hotelDestacado = nav.findElement(By.xpath("//h3[contains(@class, \"tituloDestacado\")]"));
		String hotel = hotelDestacado.getText();

		if (hotel.contains(nomeHotel)) {
			System.out.println("Hotel possui o nome pesquisado");
		} else {
			System.out.println("Hotel não possui nome pesquisado, algo deu errado");
			throw new RuntimeException();
		}

		return this;
	}

	public ReservarHotel_Page chooseQuarto() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.xpath("//span[@id = \"pnlQuarto1\"]/label[2]")).click();
		return this;
	}

	public ReservarHotel_Page checkQuarto() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
		}
		WebElement x = nav.findElement(By.xpath("//label[contains(@class, \"active\")]/div/div/strong"));
		String nomeQuarto = x.getText();

		WebElement y = nav.findElement(By.xpath("//div[@class = \"guest\"]/div/div[2]"));
		String nomeQuartoEsc = y.getText();

		if (nomeQuarto.equals(nomeQuartoEsc)) {
			System.out.println("Nome do quarto está correto");
			System.out.println("O quarto selecionado = " + nomeQuarto);
			System.out.println("É igual ao detalhe = " + nomeQuartoEsc);
		} else {
			System.out.println("Nome do quarto não está correto");
			System.out.println("O quarto selecionado = " + nomeQuarto + " não é igual ao detalhe = " + nomeQuartoEsc);
			throw new RuntimeException();
		}

		return this;
	}

	public ReservarHotel_Page checkRegime() {
		WebElement reg = nav.findElement(By.xpath("//label[contains(@class, \"active\")]/div/div[2]/div[2]"));
		String regimeEsc = reg.getText();

		WebElement reg2 = nav.findElement(By.xpath("//div[@class = \"guest\"]/div/div[3]"));
		String regimeDetalhe = reg2.getText();

		if (regimeEsc.equals(regimeDetalhe)) {
			System.out.println("Nome do regime está correto");
			System.out.println("O regime selecionado = " + regimeEsc);
			System.out.println(" é igual ao detalhe = " + regimeDetalhe);
		} else {
			System.out.println("Nome do regime não está correto");
			System.out.println("O regime selecionado = " + regimeEsc + " não é igual ao detalhe = " + regimeDetalhe);
			throw new RuntimeException();
		}

		return this;
	}

	public ReservarHotel_Page checkRooms() {
		WebElement room = nav.findElement(By.xpath("//span[@class = \"search-rooms\"]/span[2]"));
		// //span[@class = "search-rooms"]/span[2]
		// *[@id="page-wrapper"]/section[1]/div/div[1]/div[1]/div/div[1]/span[2]/text()[2]
		String roomQtdd = room.getText().toLowerCase();

		WebElement room1 = nav.findElement(By.xpath("//div[@class = \"guest\"]/div/div/div"));
		String roomDetalhe = room1.getText().toLowerCase();

		if (roomDetalhe.contains(roomQtdd)) {
			System.out.println("A quantidade de quartos está correto");
			System.out.println("Quantidade selecionada = " + roomQtdd);
			System.out.println("Quantidade no detalhe = " + roomDetalhe);
		} else {
			System.out.println("Nome do regime não está correto");
			System.out.println(
					"Quantidade selecionada = " + roomQtdd + " Não é igual a quantidade no detalhe = " + roomDetalhe);
			throw new RuntimeException();
		}

		return this;
	}

	public ReservarHotel_Page checkValores() {
		WebElement vq = nav
				.findElement(By.xpath("//label[contains(@class, \"active\")]/div/div[4]/div[2]/span/span[2]"));
		String valorQuarto = vq.getText();

		WebElement pf = nav.findElement(By.xpath("//div[@class = \"finalPrice\"]/span[2]/span"));
		String precoFinal = pf.getText();

		WebElement total = nav.findElement(By.xpath("//p[@class = \"total\"]/span/span"));
		String total1 = total.getText();

		if (precoFinal.contains(valorQuarto) && precoFinal.equals(total1)) {
			System.out.println("Os preços estão corretos");
			System.out.println("Preço quarto = " + valorQuarto);
			System.out.println("Final Price = " + precoFinal);
			System.out.println("Total = " + total1);
		} else {
			System.out.println("Os preços não estão corretos");
			System.out.println("Preço quarto = " + valorQuarto);
			System.out.println("Final Price = " + precoFinal);
			System.out.println("Total = " + total1);
			throw new RuntimeException();
		}

		return this;
	}

	public ReservarHotel_Page checkValoresComServ() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
		}

		WebElement pf = nav.findElement(By.xpath("//div[@class = \"finalPrice\"]/span[2]/span"));
		String precoFinal = pf.getText();

		WebElement total = nav.findElement(By.xpath("//p[@class = \"total\"]/span/span"));
		String total1 = total.getText();

		if (precoFinal.equals(total1)) {
			System.out.println("Os preços estão corretos");
			System.out.println("Final Price = " + precoFinal);
			System.out.println("Total = " + total1);
		} else {
			System.out.println("Os preços não estão corretos");
			System.out.println("Final Price = " + precoFinal);
			System.out.println("Total = " + total1);
			throw new RuntimeException();
		}

		return this;
	}

	// public ReservarHotel_Page checkServicoAdicional() {
	// nav.findElement(By.xpath("//div[@id = \"painelDetalheServInc\"]/div/p"));
	// WebElement adicional = nav.findElement(By.xpath("//div[@id =
	// \"painelDetalheServInc\"]/div/p/following-sibling::div/div/div/div/span[2]"));
	// String servico = adicional.getText();
	// System.out.println(servico);
	//
	// return this;
	// }

	public ReservarHotel_Page alterarServIngresso() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}

		List<WebElement> btnAlterar = nav.findElements(By.xpath("//u[text() = \"Alterar\"]"));
		btnAlterar.get(0).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.xpath("//ul[@id = \"drop-tabs\"]/li[2]"));
		System.out.println("Chegou em Ingressos");

		return this;
	}

	public ReservarHotel_Page alterarServTransfer() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}

		List<WebElement> btnAlterar = nav.findElements(By.xpath("//u[text() = \"Alterar\"]"));
		btnAlterar.get(1).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.xpath("//ul[@id = \"drop-tabs\"]/li[3]"));
		System.out.println("Chegou em Transfer");

		return this;
	}

	public ReservarHotel_Page alterarServMais() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}

		List<WebElement> btnAlterar = nav.findElements(By.xpath("//u[text() = \"Alterar\"]"));
		btnAlterar.get(2).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.xpath("//ul[@id = \"drop-tabs\"]/li[4]"));
		System.out.println("Chegou em mais Serviços");

		return this;
	}

	public ReservarHotel_Page removerIngresso() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
		}

		List<WebElement> btnAlterar = nav.findElements(By.xpath("//u[text() = \"Excluir\"]"));
		btnAlterar.get(0).click();

		return this;
	}

	public ReservarHotel_Page removerTransfer() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
		}

		List<WebElement> btnAlterar = nav.findElements(By.xpath("//u[text() = \"Excluir\"]"));
		btnAlterar.get(0).click();

		return this;
	}

	public ReservarHotel_Page removerServMais() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
		}

		List<WebElement> btnAlterar = nav.findElements(By.xpath("//u[text() = \"Excluir\"]"));
		btnAlterar.get(0).click();

		return this;
	}

	// ESSE MÉTODO IRÁ VALIDAR SE A DIV DE SERVIÇOS É EXIBIDA APÓS EXCLUIR TODDOS OS
	// SERVIÇOS, CASO ELA SEJA ESTÁ ERRADO
	public ReservarHotel_Page checkNoService() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
		}

		if (nav.findElement(By.id("painelDetalheServInc")).isDisplayed()) {
			System.out.println("Algum serviço não foi excluido");
			throw new RuntimeException();
		} else {
			System.out.println("Todos os serviços foram excluidos");
		}

		return this;
	}

	public ReservarHotel_Page checkDucplicacaoServ() {
		// ARRUMAR PARA SER VALIDADO COM OUTRA TAG SEM SER ID
		if (nav.findElement(By.id("tab-PASSEIO")).isDisplayed()) {
			System.out.println("Foi exibido mais de uma linha");
			throw new RuntimeException();
		}

		return this;
	}

	public ReservarHotel_Page clickComprar() {
		nav.findElement(By.id("btnReservar")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException ex) {
		}

		if (nav.findElement(By.xpath("//h2[text() = \"Último passo: Garanta sua viagem agora!\"]")).isDisplayed()) {
			System.out.println("Chegou na tela de pagamento");
		} else {
			System.out.println("Algo deu errado ao comprar");
			throw new RuntimeException();
		}

		return this;
	}

}

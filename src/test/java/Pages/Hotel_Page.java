package Pages;

import java.util.List;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

@RunWith(DataDrivenTestRunner.class)

public class Hotel_Page extends Base_Page {
	
	private String nomeHotel;
	private String servIngresso;
	private String servTransfer;
	private String servMais;
	List<WebElement> nomeServico = nav.findElements(By.xpath("//div[@class = \"details detalhesServ\"]/h4"));

	Ingresso_Page ingresso = new Ingresso_Page(nav);

	public Hotel_Page(WebDriver nav) {
		super(nav);
	}

	public Hotel_Page fillDestino(String destinoName) {
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

	public Hotel_Page chooseDatas() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		
		nav.findElement(By.id("dataentrada")).click();
		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}

		
		nav.findElement(By.xpath("//a[text() = \"28\"]")).click();

		try {Thread.sleep(1000);} catch (InterruptedException ex) {}

		nav.findElement(By.id("datasaida")).click();
		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}

		nav.findElement(By.xpath("//a[text() = \"30\"]")).click();
		
		return this;
	}
	
	public Hotel_Page selectCrianca() {	
		Select select = new Select(nav.findElement(By.id("criancas")));
		select.selectByValue("1");
		return this;
	}
	
	public Hotel_Page selectIdadeCrianca() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		Select select = new Select(nav.findElement(By.id("idades")));
		select.selectByValue("5");
		return this;
	}

	public Hotel_Page btnPesquisar() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		List<WebElement> buscar = nav.findElements(By.id("btnBuscar"));
		buscar.get(0).click();
//		nav.findElement(By.id("btnBuscar")).click();
		return this;
	}

	public Hotel_Page checkNomeHotel() {
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}

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

	public Hotel_Page chooseQuarto() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}

		nav.findElement(By.xpath("//span[@id = \"pnlQuarto1\"]/label[2]")).click();
		return this;
	}

	public Hotel_Page checkQuarto() {
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}

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

	public Hotel_Page checkRegime() {
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

	public Hotel_Page checkHospedes() {
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}

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
			System.out.println("Quantidade selecionada = " + roomQtdd + " Não é igual a quantidade no detalhe = " + roomDetalhe);
			throw new RuntimeException();
		}

		return this;
	}
	
	public Hotel_Page checkHospedesCrianca() {
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}
		WebElement adults = nav.findElement(By.xpath("//span[@class = \"search-rooms\"]/span[2]"));
		WebElement criancas = nav.findElement(By.xpath("//span[@class = \"search-rooms\"]/span[3]"));
		// //span[@class = "search-rooms"]/span[2]
		// *[@id="page-wrapper"]/section[1]/div/div[1]/div[1]/div/div[1]/span[2]/text()[2]
		String adultsQtdd = adults.getText().toLowerCase();
		String criancaQtdd = criancas.getText().toLowerCase();

		WebElement detalheAdult1 = nav.findElement(By.xpath("//div[@class = \"guest\"]/div/div/div"));
		String qttDetalhe = detalheAdult1.getText().toLowerCase();

		if (qttDetalhe.contains(adultsQtdd) && qttDetalhe.contains(criancaQtdd)) {
			System.out.println("A quantidade de quartos está correto");
			System.out.println("Quantidade selecionada = " + adultsQtdd);
			System.out.println("Quantidade no detalhe = " + qttDetalhe);
			
			System.out.println("Quantidade selecionada = " + criancaQtdd);
			System.out.println("Quantidade no detalhe = " + qttDetalhe);
		} else {
			System.out.println("Quantidade selecionada = " + adultsQtdd + " Não é igual a quantidade no detalhe = " + qttDetalhe);
			throw new RuntimeException();
		}

		return this;
	}


	public Hotel_Page checkValores() {
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
	
	//VALIDA SE OS SERVIÇOS FORAM ADICIONADOS
	public Hotel_Page checkServicoAdicional() {
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}
		 List<WebElement> adicional = nav.findElements(By.xpath("//div[@id =\"painelDetalheServInc\"]/div/p/following-sibling::div/div/div/div/span"));
		 String servicoIngresso = adicional.get(1).getText();
		 String servicoTransfer = adicional.get(5).getText();
		 String servicoMais = adicional.get(9).getText();
		 	 
		if(servicoIngresso.equals("Show teste") && servicoTransfer.equals("TRANSFER TESTE ida e volta") && servicoMais.equals("passeio de cavalo")) {
			System.out.println("Serviços adicionados com sucesso");
			System.out.println(servicoIngresso);
			System.out.println(servicoTransfer);
			System.out.println(servicoMais);
		}else {
			System.out.println("Os serviços não foram adicionados");
		}
		 
		 return this;
		}

	public Hotel_Page checkValoresComServ() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}

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

	 

	public Hotel_Page alterarServIngresso() {
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

	public Hotel_Page alterarServTransfer() {
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

	public Hotel_Page alterarServMais() {
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

	public Hotel_Page removerIngresso() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
		}

		List<WebElement> btnAlterar = nav.findElements(By.xpath("//u[text() = \"Excluir\"]"));
		btnAlterar.get(0).click();

		return this;
	}

	public Hotel_Page removerTransfer() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
		}

		List<WebElement> btnAlterar = nav.findElements(By.xpath("//u[text() = \"Excluir\"]"));
		btnAlterar.get(0).click();

		return this;
	}

	public Hotel_Page removerServMais() {
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
	public Hotel_Page checkNoService() {
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

	public Hotel_Page checkDucplicacaoServ() {
		// ARRUMAR PARA SER VALIDADO COM OUTRA TAG SEM SER ID
		if (nav.findElement(By.id("tab-PASSEIO")).isDisplayed()) {
			System.out.println("Foi exibido mais de uma linha");
			throw new RuntimeException();
		}

		return this;
	}

	public Hotel_Page clickComprar() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException ex) {
		}
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

package steps;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.AbasMenu_Page;
import Pages.AbasServiços_Page;
import Pages.AbstractPage;
import Pages.Comprovante_Page;
import Pages.Ingresso_Page;
import Pages.MaisServicos_Page;
import Pages.Pagamento_Page;
import Pages.Hotel_Page;
import Pages.Transfer_Page;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)

public class ReservarHotel extends AbstractPage {

	WebDriver nav = getDriver();
	AbasMenu_Page aba = new AbasMenu_Page(nav);
	Hotel_Page hotel = new Hotel_Page(nav);
	AbasServiços_Page servicos = new AbasServiços_Page(nav);
	Ingresso_Page ingresso = new Ingresso_Page(nav);
	Transfer_Page transfer = new Transfer_Page(nav);
	MaisServicos_Page mais = new MaisServicos_Page(nav);
	Pagamento_Page pag = new Pagamento_Page(nav);
	Comprovante_Page comp = new Comprovante_Page(nav);

	// FEATURE: RESERVA HOTEL

	@Quando("^pesquisar um hotel por destino$")
	public void pesquisarUmHotelPorDestino() throws Throwable {
		aba.clickAbaHotelResort();
		hotel.fillDestino("hotel rafa teste");
	}

	@Quando("^preecher as datas$")
	public void preecherAsDatas() throws Throwable {
		hotel.chooseDatas();
	}

	@Quando("^clicar em pesquisar$")
	public void clicarEmPesquisar() throws Throwable {
		hotel.btnPesquisar();
	}

	@Quando("^verificar o nome do hotel escolhido$")
	public void verificarONomeDoHotelEscolhido() throws Throwable {
		hotel.checkNomeHotel();
	}

	@Quando("^verificar a quantidade de hóspedes$")
	public void verificarAQuantidadeDeHóspedes() throws Throwable {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
		}
		hotel.checkHospedes();
	}

	@Quando("^selecionar ou não outro tipo de quarto$")
	public void selecionarOuNãoOutroTipoDeQuarto() throws Throwable {
		hotel.chooseQuarto();
	}

	@Quando("^verificar o nome do quarto$")
	public void verificarONomeDoQuarto() throws Throwable {
		WebElement btnComprar = (new WebDriverWait(nav, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("btnReservar")));
		hotel.checkQuarto();
	}

	@Quando("^verificar o nome do regime$")
	public void verificarONomeDoRegime() throws Throwable {
		hotel.checkRegime();
	}

	@Quando("^verificar os valores$")
	public void verificarOsValores() throws Throwable {
		hotel.checkValores();
	}

	@Quando("^selecionar ou não outros serviços$")
	public void selecionarOuNãoOutrosServiços() throws Throwable {
		// ADICIONAR UM INGRESSO
		servicos.clickIngresso();
		ingresso.checkDetalhes();
		ingresso.addIngresso();

		// ADICIONAR UM TRANSFER
		servicos.clickTransfer();
		transfer.checkDetalhes();
		transfer.addTransfer();

		// ADICIONAR MAIS SERVICOS
		servicos.clickMaisServicos();
		mais.checkDetalhes();
		mais.addMais();

		servicos.clickDetalheViagem();
		
		//VERIFICA SE EXISTE OS 3 SERVIÇOS 
		hotel.checkServicoAdicional();
		
		WebElement btnComprar2 = (new WebDriverWait(nav, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text() = \"COMPRAR\"]")));

		// ALTERAR OS SERVIÇOS ADICIONADOS
		// INGRESSO
		hotel.alterarServIngresso();
		hotel.checkDucplicacaoServ();
		servicos.clickDetalheViagem();
		// TRANSFER
		hotel.alterarServTransfer();
		hotel.checkDucplicacaoServ();
		servicos.clickDetalheViagem();
		// MAIS SERVIÇOS
		hotel.alterarServMais();
		// NÃO TEM A VALIDAÇÃO DE DUPLICAÇÃO PQ ESTÁ INICIALMENTE PELO ID
		servicos.clickDetalheViagem();

		// VALIDA O VALOR TOTAL E O FINAL
		hotel.checkValoresComServ();

		// REMOVER OS SERVIÇOS ADICIONADOS
		// INGRESSO
		hotel.removerIngresso();
		// TRANSFER
		hotel.removerTransfer();
		// MAIS SERVIÇOS
		hotel.removerServMais();
		// VERIFICA SE OS SERVIÇOS FORAM EXCLUIDOS
		hotel.checkNoService();

		// ADICIONA O INGRESSO PARA NO COMPROVANTE VALIDAR SE FOI INSERIDO NA RESERVA
		servicos.clickIngresso();
		ingresso.addIngresso();

		// VALIDA OO VALOR TOTAL E O FINAL
		servicos.clickDetalheViagem();
		hotel.checkValoresComServ();

	}

	@Quando("^clicar em comprar$")
	public void clicarEmComprar() throws Throwable {
		hotel.clickComprar();
	}

	@Quando("^preencher os campos de pagamento$")
	public void preencher_os_campos_de_pagamento() throws Throwable {
//		pag.fillNames();
		
		//MÉTODO ALTERNATIVO - CLICA NO BOTÃO NA PARTE SUPERIOR PARA PREENCHER TODAS AS INFORMAÇÕES
		pag.fillInformation();
		
		//PREENCHE CAMPO COM CARTÃO VÁLIDO
		pag.fillNumeroCartaoValido("5260805648318901");
		//PREENCHE CAMPO COM CARTÃO INVÁLIDO
//		pag.fillNumeroCartaoInvalido("5503841169067772");
		
		//PREENCHE O NÚMERO DE PARCELAS
		pag.fillParcelas();
		
		//PREENCHE O MES DE VENCIMENTO DO CARTÃO
		pag.fillMes();
		
		//PREENCHE O ANO DE VENCIMENTO DO CARTÃO
		pag.fillAno();
		
		//ACEITA OS TERMOS E CONDIÇOES
		pag.clickTermosCondicoes();
		
	}

	@Então("^a reserva deverá ser realizada$")
	public void a_reserva_deverá_ser_confimada() throws Throwable {
		pag.clickComprar();
//		WebElement btnComprar2 = (new WebDriverWait(nav, 10))
//				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id = \"main\"]")));
		try {Thread.sleep(10000);} catch (InterruptedException ex) {}

		comp.checkReserva();
		
		System.out.println("A RESERVA FOI FEITA COM SUCESSO");
	}
	
	//RESERVAR COM CARTÃO INVÁLIDO
	@Quando("^preencher os campos de pagamento com cartão inválido$")
	public void preencherOsCamposDePagamentoComCartãoInválido() throws Throwable {
		//MÉTODO ALTERNATIVO - CLICA NO BOTÃO NA PARTE SUPERIOR PARA PREENCHER TODAS AS INFORMAÇÕES
				pag.fillInformation();
				
				//PREENCHE CAMPO COM CARTÃO VÁLIDO
//				pag.fillNumeroCartaoValido("5260805648318901");
				//PREENCHE CAMPO COM CARTÃO INVÁLIDO
				pag.fillNumeroCartaoInvalido("5503841169067772");
				
				//PREENCHE O NÚMERO DE PARCELAS
				pag.fillParcelas();
				
				//PREENCHE O MES DE VENCIMENTO DO CARTÃO
				pag.fillMes();
				
				//PREENCHE O ANO DE VENCIMENTO DO CARTÃO
				pag.fillAno();
				
				//ACEITA OS TERMOS E CONDIÇOES
				pag.clickTermosCondicoes();
	}

	@Então("^deverá ser exibido uma mensagem de erro$")
	public void deveráSerExibidoUmaMensagemDeErro() throws Throwable {
		pag.clickComprar();
		pag.msgErroCartao();
		

	}
	
	//VALIDAR RESERVA COM CRIANÇA
	@Quando("^adicionar uma ou mais crianças$")
	public void adicionarUmaOuMaisCrianças() throws Throwable {
	    hotel.selectCrianca();
	    hotel.selectIdadeCrianca();
	}

	@Quando("^verificar a quantidade de hóspedes com crianca$")
	public void verificarAQuantidadeDeHóspedesComCrianca() throws Throwable {
	    hotel.checkHospedesCrianca();
	}
	
	@Quando("^atualizar a idade da criança$")
	public void atualizarAIdadeDaCriança() throws Throwable {
	    pag.idadeCrianca();
	}


}

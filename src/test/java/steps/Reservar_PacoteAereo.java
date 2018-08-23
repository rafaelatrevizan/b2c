package steps;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Pages.AbasMenu_Page;
import Pages.AbasServiços_Page;
import Pages.AbstractPage;
import Pages.Comprovante_Page;
import Pages.Hotel_Page;
import Pages.OutroVoo_Page;
import Pages.PacoteAereo_Page;
import Pages.Pagamento_Page;
import Pages.Transfer_Page;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)

public class Reservar_PacoteAereo extends AbstractPage {

	WebDriver nav = getDriver();
	AbasMenu_Page aba = new AbasMenu_Page(nav);
	Hotel_Page hotel = new Hotel_Page(nav);
	AbasServiços_Page servicos = new AbasServiços_Page(nav);
	Pagamento_Page pag = new Pagamento_Page(nav);
	Comprovante_Page comp = new Comprovante_Page(nav);
	PacoteAereo_Page pa = new PacoteAereo_Page(nav);
	OutroVoo_Page voo = new OutroVoo_Page(nav);
	Transfer_Page transfer = new Transfer_Page(nav);

	// FEATURE: RESERVA PACOTE AEREO
	@Quando("^clicar na aba Pacote Aereo$")
	public void clicarNaAbaPacoteAereo() throws Throwable {
	    aba.clickAbaPacoteAreo();
	}

	@Quando("^pesquisar uma origem$")
	public void pesquisarUmaOrigem() throws Throwable {
	    pa.fillOrigem("São Paulo");
	}

	@Quando("^selecionar um destino$")
	public void selecionarUmDestino() throws Throwable {
		pa.fillDestino();
	}

	@Quando("^preecher as datas de ida de volta$")
	public void preecherAsDatasDeIdaDeVolta() throws Throwable {
		pa.chooseDatas();
	}
	
	@Quando("^clicar em buscar$")
	public void clicarEmBuscar() throws Throwable {
	   pa.btnPesquisar();
	}	
	
	@Quando("^selecionar um hotel$")
	public void selecionarOutroHotel() throws Throwable {
	    pa.chooseHotel();
	}

	@Quando("^verificar o valor$")
	public void verificarAOrigemEDestinoEValor() throws Throwable {
//	   pa.checkOrigemDestino();
		pa.checkValores();

	}	

	@Quando("^selecionar outro voo$")
	public void selecionarOutroVoo() throws Throwable {
	   servicos.clickOutroVoo();
	   voo.clickVoo();
	   servicos.clickDetalheViagem();
	}

	@Quando("^selecionar ou não outros serviços do pacote$")
	public void selecionarOuNãoOutrosServiçosDoPacote() throws Throwable {
//	   servicos.clickTransferPacote();
	   
	}

	
	
}

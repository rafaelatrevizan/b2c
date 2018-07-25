package steps;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Pages.Abas_Page;
import Pages.AbstractPage;
import Pages.ReservarHotel_Page;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)

public class ReservarHotel extends AbstractPage {

	WebDriver nav = getDriver();
	Abas_Page aba = new Abas_Page(nav);
	ReservarHotel_Page hotel = new ReservarHotel_Page(nav);

	// FEATURE: RESERVA HOTEL

	@Quando("^pesquisar e selecionar um hotel ou serciço adicional$")
	public void pesquisar_e_selecionar_um_hotel_ou_serciço_adicional() throws Throwable {
		aba.clickAbaHotelResort();
		
		hotel.fillDestino("hotel rafa teste");
		
	}

	@Quando("^preencher os campos de pagamento$")
	public void preencher_os_campos_de_pagamento() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Então("^a reserva deverá ser confimada$")
	public void a_reserva_deverá_ser_confimada() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

}

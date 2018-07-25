package Suporte;

import org.openqa.selenium.WebDriver;

import Pages.Base_Page;


public class Frame extends Base_Page {
	
	
	public Frame(WebDriver nav) {
		super(nav);
		// TODO Auto-generated constructor stub
	}

	public Frame swithFrame(int valor){
		nav.switchTo().frame(valor);
		
		return this;
	}

}

package pageobjects.steps.comum;

import cucumber.api.java.pt.Entao;
import pageobjects.pages.comum.NavbarPage;

public class NavbarSteps {
	
	NavbarPage navbarPage = new NavbarPage();
	
	@Entao("sera feito o login no sistema e deve ser validado o botao logout")
	public void entao_sera_feito_o_login_no_sistema_e_deve_ser_validado_o_botao_logout () {
		navbarPage.validarLogin(); 		
 	}

}

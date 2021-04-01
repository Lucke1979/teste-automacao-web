package pageobjects.steps.comum;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import pageobjects.pages.comum.SidebarPage;

public class SidebarSteps {
	
	SidebarPage sidebarPage = new SidebarPage();
	
	@Dado("que clique em Accounts na barra lateral")	
	public void dado_que_clique_em_Accounts_na_barra_lateral () {
		sidebarPage.cliqueAccountsBarraLateral();
	}
	
	@E("clique no submenu supliers")
	public void e_clique_no_submenu_supliers () {
		sidebarPage.cliqueSubmenuSuppliers();
	}

}

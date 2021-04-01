package pageobjects.steps.accounts;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.pages.accounts.SuppliersPage;

public class SuppliersSteps {
	
		SuppliersPage suppliersPage = new SuppliersPage();
	
	@Quando("for direcionado para o menu Suppliers Management")	
	public void quando_for_direcionado_para_o_menu_Suppliers_Management () {
		suppliersPage.validarMenuSuppliersManagement();
	}
	
	@E("clicar no botao Adicionar")
	public void e_clicar_no_botao_Adicionar () {
		suppliersPage.clicarBotaoAdicionar();
	}
	
	@Entao("o cadastro deve ser validado na tabela")
	public void entao_o_cadastro_deve_ser_validado_na_tabela () {
		suppliersPage.validarCadastro();
	}

}

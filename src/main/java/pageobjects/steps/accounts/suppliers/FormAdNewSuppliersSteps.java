package pageobjects.steps.accounts.suppliers;

import cucumber.api.java.pt.E;
import pageobjects.pages.accounts.suppliers.FormAdNewSuppliersPage;

public class FormAdNewSuppliersSteps {
	
	FormAdNewSuppliersPage form = new FormAdNewSuppliersPage(); 
	
	@E("preencher as informacoes dos campos obrigatorios no formulario de cadastro")
	public void e_preencher_as_informaçoes_dos_campos_obrigatorios_no_formulario_de_cadastro() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		form.preencherInformacoesFormulario();
	}
	
	@E("clicar no botao Submit")
	public void e_clicar_no_botao_Submit () {
		form.clicarBotaoSubmit();
	}

}

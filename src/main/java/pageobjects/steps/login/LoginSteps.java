package pageobjects.steps.login;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;
import pageobjects.pages.login.LoginPage;

public class LoginSteps {
	
	LoginPage loginPage = new LoginPage();
	
	@Dado("que esteja na tela de login")
	public void dado_que_esteja_na_tela_de_login () {
		loginPage.validaTelaLogin();
	}
	
	@E("preencha o campo de e-mail")
	public void preencha_o_campo_de_email () {
		loginPage.preencheCampoEmail();
	}
	
	@E("preencha o campo de senha")
	public void e_preencha_o_campo_de_senha () {
		loginPage.preencheCampoSenha();
	}
	
	@Quando("clicar no botao login")
	public void quando_clicar_no_botao_login () {
		loginPage.clicarBotaoLogin();
	}
}

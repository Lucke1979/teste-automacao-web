package pageobjects.pages.login;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.PageBase;

public class LoginPage extends PageBase {
	
	String title = driver.getTitle();
	WebElement inputEmail = driver.findElement(By.name("email"));
	WebElement inputSenha = driver.findElement(By.name("password"));
	WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
	
	
	public void validaTelaLogin () {
		Assert.assertTrue(title.equals("Administator Login"));
	}
	
	public void preencheCampoEmail () {
		inputEmail.sendKeys("admin@phptravels.com");
	}
	
	public void preencheCampoSenha () {
		inputSenha.sendKeys("demoadmin");
	}
	
	public void clicarBotaoLogin () {
		btnLogin.click();
	}

}

package pageobjects.pages.accounts.suppliers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.PageBase;

public class FormAdNewSuppliersPage extends PageBase {
	
	WebElement inputNome = driver.findElement(By.name("fname"));
	WebElement inputSobrenome = driver.findElement(By.name("lname"));
	WebElement inputEmail = driver.findElement(By.name("email"));
	WebElement inputpassword = driver.findElement(By.name("password"));
	WebElement selectPais = driver.findElement(By.id("s2id_autogen1"));
	WebElement nomePais = driver.findElement(By.xpath("//div[contains(text(),'Afghanistan')]"));
	WebElement btnSubmit = driver.findElement(By.xpath("//button[text()=\"Submit\"]"));
	
	public void preencherInformacoesFormulario () {
		inputNome.sendKeys("Marcelo");
		inputSobrenome.sendKeys("Jeremias");
		inputEmail.sendKeys("teste@gmail.com");
		selectPais.click();
		nomePais.click();
	}
	
	public void clicarBotaoSubmit () {
		btnSubmit.click();
	}

}

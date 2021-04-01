package pageobjects.pages.accounts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.PageBase;

public class SuppliersPage extends PageBase {
	
	String title = driver.getTitle();
	WebElement btnAdd = driver.findElement(By.xpath("//button[@type= 'submit']"));
	
	
	public void validarMenuSuppliersManagement () {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(title.equals("Suppliers Management"));
	}
	
	public void clicarBotaoAdicionar () {
		btnAdd.click();
	}
	
	public void validarCadastro () {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.getPageSource().contains("teste@gmail.com");
	}

}

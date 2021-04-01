package pageobjects.pages.comum;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.PageBase;

public class NavbarPage extends PageBase {
	
	WebElement btnLogout = driver.findElement(By.id("logout"));
	

	public void validarLogin () {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertTrue("Erro ao validar Login", btnLogout.isDisplayed());
		
		
	}

}

	

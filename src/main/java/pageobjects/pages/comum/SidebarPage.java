package pageobjects.pages.comum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.PageBase;

public class SidebarPage extends PageBase {
	
	WebElement MenuAccounts = driver.findElement(By.xpath("//ul[@id='ACCOUNTS']/../a"));
	WebElement MenuSuppliers = driver.findElement(By.id("ACCOUNTS"));
	
	
	public void cliqueAccountsBarraLateral () {

		MenuAccounts.click();	
	}
	
	public void cliqueSubmenuSuppliers () {
	
		MenuSuppliers.click();
	}

}

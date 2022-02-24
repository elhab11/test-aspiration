package techbee.solutions.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products {

	public void launchAspiration(WebDriver driver) throws InterruptedException {
		
		driver.get("https://www.aspiration.com/");
		
	}
	
	public void viewProducts(WebDriver driver) throws InterruptedException {
		launchAspiration(driver);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/ul[1]/li[1]/a")).click();

	}
	
	public boolean searchEbayCategory(WebDriver driver) throws InterruptedException {
		launchAspiration(driver);
		viewProducts(driver);
        if (driver.getPageSource().contains("Aspiration") && driver.getPageSource().contains("Aspiration Plus"))
        	return true;
        	else return false;
			
	}
	
}

package techbee.solutions.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Aspiration extends Products {

	
public boolean modalAspiration(WebDriver driver) throws InterruptedException {
		
		driver.get("https://www.aspiration.com/");
		driver.findElement(By.id("price-card-2")).click();
		
		if (driver.switchTo().alert().getText().contains("email adress"))
			return true;
		else return false;
		
	}
	
	
}

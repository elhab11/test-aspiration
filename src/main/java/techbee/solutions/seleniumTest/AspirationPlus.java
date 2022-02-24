package techbee.solutions.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class AspirationPlus extends Products{
public boolean modalAspiration(WebDriver driver) throws InterruptedException {
		
		driver.get("https://www.aspiration.com/");
		driver.findElement(By.xpath("//*[@id=\"price-card-3\"]/div[1]p")).click();
		
		driver.switchTo().alert().sendKeys("aa@dd.com");
		if (driver.switchTo().alert().getText().contains("$71.88"))
			return true;
		else return false;
		
		
	}
	
	
}



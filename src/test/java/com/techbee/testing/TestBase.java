package com.techbee.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import techbee.solutions.seleniumTest.Aspiration;
import techbee.solutions.seleniumTest.AspirationPlus;
import techbee.solutions.seleniumTest.Products;

public class TestBase {
	
     WebDriver driver;
     Products products = new Products();
     Aspiration aspirtion = new Aspiration();
     AspirationPlus aspirtionplus = new AspirationPlus();  
	@Before
	public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elhab\\Documents\\New folder\\chromedriver.exe");
		this.driver = new ChromeDriver();
	}
	@Test
	public void launch() throws InterruptedException {
		products.launchAspiration(driver);
	}
	@Test
	public void viewProducts() throws InterruptedException {
		products.launchAspiration(driver);
	}
	@Test
	public void checkProduct() throws InterruptedException {Products products = new Products();
	assertEquals(products.searchEbayCategory(driver),true);
	}
	@Test
	public void testModal() throws InterruptedException {Products products = new Products();
	assertEquals(aspirtion.modalAspiration(driver),true);
	}
	@Test
	public void testmodalPlus() throws InterruptedException {Products products = new Products();
	assertEquals(aspirtionplus.modalAspiration(driver),true);
	}
	
	
	
	
	@After
    public void quit() {
    	
		driver.quit();
    }
}
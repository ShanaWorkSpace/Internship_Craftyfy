package pages;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.LocatorsReader;


public class HomePage extends LocatorsReader{
	WebDriver driver;
	
	public HomePage(WebDriver driver) throws IOException {
		
		this.driver=driver;
	}
	
	
	 public void enterCredentials(String Username,String Password) {
		 WebElement user = driver.findElement(By.xpath(propi.getProperty("homePage.username")));
		 user.sendKeys(Username);
	 
		 WebElement pass = driver.findElement(By.xpath(propi.getProperty("homePage.password")));
		 pass.sendKeys(Password);
	 }
}
		
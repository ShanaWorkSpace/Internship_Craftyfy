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
	 
		    public boolean Home()
	    {
	        WebElement home=driver.findElement(By.xpath(propi.getProperty("homePage.home")));
	        boolean flag =home.isDisplayed();
	        return flag;
	    }
		    
	    public boolean Collection()
	    {
	        WebElement collection=driver.findElement(By.xpath(propi.getProperty("homePage.collection")));
	        boolean flag = collection.isDisplayed();
	        return flag;
	    }
	    
	    public boolean About()
	    {
	        WebElement about=driver.findElement(By.xpath(propi.getProperty("homePage.about")));
	        boolean flag=about.isDisplayed();
	        return flag;
	    }
	    
	    public boolean Contact()
	    {
	        WebElement contact=driver.findElement(By.xpath(propi.getProperty("homePage.contact")));
	        boolean flag = contact.isDisplayed();
	        return flag;
	    }
}
		
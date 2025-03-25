package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.LocatorsReader;

public class LoginPage extends LocatorsReader
	{
	    public WebDriver driver;

	    public LoginPage(WebDriver drv)throws IOException
	    {
	        this.driver=drv;
	    }
	

	   	    public void login() {
	            WebElement login = driver.findElement(By.xpath(propi.getProperty("UserPage.login")));
	            login.click();
	        }

	        public void enterEmail(String email) {
	            WebElement emailField = driver.findElement(By.xpath(propi.getProperty("UserPage.email")));
	            emailField.sendKeys(email);
	        }

	        public void enterPassword(String password) {
	            WebElement passwordField = driver.findElement(By.xpath(propi.getProperty("UserPage.password")));
	            passwordField.sendKeys(password);
	        }

	        public void signIn() {
	            WebElement signin = driver.findElement(By.xpath(propi.getProperty("UserPage.signin")));
	            signin.click();
	        }

	        public void openCollection() {
	            WebElement collectn = driver.findElement(By.xpath(propi.getProperty("UserPage.collectn")));
	            collectn.click();
	        }

	        public void selectItem() {
	            WebElement select = driver.findElement(By.xpath(propi.getProperty("UserPage.select")));
	            select.click();
	        }

	        public void chooseColor() {
	            WebElement color = driver.findElement(By.xpath(propi.getProperty("UserPage.color")));
	            color.click();
	        }

	        public void addToCart() {
	            WebElement cart = driver.findElement(By.xpath(propi.getProperty("UserPage.cart")));
	            cart.click();
	        }
	    }

	    

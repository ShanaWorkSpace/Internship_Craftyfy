package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserSignUpPage {
    public WebDriver driver;
    public Properties propi;
    
    // Constructor to initialize WebDriver and Properties
    public UserSignUpPage(WebDriver drv) {
        this.driver = drv;
        propi = new Properties();
        try {
            FileInputStream locatorsFile = new FileInputStream("src/test/resources/locators.properties");
            propi.load(locatorsFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void SignUp() {
        driver.findElement(By.xpath(propi.getProperty("signup.button"))).click();
    }

    public void Mail(String Email, String Password) {
        driver.findElement(By.xpath(propi.getProperty("email.input"))).sendKeys(Email);
        driver.findElement(By.xpath(propi.getProperty("password.input"))).sendKeys(Password);
        driver.findElement(By.xpath(propi.getProperty("signin.button"))).click();
    }

    public void AddtoCart() throws InterruptedException {
        driver.findElement(By.xpath(propi.getProperty("collection.text"))).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,115);");

        driver.findElement(By.xpath(propi.getProperty("mandelaArt.text"))).click();
        driver.findElement(By.xpath(propi.getProperty("color.button"))).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath(propi.getProperty("addToCart.button"))).click();

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");

        driver.findElement(By.xpath(propi.getProperty("cart.icon"))).click();
        driver.findElement(By.xpath(propi.getProperty("proceedToCheckout.button"))).click();

        Thread.sleep(2000);
    }

    public void Delivery(String firstName, String lastName, String email, String street, String city, 
                         String state, String zipcode, String country, String phone) throws InterruptedException {

        driver.findElement(By.xpath(propi.getProperty("fname.input"))).sendKeys(firstName);
        driver.findElement(By.xpath(propi.getProperty("lname.input"))).sendKeys(lastName);
        driver.findElement(By.xpath(propi.getProperty("email.input"))).sendKeys(email);
        driver.findElement(By.xpath(propi.getProperty("street.input"))).sendKeys(street);
        driver.findElement(By.xpath(propi.getProperty("city.input"))).sendKeys(city);
        driver.findElement(By.xpath(propi.getProperty("state.input"))).sendKeys(state);
        driver.findElement(By.xpath(propi.getProperty("zipcode.input"))).sendKeys(zipcode);
        driver.findElement(By.xpath(propi.getProperty("country.input"))).sendKeys(country);
        driver.findElement(By.xpath(propi.getProperty("phone.input"))).sendKeys(phone);

        Thread.sleep(2000);

        driver.findElement(By.xpath(propi.getProperty("cash.option"))).click();
        driver.findElement(By.xpath(propi.getProperty("placeOrder.button"))).click();
    }
}

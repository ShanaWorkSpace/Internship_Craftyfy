package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserSignUpPage {
    public WebDriver driver;
    public Properties propi;

    // Constructor to load properties file
    public UserSignUpPage(WebDriver drv) throws IOException {
        this.driver = drv;
        propi = new Properties();
        FileInputStream file = new FileInputStream("src/test/resources/locators.properties");
        propi.load(file);
    }

    public void SignUp() {
        WebElement signup = driver.findElement(By.xpath(propi.getProperty("signup.xpath")));
        signup.click();
    }

    public void Mail(String Email, String Password) {
        WebElement mail = driver.findElement(By.xpath(propi.getProperty("email.xpath")));
        mail.sendKeys(Email);
        
        WebElement password = driver.findElement(By.xpath(propi.getProperty("password.xpath")));
        password.sendKeys(Password);
        
        WebElement signin = driver.findElement(By.xpath(propi.getProperty("signin.xpath")));
        signin.click();
    }

    public void AddtoCart() throws InterruptedException {
        WebElement collection = driver.findElement(By.xpath(propi.getProperty("collection.xpath")));
        collection.click();

        // Scroll down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,115);");

        WebElement mandelaart = driver.findElement(By.xpath(propi.getProperty("mandelaart.xpath")));
        mandelaart.click();

        WebElement color = driver.findElement(By.xpath(propi.getProperty("color.xpath")));
        color.click();

        Thread.sleep(1000);

        WebElement addtocart = driver.findElement(By.xpath(propi.getProperty("addtocart.xpath")));
        addtocart.click();

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -250);");

        WebElement cart = driver.findElement(By.xpath(propi.getProperty("cart.xpath")));
        cart.click();

        WebElement proceed = driver.findElement(By.xpath(propi.getProperty("proceed.xpath")));
        proceed.click();

        Thread.sleep(2000);
    }

    public void Delivery(String Fname, String Lname, String Email, String Street, String City, String State, String Zipcode, String Country, String Phone) throws InterruptedException {
        driver.findElement(By.xpath(propi.getProperty("fname.xpath"))).sendKeys(Fname);
        driver.findElement(By.xpath(propi.getProperty("lname.xpath"))).sendKeys(Lname);
        driver.findElement(By.xpath(propi.getProperty("delivery_email.xpath"))).sendKeys(Email);
        driver.findElement(By.xpath(propi.getProperty("street.xpath"))).sendKeys(Street);
        driver.findElement(By.xpath(propi.getProperty("city.xpath"))).sendKeys(City);
        driver.findElement(By.xpath(propi.getProperty("state.xpath"))).sendKeys(State);
        driver.findElement(By.xpath(propi.getProperty("zipcode.xpath"))).sendKeys(Zipcode);
        driver.findElement(By.xpath(propi.getProperty("country.xpath"))).sendKeys(Country);
        driver.findElement(By.xpath(propi.getProperty("phone.xpath"))).sendKeys(Phone);

        Thread.sleep(2000);

        WebElement cash = driver.findElement(By.xpath(propi.getProperty("cash.xpath")));
        cash.click();

        WebElement order = driver.findElement(By.xpath(propi.getProperty("order.xpath")));
        order.click();
    }
}

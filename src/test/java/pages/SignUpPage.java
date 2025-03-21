package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.LocatorsReader;

public class SignUpPage extends LocatorsReader
{
    public WebDriver driver;

    public SignUpPage(WebDriver drv)throws IOException
    {
        this.driver=drv;
    }
    public void SignUp() {
        WebElement signup = driver.findElement(By.xpath(propi.getProperty("SignUpPage.signup")));
        signup.click();
    }

    public void CreateAcc() {
        WebElement create = driver.findElement(By.xpath(propi.getProperty("SignUpPage.createAcc")));
        create.click();
    }

    public void Name() {
        WebElement name = driver.findElement(By.xpath(propi.getProperty("SignUpPage.name")));
        name.sendKeys("Firstuser");
    }

    public void Email() {
        WebElement email = driver.findElement(By.xpath(propi.getProperty("SignUpPage.email")));
        email.sendKeys("first1user@example.com");
    }

    public void Password() {
        WebElement password = driver.findElement(By.xpath(propi.getProperty("SignUpPage.password")));
        password.sendKeys("firstuser@123");
    }

    public void SignupButton() {
        WebElement signupbutton = driver.findElement(By.xpath(propi.getProperty("SignUpPage.signupButton")));
        signupbutton.click();
    }

    public void Collection() {
        WebElement collection = driver.findElement(By.xpath(propi.getProperty("SignUpPage.collection")));
        collection.click();
    }

    public void Profile() {
        WebElement profile = driver.findElement(By.xpath(propi.getProperty("SignUpPage.profile")));
        profile.click();
    }

    public void Logout() {
        WebElement logout = driver.findElement(By.xpath(propi.getProperty("SignUpPage.logout")));
        logout.click();
    }

    public boolean CollectionDisplayed() {
        WebElement collection = driver.findElement(By.xpath(propi.getProperty("SignUpPage.collection")));
        boolean flag = collection.isDisplayed();
        return flag;
    }
}

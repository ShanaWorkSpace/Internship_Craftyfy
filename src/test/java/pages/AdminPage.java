package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.LocatorsReader;

public class AdminPage extends LocatorsReader {
    public WebDriver driver;

    public AdminPage(WebDriver drv) throws IOException
    {
        this.driver = drv;
    }

    public void AdminPanel(String Email, String Password) {
    
        WebElement email = driver.findElement(By.xpath(propi.getProperty("admin.email.xpath")));
        email.click();
        email.sendKeys(Email);

        WebElement password = driver.findElement(By.xpath(propi.getProperty("admin.password.xpath")));
        password.click();
        password.sendKeys(Password);

        WebElement login = driver.findElement(By.xpath(propi.getProperty("admin.login.xpath")));
        login.click();
    }

    public void AddItem() {
        WebElement additem = driver.findElement(By.xpath(propi.getProperty("admin.addItem.xpath")));
        additem.click();
    }

    public void UploadImage(String imgPath,String PdtName,String PdtDesc,String PdtPrice) {
        WebElement image = driver.findElement(By.xpath(propi.getProperty("product.image.xpath")));
        image.sendKeys(imgPath);

        WebElement pdtname = driver.findElement(By.xpath(propi.getProperty("product.name.xpath")));
        pdtname.sendKeys(PdtName);

        WebElement pdtdescptn = driver.findElement(By.xpath(propi.getProperty("product.description.xpath")));
        pdtdescptn.sendKeys(PdtDesc);

        WebElement pdtcategory = driver.findElement(By.xpath(propi.getProperty("product.category.xpath")));
        pdtcategory.click();

        WebElement category = driver.findElement(By.xpath(propi.getProperty("product.category.option.xpath")));
        category.click();

        WebElement subcategory = driver.findElement(By.xpath(propi.getProperty("product.subcategory.xpath")));
        subcategory.click();

        WebElement subcat = driver.findElement(By.xpath(propi.getProperty("product.subcategory.option.xpath")));
        subcat.click();

        WebElement pdtprice = driver.findElement(By.xpath(propi.getProperty("product.price.xpath")));
        pdtprice.click();

        WebElement itemprice = driver.findElement(By.xpath(propi.getProperty("product.price.input.xpath")));
        itemprice.sendKeys(PdtPrice);

        WebElement color = driver.findElement(By.xpath(propi.getProperty("product.color.xpath")));
        color.click();

        WebElement tick = driver.findElement(By.xpath(propi.getProperty("product.bestseller.xpath")));
        tick.click();

        WebElement add = driver.findElement(By.xpath(propi.getProperty("product.submit.xpath")));
        add.click();
    }

    public void ListItems() {
        WebElement list = driver.findElement(By.xpath(propi.getProperty("admin.listItems.xpath")));
        list.click();
    }

    public void DeleteItems() {
        WebElement delete = driver.findElement(By.xpath(propi.getProperty("admin.deleteItem.xpath")));
        delete.click();
    }

    public void GetOrders() {
        WebElement orders = driver.findElement(By.xpath(propi.getProperty("admin.orders.xpath")));
        orders.click();
    }
    public boolean isElementDisplayed(String locatorKey) {
        try {
            return driver.findElement(By.xpath(propi.getProperty(locatorKey))).isDisplayed();
        } catch (Exception e) {
            return false;
        }
}}

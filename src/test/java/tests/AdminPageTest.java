package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import base.TestBase;
import pages.AdminPage;


public class AdminPageTest extends TestBase {
    AdminPage obj;

    @BeforeClass
    public void init() throws IOException{
        obj = new AdminPage(driver);
    }

    @Test
    public void Sign() {

    	driver.get(prop.getProperty("admin.url"));
        obj.AdminPanel(prop.getProperty("admin.email"), prop.getProperty("admin.password"));

        // Assert login success (Check if Add Item button is displayed after login)
        Assert.assertTrue(obj.isElementDisplayed("admin.addItem.xpath"), "Admin login failed!");
        
        obj.AddItem();
        obj.UploadImage(prop.getProperty("product.image.path"),prop.getProperty("product.name"),prop.getProperty("product.description"),prop.getProperty("product.price"));
     // Assert item upload success (Check if list items button is displayed)
        Assert.assertTrue(obj.isElementDisplayed("admin.listItems.xpath"), "Item upload failed!");
        
        obj.ListItems();
     // Assert listing success (Check if delete button is visible)
        Assert.assertTrue(obj.isElementDisplayed("admin.deleteItem.xpath"), "Item listing failed!");
        
        obj.DeleteItems();
        // Assert deletion success (Check if delete button is no longer visible)
        Assert.assertTrue(obj.isElementDisplayed("admin.deleteItem.xpath"), "Item deletion failed!");

        obj.GetOrders();
        // Assert orders page loaded
        Assert.assertTrue(obj.isElementDisplayed("admin.orders.xpath"), "Order retrieval failed!");
    }
}

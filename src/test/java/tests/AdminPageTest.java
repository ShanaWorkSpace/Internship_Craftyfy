package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import base.TestBase;
import constants.AutomationConstants;
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
        
    }
    @Test(priority = 2)
    public void itemSecTC01() {
        obj.AddItem(); // Assuming you have a method for this in AdminActions
        obj.listItems();
        
        String actResult = obj.getProductName();
        Assert.assertEquals(actResult, AutomationConstants.listitem);

        obj.deleteItems();
        obj.verifyProductRemovedAlert();

        obj.getOrders();

        String orderTitle = obj.getOrderPageTitle();
        Assert.assertEquals(orderTitle, "Order Page");

        obj.updateDeliveryStatus();
    }

    @Test(priority = 3)
    public void adminLogout() {
        obj.logout();
    }

    @Test(priority = 4)
    public void adminNegTC02() {
    	obj.AdminPanel(prop.getProperty("admin.bemail"), prop.getProperty("admin.npassword"));
       
    }

    @Test(priority = 5)
    public void adminNegTC01() {
    	obj.AdminPanel(prop.getProperty("admin.nemail"), prop.getProperty("admin.bpassword"));
    }
}
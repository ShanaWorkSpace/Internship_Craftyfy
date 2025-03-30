package tests;

import java.io.IOException;

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
        obj.AddItem();
        obj.UploadImage(prop.getProperty("product.image.path"),prop.getProperty("product.name"),prop.getProperty("product.description"),prop.getProperty("product.price"));
        obj.ListItems();
        obj.DeleteItems();
        obj.GetOrders();
    }
}

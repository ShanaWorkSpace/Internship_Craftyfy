package tests;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import constants.AutomationConstants;
import pages.HomePage;
public class HomePageTest extends TestBase{
		
		HomePage home;
		
		@BeforeClass
		public void page_init() throws IOException {
			home = new HomePage(driver);
		}
		
		
		@Test (priority = 1)
		public void home_show() throws InterruptedException {
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
	    Assert.assertEquals(currentUrl, AutomationConstants.HomeURL);
        boolean display=home.Home();
        Assert.assertEquals(display, true);
        
        boolean display1 = home.Collection();
        Assert.assertEquals(display1, true);
        
        boolean display2 = home.About();
        Assert.assertEquals(display2, true);
        
        boolean display3 = home.Contact();
        Assert.assertEquals(display3, true);
        
        
        Thread.sleep(500);
        
	    System.out.println("Test:HomePage Verification passed");
		
//		home.enterCredentials(prop.getProperty("UsernameM"),prop.getProperty("PasswordM"));	
		
}

	}



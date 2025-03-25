package tests;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;


 class LoginPageTest extends TestBase 
 {
	    LoginPage user;
	    
	    @BeforeClass
	    public void init() throws IOException
	    {
	        user = new LoginPage(driver);
	    }
    @Test(priority = 1)
    public void testLogin() {
        user.login();
        user.enterEmail(prop.getProperty("logName"));
        user.enterPassword(prop.getProperty("logPass"));
        user.signIn();
    }

    @Test(priority = 2, dependsOnMethods = "testLogin")
    public void testProductSelection() {
        user.openCollection();
        user.selectItem();
        user.chooseColor();
        user.addToCart();
    }

    
    }


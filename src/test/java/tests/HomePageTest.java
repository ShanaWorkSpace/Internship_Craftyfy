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
		public void testURL() {
		String currentUrl=driver.getCurrentUrl();
		 System.out.println(currentUrl);
	    Assert.assertEquals(currentUrl, AutomationConstants.HomeURL);
	    System.out.println("Test:URL Verification passed");
		}
		
//		@Test(priority = 2)
//		public void login_admin() throws InterruptedException {
//		home.enterCredentials(prop.getProperty("UsernameM"),prop.getProperty("PasswordM"));	
//		Thread.sleep(500);
		
		
//		String Dashurl = driver.getCurrentUrl();
//		Assert.assertEquals(Dashurl, AutomationConstants.DashURL);
//	    System.out.println("Test:Dash_URL Found");
//		home.homeOut();
//		
//		System.out.println("Test:Manager homein Verification passed");
//		}
//		
//		@Test(priority = 3)
//		public void homein_A1() throws InterruptedException {
//		
//		home.titleCheck();
//		
//		home.enterUsername(prop.getProperty("UsernameA1"));	
//		home.enterPassword(prop.getProperty("PasswordA1"));
//		
//		home.eye();
//		home.signIn();
//		Thread.sleep(2000);
//		String Dashurl = driver.getCurrentUrl();
//		Assert.assertEquals(Dashurl, AutomationConstants.DashURL);
//	    System.out.println("Test:Dash_URL Found");
//		home.homeOut();
//		
//		System.out.println("Test:A1 homein Verification passed");
//		}
//		
//		@Test(priority = 4)
//		public void homein_A2() throws InterruptedException {
//		
//		home.titleCheck();
//		
//		home.enterUsername(prop.getProperty("UsernameA2"));	
//		home.enterPassword(prop.getProperty("PasswordA2"));
//		
//		home.eye();
//		home.signIn();
//		Thread.sleep(2000);
//		
//		String Dashurl = driver.getCurrentUrl();
//		Assert.assertEquals(Dashurl, AutomationConstants.DashURL);
//	    System.out.println("Test:Dash_URL Found");
//		home.homeOut();
//		
//		System.out.println("Test:A2 homein Verification passed");
//		}
//		
//		@Test(priority = 5)
//	    public void testInvalidhomeinErrors() {
//	        // Perform invalid homein action (Example: without entering credentials)
//			home.signIn();
//	        // Check for errors
//	        boolean errorDisplayed = home.isErrorDisplayed();
//	        Assert.assertTrue(errorDisplayed, "Expected error message was not displayed.");
//	    }
//		@Test(priority = 6)
//		public void forgotPass() {
//		home.forgot(prop.getProperty("Mail"));
//		System.out.println("Test:Forgot Password verification passed");
//		
//		}
	}



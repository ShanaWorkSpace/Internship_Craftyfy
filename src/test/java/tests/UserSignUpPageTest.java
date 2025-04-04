package tests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.UserSignUpPage;

public class UserSignUpPageTest extends TestBase {
    UserSignUpPage obj1;

    @BeforeClass
    public void init() throws IOException {
        obj1 = new UserSignUpPage(driver);
    }

    @Test
    public void Sign() throws InterruptedException {
        obj1.SignUp();
        obj1.Mail("user7@example.com", "user7@123");
        obj1.AddtoCart();
        obj1.Delivery("Sam", "John", "sam@example.com", "Gandidham", "Mundra", "Gujarat", "2", "India", "2345678910");
    }
}

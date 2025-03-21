package tests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.SignUpPage;

public class SignUpPageTest extends TestBase
{
    SignUpPage sign;
    
    @BeforeClass
    public void init() throws IOException
    {
        sign = new SignUpPage(driver);
    }
    @Test
    public void Sign()
    {    
    sign.SignUp();
    sign.CreateAcc();
    sign.Name(prop.getProperty("Name"));
    sign.Email(prop.getProperty("Email"));
    sign.Password(prop.getProperty("Password"));
    sign.SignupButton();
    sign.Collection();
    sign.Profile();
    sign.Logout();
    }
}
package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import utils.LocatorsReader;

public class LoginPage extends LocatorsReader
	{
	    public WebDriver driver;

	    public LoginPage(WebDriver drv)throws IOException
	    {
	        this.driver=drv;
	    }

}

package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class TestBase 
{
  public WebDriver driver;
  public Properties prop ;
  
  public void load_prop() throws IOException {
	  prop = new Properties();
      FileInputStream configFile = new FileInputStream("C:\\Users\\gssar\\Documents\\Internship\\ICTAK\\src\\test\\resources\\config.properties");
//    		  ("D:\\INTERN\\Internship_Craftyfy\\src\\test\\resources\\config.properties");
      
      prop.load(configFile);
  }
	
	@BeforeTest
	public void setUp() throws IOException{
		load_prop();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.getProperty("URL"));
	
        System.out.println("Browser opened.");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		System.out.println("Browser closed.");
	}
	
	
	

}
	

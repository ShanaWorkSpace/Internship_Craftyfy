package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LocatorsReader {
    
	protected Properties propi;
	
   public LocatorsReader() throws IOException{
            propi = new Properties();
            FileInputStream locatorsFile = new FileInputStream("D:\\INTERN\\Internship_Craftyfy\\src\\test\\resources\\locators.properties");
			propi.load(locatorsFile);      
   }
}
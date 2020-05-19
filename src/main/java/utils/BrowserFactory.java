package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName) {
		
		if( browserName.equals("Chrome") )
		{
			driver = new ChromeDriver();
		}
		
		return driver;
	}

}

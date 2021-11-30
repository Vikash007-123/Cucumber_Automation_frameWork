package Cucumber.Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		//WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver", "D:\\Spring\\Automation\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		return driver;
	}
	
	public static  void readData() throws IOException {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\Spring\\Automation\\resources\\global.properties");
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		
	}

}

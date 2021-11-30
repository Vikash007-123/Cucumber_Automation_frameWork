package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	By search_box=By.xpath("//input[@type='search']");
	
	public WebElement search_Veg_box() {
		return driver.findElement(search_box);
	}

}

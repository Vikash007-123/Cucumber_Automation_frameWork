package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Cucumber.Automation.BaseClass;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefinations {
	WebDriver driver;
	HomePage pg;

	@Given("User is on GreenKart landing page")
	public void user_is_on_green_kart_landing_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "D:\\Spring\\Automation\\Drivers\\chromedriver.exe");
		//driver=new ChromeDriver();
		driver = BaseClass.getDriver();
		BaseClass.readData();
		driver.manage().window().maximize();
		
		System.out.println("----------------");
		//driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
	}

	@When("user search for {string} vegetables")
	public void user_search_for_vegetables(String string) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//Implement Page Object Model 
		pg=new HomePage(driver);
		WebElement search_Veg_box = pg.search_Veg_box();
		search_Veg_box.sendKeys(string);
		//driver.findElement(By.xpath("//input[@type='search']")).sendKeys(string);;
		Thread.sleep(3000);
	}

	@Then("{string} Results are displayed")
	public void results_are_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().concat(string), true);
	}

}

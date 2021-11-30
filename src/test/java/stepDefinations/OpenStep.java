package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenStep {
	WebDriver driver;

@Given("Open the Application")
public void open_the_application() {
    // Write code here that turns the phrase above into concrete actions
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
}
	
	@When("navigate the URL")
	public void navigate_the_url() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://leetcode.com/accounts/login/");
	}

	@Then("verify the page")
	public void verify_the_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("login the Application");
	}

}

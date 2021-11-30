package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	
	@Given("Validated the Browser")
	public void validated_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Validated the Browser");
	}

	@When("Open the Browser")
	public void open_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Open the BrowserName");

		
	}

	@Then("check the Browser name")
	public void check_the_browser_name() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Check  the BrowserName");

	}
	
	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
		//code is navigate to Login Url
		System.out.println("navigate to Login Url");
	   
	}



	@When("User login into application with  {string} and password {string}")
	public void user_login_into_application_with_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);
		System.out.println(string2);


	}
	@When("User signup with following details")
	public void user_signup_with_following_details(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<List<String>> list = dataTable.asLists();
		String first_row_column = list.get(0).get(0);
		String first_row_sec_column = list.get(0).get(1);
		System.out.println(first_row_column);
		System.out.println(first_row_sec_column);
		System.out.println(list.get(0).get(2));
		System.out.println(list.get(0).get(3));

		

	}
	
	
	
	@When("User login in to application with  {string} and password {string}")
	public void user_login_in_to_application_with_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(username);
    	System.out.println(password);
	}

	@Then("Home page is populated")
	public void home_page_is_populated() {
		//Home page validation
		System.out.println("Home Page is Display");



	}

	@Then("Cards displayed are {string}")
	public void cards_displayed_are(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);

	}

}

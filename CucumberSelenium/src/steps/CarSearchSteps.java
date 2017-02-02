package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CarSearchSteps {
	public static WebDriver driver;
	
	@Before
	public void setUp()
	{
		 driver =new ChromeDriver();
		
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	@Given("^I am on the home page http://www\\.carsguide\\.com\\.au of carsguide website$")
	public void i_am_on_the_home_page_http_www_carsguide_com_au_of_carsguide_website() throws Throwable {
	    
	    driver.get("http://www.carsguide.com.au/");
	}

	@When("^i move to Car for Sale Menu$")
	public void i_move_to_Car_for_Sale_Menu() throws Throwable {
	    
	    
	}

	@Then("^i click on search cars$")
	public void i_click_on_search_cars() throws Throwable {
	    
	    
	}

	@Then("^I select Make as \"([^\"]*)\"$")
	public void i_select_Make_as(String arg1) throws Throwable {
	    
	    
	}

	@Then("^I select Model as \"([^\"]*)\"$")
	public void i_select_Model_as(String arg1) throws Throwable {
	    
	    
	}

	@Then("^I Select location as \"([^\"]*)\"$")
	public void i_Select_location_as(String arg1) throws Throwable {
	    
	    
	}

	@Then("^I select price as \"([^\"]*)\"$")
	public void i_select_price_as(String arg1) throws Throwable {
	    
	    
	}

	@Then("^i click on Find My Next Car button$")
	public void i_click_on_Find_My_Next_Car_button() throws Throwable {
	    
	    
	}

	@Then("^I should see list of searched cars$")
	public void i_should_see_list_of_searched_cars() throws Throwable {
	    
	    
	}

	@Then("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String arg1) throws Throwable {
	    
	    
	}



}

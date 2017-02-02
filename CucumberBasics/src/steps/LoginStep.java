package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStep {
	
	@Before
	public void setUp()
	{
		System.out.println("launching the browser");
	}
	
	@After
	public void TearDown()
	{
		System.out.println("driver quit");	
	}
	@After("@sandbox")
	public void TearDownProd()
	{
		System.out.println("only after production");	
	}

	@Given("^user navigates to facebook website$")
	public void user_navigates_to_facebook_website() throws Throwable {
		System.out.println("user navigates to facebook website");
	    	}

	@When("^user validates the homepage title$")
	public void user_validates_the_homepage_title() throws Throwable {
		System.out.println("user validates homepage title");
	    
	}

	@Then("^user entered the username$")
	public void user_entered_the_username() throws Throwable {
		
		System.out.println("user eneterd the username");
	    
	}

	@Then("^user entered the password$")
	public void user_entered_the_password() throws Throwable {
		System.out.println("user eneterd the password");
	   
	}

	@Then("^user should be successfully logged in$")
	public void user_should_be_successfully_logged_in() throws Throwable {
		
		System.out.println("user is succesfully logged in");
	    
	}


}

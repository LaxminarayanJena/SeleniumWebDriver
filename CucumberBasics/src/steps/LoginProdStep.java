package steps;
import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;


public class LoginProdStep {
	@Then("^user entered \"([^\"]*)\" username$")
	public void user_entered_username(String username) throws Throwable {
	    System.out.println("user entered username");
	 
	}

	@Then("^user entered \"([^\"]*)\" password$")
	public void user_entered_password(String password) throws Throwable {
		System.out.println("user entered password");
	   
	}
	
	/*@Then("^user select the  age category$")
	public void user_select_the_age_category(List<String> list) throws Throwable {
		System.out.println("user selects the age" + list.get(1)); 
	    	} 
	    	*/
	@Then("^user select the  age category$")
	public void user_select_the_age_category(DataTable table) throws Throwable {
		List<Map<String,String>> data= table.asMaps(String.class, String.class);
		//key and value pair
		System.out.println("user selects the age" + data.get(1).get("age")+"---selected location as :" + data.get(1).get("location")); 
		
	}
	
	@Then("^user validates the  captcha image$")
	public void user_validates_the_captcha_image() throws Throwable {
		
		System.out.println("user validates captcha image");
	   
	}

	@Then("^user \"([^\"]*)\" successfully logged in$")
	public void user_successfully_logged_in(String loginType) throws Throwable {
	   
		System.out.println("user succesffuly logged in");
	}


	}




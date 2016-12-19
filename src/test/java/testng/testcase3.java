package testng;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcase3 {
	
	@Test(priority=1, groups="med")
public void doLogin()
{
	//Assert.fail("login is not succesfull");
		//Assert.assertTrue(isElementPresent(""), "login not succesfull");
}
	@Test(priority=2, dependsOnMethods="doLogin" , groups="low")
	//@Test(priority=2, dependsOnMethods={"doLogin",""})--->multiple methods
	public void composeEmail()
	{
		System.out.println("executing compose email");
		throw new SkipException("skipping the testcase");
		
	}
	@Test(groups="high")
	public void validateData()
	{
		Assert.fail();
	}
	
}

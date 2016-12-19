package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcase1 {
	@BeforeTest
	public void createDBConn()
	{
		System.out.println("creating db connection");
	}
	@AfterTest
	public void closeDBConn()
	{
		System.out.println("closing db connection");
	}
	
	@BeforeMethod
	public void openBrowser()
	{
		System.out.println("opening browser");
	}
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("closing browser");
	}
	
	@Test(priority=1, groups="high")
public void doLogin()
{
	System.out.println("executing login test");
}
	@Test(priority=2, groups="high")
	public void composeEmail()
	{
		System.out.println("executing compose email");
		
	}
}

package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testcase2 {
	@Test(groups="low")
public void validateTitles()
{
	String expected="Yahoo";
	String actual="Gmail";
	
	/*if(expected.equals(actual))
	{
		System.out.println("Testcase pass");
	}
	else
	{
		System.out.println("Testcase fail");
	}*/
	
	Assert.assertEquals(expected, actual);
}
}
